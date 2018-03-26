<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <div ng-controller="indexCtrl">
<div class="col-md-7">
				<div class="news-content">
					<ul>
						<li ng-repeat="news in mainNews"><div class="item">
								<div class="leftBox left">
									<a href="#/detail/{{news.newId}}" style="text-decoration:none;"><img ng-src="{{news.newImg}}" /></a>
								</div>	
								<div class="rightBox" style="width:467px;">
									<div class="list-tittle"><a href="#/detail/{{news.newId}}" class="index-title" style="text-decoration:none;"  ng-bind="news.newTitle"></a></div>
									<a href="#/detail/{{news.newId}}" style="text-decoration:none;"><div class="list-abstract" ng-bind="news.newText"></div></a>
									<div class="list-footer" style="width:467px;">
										<span>
											<span ng-bind="news.userName">用户名</span>&nbsp;-&nbsp;
											<span ng-bind="news.statisticComment+'条评论'"></span>
										</span>										
										<span class="right list-time"  ng-bind="news.newCreatetime |date:'MM-dd HH:mm'"></span>
									</div>
								</div>		
								</div></li>	
					</ul>
					<a class="loadmore"href="javascript:;">已无更多</a>
				</div>
			</div>
			<div class="col-md-3">
			<div class="index-right">
				<div class="head"> 实时要闻 </div>
				<div class="news">
					<a href="#/detail/{{n.newId}}" ng-repeat="n in fastNews" ng-bind="n.newTitle"></a>
				</div>
			</div>
			</div>
			</div>