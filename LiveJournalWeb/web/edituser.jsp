<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter user's information</h1>
        
         <c:set var="user" value="${USER}"/>

        <form method="POST" action="add">
            <input type="hidden" name="userId" value="${user.userId}"/>
            Alias:<input type="text" name="alias" value="${user.alias}"/><br/>
            Email:<input type="text" name="email" value="${user.email}"/><br/>
            Password:<input type="text" name="password" value="${user.password}"/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
