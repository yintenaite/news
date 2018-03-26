<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
			<!-- ++++++++++++++++++++开始++++++++++++++++++++ -->
			<div ng-controller="authormessage">
			<div class="col-md-12" style=";margin-bottom:10px;border-radius: 4px;">
			<div class="col-md-6">
					<div class="col-md-5" style="margin-right:-30px;">
						<img class="img-thumbnail" style="width:160px;height:130px" ng-src="{{authorimg}}">
					</div>
					<div class="col-md-7">
						<span>
						<h3 > {{authorname}}&nbsp;&nbsp;&nbsp;
						         <span class="like">
										<a href="javascript:;" ng-click="adddingyue(authorid)">+ 订阅</a>
									</span>
						</h3>
						</span>			
						
						<span ng-bind="authordesc"></span>
					</div>
				</div><div class="col-md-1"></div>
					<div class="col-md-2" style="padding-left:0px;">
						<div style="margin-top:24px;">
							<span style="color: #f76120;font-size: 34px;font-weight: 900;" ng-bind= "authordingyue"></span>
							
							<br>
							<span style="font-size:16px;font-weight: 550;">订阅量</span>
						</div>
					</div>
					<div class="col-md-2" style="padding-left:0px;">
						<div style="margin-top:24px;">
							<span style="color: #f76120;font-size: 34px;font-weight: 900;" ng-bind="newslistsize"></span>
							
							<br>
							<span style="font-size:16px;font-weight: 550;">发布量</span>
						</div>
					</div>
			</div>
			<div style="width:1000px;margin-left:45px;"class="clearfix">
				<ul style="list-style: outside none none;">
					<li style="margin-left:-35px;"><div class="item" ng-repeat="n in newslist">	
								<div class="leftBox left">
									<a href="#/detail/{{n.newId}}" style="text-decoration:none;"><img ng-src="{{n.newImg}}" width="124px" height="80px" /></a>
								</div>	
								<div class="rightBox">
									<a href="#/detail/{{n.newId}}" style="text-decoration:none;"><div class="list-tittle" ng-bind="n.newTitle"></div></a>
									<a href="#/detail/{{n.newId}}" style="text-decoration:none;"><div class="list-abstract" ng-bind="n.newText"></
									</div>
									<div class="list-footer">
										<span>
											<span ng-bind="n.statisticComment+'条评论'"></span>
										</span>										
										<span class="right list-time" ng-bind="n.newCreatetime |date:'MM-dd HH:mm'"></span>
									</div>
								</div>		
								</div></li>	
				</ul>

			</div></div>
			<!-- ++++++++++++++++++++结束++++++++++++++++++++ -->
