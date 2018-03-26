<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div class="col-md-8">
			<!-- ***************************开始************************************ -->
				<div class="page-article" ng-controller="detailCtrl">
							<div class="article-header">
									<h1 class="title" ng-bind="news.newTitle"></h1>
									<span class="sub" ><a href="#/author/message/{{news.userId}}" ng-bind="username"></a></span>
									<span class="sub" ng-bind="news.newCreatetime|date:' yyyy-MM-dd HH:mm'"></span>
									<span class="right"><a href="javascript:;" ng-click="addcollection(news.newId,news.newTitle)">收藏</a></span>
							</div>
							<div class="article-content detail-content" ng-bind-html="news.newContent | to_html"></div>
				<div class="article-comment">
					<div class="article-comment-head">
						<div class="dtag">文章评论</div>
						<div style="float:right">  共<span ng-bind="commentsize"></span>条,&nbsp;<a href="javascript:;" ng-click="commentview()">点击评论</a></div>
					</div>
					<div ng-hide="commentdisplay">
						<div><textarea  cols="100" rows="6" style="resize:none;width:100%;" ng-model="usercomment"></textarea></div>
						<div style="margin-bottom:80px;margin-top:5px;"><button class="btn" style="background-color:#ed4040;color:#FFF;float:right;" ng-click="commentsubmit(news.newId)">发表评论</button></div>
					</div>
					</div>					
					<div class="article-comment-content clearfix">
					
					<ul style="list-style: outside none none;padding:0px;" class="clearfix">
						<li style="margin-bottom: 30px;margin-top:10px;" ng-repeat="c in comments">
							<div>
							<div>
								<img ng-src="{{c.userImgUrl}}" width="50px" height="50px" style="border-radius: 30px;float:left;margin-right:10px;">
							</div>
								<div>
									<div style="margin-bottom:10px;"><a href="#" style="color: #406599;" ng-bind="c.userName"></a></div>
									<div style="font-size:16px;padding-left:60px;" ng-bind="c.commentContent"></div>
								</div> 
							</div>
							<div style="float:right;" ng-bind="c.commentCreatetime|date:' yyyy-MM-dd HH:mm'"></div>
						</li>
					</ul>
					<a class="loadmore"href="javascript:;" style="margin: 50px 0px 10px 0px;">已无更多</a>
					</div>
					</div>
				
		<!-- ***************************结束************************************ -->
			</div>