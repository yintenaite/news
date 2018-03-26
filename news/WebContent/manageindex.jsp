<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lumino - Dashboard</title>
<script src="bootstrap/jquery.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link href="css/styles.css" rel="stylesheet">
<script type="text/javascript" src="bootstrap/js/angular.js"></script>	
<script src="bootstrap/js/angular-ui-router.js"></script>
<script type="text/javascript" src="js/manage.js"></script>	
<script type="text/javascript" src="js/managerouter.js"></script>	
<style>
	.aa{
		background-color: #666;
	}
</style>
</head>

<body ng-app="module">
	<div ui-view="managehead"></div>
	<div ui-view="managecontent"></div>
</body>

</html>
    