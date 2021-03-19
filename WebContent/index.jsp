<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Home Page</title>
<s:head />
</head>

<body>
	<h3>Welcome to Struts2</h3>
	<p>
		<a href="<s:url action='login'/>">Login</a><br />
		<a href="<s:url action='dashboard'/>">Dashboard</a>
	</p>
</body>
</html>
