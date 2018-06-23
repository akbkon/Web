<%-- 
    Document   : register
    Created on : 2018-6-22, 16:32:00
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <title>注册</title>
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
                width:70%;
                border-radius: 10px;
                height:30px;
                display:inline-block;
            }
            h5{
                display:inline-block;
            }
            
            #button{
                margin-left:30px;
                display:block;
                width:75%;
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
                top:20px;
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
                <h2> 注册</h2>
            </div>
            <div class="main_form">
                <form action="#" method="post">
                    <h5>用户名:</h5>
                    <input name="username" type="text" id="input">
                    <br>
                    <h5>密&nbsp;&nbsp;&nbsp;&nbsp;码:</h5>
                    <input name="password" type="text" id="input">
                    <h5>性&nbsp;&nbsp;&nbsp;&nbsp;别:</h5>
                    <input name="sex" type="text" id="input">
                    <h5>Q&nbsp;&nbsp;&nbsp;&nbsp;Q :</h5>
                    <input name="QQ" type="text" id="input">
                    <input name="login" type="submit" value="登录" id="button">
                </form>
            </div>
        </div>
    </body>
</html>
