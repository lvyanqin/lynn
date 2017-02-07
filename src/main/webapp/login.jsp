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
            <form action="/lynn/login.do" method="post">
                用户名：<input name="username"/><br/>
                密码：<input type="password" name="password"/><br/>
                <input type="submit" value="登录">
            </form>
        </div>
    </body>
</html>
