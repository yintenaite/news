<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<%@ page contentType="text/html;charset=UTF-8" %> 
<!-- http://localhost:8080/news/member/userLogin?userLoginName=ggg2537&userPassword=5203344 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript" src="bootstrap/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="bootstrap/js/angular.js"></script>
<script type="text/javascript" src="bootstrap/js/angular-cookies.js"></script>
<script>
	var news = angular.module('news',['ngCookies']);
	//登陆服务
	 news.factory('loginService',['$http',function($http){
		var doRequest = function(userLoginName,userPassword){
		var promise=$http({
				 	method:'POST',
					url:'userLogin',
					async:false,
					data:'{"userLoginName":"'+userLoginName+'","userPassword":"'+userPassword+'"}',
					headers: {
						   'Content-Type': 'application/json;charset=UTF-8'
						 }
				});
			return promise;
			
		}
		return {
			userLogin: function(userLoginName,userPassword){
				return doRequest(userLoginName,userPassword);
			}
		}
	}]); 
	//注册服务
	 news.factory('userRegisterService',['$http',function($http){
		var doRequest = function(user){
		var promise=$http({
				 	method:'POST',
					url:'member/userRegister',
					data:user,
					headers: {
						   'Content-Type': 'application/json;charset=UTF-8'
						 }
				});
			return promise;
			
		}
		return {
			userRegister: function(user){
				return doRequest(user);
			}
		}
	}]); 
	news.factory('currentUser',function(){
		return {
			
				userId:null,
				userName:null,
				setUser:function(userId,userName){this.userId = userId;this.userName = userName;}
		}
	});
	news.controller('userLogin',function($scope,$http,$cookieStore,loginService,currentUser){
		$scope.currentUser = currentUser;
		$scope.userLogin=function(){
			var userLoginName = "ggg2537";
			var userPassword = "5203344";
			loginService.userLogin(userLoginName,userPassword).then(function(message){
				var login = message.data;
				if(login.status == "1001"){
					currentUser.setUser(login.userId,login.userName);
					$cookieStore.put('COOKIE_USERNAME',login.userName); 
				}else{
					//登陆失败 
					console.log("error");
				}
				
			});
		}
	});
	news.controller('userRegister',function($scope,$http,$cookieStore,userRegisterService,currentUser){
		$scope.user={userName:"yyf",userLoginName:"admin",userPassword:"123456"};
		$scope.userRegister=function(){
			userRegisterService.userRegister($scope.user).then(function(message){
				var register = message.data;
				if(register.status == "2001"){
					currentUser.setUser(register.userId,register.userName);
					$cookieStore.put('COOKIE_USERNAME',register.userName); 
				}else{
					//注册失败  
					console.log("error");
				}
				
			});
		}
	});
</script>
</head>
<body ng-app="news">
	<div ng-controller="userLogin">
	<button ng-click="userLogin()">login</button>{{currentUser.userName}}
	</div>
	
	<div ng-controller="userRegister">
		<button ng-click="userRegister()">register</button>
	</div>
</body>
</html>