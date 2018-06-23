<%-- 
    Document   : index
    Created on : 2018-6-22, 14:21:09
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在线留言板</title>
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <style>

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
            <div class="main_outer">
                <div class = "main_l">
                    <input type="button" value="我要发布" class="input_mes" onclick="publish()"> 
                </div>
                    <div class = "main_r">
                        <div class = "user_avatar_outer">
                        <img src="images/user.jpg" id = "user_avatar"/>
                        </div>
                        <div class="user_information">
                            <p>用户名：李狗蛋</p>
                            <p>手机号：10086</p>
                            <p>性别：未知</p>
                            <p>QQ：3838438</p>
                            <p>注册时间:1900-01-01</p>
                        </div>
                    </div>
                    <div class = "main_m">
                        <div class ="message">
                        <div class = "avatar_outer">
                           <img class = "avatar" src="images/11.jpg"/>
                        </div>
                        <h3 id="user_name">用户名</h3>
                        <h3 id ="main_text">
                            这gfdsghjfkdlghfjkldghkl里fdsghgjklfdhgjkfldhgfjkldghjksfldhgjkfldhgfjkdlhgfjkldfdhskflshjkafshdjklfshdjklfhsjklfhsjkdfhsjkdhfsjkdhfjksldhfjkld
                        </h3>
                        <h4 id ="message_time">
                            留言时间
                        </h4>
                        </div>
                        <div class ="message">
                        <div class = "avatar_outer">
                           <img class = "avatar" src="images/11.jpg"/>
                        </div>
                        <h3 id="user_name">用户名</h3>
                        <h3 id ="main_text">
                            这gfdsghjfkdlghfjkldghkl里fdsghgjklfdhgjkfldhgfjkldghjksfldhgjkfldhgfjkdlhgfjkldfdhskflshjkafshdjklfshdjklfhsjklfhsjkdfhsjkdhfsjkdhfjksldhfjkld
                        </h3>
                        <h4 id ="message_time">
                            留言时间
                        </h4>
                        </div>
                    </div>
        </div>
        <div class = "edit_box" id = "edit_box">
            <p>请输入您要发布的内容：</p>
            <div class="editable" id="richedit" contenteditable="true"  style="padding:10px;width:100%;height:200px;border:solid 1px black;background-color:white; ">
            </div><br>
            <input type="button" value=" 斜体 " onclick="italic()">
            <input type="button" value=" 颜色 " onclick="color()">
            <input type="button" value=" 字号 " onclick="size_()"> 
            <input type="button" value=" 图像 " onclick="pic()">
            <input type="button" value=" 链接 " onclick="link_()">
            <input type="button" value=" 撤销 " onclick="red()">
            <input type="button" value=" 发布 " onclick="show()">

            <script>
            function italic() {
            document.execCommand("italic", false, null);
            }
            function show() {
            var box = document.getElementById("edit_box");
            box.style.display = "none";
            }
            function color(){
            document.execCommand("forecolor",false,"red");
            }
            function size_(){
            document.execCommand("fontsize",false,"7");
            }
            function pic(){
            document.execCommand("insertimage",false,"images/home.gif");    
            }
            function link_(){
            document.execCommand("createlink",false,"#");    
                }
            function red(){
            document.execCommand("undo",false,false);
            }
            function publish(){
                 var box = document.getElementById("edit_box");
                  box.style.display = "inline-block";
            }
            </script>
        </div>
    </body>
</html>
