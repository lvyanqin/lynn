<%-- 
    Document   : login
    Created on : 2017-2-7, 13:43:48
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登录</title>
    </head>
    <body>
        <div>
            用户名：<input name="username" value="lynn"/><br/>
            密码：<input type="password" name="password" value="123456"/><br/>
            <input id="loginButton" type="button" value="登录">
        </div>
    </body>
    <script src="/lynn/js/jquery-2.2.2.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#loginButton").click(function () {
                $.ajax({
                    url: "/lynn/login.do",
                    type: 'post',
                    data: {
                        "username": $('input[name="username"]').val(),
                        "password": $('input[name="password"]').val()
                    },
                    dataType: "text",
                    success: function (data) {
                        data = eval("(" + data + ")");
                        if(data.status == "error"){
                            alert(data.msg);
                        }else if(data.status == "ok"){
                            window.location.href = "/lynn/login/success.do";
                        }
                    },
                    error: function () {
                        alert("网页异常");
                    }
                });
            });
        });

    </script>
</html>
