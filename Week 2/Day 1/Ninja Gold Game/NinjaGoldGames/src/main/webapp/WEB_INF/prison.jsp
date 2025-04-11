<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Debtors' Prison</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="container">
        <h1>Debtors' Prison</h1>
        <p>You've fallen too far into debt! Your gold is ${gold}.</p>
        <p>You've been sent to debtors' prison. Better luck next time!</p>
        <form action="/reset" method="post">
            <button type="submit" class="reset">Start Over</button>
        </form>
    </div>
</body>
</html>