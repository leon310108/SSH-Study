<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="context-type" content="text/html;charset=utf-8">
<title>注册页面</title>
</head>
<body>
<h3>用户 </h3>
	<hr />
	<s:form action="regist">
		<s:textfield name="username" label="用户名" />
		<s:textfield name="password1" label="密码" type="password"/>
		<s:textfield name="password2" label="确认密码" type="password"/>
		<tr>
			<td colspan="2"><s:submit value="注册" theme="simple" /> <s:submit
					value="重填" theme="simple" /></td>
		</tr>
	</s:form>
</body>
</html>