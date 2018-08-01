<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>my hello world</title>
</head>
<body>
<a href="/doICando?name=top">这个是一个跳转链接</a>
<br/>
<br/>
<a href="/antStyle">Ant Style</a>
<br/>
<br/>
<a href="/testPage/12">占位符测试</a>
<br/>
<br/>
<a href="/testGet/123">Test GET</a>
<br/>
<br/>


<form method="post" action="testPost">
    <input type="submit" value="POST"/>
</form>

<br/>
<br/>

<form action="/testDelete/12" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="DELETE"/>
</form>

<br/>
<br/>

<form action="/testPut/5827" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="PUT"/>
</form>

<br/>
<br/>
<%--测试获取请求参数--%>


<%--<form action="/testtestRequestParam" method="post">--%>
    <%--id:<input type="text" name="id"/>--%>
    <%--<br/>--%>
    <%--name:<input type="text" name="name"/>--%>
    <%--<br/>--%>
    <%--<input type="submit" value="submit"/>--%>
<%--</form>--%>


<form action="/testPOJO" method="post">
    id:<input type="text" name="id"/>
    <br/>
    name:<input type="text" name="name"/>
    <br/>
    city:<input type="text" name="address.city"/>
    <br/>
    street:<input type="text" name="address.street"/>
    <input type="submit" value="submit"/>
</form>
<br/>

获取请求报头信息

<br/>
<a href="/testRequestHeader">Test RequestHeader</a>
<br/>
<a href="/testCookiesValues">Test CookiesValues</a>

<br/>

<a href="/testServletAPI">Test ServletAPI</a>



<br/>

<a href="testModelAndView">Test ModelAndView</a>
</body>
</html>