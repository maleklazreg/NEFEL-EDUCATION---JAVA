<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Date</title>
    <script src="/js/script.js"></script>
</head>
<body>
    <h2><fmt:formatDate value="${date}" pattern="EEEE, MMM d, yyyy"/></h2>
</body>
</html>