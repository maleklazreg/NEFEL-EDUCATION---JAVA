<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Current visit count</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <h2>You have visited <a href="/">http://your_server</a> <c:out value="${count}"/> times.</h2>
    <p><a href="/increment-by-two">Test another visit?</a></p>
    <form action="/reset" method="post">
        <button type="submit">Reset Counter</button>
    </form>
</body>
</html>