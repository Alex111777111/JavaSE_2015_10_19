<%@page import="java.util.List"%>
<%@page import="edu.javacourse.live.entity.LiveUser"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>

        <table border="1">
            <thead>
                <th>User ID</th>
                <th>User Alias</th>
                <th>User Email</th>
                <th></th>
            </thead>
            <c:forEach var="user" items="${USER_LIST}" varStatus="status">
                <c:url var="userUrl" value="getUser">
                    <c:param name="userId" value="${user.userId}"/>
                </c:url>
                <c:url var="userDelete" value="deleteUser">
                    <c:param name="userId" value="${user.userId}"/>
                </c:url>

                <c:if test="${status.count%2==1}">
                    <tr style="background-color: yellow;">
                </c:if>
                <c:if test="${status.count%2!=1}">
                    <tr style="background-color: white;">
                </c:if>
                        <td><a href="${userUrl}">${user.userId}</a></td>
                        <td>${user.alias}</td>
                        <td>${user.email}</td>
                        <td><a href="${userDelete}">Delete</a></td>
                    </tr>
            </c:forEach>
        </table>
        <p/>
        <a href="edituser.jsp">Add user</a>
    </body>
</html>
