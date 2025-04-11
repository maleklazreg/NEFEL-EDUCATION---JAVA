<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ninja Gold Game</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="container">
        <h1>Ninja Gold Game</h1>
        <div class="gold">
            <label>Your Gold:</label>
            <input type="text" value="${gold}" readonly>
        </div>
        <div class="activities">
            <div class="activity">
                <h3>Farm</h3>
                <p>(earns 10-20 gold)</p>
                <form action="/process" method="post">
                    <input type="hidden" name="location" value="farm">
                    <button type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="activity">
                <h3>Cave</h3>
                <p>(earns 5-10 gold)</p>
                <form action="/process" method="post">
                    <input type="hidden" name="location" value="cave">
                    <button type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="activity">
                <h3>House</h3>
                <p>(earns 2-5 gold)</p>
                <form action="/process" method="post">
                    <input type="hidden" name="location" value="house">
                    <button type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="activity">
                <h3>Quest</h3>
                <p>(earns/takes 0-50 gold)</p>
                <form action="/process" method="post">
                    <input type="hidden" name="location" value="quest">
                    <button type="submit">Find Gold!</button>
                </form>
            </div>
            <div class="activity">
                <h3>Spa</h3>
                <p>(loses 5-20 gold)</p>
                <form action="/process" method="post">
                    <input type="hidden" name="location" value="spa">
                    <button type="submit">Relax!</button>
                </form>
            </div>
        </div>
        <h2>Activities:</h2>
        <div class="log">
            <c:forEach var="activity" items="${activities}">
                <p class="${activity.contains('earned') ? 'earned' : 'lost'}">
                    <c:out value="${activity}"/>
                </p>
            </c:forEach>
        </div>
        <form action="/reset" method="post">
            <button type="submit" class="reset">Reset Game</button>
        </form>
    </div>
</body>
</html>