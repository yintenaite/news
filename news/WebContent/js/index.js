app.controller('indexCtrl',function($scope,$http,$stateParams){
		nav = $stateParams.nav;
		$scope.mainNews=[];
		$scope.fastNews=[];
		$http({
		 	method:'get',
			url:'getNewsOfIndex/'+nav,
	}).success(function(m){
		$scope.mainNews = m.mainNews;
	});
		$http({
		 	method:'get',
			url:'getFastNews',
	}).success(function(m){
		console.log(m);
		$scope.fastNews = m.fastNews;
	});
	});
app.controller('navCtrl',function($scope,$http){
	$scope.nav = [];
	$http({
	 	method:'get',
		url:'getAllNav'
}).success(function(m){
	$scope.nav = m;
});
});
app.controller('detailCtrl',function($scope,$http,$stateParams,$window,currentUser){
	$scope.news = [];
	$scope.comments = [];
	$scope.addComment = function(comment){$scope.comments.push(comment);}
	$scope.commentsize=0;
	$scope.username="";
	$scope.commentdisplay = false;
	$scope.commentview = function(){$scope.commentdisplay = !$scope.commentdisplay;}
	$http({
	 	method:'get',
		url:'getNewsDetail/'+$stateParams.id,
	}).success(function(m){
		$scope.news = m.news;
		$scope.comments = m.comment;
		$scope.commentsize = m.commentsize;
		$scope.username = m.userName;
	});
	$scope.usercomment="";
	$scope.commentsubmit = function(newsId){
		var userString = $window.sessionStorage.getItem("user");
		if(userString == null || userString == ""){
			alert("请登录");
		}else{
			var currentuser = JSON.parse(userString);
			var token =currentuser.token;
			currentUser.get(token).then(function(m){
				if(m.data.message != "1"){
					$window.sessionStorage.setItem("user","");
					alert("请登录");
					window.location.href="#/index";
				}else{
					comment = {"commentContent":$scope.usercomment,"newId":newsId};
					$http({
						 	method:'post',
							url:'addComment',
							data:comment,
						}).success(function(m){
							if(m.status == 4001){
									$scope.comments = m.comment;
									$scope.commentsize = m.commentsize;
							}else if(m.status == 4003){
								alert("请登录！");
								window.location.href="#/index";
							}else{
								console.log(m.status);
							}
						});
				}
			});
		}
		
	};
	$scope.addcollection = function(newId,title){
		var userString = $window.sessionStorage.getItem("user");
		if(userString == null || userString == ""){
			alert("请登录");
		}else{
			var currentuser = JSON.parse(userString);
			var token =currentuser.token;
			currentUser.get(token).then(function(m){
				if(m.data.message != "1"){
					$window.sessionStorage.setItem("user","");
					alert("请登录");
				}else{
					$http({
					 	method:'get',
						url:'addCollection/'+newId+'/'+title,
					}).success(function(m){
						if(m.message == "success"){
							alert("收藏文章成功")
						}else if(m.message == "already"){
							alert("已收藏过此文章");
						}else{
							alert("收藏失败");
						}
					});
				}
			});
			}
	};
});
app.controller("addnewsCtrl",function($scope,$http,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.content = "";
	$scope.title = "";
	$scope.categroy = "";
	$scope.text = "";
	$scope.nav=[];
	$http({
	 	method:'get',
		url:'getAllNav',
	}).success(function(m){
		$scope.nav = m;
		$scope.categroy = $scope.nav[0];
	});
	
	$scope.submit = function(){
		$scope.content = UM.getEditor('myEditor').getContent();
		text = UM.getEditor('myEditor').getContentTxt(); 
		$scope.text = text.replace(/\ +/g,"").substring(0,78);
		var news = {"newTitle":$scope.title,"newContent":$scope.content,"categoryId":$scope.categroy.navId,"newText":$scope.text};
		$http({
		 	method:'post',
			url:'addNews',
			data:news
	}).success(function(m){
		console.log(m.status);
		window.location.href="#/user/newsshow"
	});
	}
	
});
app.filter('to_html',function ($sce) {  
	        return function (text) {  
	            return $sce.trustAsHtml(text);  
	        }  
	    });
