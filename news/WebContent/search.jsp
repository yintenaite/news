<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div style="width:1000px;">
			<div class="content clearfix" style="margin-top:30px;">
				<div class="content" ng-controller="search">
				<table class="table table-hover" style="margin-top:10px;">
				  <tr ng-repeat="news in searchnews" style="border:1px;">
				  <td width="55px;"><a href="#/detail/{{news.newId}}" style="text-decoration:none;"><img ng-src="{{news.newImg}}" width="60px" height="60px;" style="border-radius:4px;"></a></td>
				  	<td width="600px;"><div><a  href="#/detail/{{news.newId}}" ng-bind="news.newTitle" style="text-decoration:none;color:#000;"></a></div><a href="#/detail/{{news.newId}}" style="text-decoration:none;color:#000;"><div ng-bind="news.newText"></div></a></td>
				  	<td class="text-center" style="vertical-align:middle">&nbsp;&nbsp;发布时间：<span ng-bind="news.newCreatetime |date:'MM-dd HH:mm'"></span></td>
				  	<td style="vertical-align:middle"><a href="#/detail/{{news.newId}}" style="color: #000;" ng-bind="news.statisticComment+'条评论'"></a></td>
				  </tr>
				
				</table>
			</div>
			</div>
		</div>
