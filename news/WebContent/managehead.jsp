<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation" ng-controller="loginheader">
		<div class="container-fluid">
			<div class="navbar-header">
				<ul class="user-menu">
					<li class="dropdown pull-right" ng-show="logined">
						<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> <span ng-bind="currentuser.userName"></span> 
						&nbsp;&nbsp;&nbsp;<a href="javascript:;"  ng-click="managerlogout()"><span class="glyphicon glyphicon-log-out"></span> 退出</a>
						
					</li>
				</ul>
			</div>
		</div><!-- /.container-fluid -->
	</nav>    