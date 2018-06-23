<%-- 
    Document   : register
    Created on : 2018-6-22, 16:32:00
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*, java.sql.*" %>
<%
    request.setCharacterEncoding("utf-8");
    String user = "";
    String passw = "";
    boolean login;
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
            else {
                
            }
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <title>登录</title>
        <style>
            .main_contain{
                position:relative;
                top:100px;
/*                left:450px;*/
                width:300px;
                height:400px;
                background: rgba(255,255,255,0.7);
                border-radius: 20px;
                border:1px solid rgb(31,201,44);
                margin:auto;
            }
            .main_header{
                position: relative;
                height:40px;
                border-bottom: 1px solid rgb(31,201,44);
            }
            .main_header>h2{
                text-align: center;
                color:rgb(99,231,108);
                font-family: 微软雅黑;
            }
            .main_form{
                padding:20px;
                color:rgb(99,231,108);
                padding-top: 10px;
            }
            .main_form #input{
                width:100%;
                border-radius: 10px;
                height:30px;
            }
            #button{
                display:block;
                width:100%;
                height:34px;
                padding:6px 12px;
                font-size:14px;
                color:#555;
                background-color:#fff;
                background-image:none;
                border:1px solid #ccc;
                border-radius:4px;
                box-shadow:inset 0 1px 1px rgba(0,0,0,.075);
                position:relative;
                border-radius: 10px;
                top:40px;
            }
        </style>
    </head>
    <body>
            <div class = "navbar-header">
            <div class = "navbar-title"><a href="index.jsp" id = "homepage">留言板</a></div>
            <div class = "navbar-bottom">
                <a href="login.jsp" id="login">登录&nbsp;&nbsp;</a>
                 <a href="register.jsp" id = "register">注册</a>
            </div>
            </div>
        <div class="main_contain">
            <div class="main_header">
                <h2> 用户登录</h2>
            </div>
            <div class="main_form">
                <form action="login.jsp" method="post">
                    <h3>用户名:</h3>
                    <input name="username" type="text" id="input">
                    <h3>密码:</h3>
                    <input name="password" type="text" id="input">
                    <%if (!login) {
                        out.print("<p style='color:red'>用户名或密码错误</p>");
                    }%>
                    <input name="login" type="submit" value="登录" id="button">
                </form>
            </div>
        </div>
    </body>
</html>
