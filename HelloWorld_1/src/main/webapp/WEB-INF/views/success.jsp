<%--
  Created by IntelliJ IDEA.
  User: Martin_working
  Date: 2018/7/31
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>show message</title>
<body>
    Map: ${requestScope.age}
    <br/>

    Model: ${requestScope.mail}
    <br/>
    ModelMdap: ${requestScope.City}
</body>
</html>
