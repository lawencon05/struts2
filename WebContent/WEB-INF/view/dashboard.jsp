<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<h2>Welcome, <s:property value="username" /></h2>
	<p>
		<a href="<s:url action='logout'/>">Logout</a>
	</p>
</body>
</html>