<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Time</title>
    <script src="/js/script.js"></script>
</head>
<body>
    <h2><fmt:formatDate value="${time}" pattern="h:mm a"/></h2>
</body>
</html>