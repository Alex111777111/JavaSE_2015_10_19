<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World</h1>
        
    <strong><%=(String)request.getAttribute("MOD_1") %></strong>
    <strong><%=(String)request.getAttribute("MOD_2") %></strong>
    
    </body>
</html>
