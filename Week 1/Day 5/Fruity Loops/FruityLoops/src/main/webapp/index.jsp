<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fruit Store</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
    <div class="container">
        <h1>Fruit Store</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="fruit" items="${fruits}">
                    <tr>
                        <td class="${fruit.name.startsWith('G') ? 'highlight' : ''}">
                            <c:out value="${fruit.name}"/>
                        </td>
                        <td><c:out value="${fruit.price}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>