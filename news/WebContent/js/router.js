app = angular.module('app',['ui.router','ngCookies','angularFileUpload']);
app.config(function($stateProvider, $urlRouterProvider){
	 $urlRouterProvider.otherwise("index");
	 $stateProvider
	 .state('index', {
		 url:"/{nav}",
     	 views:{
     		 'content':{
     			templateUrl: "newsOfIndex.jsp"
     		 },
     		 'nav':{
     			 templateUrl: "newsOfNav.jsp"
     		 }
     	 }
     	
   	 })
   	 .state('detail', {
		 url:"/detail/{id}",
     	 views:{
     		 'content':{
     			templateUrl: "detail.jsp"
     		 },
     		 'nav':{
     			 templateUrl: "newsOfNav.jsp"
     		 }
     	 }
     	
   	 })
	 .state('addNews', {
		 url:"/user/addnews",
     	 views:{
     		 'content':{
     			templateUrl: "addNews.jsp"
     		 } 
     	 }
   	 })
   	 .state('updateNews', {
   		 url:"/user/updatenews/{id}",
   		 views:{
   			 'content':{
   				 templateUrl: "updateNews.jsp"
   			 } 
   		 }
   	 })
   	  .state('newsshow', {
		 url:"/user/newsshow",
     	 views:{
     		 'content':{
     			templateUrl: "newsshow.jsp"
     		 } 
     	 }
   	 })
   	 .state('newsshowpassing', {
   		 url:"/user/newsshowpassing",
   		 views:{
   			 'content':{
   				 templateUrl: "newsshowpassing.jsp"
   			 } 
   		 }
   	 })
   	 .state('newsshowfalse', {
   		 url:"/user/newsshowfalse",
   		 views:{
   			 'content':{
   				 templateUrl: "newsshowfalse.jsp"
   			 } 
   		 }
   	 })
   	  .state('authormessage', {
		 url:"/user/authormessage",
     	 views:{
     		 'content':{
     			templateUrl: "authormessage.jsp"
     		 } 
     	 }
   	 })
   	   .state('usermessage', {
		 url:"/user/usermessage",
     	 views:{
     		 'content':{
     			templateUrl: "usermessage.jsp"
     		 } 
     	 }
   	 })
   	 .state('shoucang', {
		 url:"/user/shoucang",
     	 views:{
     		 'content':{
     			templateUrl: "shoucang.jsp"
     		 } 
     	 } 
   	 })
   	.state('dingyue', {
		 url:"/user/dingyue",
    	 views:{
    		 'content':{
    			templateUrl: "dingyue.jsp"
    		 } 
    	 }
  	 })
  	
  	.state('search', {
		 url:"/search/{param}",
   	 views:{
   		 'content':{
   			templateUrl: "search.jsp"
   		 } 
   	 }
 	 })
	 .state('author', {
		 url:"/author/message/{authorid}",
    	 views:{
    		 'content':{
    			templateUrl: "author.jsp"
    		 } 
    	 }
  	 });	 
});