//登陆服务
app.factory('loginService',['$http',function($http){
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
app.controller('login',function($scope,$http,loginService,$window,currentUser){
	$scope.searchparam = "";
	$scope.tosearch = function(){
		if($scope.searchparam != ""){
			window.location.href='#/search/'+$scope.searchparam;
		}
	}
	$scope.currentuser=[];
	$scope.logined=false;
	$scope.loginresule = true; 
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		$scope.logined = false;
	}else{
		$scope.currentuser = JSON.parse(userString);
		var token =$scope.currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message == "1"){
				console.log("success");
				$scope.logined=true;
			}else{
				$scope.logined=false;
				$window.sessionStorage.setItem("user","");
			}
			
		},function(m){console.log("erroe");});
	}
	$scope.userlogin=function(user){
		var userLoginName = user.userLoginName;
		var userPassword = user.userPassword;
		loginService.userLogin(userLoginName,userPassword).then(function(message){
			var login = message.data;
			if(login.status == "1001"){
				var user = {"token":login.token,"userId":login.userId,"userName":login.userName};
				$scope.currentuser=user;
				var userString  = JSON.stringify(user);
				$window.sessionStorage.setItem("user",userString );
				$scope.loginresule = true;
				$('#modal-login').modal('hide');
				$scope.logined = true;
			}else{
				//登陆失败 
				console.log("error");
				$scope.loginresule = false;
			}
			
		});
	};
	$scope.logout = function(){
		$window.sessionStorage.setItem("user","" );
		$http({
		 	method:'get',
			url:'logout',
	}).success(function(m){
		if(m.message == "1"){
			$scope.currentuser=[];
			$scope.logined=false;
			window.location.href="#/index"
		}
	});
	};
});
app.controller('search',function($scope,$http,$stateParams){
	$scope.searchnews=[];
	$http({
	 	method:'get',
		url:'search/'+$stateParams.param,
	}).success(function(m){
		$scope.searchnews = m;
		});
	
});
app.controller('shoucang',function($scope,$http,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.collectionnews = [];
	$scope.quxiaocollection = function(newsId){alert("取消")};
	$http({
	 	method:'get',
		url:'getNewsOfCollection',
}).success(function(m){
	$scope.collectionnews = m.news;
});
	$scope.delcollection = function(newId){
		$http({
		 	method:'get',
			url:'delCollection/'+newId,
	}).success(function(m){
		if(m.status == "5001"){
			$http({
			 	method:'get',
				url:'getNewsOfCollection',
		}).success(function(m){
			$scope.collectionnews = m.news;
		});
		}
	});
	};
});
app.controller('dingyue',function($scope,$http,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.dingyuemessage = [];
	$http({
	 	method:'get',
		url:'getDingyue',
	}).success(function(m){
		$scope.dingyuemessage =	m.message;
	});
	$scope.quxiaodingyue = function(authorid){
	$http({
	 	method:'get',
		url:'delSubscribe/'+authorid,
	}).success(function(m){
		if(m.status=="6001"){
			$http({
			 	method:'get',
				url:'getDingyue',
			}).success(function(m){
				$scope.dingyuemessage =	m.message;
			});
		}
	});
	}
});
app.controller('usermessage',function($scope,$http,FileUploader,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.usermsg=[];
	$scope.jianjie="";
	$scope.checkpwd="";
	$scope.password="";
	$scope.content = "";
	$scope.userImgUrl="";
	 $scope.uploader= new  FileUploader({
		 url: 'hello'
	 });
	 $scope.uploader.onAfterAddingFile = function(fileItem) {
			var length = $scope.uploader.queue.length;
			if(length>1){
				$scope.uploader.queue.splice(0,1);
			}
	 };
	 $scope.uploader.onSuccessItem = function(item, res, status, headers){
		 $scope.userImgUrl = res.path;
		 console.log( $scope.userImgUrl);
		 $http({
			 	method:'post',
				url:'updateImg',
				data: $scope.userImgUrl
			}).success(function(m){
				if(m.status == "8001"){
					alert("修改成功");
					$scope.usermsg.userImgUrl = $scope.userImgUrl;
					$('#modal-img').modal('hide');
				}else{
					console.log("error");
				}
			});
	 };
	$scope.submitpic = function(){$scope.uploader.uploadAll();};
	$scope.updatejianjie = function(content){
		$http({
		 	method:'post',
			url:'updatejianjie',
			data:content
		}).success(function(m){
			if(m.status == "8001"){
				alert("修改成功");
				$scope.jianjie=content;
				$('#modal-jianjie').modal('hide');
			}else{
				console.log("error");
			}
		});
	}
	$scope.checkpassword=function(){
		if($scope.password == $scope.checkpwd){
			return false;
		}else{
			return true;
		}
	};
	$scope.updatepassword = function(password){
		$http({
		 	method:'post',
			url:'updatePassword',
			data:password
		}).success(function(m){
			console.log(m);
			alert("修改成功");
			$('#modal-password').modal('hide');
		});
	};
	$http({
	 	method:'get',
		url:'getUserMsg',
}).success(function(m){
	$scope.usermsg = m.user;
	$scope.jianjie=m.jianjie;
});
})
app.controller('usernewsshow',function($scope,$http,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.authornews=[];
	$http({
	 	method:'get',
		url:'getNewsByAuthor',
}).success(function(m){
	$scope.authornews = m.message;
});
});
app.controller('usernewsshowing',function($scope,$http,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.authornews=[];
	$http({
		method:'get',
		url:'getNewsByAuthoring',
	}).success(function(m){
		$scope.authornews = m.message;
	});
});
app.controller('usernewsshowno',function($scope,$http,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.authornews=[];
	$scope.reason="";
	$scope.reasonclick = function(newsid){
		$http({
			method:'get',
			url:'getreason/'+newsid,
		}).success(function(m){
			$scope.reason = m.message;
			alert($scope.reason);
		});
	};
	$http({
		method:'get',
		url:'getNewsByAuthorno',
	}).success(function(m){
		$scope.authornews = m.message;
	});
	$scope.delnews = function(newId){
		$http({
			method:'get',
			url:'delnews/'+newId,
		}).success(function(m){
			$http({
				method:'get',
				url:'getNewsByAuthorno',
			}).success(function(m){
				$scope.authornews = m.message;
			});
		});
	}
});
app.controller('authormessage',function($scope,$http,$stateParams,$window,currentUser){
	
	$scope.newslist = [];
	$scope.newslistsize=0;
	$scope.authordingyue = 0;
	$scope.authorid ="";
	$scope.authorname ="";
	$scope.authordesc ="";
	$scope.authorimg = "";
	$http({
	 	method:'get',
		url:'getauthormessage/'+$stateParams.authorid,
	}).success(function(m){
		$scope.newslist = m.newslist;
		$scope.newslistsize = m.listsize;
		$scope.authordingyue = m.dingyue;
		$scope.authorid =$stateParams.authorid;
		$scope.authorname =m.authorname;
		$scope.authordesc =m.authordesc;
		$scope.authorimg =m.img;
});
	$scope.adddingyue = function(authorid){
		var userString = $window.sessionStorage.getItem("user");
		if(userString == null || userString == ""){
			alert("请登录");
		}else{
			var currentuser = JSON.parse(userString);
			var token =currentuser.token;
			currentUser.get(token).then(function(m){
				if(m.data.message != "1"){
					$window.sessionStorage.setItem("user","");
					alert("请登录");
				}else{
					$http({
					 	method:'get',
						url:'adddingyue/'+authorid,
					}).success(function(m){
						if(m.message == "success"){
							alert("订阅成功");
							$scope.authordingyue = $scope.authordingyue+1;
						}else if(m.message == "already"){
							alert("已订阅该作者");
						}else if(m.message == "same"){
							alert("不能订阅自己");
						}else{
							alert("订阅失败");
						}
					});
				}
			});
		}
	};
})
app.factory('currentUser',function($http){
	
	var doRequest = function(sessionid){
		var promise=$http({
		 	method:'get',
			url:'getUser/'+sessionid,
		});
		return promise;
	}
	return {
		get:function(sessionid){return doRequest(sessionid);}
	}
});
//注册服务
app.factory('userRegisterService',['$http',function($http){
	var doRequest = function(user){
	var promise=$http({
			 	method:'POST',
				url:'userRegister',
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

app.controller('register',function($scope,$http,FileUploader,userRegisterService,$window){
	$scope.canregister=false;
	$scope.user={userName:"",userLoginName:"",userPassword:"",userImgUrl:""};
	$scope.checkuserloginname = function(){
		$http({
		 	method:'post',
			url:'checkuserloginname',
			data:$scope.user.userLoginName
		}).success(function(m){
			if(m.message == "success"){
				$scope.canregister=false;
			}else{
				$scope.canregister=true;
			}
		});
	}
	 $scope.uploader= new  FileUploader({
		 url: 'hello'
	 });
	 $scope.uploader.onAfterAddingFile = function(fileItem) {
			var length = $scope.uploader.queue.length;
			if(length>1){
				$scope.uploader.queue.splice(0,1);
			}
	 };
	 $scope.uploader.onSuccessItem = function(item, res, status, headers){
		 $scope.user.userImgUrl = res.path;
		 console.log( $scope.user);
		 $scope.userRegister();
	 };
	$scope.submitpic = function(){$scope.uploader.uploadAll();};
	$scope.checkpwd="";
	$scope.checkpassword=function(){
		if($scope.user.userPassword == $scope.checkpwd){
			return false;
		}else{
			return true;
		}
	};
	
	$scope.userRegister=function(){
		userRegisterService.userRegister($scope.user).then(function(message){
			var register = message.data;
			if(register.status == "2001"){
				var user = {"token":register.token,"userId":register.userId,"userName":register.userName};
				var userString  = JSON.stringify(user);
				$window.sessionStorage.setItem("user",userString );
				alert("注册成功");
				$('#modal-register').modal('hide');
				window.history.go(0);
			}else{
				//注册失败  
				console.log("error");
			}
			
		});
	}
});
app.controller('updateNewsCtrl',function($scope,$http,$stateParams,$window,currentUser){
	var userString = $window.sessionStorage.getItem("user");
	if(userString == null || userString == ""){
		alert("请登录");
		window.location.href="#/index";
	}else{
		var currentuser = JSON.parse(userString);
		var token =currentuser.token;
		currentUser.get(token).then(function(m){
			if(m.data.message != "1"){
				$window.sessionStorage.setItem("user","");
				alert("请登录");
				window.location.href="#/index";
			}
		});
	}
	$scope.news = [];
	$scope.categroy = "";
	$scope.title = "";
	$scope.nav=[];
	$http({
	 	method:'get',
		url:'getAllNav',
	}).success(function(m){
		$scope.nav = m;
		$http({
		 	method:'get',
			url:'getManageNews/'+$stateParams.id,
		}).success(function(m){
			$scope.news = m.news;
			var content = $scope.news.newContent;
			 UM.getEditor('myEditor').setContent(content);
			 $scope.title = $scope.news.newTitle;
			 for(var i = 0;i<$scope.nav.length;i++){
				 if($scope.nav[i].navId == $scope.news.categoryId){
					 $scope.categroy = $scope.nav[i];break;
				 }
			 }
			
		});
	});
	$scope.submit = function(){
		$scope.content = UM.getEditor('myEditor').getContent();
		text = UM.getEditor('myEditor').getContentTxt(); 
		$scope.text = text.replace(/\ +/g,"").substring(0,78);
		var news = {"newId":$scope.news.newId,"newTitle":$scope.title,"newContent":$scope.content,"categoryId":$scope.categroy.navId,"newText":$scope.text};
		$http({
		 	method:'post',
			url:'updateNews',
			data:news
	}).success(function(m){
		window.location.href="#/user/newsshow"
	});
	}

});
