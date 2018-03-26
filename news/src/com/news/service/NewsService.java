package com.news.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;

import com.news.entity.Author;
import com.news.entity.Category;
import com.news.entity.Checkfailed;
import com.news.entity.Checkpass;
import com.news.entity.Collection;
import com.news.entity.Comment;
import com.news.entity.CommentVo;
import com.news.entity.DingyueVo;
import com.news.entity.Nav;
import com.news.entity.New;
import com.news.entity.NewsOfIndex;
import com.news.entity.Statistic;
import com.news.entity.Subscribe;
import com.news.mapper.AuthorMapper;
import com.news.mapper.CategoryMapper;
import com.news.mapper.CheckfailedMapper;
import com.news.mapper.CheckpassMapper;
import com.news.mapper.CollectionMapper;
import com.news.mapper.CommentMapper;
import com.news.mapper.CommentVoMapper;
import com.news.mapper.DingyueVoMapper;
import com.news.mapper.NavMapper;
import com.news.mapper.NewMapper;
import com.news.mapper.NewsOfIndexMapper;
import com.news.mapper.StatisticMapper;
import com.news.mapper.SubscribeMapper;
import com.news.tools.UUIDUtil;


public class NewsService {

	@Autowired
	private NewMapper newMapper;
	@Autowired
	private StatisticMapper statisticMapper;
	@Autowired
	private NewsOfIndexMapper newsOfIndexMapper;
	@Autowired
	private CommentVoMapper commentVoMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private NavMapper navMapper;
	@Autowired
	private DingyueVoMapper dingyueVoMapper;
	@Autowired
	private CollectionMapper collectionMapper;
	@Autowired
	private SubscribeMapper subscribeMapper;
	@Autowired
	private AuthorMapper authorMapper;
	@Autowired
	private CheckpassMapper checkpassMapper;
	@Autowired
	private CheckfailedMapper checkfailedMapper;
	
	public Checkfailed getReason(String newsid){
		return checkfailedMapper.getReason(newsid);
	}
	public void delnews(String newid){
		newMapper.deleteByPrimaryKey(newid);
	}
	public List<Nav> getAllNav(){
		return navMapper.getAllNav();
	}
	
	public List<NewsOfIndex> getNewsOfAuthor(String authorId){
		return newsOfIndexMapper.getNewsOfAuthor(authorId);
	}
	public List<NewsOfIndex> getNewsOfAuthoring(String authorId){
		return newsOfIndexMapper.getNewsOfAuthoring(authorId);
	}
	public List<NewsOfIndex> getNewsOfAuthorno(String authorId){
		return newsOfIndexMapper.getNewsOfAuthorno(authorId);
	}
	public List<NewsOfIndex> getNewsOfCollection(String id){
		return newsOfIndexMapper.getNewsOfCollection(id);
	}
	
	public List<DingyueVo> getDingyue(String id){
		return dingyueVoMapper.getDingyue(id);
	}
	public Integer getDingyueOfAuthor(String authorid){
		return dingyueVoMapper.getDingyueOfAuthor(authorid);
	}
	public New getNewsDetail(String id){
		New news = newMapper.selectByPrimaryKey(id);
		Statistic statistic = new Statistic();
		Statistic s = statisticMapper.getStatisticByNewsId(id);
		if(s == null){
			Statistic record = new Statistic(1, 0, 0, id);
			statisticMapper.insertSelective(record);
		}else{
			statistic.setStatisticId(s.getStatisticId());
			if(s.getStatisticRead() == null || s.getStatisticRead() == 0){
				statistic.setStatisticRead(1);;
			}else{
				statistic.setStatisticRead(s.getStatisticRead()+1);
			}
			statisticMapper.updateByPrimaryKeySelective(statistic);
		}
		return news;
	}
	public New getManageNewsDetail(String id){
		New news = newMapper.selectByPrimaryKey(id);
		return news;
	}
	public Nav getCategoryName(Integer id){
		 return navMapper.selectByPrimaryKey(id);
	}
	
	public List<NewsOfIndex> getNewsOfIndex(String nav) throws Exception{
		return newsOfIndexMapper.showAllNews(nav);
	}
	
	public void addNews(New news,String userId,String picPath,String contextPath) throws Exception{
		String newsId = UUIDUtil.getUUID();
		Date data = new Date();
		news.setNewCreatetime(data);
		news.setNewUpdatetime(data);
		news.setNewPass(0);
		news.setUserId(userId);
		news.setNewId(newsId);
		String content = news.getNewContent();
		content = content.replaceAll("background-color: rgb(255, 255, 255);", "");
		Map<String, String> map = changeFilePath(content, picPath,contextPath);
		news.setNewContent(map.get("content"));
		news.setNewImg(map.get("newsImg"));
		newMapper.insertSelective(news);
		statisticMapper.insertSelective(new Statistic(0,0,0,newsId));
	}
	public void updateNews(New news,String picPath,String contextPath) throws Exception{
		Date data = new Date();
		news.setNewUpdatetime(data);
		news.setNewPass(0);
		String content = news.getNewContent();
		content = content.replaceAll("background-color: rgb(255, 255, 255);", "");
		Map<String, String> map = changeFilePath(content, picPath,contextPath);
		news.setNewContent(map.get("content"));
		news.setNewImg(map.get("newsImg"));
		newMapper.updateByPrimaryKeySelective(news);
	}
	
	public List<CommentVo> getCommentsVo(String id) throws Exception{
		return commentVoMapper.getCommentVoByNewsId(id);
	}
	
