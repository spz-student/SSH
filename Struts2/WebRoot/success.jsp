<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 	导入Struts 2标签库 -->
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>登录成功</title>
	</head>
	<body>
		<h1>
			登录成功
		</h1>
		<div>
			欢迎您，<s:property value="username"/>
			${username}
		</div>
	</body>
</html>