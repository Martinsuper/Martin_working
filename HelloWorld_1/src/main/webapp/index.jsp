<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>my hello world</title>
</head>
<body>


<a href="/springmvc/testModelMap">Test Session</a>


<form action="/springmvc/testModelAttribute">
    id:<input type="text" name="id" value="101"/>
    <br/>
    name:<input type="text" name="name" value="Tom"/>
    <br/>
    <input type="submit" value="update"/>
</form>


</body>
</html>