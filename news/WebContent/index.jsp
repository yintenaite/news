<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Examples</title>
<meta name="description" content="">
<meta name="keywords" content="">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="bootstrap/jquery.min.js"></script>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/article.css">
<script type="text/javascript" src="bootstrap/js/angular.js"></script>	
<script src="bootstrap/js/angular-ui-router.js"></script>
<script type="text/javascript" src="js/router.js"></script>	
<script type="text/javascript" src="js/index.js"></script>	
<link href="um/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" charset="utf-8" src="um/umeditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="um/umeditor.min.js"></script>
    <script type="text/javascript" src="um/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" src="bootstrap/js/angular-cookies.js"></script>
    <script type="text/javascript" src="bootstrap/js/angular-file-upload.js"></script>
</head>
<body ng-app="app"  ng-controller="login">
	<div>
		<div class="bar">
			<div class="topBar">
				<ul class="list-inline right">
					<li ng-show="logined"><a href="#/user/newsshow">发布</a></li>
					<li ng-hide="logined"><a href="javascript:;" data-toggle="modal" data-target="#modal-login">登陆</a></li>
					<li ng-hide="logined"><a href="javascript:;"data-toggle="modal" data-target="#modal-register">注册</a></li>
					<li ng-show="logined"><a href="#/user/shoucang" ng-bind="currentuser.userName"></a></li>
					<li ng-show="logined"><a href="javascript:;" ng-click="logout()">注销</a></li>
				</ul>
			</div>
			<div class="midBar">
				<div class="midBarContent">
					<div class="logo cannot_select"><a href="#/index"><h2>NEWS</h2></a></div>
					<div class="search">
						<div class="search-form">
							<input type="text" ng-model="searchparam"/>
							<button href="javascript:;" type="submit" class="glyphicon glyphicon-search" ng-click="tosearch()">
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
		<div ui-view="nav"></div>
		<div ui-view="content"></div>
		</div>
	</div>


<!-- 登录框 开始 -->
<div class="modal " id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-login-dialog">
  <div class="modal-dialog" role="document" style="width:400px">
  	<form ng-submit="userlogin(user)" method="post" name="loginform">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modal-login-dialog">用户登陆</h4>
      </div>
      <div class="modal-body">
        <!-- 主体 -->
        <div class="row" style="margin-bottom:5px;">
			<div class="col-sm-8 col-sm-offset-2" ng-hide="loginresule">
			<span style="color:#a94442;font-size:10px;">*用户名或密码错误</span>
			</div>
		</div>

		<div class="row form-group">
			<div class="col-sm-8 col-sm-offset-2">
				<!-- <span class="input-group-addon glyphicon glyphicon-user ico-to-top"></span> -->
				<input type="tel" id="login-phone" class="form-control input-sm" placeholder="用户名/手机号" ng-model="user.userLoginName" required>
			</div>
		</div>
		<div class="row form-group" >
			<div class="col-sm-8  col-sm-offset-2">
				<!-- <span class="input-group-addon glyphicon glyphicon-user"></span> -->
				<input type="password" id="login-phone" class="form-control input-sm" placeholder="密码" ng-model="user.userPassword" required>
			</div>
		</div>
        <!-- 主体结束-->
      </div>      
      <div class="modal-footer" style="text-align: center;">
    	<button type="submit" class="btn " style="width:150px; background: #ed4040;color:#fff;" ng-disabled="loginform.$invalid">登陆</button>
      </div>
    </div></form>
  </div>
</div>

<!-- 登录框 结束 -->


<!-- 注册框 开始-->
<div class="modal " id="modal-register" tabindex="-1" role="dialog" aria-labelledby="modal-register-dialog" ng-controller="register">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modal-register-dialog">注册</h4>
      </div>
      <form  class="form-horizonal"   name="registerform" >
      <div class="modal-body">
        <!-- 注册主体 -->		
			<div class="form-group row">
				<label for="register-phone" class="col-sm-2 text-right" style="margin-top:1%;">注册手机</label>
				<div class="col-sm-5">
					<input type="tel"ng-change="checkuserloginname()" required ng-pattern="/^1[3|4|5|7|8]\d{9}$/" name="registerphone" id="register-phone" ng-model="user.userLoginName" class="form-control input-sm">
				</div>
				<div class="col-sm-5 input-tip font-red" ng-show="registerform.registerphone.$dirty && registerform.registerphone.$invalid
				"><label class="control-label">*请输入11位手机号</label></div>
				<div class="col-sm-5 input-tip font-red" ng-show="canregister"><label class="control-label">*该账号已被使用</label></div>
			</div>
			<div class="form-group  row">
				<label for="username" class="text-right col-sm-2"  style="margin-top:1%;">用户名&nbsp;&nbsp;&nbsp;</label>
				<div class="col-sm-5">
					<input type="text" required class="form-control  input-sm" name="" id="username" ng-model="user.userName">
				</div>
			</div>
			<!-- <div class="form-group  row">
				<label for="usersc" class="text-right col-sm-2"  style="margin-top:1%;">用户介绍</label>
				<div class="col-sm-5">
					<input type="text" required class="form-control  input-sm" name="" id="usersc" ng-model="usersc">
				</div>
			</div> -->
			<div class="form-group row">
				<label for="register-password" class="text-right col-sm-2" style="margin-top:1%;" >创建密码</label>
				<div class="col-sm-5">
					<input type="password" required id="register-password" ng-pattern="/^[^\s]{6,16}$/" ng-minlength="6" ng-maxlength="16" name="registerpassword"  ng-model="user.userPassword" class="form-control  input-sm">
				</div>
				<div class="col-sm-5 font-red input-tip"ng-show="registerform.registerpassword.$dirty&&registerform.registerpassword.$invalid"><label class="control-label"><label  class="control-label">*至少6位并不包含空格</label></div>
			</div>
			<div class="form-group  row">
				<label for="check-password" class="text-right col-sm-2" ng-model="checkpassword"  style="margin-top:1%;">确认密码</label>
				<div class="col-sm-5">
					<input type="password" required class="form-control  input-sm" name="checkpassword" id="check-password" ng-model="checkpwd">
				</div>
				<div class="col-sm-5 font-red input-tip" ng-show="registerform.checkpassword.$dirty&&checkpassword()"><label  class="control-label">*与第一次密码输入一致</label></div>
			</div>
			<div class="form-group  row">
				<label for="userimg" class="text-right col-sm-2"  style="margin-top:1%;">用户头像</label>
				<div class="col-sm-5">
					<input type="file" required style="box-shadow:none;border:0px;" nv-file-select uploader="uploader"/><br/>
				</div>
				<br><br>
			</div>
			<div class="form-group  row">
				<ul style="list-style:none;margin-right:102px;margin-left:78px;">
		            <li ng-repeat="item in uploader.queue">
		           	    <label  class="text-right col-sm-2"  style="margin-top:1%;width:110px;margin-left:-130px;">头像预览</label>
		                <div  ng-show="uploader.isHTML5" ng-thumb="{ file: item._file, height: 100 }" style="margin-left:10px;"></div>
		            </li>
		        </ul>
		     </div>
		
        <!-- 注册主体结束-->
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="submit" ng-disabled="registerform.$invalid || checkpassword() || canregister" class="btn" style=" background: #ed4040;color:#fff;" ng-click="submitpic()">注册</button>
      </div>
      </form>
    </div>
  </div>
</div>
<!-- 注册框 结束-->
</body>
<script type="text/javascript" src="bootstrap/myjs/loadimage.js"></script>
</html>