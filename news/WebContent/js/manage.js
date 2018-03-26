module = angular.module('module',['ui.router']);
module.filter('to_html',function ($sce) {  
    return function (text) {  
        return $sce.trustAsHtml(text);  
    }  
});
module.controller('aaa',function($scope,$http){ 
$scope.managenews = [];
$scope.nonewsmessage = "";
	$http({
	 	method:'get',
		url:'getNewsQueue',
	}).success(function(m){ console.log(m);
		$scope.managenews = m;
		if($scope.managenews == "" || $scope.managenews == null ||$scope.managenews == []){
			$scope.nonewsmessage = "暂无需审核文章";
		}else{
			$scope.nonewsmessage = "";
		}
	}).error(function(){alert("error")});
});
module.controller('managenewsdel',function($scope,$http){ 
	$scope.searchparam = "";
	$scope.searchnews=[];
	$scope.delnews = function(newId){
		$http({
			method:'get',
			url:'delnews/'+newId,
		}).success(function(m){
			alert("删除成功");
			$http({
			 	method:'get',
				url:'search/'+$scope.searchparam,
			}).success(function(m){
				$scope.searchnews = m;
				});
		});
	};
	$scope.tosearch = function(){
		if($scope.searchparam != ""){
			$http({
			 	method:'get',
				url:'search/'+$scope.searchparam,
			}).success(function(m){
				$scope.searchnews = m;
				});
		};
				}
});

module.controller('managenewsshow',function($scope,$http,$stateParams){ 
	$scope.news = [];
	$scope.username="";
	$scope.categoryName="";
	$scope.reasonshow = false;
	$scope.showreason = function(){		$scope.reasonshow = ! $scope.reasonshow;	};
	$http({
	 	method:'get',
		url:'getManageNews/'+$stateParams.newsid,
	}).success(function(m){ console.log(m);
		$scope.news = m.news;
		$scope.username = m.userName;
		$scope.categoryName = m.categoryName;
	}).error(function(){alert("error")});
	$scope.pass = function(newId){
		$http({
		 	method:'get',
			url:'setPass/'+newId,
		}).success(function(m){ 
			alert("提交成功");
			if(m.nextid != null){
				console.log("asd");
				window.location.href="#/managenewsdetail/" + m.nextid;
			}else{
				window.location.href="#/manageindex";
			}
		}).error(function(){alert("error")});
	};
	$scope.reason="";
	$scope.nopass = function(newId){
		var nopass = {};
		nopass.chfReason = $scope.reason;
		nopass.newId = newId;
		console.log(nopass);
		$http({
		 	method:'post',
			url:'setNoPass',
			data:nopass
		}).success(function(m){ 
			alert("提交成功");
			if(m.nextid != null){
				window.location.href="#/managenewsdetail/" + m.nextid;
			}else{
				window.location.href="#/manageindex";
			}
		}).error(function(){alert("error");});
	};
});
//登陆服务
module.factory('managerloginService',['$http',function($http){
	var doRequest = function(userLoginName,userPassword){
	var promise=$http({
			 	method:'POST',
				url:'manageLogin',
				async:false,
				data:'{"managerLoginname":"'+userLoginName+'","managerPassword":"'+userPassword+'"}',
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
module.factory('currentManager',function($http){
	
	var doRequest = function(sessionid){
		var promise=$http({
		 	method:'get',
			url:'getManager/'+sessionid,
		});
		return promise;
	}
	return {
		get:function(sessionid){return doRequest(sessionid);}
	}
});

module.controller('loginheader',function($scope,$http,managerloginService,$window,currentManager){
	$scope.currentuser=[];
	$scope.logined=false;
	var userString = $window.sessionStorage.getItem("manager");
	if(userString == null || userString == ""){
		$scope.logined = false;
		alert("请登录");
		window.location.href="manageindex.jsp#/managerlogin";
	}else{
		$scope.currentuser = JSON.parse(userString);
		console.log($scope.currentuser);
		var token =$scope.currentuser.token;
		currentManager.get(token).then(function(m){
			if(m.data.message == "1"){
				$scope.logined=true;
			}else{
				$scope.logined=false;
				$window.sessionStorage.setItem("manager","");
				alert("请登录");
				window.location.href="manageindex.jsp#/managerlogin";
			}
			
		},function(m){console.log("error");});
	}
	$scope.managerlogout = function(){
		$window.sessionStorage.setItem("manager","" );
		$http({
		 	method:'get',
			url:'logout',
	}).success(function(m){
		if(m.message == "1"){
			$scope.currentuser=[];
			$scope.logined=false;
			window.location.href="manageindex.jsp#/managerlogin";
		}
	});
	};
});
module.controller('managerlogin',function($scope,$http,managerloginService,$window,currentManager){
	var userString = $window.sessionStorage.getItem("manager");
	if(userString != null && userString != ""){
		window.location.href="#/manageindex";
	}
	$scope.managerlogin=function(user){
		var userString = $window.sessionStorage.getItem("manager");
		if(userString != null || userString != ""){
			$window.sessionStorage.setItem("manager","" );
			$http({
			 	method:'get',
				url:'logout',
		}).success(function(){
			var userLoginName = user.userLoginName;
			var userPassword = user.userPassword;
			managerloginService.userLogin(userLoginName,userPassword).then(function(message){
				var login = message.data;
				if(login.status == "1001"){
					console.log(login);
					var user = {"token":login.token,"userId":login.managerId,"userName":login.managerName};
					var userString  = JSON.stringify(user);
					$window.sessionStorage.setItem("manager",userString);
					$scope.loginresule = true;
					$scope.logined = true;
					alert("登录成功！");
					window.location.href="#/manageindex";
				}else{
					//登陆失败 
					console.log("error");
					$scope.loginresule = false;
					alert("用户名或密码错误！");
				}
				
			});
		});
		}
	};
});