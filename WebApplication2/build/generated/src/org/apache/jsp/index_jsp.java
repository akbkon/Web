package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>在线留言板</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class = \"navbar-header\">\n");
      out.write("            <div class = \"navbar-title\"><a href=\"index.jsp\" id = \"homepage\">留言板</a></div>\n");
      out.write("            <div class = \"navbar-bottom\">\n");
      out.write("                <a href=\"login.jsp\" id=\"login\">登录&nbsp;&nbsp;</a>\n");
      out.write("                 <a href=\"register.jsp\" id = \"register\">注册</a>\n");
      out.write("            </div>\n");
      out.write("                        </div>\n");
      out.write("            <div class=\"main_outer\">\n");
      out.write("                <div class = \"main_l\">\n");
      out.write("                    <input type=\"button\" value=\"我要发布\" class=\"input_mes\" onclick=\"publish()\"> \n");
      out.write("                </div>\n");
      out.write("                    <div class = \"main_r\">\n");
      out.write("                        <div class = \"user_avatar_outer\">\n");
      out.write("                        <img src=\"images/user.jpg\" id = \"user_avatar\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"user_information\">\n");
      out.write("                            <p>用户名：李狗蛋</p>\n");
      out.write("                            <p>手机号：10086</p>\n");
      out.write("                            <p>性别：未知</p>\n");
      out.write("                            <p>QQ：3838438</p>\n");
      out.write("                            <p>注册时间:1900-01-01</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class = \"main_m\">\n");
      out.write("                        <div class =\"message\">\n");
      out.write("                        <div class = \"avatar_outer\">\n");
      out.write("                           <img class = \"avatar\" src=\"images/11.jpg\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <h3 id=\"user_name\">用户名</h3>\n");
      out.write("                        <h3 id =\"main_text\">\n");
      out.write("                            这gfdsghjfkdlghfjkldghkl里fdsghgjklfdhgjkfldhgfjkldghjksfldhgjkfldhgfjkdlhgfjkldfdhskflshjkafshdjklfshdjklfhsjklfhsjkdfhsjkdhfsjkdhfjksldhfjkld\n");
      out.write("                        </h3>\n");
      out.write("                        <h4 id =\"message_time\">\n");
      out.write("                            留言时间\n");
      out.write("                        </h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class =\"message\">\n");
      out.write("                        <div class = \"avatar_outer\">\n");
      out.write("                           <img class = \"avatar\" src=\"images/11.jpg\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <h3 id=\"user_name\">用户名</h3>\n");
      out.write("                        <h3 id =\"main_text\">\n");
      out.write("                            这gfdsghjfkdlghfjkldghkl里fdsghgjklfdhgjkfldhgfjkldghjksfldhgjkfldhgfjkdlhgfjkldfdhskflshjkafshdjklfshdjklfhsjklfhsjkdfhsjkdhfsjkdhfjksldhfjkld\n");
      out.write("                        </h3>\n");
      out.write("                        <h4 id =\"message_time\">\n");
      out.write("                            留言时间\n");
      out.write("                        </h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("        <div class = \"edit_box\" id = \"edit_box\">\n");
      out.write("            <p>请输入您要发布的内容：</p>\n");
      out.write("            <div class=\"editable\" id=\"richedit\" contenteditable=\"true\"  style=\"padding:10px;width:100%;height:200px;border:solid 1px black;background-color:white; \">\n");
      out.write("            </div><br>\n");
      out.write("            <input type=\"button\" value=\" 斜体 \" onclick=\"italic()\">\n");
      out.write("            <input type=\"button\" value=\" 颜色 \" onclick=\"color()\">\n");
      out.write("            <input type=\"button\" value=\" 字号 \" onclick=\"size_()\"> \n");
      out.write("            <input type=\"button\" value=\" 图像 \" onclick=\"pic()\">\n");
      out.write("            <input type=\"button\" value=\" 链接 \" onclick=\"link_()\">\n");
      out.write("            <input type=\"button\" value=\" 撤销 \" onclick=\"red()\">\n");
      out.write("            <input type=\"button\" value=\" 发布 \" onclick=\"show()\">\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("            function italic() {\n");
      out.write("            document.execCommand(\"italic\", false, null);\n");
      out.write("            }\n");
      out.write("            function show() {\n");
      out.write("            var box = document.getElementById(\"edit_box\");\n");
      out.write("            box.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            function color(){\n");
      out.write("            document.execCommand(\"forecolor\",false,\"red\");\n");
      out.write("            }\n");
      out.write("            function size_(){\n");
      out.write("            document.execCommand(\"fontsize\",false,\"7\");\n");
      out.write("            }\n");
      out.write("            function pic(){\n");
      out.write("            document.execCommand(\"insertimage\",false,\"images/home.gif\");    \n");
      out.write("            }\n");
      out.write("            function link_(){\n");
      out.write("            document.execCommand(\"createlink\",false,\"#\");    \n");
      out.write("                }\n");
      out.write("            function red(){\n");
      out.write("            document.execCommand(\"undo\",false,false);\n");
      out.write("            }\n");
      out.write("            function publish(){\n");
      out.write("                 var box = document.getElementById(\"edit_box\");\n");
      out.write("                  box.style.display = \"inline-block\";\n");
      out.write("            }\n");
      out.write("            </script>\n");
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
