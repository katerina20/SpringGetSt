<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Flowers List</title>
</head>
    <body>
        <h1>Flowers List</h1>
        <br/>
        <div>
            <table border="1">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Color</th>
                </tr>
                <c:forEach items="${flowers}" var="flower">
                    <tr>
                        <td>${flower.id}</td>
                        <td>${flower.name}</td>
                        <td>${flower.color}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>