/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-30 10:26:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class SPleave_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/indexTop.jsp", Long.valueOf(1514608207569L));
    _jspx_dependants.put("/indexbottm.jsp", Long.valueOf(1514376253017L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>OA办公系统</title>\r\n");
      out.write("     <script type=\"text/javascript\" src=\"js/jquery-1.12.4.js\" ></script>\r\n");
      out.write("\t <script type=\"text/javascript\" src=\"js/bootstrap.js\" ></script>\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.list{margin-bottom: 0px;}\r\n");
      out.write("\t\t*{ padding: 0px; }\r\n");
      out.write("\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("  \t<div>\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" >\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"welcome.jsp\"><span class=\"glyphicon glyphicon-home\"></span>&nbsp;&nbsp;<span>自动化办公系统</span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"> </span>&nbsp;&nbsp;退出</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container-fluid\" >\r\n");
      out.write("      <div class=\"row\" >\r\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("           <div class=\"panel-group nav-sidebar list\" id=\"accordion\" role=\"tablist\">\r\n");
      out.write("           \t<!--用户名 -->\r\n");
      out.write("           \t\r\n");
      out.write("\t\t\t\t    <div class=\"panel panel-default list\">\r\n");
      out.write("\t\t\t\t      <div class=\"panel-heading\"  role=\"tab\" id=\"collapseListGroupHeading1\">\r\n");
      out.write("\t\t\t\t        <h4 class=\"panel-title\" >\r\n");
      out.write("\t\t\t\t          <span  class=\"collapsed\"  data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseListGroup\"  aria-controls=\"collapseListGroup1\">\r\n");
      out.write("\t\t\t\t            \t<span class=\"glyphicon glyphicon-cog\"></span> 报销单管理\r\n");
      out.write("\t\t\t\t          </span>\r\n");
      out.write("\t\t\t\t        </h4>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      \r\n");
      out.write("\t\t\t\t      <div id=\"collapseListGroup\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"collapseListGroupHeading1\">\r\n");
      out.write("\t\t\t\t        <ul class=\"list-group\" >\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item \" href=\"#\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\"></span> \r\n");
      out.write("\t\t\t\t          \t<a href=\"cvList.jsp\">查看报销单</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item\" href=\"#\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\"></span>\r\n");
      out.write("\t\t\t\t          \t<a href=\"addcv.jsp\">添加报销单</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    <!--  2-->\r\n");
      out.write("\t\t\t\t    <div class=\"panel panel-default list\">\r\n");
      out.write("\t\t\t\t      <div class=\"panel-heading\" role=\"tab\" id=\"collapseListGroupHeading2\">\r\n");
      out.write("\t\t\t\t        <h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t          <span class=\"collapsed\" data-parent=\"#accordion\" data-toggle=\"collapse\" href=\"#collapseListGroup2\"  aria-controls=\"collapseListGroup2\">\r\n");
      out.write("\t\t\t\t            \t<span class=\"glyphicon glyphicon-cog \"></span> 请假管理\r\n");
      out.write("\t\t\t\t          </span>\r\n");
      out.write("\t\t\t\t        </h4>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      \r\n");
      out.write("\t\t\t\t      <div id=\"collapseListGroup2\" class=\"panel-collapse collapse \" role=\"tabpanel\" aria-labelledby=\"collapseListGroupHeading2\">\r\n");
      out.write("\t\t\t\t        <ul class=\"list-group\" >\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item \" >&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\">\r\n");
      out.write("\t\t\t\t          \t</span> <a href=\"skipLeaveList.action\">查看请假</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\">\r\n");
      out.write("\t\t\t\t          \t</span> <a href=\"skipAddLeave.action\">申请请假</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          \r\n");
      out.write("\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    <!--3 -->\r\n");
      out.write("\t\t\t\t    <div class=\"panel panel-default list\">\r\n");
      out.write("\t\t\t\t      <div class=\"panel-heading\" role=\"tab\" id=\"collapseListGroupHeading4\">\r\n");
      out.write("\t\t\t\t        <h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t          <a class=\"collapsed\" data-parent=\"#accordion\" data-toggle=\"collapse\" href=\"#collapseListGroup4\"  aria-controls=\"collapseListGroup4\">\r\n");
      out.write("\t\t\t\t            \t<span class=\"glyphicon glyphicon-cog\"></span> 统计中心\r\n");
      out.write("\t\t\t\t          </a>\r\n");
      out.write("\t\t\t\t        </h4>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t      \r\n");
      out.write("\t\t\t\t      <div id=\"collapseListGroup4\" class=\"panel-collapse collapse \" role=\"tabpanel\" aria-labelledby=\"collapseListGroupHeading4\">\r\n");
      out.write("\t\t\t\t        <ul class=\"list-group\" >\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item \" >&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\">\r\n");
      out.write("\t\t\t\t          \t</span> <a href=\"#\">请假统计</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\">\r\n");
      out.write("\t\t\t\t          \t</span> <a href=\"#\">报销单统计</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          \r\n");
      out.write("\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t<!--  4-->\r\n");
      out.write("\t\t\t\t    <div class=\"panel panel-default list\">\r\n");
      out.write("\t\t\t\t      <div class=\"panel-heading\" role=\"tab\" id=\"collapseListGroupHeading3\">\r\n");
      out.write("\t\t\t\t        <h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t          <a class=\"collapsed\" data-parent=\"#accordion\" data-toggle=\"collapse\" href=\"#collapseListGroup3\"  aria-controls=\"collapseListGroup3\">\r\n");
      out.write("\t\t\t\t            \t<span class=\"glyphicon glyphicon-cog\"></span> 信息中心\r\n");
      out.write("\t\t\t\t          </a>\r\n");
      out.write("\t\t\t\t        </h4>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t      <div id=\"collapseListGroup3\" class=\"panel-collapse collapse \" role=\"tabpanel\" aria-labelledby=\"collapseListGroupHeading3\">\r\n");
      out.write("\t\t\t\t        <ul class=\"list-group\" >\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item \" >&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\">\r\n");
      out.write("\t\t\t\t          \t</span> <a href=\"#\">信息中心1</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          <li class=\"list-group-item\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t          \t<span class=\"glyphicon glyphicon-th\">\r\n");
      out.write("\t\t\t\t          \t</span> <a href=\"#\">信息中心2</a>\r\n");
      out.write("\t\t\t\t          </li>\r\n");
      out.write("\t\t\t\t          \r\n");
      out.write("\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2\">\r\n");
      out.write("        \t\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkLeave(status) {\r\n");
      out.write("\t\tif (!confirm('确定' + status + '请假吗')) return;\r\n");
      out.write("\t\tdocument.checkLeaveFrom[2].value=status;\r\n");
      out.write("\t\tdocument.checkLeaveFrom.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<h4>请假基本信息</h4>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<form class=\"form-inline\" action=\"checkLeave.action\" method=\"post\"\r\n");
      out.write("\t\tname=\"checkLeaveFrom\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp; 填写人:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.sysEmployeeByProposerEid.ename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;部&nbsp;&nbsp;&nbsp;&nbsp;门:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.sysEmployeeByProposerEid.sysDepartment.dname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp; 请假事由:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.event}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;开始时间:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.begindate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;结束时间:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.closuredate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;请假天数:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.days}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;休假类型:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.leavetype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;审批状态:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;处理人:</label>\r\n");
      out.write("\t\t\t\t\t<p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.sysEmployeeByExecutorEid.ename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label>&nbsp;&nbsp;审批意见：</label>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control input-lg \"\r\n");
      out.write("\t\t\t\t\t\tname=\"leave.leaveResult.shsuggestion\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"leave.id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leave.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"leave.status\" name=\"leave.status\" />\r\n");
      out.write("\t\t\t<div class=\"col-lg-1\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-1\">\r\n");
      out.write("\t\t\t\t<a type=\"button\" class=\"btn btn-primary\" id=\"SCCB\" onclick=\"checkLeave('已审批')\">审批通过</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-1\">\r\n");
      out.write("\t\t\t\t<a type=\"button\" class=\"btn btn-primary\" id=\"ballback\" onclick=\"checkLeave('已打回 ')\">打回</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-6\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       </div>\t\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
