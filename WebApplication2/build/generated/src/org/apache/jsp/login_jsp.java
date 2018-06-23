package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    request.setCharacterEncoding("utf-8");
    String user = "";
    String passw = "";
    boolean login = false;
    if (request.getMethod().equalsIgnoreCase("post")) {
        Enumeration<String> enums = request.getParameterNames();
	while (enums.hasMoreElements()) {
            String name = (String)enums.nextElement();
            if (name.equals("username")) {
                user += request.getParameter(name);
            }
            if (name.equals("password")) {
                passw += request.getParameter(name);
            }
	}
        String connectString = "jdbc:mysql://172.18.187.234:53306/mysql"
					+ "?autoReconnect=true&useUnicode=true"
					+ "&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(connectString, "user", "123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from salt_user where name =" + user);
            ResultSetMetaData rsmd = rs.getMetaData();
            if (rs.next()) {
                if (passw.equals(rs.getString("passwd"))) {
                    login = true;
                }
            }
        }
        catch (Exception e) {
            e.getMessage();
        }
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        <title>登录</title>\n");
      out.write("        <style>\n");
      out.write("            .main_contain{\n");
      out.write("                position:relative;\n");
      out.write("                top:100px;\n");
      out.write("/*                left:450px;*/\n");
      out.write("                width:300px;\n");
      out.write("                height:400px;\n");
      out.write("                background: rgba(255,255,255,0.7);\n");
      out.write("                border-radius: 20px;\n");
      out.write("                border:1px solid rgb(31,201,44);\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("            .main_header{\n");
      out.write("                position: relative;\n");
      out.write("                height:40px;\n");
      out.write("                border-bottom: 1px solid rgb(31,201,44);\n");
      out.write("            }\n");
      out.write("            .main_header>h2{\n");
      out.write("                text-align: center;\n");
      out.write("                color:rgb(99,231,108);\n");
      out.write("                font-family: 微软雅黑;\n");
      out.write("            }\n");
      out.write("            .main_form{\n");
      out.write("                padding:20px;\n");
      out.write("                color:rgb(99,231,108);\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("            .main_form #input{\n");
      out.write("                width:100%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                height:30px;\n");
      out.write("            }\n");
      out.write("            #button{\n");
      out.write("                display:block;\n");
      out.write("                width:100%;\n");
      out.write("                height:34px;\n");
      out.write("                padding:6px 12px;\n");
      out.write("                font-size:14px;\n");
      out.write("                color:#555;\n");
      out.write("                background-color:#fff;\n");
      out.write("                background-image:none;\n");
      out.write("                border:1px solid #ccc;\n");
      out.write("                border-radius:4px;\n");
      out.write("                box-shadow:inset 0 1px 1px rgba(0,0,0,.075);\n");
      out.write("                position:relative;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                top:40px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class = \"navbar-header\">\n");
      out.write("            <div class = \"navbar-title\"><a href=\"index.jsp\" id = \"homepage\">留言板</a></div>\n");
      out.write("            <div class = \"navbar-bottom\">\n");
      out.write("                <a href=\"login.jsp\" id=\"login\">登录&nbsp;&nbsp;</a>\n");
      out.write("                 <a href=\"register.jsp\" id = \"register\">注册</a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"main_contain\">\n");
      out.write("            <div class=\"main_header\">\n");
      out.write("                <h2> 用户登录</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main_form\">\n");
      out.write("                <form action=\"login.jsp\" method=\"post\">\n");
      out.write("                    <h3>用户名:</h3>\n");
      out.write("                    <input name=\"username\" type=\"text\" id=\"input\">\n");
      out.write("                    <h3>密码:</h3>\n");
      out.write("                    <input name=\"password\" type=\"text\" id=\"input\">\n");
      out.write("                    ");
if (!login) {
                        out.print("<p style='color:red'>用户名或密码错误</p>");
                    }
      out.write("\n");
      out.write("                    <input name=\"login\" type=\"submit\" value=\"登录\" id=\"button\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