	public void addComment(Comment comment,String userId)throws Exception{
		comment.setCommentCreatetime(new Date());
		comment.setUserId(userId);
		commentMapper.insertSelective(comment);
		Statistic s = statisticMapper.getStatisticByNewsId(comment.getNewId());
		Statistic statistic = new Statistic();
		statistic.setStatisticId(s.getStatisticId());
		statistic.setStatisticComment(s.getStatisticComment()+1);
		statisticMapper.updateByPrimaryKeySelective(statistic);
	}
	public List<NewsOfIndex> search(String q)throws Exception{		
		return  newsOfIndexMapper.search('%'+q+'%');
	}
	public Map<String, String> changeFilePath(String source,String picPath,String contextPath) throws IOException{
		List<String> picPathList = new ArrayList<String>();
		Pattern p=Pattern.compile("(/\\w*){2}/[0-9]{1,}[.](jpg|png)"); 
		source = source.replaceAll("_src=\\s*['\"]([^'\"]+)['\"]", "");
	    Matcher m=p.matcher(source);
	    Map<String,String> map = new HashMap<String, String>();
	    String newImg = "";
	    if(m.find()){
	    	newImg = m.group().substring(1);
	    	 do{
	 	    	picPathList.add(m.group().substring(1).replaceAll("/","\\\\"));
	 	    }while(m.find());
	    	  String tempPath = newImg.substring(0,newImg.lastIndexOf("/"));
	    	  //  String oldPath = picPath + tempPath;
	    	    String newPath = ("G:\\newsfile\\newspic\\"+ tempPath + "\\").replaceAll("/","\\\\").replaceAll("\\\\", "\\\\\\\\");
	    	    File file = new File(newPath);
	    	    if(!file.exists() || !file.isDirectory()){
	    	    	file.mkdirs();
	    	    }
	    	    FileInputStream[] fis = new FileInputStream[picPathList.size()];
	    	    FileOutputStream[] fos = new FileOutputStream[picPathList.size()];
	    	    for(int i = 0; i<picPathList.size(); i++){
	    	    	fis[i] = new FileInputStream((picPath+picPathList.get(i)).replaceAll("\\\\", "\\\\\\\\"));
	    	    	fos[i] = new FileOutputStream(("G:\\newsfile\\newspic\\"+ picPathList.get(i)).replaceAll("\\\\", "\\\\\\\\"));
	    	    	FileChannel fci = fis[i].getChannel();
	    	    	FileChannel fco = fos[i].getChannel();
	    	    	ByteBuffer bb = ByteBuffer.allocate(1024);
	    	    	int n = fci.read(bb);
	    	    	while(n != -1){
	    	    		bb.flip();
	    	    		fco.write(bb);
	    	    		bb.clear();
	    	    		n = fci.read(bb);
	    	    	}
	    	    	fci.close();
	    	    	fco.close();
	    	    	fis[i].close();
	    	    	fos[i].close();
	    	    }
	    	    String content = source.replaceAll(contextPath+"/"+tempPath,"/newspic/"+tempPath);
	    	    map.put("content", content);
	    	    map.put("newsImg", "/newspic/"+newImg);
	    }else{
	    	map.put("content", source);
    	    map.put("newsImg", "");
	    }
	  
	    return map;
	}
	
	public String addCollection(String newsid,String newstitle,String userId){
		Collection in = new Collection();
		in.setNewId(newsid);
		in.setUserId(userId);
		Collection c = collectionMapper.getIfCollection(in);
		if(c == null){
			in.setCollectionTitle(newstitle);
			collectionMapper.insertSelective(in);
			return "success";
		}else{
			return "already";
		}
	}
	public String adddingyue(String authorid,String userid){
		if(authorid.equals(userid)){
			return "same";
		}else{
			Subscribe s = new Subscribe();
			s.setUserId(userid);
			s.setAuthorId(authorid);
			Subscribe sub = subscribeMapper.getIfSubscribe(s);
			if(sub == null){
				subscribeMapper.insertSelective(s);
				Author a = authorMapper.getAuthorByUserId(authorid);
				authorMapper.updateSubscribeCount(a.getAuthorSubscribe()+1);
				return "success";
			}else{
				return "already";
			}
		}
	}
	public void delSubscribe(Subscribe s){
		subscribeMapper.delSubscribe(s);
		Author a = authorMapper.getAuthorByUserId(s.getAuthorId());
		authorMapper.updateSubscribeCount(a.getAuthorSubscribe()-1);
	}
	
	public void delCollection(Collection c){
		collectionMapper.delCollection(c);
	}
	public List<NewsOfIndex> getFastNews(){
		return newsOfIndexMapper.getFastNews();
	}
	public void setPass(String newId,Integer managerId){
		New news = new New();
		news.setNewId(newId);
		news.setNewPass(1);
		newMapper.updateByPrimaryKeySelective(news);
		Checkpass ck = new Checkpass();
		ck.setChpCreatetime(new Date());
		ck.setNewId(newId);
		ck.setManagerId(managerId);
		checkpassMapper.insertSelective(ck);
	}
	
	public void setNoPass(Checkfailed cf,Integer managerId){
		New news = new New();
		news.setNewId(cf.getNewId());
		news.setNewPass(-1);
		newMapper.updateByPrimaryKeySelective(news);
		cf.setChfCreatetime(new Date());
		cf.setManagerId(managerId);
		checkfailedMapper.insertSelective(cf);
	}
	
}

