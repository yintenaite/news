<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

	
		<div class="row" ng-controller="managerlogin">
		<div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">管理员登录</div>
				<div class="panel-body">
					<form role="form" ng-submit="managerlogin(user)">
						<fieldset>
							<div class="form-group">
								<input ng-model="user.userLoginName" class="form-control" placeholder="用户名" name="username" type="text" autofocus="">
							</div>
							<div class="form-group">
								<input ng-model="user.userPassword"  class="form-control" placeholder="密码" name="password" type="password" value="">
							</div>
							
							<button type="submit" style="float:right;" class="btn btn-primary">登录</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div><!-- /.col-->
	</div><!-- /.row -->	