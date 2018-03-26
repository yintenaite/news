<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		
		<ul class="nav menu">
			<li ><a href="#/manageindex"><span class="glyphicon glyphicon-dashboard"></span>审核列表</a></li>
			<li class="active"><a href="#/managenewsdel"><span class="glyphicon glyphicon-stats"></span> 文章删除</a></li>
			<li role="presentation" class="divider"></li>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main " style="padding:0px;">			
		<!-- 内容开始 --> 
		<div class="content clearfix" style="margin-top:0px;">
				<div class="content" ng-controller="managenewsdel">
				<div class="search" style="width: 600px;margin-left:auto;margin-right:auto;">
						<div class="search-form" style=" background-color: #f5f6f7; border: 1px solid #e8e8e8; border-radius: 0px; height: 32px; margin-top: 14px; padding: 0 0 0 16px;">
							<input type="text" ng-model="searchparam" style=" background: #f5f6f7 none repeat scroll 0 0;    border: 0 none;    float: left;    font-size: 14px;    height: 30px;    line-height: 20px;    outline: 0 none;    padding: 7px 0;    width: 530px;"/>
							<button href="javascript:;" type="submit" class="glyphicon glyphicon-search" ng-click="tosearch()" style="background: rgba(0, 0, 0, 0) none repeat scroll 0 0;    border: 0 none;    height: 25px;    width: 50px;">
						</div>
						
				</div>
				<div class="content clearfix" style="margin-top:30px;">
				<div class="content">
				<table class="table table-hover" style="margin-top:10px;background-color:#F1F4F7;">
				  <tr ng-repeat="news in searchnews" style="border:1px;">
				  <td width="55px;"><a href="/news/#/detail/{{news.newId}}" style="text-decoration:none;"><img ng-src="{{news.newImg}}" width="60px" height="60px;" style="border-radius:4px;"></a></td>
				  	<td width="600px;"><div><a  href="/news/#/detail/{{news.newId}}" ng-bind="news.newTitle" style="text-decoration:none;color:#000;"></a></div><a href="#/detail/{{news.newId}}" style="text-decoration:none;color: #000;"><div ng-bind="news.newText"></div></a></td>
				  	<td class="text-center" style="vertical-align:middle">&nbsp;&nbsp;发布时间：<span ng-bind="news.newCreatetime |date:'MM-dd HH:mm'"></span></td>
				 	<td style="vertical-align:middle"><a href="javascript:;" style="color: #fa9700;" ng-click="delnews(news.newId)">删除</a></td>
				  </tr>
				
				</table>
			</div>
			</div>
			</div>
			</div>
		<!-- 内容结束 -->
        </div>
        
	</div>	<!--/.main-->
