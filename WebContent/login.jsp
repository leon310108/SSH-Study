<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
</head>
<body>
	<h3>用户登录</h3>
	<hr/>
	<s:form action="login" >
		<s:textfield name="username" label="用户名"  size="20"/>
		<s:textfield name="password" label="密码" />
		<s:submit value="登录"/>
	</s:form>
</body>