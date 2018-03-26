<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div class="col-md-2  navber-default navbar" style="margin-right:-4%" ng-controller="navCtrl">
				<ul class="nav nav-pills nav-stacked navul">
				<li>
					<a href="#/index">
					<img class="nav-icon"  src="image/icon/nav-fire.png">
					<h4>推荐</h4>
					</a>
				</li>
						<li ng-repeat="n in nav"><a  href="#/{{n.navHref}}"><img ng-src="{{n.navImg}}" class="nav-icon"><h4 ng-bind="n.navName"></h4></a></li>
						
					</ul>
			</div>