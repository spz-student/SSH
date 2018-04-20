<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>青鸟租房 - 用户注册</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
	<div id="header" class="wrap">
		<div id="logo">
			<img src="images/logo.gif" />
		</div>
	</div>
	<div id="regLogin" class="wrap">
		<div class="dialog">
			<dl class="clearfix">
				<dt>新用户注册</dt>
				<dd class="past">填写个人信息</dd>
			</dl>
			<div class="box">
				<s:property value="message" />
				<s:form action="register.action" method="post">
					<div class="infos">
						<table class="field">
							<tr>
								<td class="field">用 户 名：</td>
								<td><s:textfield cssClass="text" name="user.username" required="true"/></td>
							</tr>
							<tr>
								<td class="field">密 码：</td>
								<td>
									<!-- <input type="password" class="text" name="password" /> -->
									<s:password cssClass="text" name="user.password" required="true"/>
								</td>
							</tr>
							<tr>
								<td class="field">确认密码：</td>
								<td>
									<!-- <input type="password" class="text" name="repassword" />  -->
									<s:password cssClass="text" name="repassword" required="true"/>
								</td>
							</tr>
							<tr>
								<td class="field">电 话：</td>
								<td>
									<!-- <input type="text" class="text" name="telephone" /> --> <s:textfield
										cssClass="text" name="user.telephone"/>
								</td>
							</tr>
							<tr>
								<td class="field">用户姓名：</td>
								<td><s:textfield cssClass="text" name="user.name" required="true"/></td>
							</tr>
						</table>
						<div class="buttons">
							<!-- <input type="submit" name="submit" value="立即注册" /> -->
							<s:submit value="立即注册" />
						</div>
					</div>

				</s:form>
			</div>
		</div>
	</div>
	<div id="footer" class="wrap">
		<dl>
			<dt>青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号</dt>
			<dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>
		</dl>
	</div>
</body>
</html>

