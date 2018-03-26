<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div class="user-bar"style="height:30px; background:#f5f6f7;border-radius:4px;">
				<div class="col-md-2">
				<a href="#/user/shoucang"><h5 class="text-center" style="margin-top:8px;">收 藏</h5></a>
				</div>
				<div class="col-md-2">
				<a href="#/user/dingyue"><h5 class="text-center" style="margin-top:8px;">订 阅</h5></a>
				</div>
				<div class="col-md-2">
				<a href="#/user/usermessage"><h5 class="text-center" style="margin-top:8px;">个人信息</h5></a>
				</div>
			</div>
			<div class="content" ng-controller="shoucang">
				<table class="table table-hover" style="margin-top:10px;">
				  <tr ng-repeat="news in collectionnews">
				  <td width="55px;"><a href="#/detail/{{news.newId}}" style="text-decoration:none;"><img ng-src="{{news.newImg}}" width="60px" height="60px;" style="border-radius:4px;"></a></td>
				  	<td width="600px;"><div><a  href="#/detail/{{news.newId}}" ng-bind="news.newTitle" style="text-decoration:none;color:#000;"></a></div><a href="#/detail/{{news.newId}}" style="text-decoration:none;color:#000;"><div ng-bind="news.newText"></div></a></td>
				  	<td class="text-center" style="vertical-align:middle">作者：<span ng-bind="news.userName"></span>&nbsp;-&nbsp;  时间：<span ng-bind="news.newCreatetime |date:'MM-dd HH:mm'"></span></td>
				  	<td style="vertical-align:middle"><a href="javascript:;" style="color: #fa9700;" ng-click="delcollection(news.newId)">取消收藏</a></td>
				  </tr>
				
				</table>
			</div>