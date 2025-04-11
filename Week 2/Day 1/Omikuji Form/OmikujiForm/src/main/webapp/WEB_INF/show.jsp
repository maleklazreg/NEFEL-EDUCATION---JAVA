<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="container">
        <h1>Here's Your Omikuji!</h1>
        <div class="fortune-box">
            <p>
                In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> 
                with <c:out value="${person}"/> as your roommate, <c:out value="${endeavor}"/> 
                for a living. The next time you see a <c:out value="${livingThing}"/>, you will 
                have good luck. Also, <c:out value="${message}"/>.
            </p>
        </div>
        <a href="/omikuji">Go Back</a>
    </div>
</body>
</html>