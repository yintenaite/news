<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

	
	<div ng-controller="managenewsshow">	
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		
		<ul class="nav menu">
			<li class="active"><a href="#/manageindex"><span class="glyphicon glyphicon-dashboard"></span>审核列表</a></li>
			<li><a href="#/managenewsdel"><span class="glyphicon glyphicon-stats"></span> 文章删除</a></li>
			<li role="presentation" class="divider"></li></ul>
			<button class="btn" ng-click="pass(news.newId)" style="background-color:#ed4040;color:#FFF;width:100%;">通过</button>
			<br/><br/><br/>
			<button class="btn" style="background-color:#ed4040;color:#FFF;width:100%;" ng-click="showreason()">不通过</button>
			<div ng-show="reasonshow" style = "margin-left:225px;margin-top:0px;position: fixed;width: 395px;z-index: 100;"><textarea  cols="100" rows="6" style="resize:none;width:400px;" ng-model="reason"></textarea>
			<div style="margin-bottom:80px;"><button class="btn" style="width:150px;background-color:#ed4040;color:#FFF;float:right;margin-left:80px;" ng-click="nopass(news.newId)">提交</button></div>
			</div>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main " style="padding:0px;">			
		<!-- 内容开始 -->
		<!-- 内容开始 -->
		<div style="margin:0px 20px 0px 20px;">
			<div  style="text-align:center;">
									<h1 ng-bind="news.newTitle"></h1>
									<div>
										<span ng-bind="username"></span>
										<span ng-bind="news.newCreatetime|date:' yyyy-MM-dd HH:mm'"></span>
										<span ng-bind="'&nbsp;&nbsp;&nbsp;&nbsp;类别：'+categoryName"></span>
									</div>
							</div>
							<div class="article-content" style="background-color: none;" ng-bind-html="news.newContent | to_html">				
				</div>
		</div>
		<!-- 内容结束 -->
		<!-- 内容结束 -->
        </div>
	</div>	<!--/.main-->

