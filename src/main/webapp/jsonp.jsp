<%-- 
    Document   : jsonp
    Created on : 2017-5-10, 10:42:53
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1><button id="a">aaaaa</button>
        <h1>Hello World!</h1>
        <h1>Hello World!</h1>
        <h1>Hello World!</h1>
        <h1>Hello World!</h1>
    </body>
    <script src="js/jquery-2.2.2.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#a").click(function () {
                $.ajax({
                    type: "post",
                    url: "http://192.168.1.237:8080/login",
                    crossDomain: true,
                    dataType: "json",
                    data: {},
                    jsonp: "callback",
                    jsonpCallback: "a",
                    success: function (data) {
                        alert(data)
//                        if (data.result == 1) {
//                            alert("成功！");
//                        } else {
//                            alert("数据错误");
//                        }
                    },
                    error: function () {
                        alert("-- fail --");
                    }
                });
            })
        });

    </script>
</html>
