<%-- 
    Document   : signin
    Created on : 09-Dec-2016, 10:18:19
    Author     : abiolam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIGN IN</title>
    </head>
    <body>
        <form action="login" method="POST">
            <fieldset style="width: 60px">
                <legend>ACCOUNT INFO</legend>
                <table>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="username" required="true"</td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" required="true"</td>
                    </tr>
                </table>
            </fieldset>
            <input type="submit" value="Login"> <input type="reset" value="cancel"> 
        </form>
    </body>
</html>
