<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div style="width:1000px;">
	<div class="user-bar"style="height:30px; background:#f5f6f7;border-radius:4px;">
				<div class="col-xs-2">
				<h5 class="text-center" style="margin-top:8px;color: #fa9700;"><a href="#/user/newsshow">个人主页</a></h5>
				</div>
				<div class="col-xs-2">
				<h5 class="text-center" style="margin-top:8px;color: #fa9700;"><a href="#/user/addnews">发表文章</a></h5>
				</div>
				<div class="col-xs-2">
				<h5 class="text-center" style="margin-top:8px;color: #fa9700;"><a href="#/user/authormessage">账号信息</a></h5>
				</div>
			</div>
			<div class="content clearfix" style="margin-top:10px;">
				<ul class="nav nav-tabs">
				  <li role="presentation" ><a href="#/user/newsshow">发布列表</a></li>
				  <li role="presentation"><a href="#/user/newsshowpassing">审核中</a></li>
				  <li role="presentation" class="active"><a href="#/user/newsshowfalse">审核失败</a></li>
				</ul>
				<div class="content" ng-controller="usernewsshowno">
				<table class="table table-hover" style="margin-top:10px;">
				  <tr ng-repeat="news in authornews">
				  <td width="55px;"><a href="javascript:;" ng-click="reasonclick(news.newId)" style="text-decoration:none;"><img ng-src="{{news.newImg}}" width="60px" height="60px;" style="border-radius:4px;"></a></td>
				  	<td width="600px;"><div><a href="javascript:;" ng-click="reasonclick(news.newId)"  ng-bind="news.newTitle" style="text-decoration:none;color:#000;"></a></div><a href="javascript:;" style="text-decoration:none;color:#000;"><div ng-click="reasonclick(news.newId)" ng-bind="news.newText"></div></a></td>
				  	<td class="text-center" style="vertical-align:middle">&nbsp;&nbsp;发布时间：<span ng-bind="news.newCreatetime |date:'MM-dd HH:mm'"></span></td>
				  	<td style="vertical-align:middle"><a href="#/user/updatenews/{{news.newId}}" style="color: #fa9700;">修改</a></td>
				  	<td style="vertical-align:middle"><a href="javascript:;" style="color: #fa9700;" ng-click="delnews(news.newId)">删除</a></td>
				  </tr>
				
				</table>
			</div>
			</div>
		</div>
