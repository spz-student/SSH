<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>用户登录</title>
</head>
<body>
	<h1>用户登录</h1>
	<form action="login.action" method="post">
		<div>
			用户名： <input name="username" type="text" value="" />
		</div>
		<div>
			密&nbsp;&nbsp;码： <input name="password" type="password" value="" />
		</div>
		<input type="submit" value="提交" />
	</form>
	<s:fielderror>
		<s:param>username</s:param>
  				<s:param>password</s:param>
	</s:fielderror>
</body>
</html>