<%-- 
    Document   : login_success
    Created on : 2017-2-7, 14:01:54
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登录成功</title>
    </head>
    <body>
        <h1>欢迎${username}</h1>
        <h1>s2:${s2}</h1>
        <h1>s3:${s3}</h1>
        <br/>map
        <ol>
        <c:forEach items="${map}" var="map">
            <li>${map.key}-${map.value}</li>
        </c:forEach>
        </ol>
    </body>
</html>
