<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="container">
        <h1>Send an Omikuji!!</h1>
        <form action="/process" method="post">
            <div class="form-group">
                <label>Pick any number from 5 to 25:</label>
                <input type="number" name="number" min="5" max="25" required>
            </div>
            <div class="form-group">
                <label>Enter the name of any city:</label>
                <input type="text" name="city" required>
            </div>
            <div class="form-group">
                <label>Enter the name of any real person:</label>
                <input type="text" name="person" required>
            </div>
            <div class="form-group">
                <label>Enter professional endeavor or hobby:</label>
                <input type="text" name="endeavor" required>
            </div>
            <div class="form-group">
                <label>Enter any type of living thing:</label>
                <input type="text" name="livingThing" required>
            </div>
            <div class="form-group">
                <label>Say something nice to someone:</label>
                <textarea name="message" required></textarea>
            </div>
            <button type="submit">Send and show a friend</button>
        </form>
    </div>
</body>
</html>