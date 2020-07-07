<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>成功页面</title>
</head>
<body>
欢迎您，${sessionScope.username }！
<s:actionmessage/>
</body>
</html>