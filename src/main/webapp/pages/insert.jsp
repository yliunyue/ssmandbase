<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/3/29
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加书籍</h1>
    <form action="${pageContext.request.contextPath}/book/insert" method="post" name="insertForm">
        书籍名称：<input type="text" name="bookName"><br>
        书籍价格：<input type="text" name="price"><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
