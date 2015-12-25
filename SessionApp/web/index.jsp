<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" action="first">
            Name:<input type="text" name="storedParameter"/>
            <input type="submit"/>
        </form>
        <p/>
        <a href="second">Get Second</a>
        <p/>
        <a href="remove">Remove Session</a>
        
    </body>
</html>
