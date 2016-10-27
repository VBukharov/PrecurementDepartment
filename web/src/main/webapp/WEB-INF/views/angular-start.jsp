<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="resources/css/bootstrap.css">
	<link href="resources/css/app.css">
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.js"></script>
	<script src="resources/js/test/app.js"></script>
	<script src="resources/js/test/service.js"></script>
	<script	src="resources/js/test/controller.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="generic-container">
		<h3>Angular JS test</h3>
		<div class="panel panel-default">
			<div class="panel-heading"><span class="lead">All contacts</span></div>
			<div class="tablecontainer">
				<li><a href='#/contacts'>Get contacts</a></li>
				<li><a href='#/contact/ivan'>Get by name (ivan)</a></li>
			</div>
		</div>
	</div>
	
	<div ng-view></div>
	
	<script	src="resources/js/test/controller.js"></script>
</body>
</html>