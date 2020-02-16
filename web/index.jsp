<%-- 
    Document   : index
    Created on : Feb 16, 2020, 1:50:14 PM
    Author     : Mobile Apps
--%>



<%@page import="service.DaoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CDI Demo</title>
    </head>
    <body>

        <c:forEach items="${DaoService.data()}" var="person">

            <c:out value="${person}"/>

        </c:forEach>

    </body>
</html>
