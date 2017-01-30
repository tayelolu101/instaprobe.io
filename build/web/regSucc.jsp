<%-- 
    Document   : regSucc
    Created on : 09-Dec-2016, 11:18:24
    Author     : abiolam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ChateMe - Registration Successful</title>
    </head>
    <body>
        <h2>User Registration Informations</h2>
        <b>Username: </b>${User.username}<br/>
        <b>Full name: </b>${User.fullname}<br/>
        Sign-in<a href="signin.jsp">-here</a>
    </body>
</html>
