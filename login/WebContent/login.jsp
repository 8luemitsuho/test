<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" url="/struts-tags" tagdir=""%>
<!DOCTYPE html">
<html>
<head>
<meta charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="name"/>
		<s:password name="password"/>
		<s:submit values="ログイン"/>
	</s:form>
</body>
</html>