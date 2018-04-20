<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 	导入Struts 2标签库 -->
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Hello World</title>
</head>
<body>
	<h1>Hello World</h1>
	<div>
		<h1>
			<!-- 显示Struts Action中message属性内容 -->
			<s:property value="message" />
		</h1>
	</div>
	<hr />
	<div>
		<form action="helloWorld.action" method="post">
			请输入您的姓名： 
			<input name="name" type="text" /> 
			<input type="submit" value="提交" />
		</form>
	</div>
</body>
</html>