package com.news.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.news.service.UserService;
import com.news.tools.UUIDUtil;

//@RequestMapping("/springmvc")
@Controller
public class ImageUploadController{
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public @ResponseBody Map<String,String> hello(MultipartFile file) throws Exception{
		Map<String,String> map = new HashMap<String, String>();
		String fileName = file.getOriginalFilename();
		String picPath = "";
		if(file!=null && fileName.length()>0){
			//存储图片物理路径
			String path = "G:\\newsfile\\userpic\\";
			//新的图片名称
			String newPicName = UUIDUtil.getUUID()+fileName.substring(fileName.lastIndexOf("."), fileName.length());
			//新图片
			File newFile =new File(path+newPicName);
			file.transferTo(newFile);
			picPath = "/userpic/"+newPicName;
			map.put("path", picPath);
		}else{
			map.put("path", "/userpic/moren/liukanshan.jpg");
		}
		return map;
	}
	
/*	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public void hello(HttpSession session) throws IOException{
		File file = new File("user");
		System.out.println(session.getServletContext().getRealPath("/"));
	}*/
	

}
