module.config(function($stateProvider, $urlRouterProvider){
	 $stateProvider
	 .state('manageindex', {
		 url:"/manageindex",
     	 views:{
     		 'managehead':{
     			templateUrl: "managehead.jsp"
     		 },
     		 'managecontent':{
     			 templateUrl: "managelist.jsp"
     		 }
     	 }
     	
   	 })
   	.state('managenewsdetail', {
		 url:"/managenewsdetail/{newsid}",
    	 views:{
    		 'managehead':{
    			templateUrl: "managehead.jsp"
    		 },
    		 'managecontent':{
    			 templateUrl: "managenewsdetail.jsp"
    		 }
    	 }
    	
  	 })
  	 .state('managenewsdel', {
  		 url:"/managenewsdel",
  		 views:{
  			 'managehead':{
  				 templateUrl: "managehead.jsp"
  			 },
  			 'managecontent':{
  				 templateUrl: "managenewsdel.jsp"
  			 }
  		 }
  	 
  	 })
  	  .state('managerlogin', {
		 url:"/managerlogin",
     	 views:{
     		
     		 'managecontent':{
     			 templateUrl: "login.jsp"
     		 }
     	 }
     	
   	 });
	 });