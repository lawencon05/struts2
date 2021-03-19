<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div>
		<s:form action="loginprocess">
			<s:textfield name="user.username" label="Username" />
			<s:password name="user.pass" label="Password" />
			<s:submit value="LOGIN"/>
		</s:form>
	</div>
</body>
</html>