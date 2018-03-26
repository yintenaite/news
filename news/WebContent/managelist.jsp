<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		
		<ul class="nav menu">
			<li class="active"><a href="#/manageindex"><span class="glyphicon glyphicon-dashboard"></span>审核列表</a></li>
			<li><a href="#/managenewsdel"><span class="glyphicon glyphicon-stats"></span> 文章删除</a></li>
			<li role="presentation" class="divider"></li>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main " style="padding:0px;">			
		<!-- 内容开始 --> 
		<div class="content clearfix" style="margin-top:0px;">
				<div class="content" ng-controller="aaa">
				<table class="table table-hover" style="margin-top:10px;">
				  <tr ng-repeat="news in managenews" style="border:1px;">
				  <td width="55px;" ng-bind="$index+1"></td>
				  	<td width="600px;"><div><a  href="#/managenewsdetail/{{news.newsId}}" ng-bind="news.newsTitle" style="text-decoration:none;color:#000;"></a></div></td>
				  	<td class="text-center" style="vertical-align:middle">&nbsp;&nbsp;发布时间：<span ng-bind="news.newsUpdateTime|date:'MM-dd HH:mm'"></span></td>
				  </tr>
				
				</table>
			</div>
			</div>
		<!-- 内容结束 -->
        </div>
	</div>	<!--/.main-->
