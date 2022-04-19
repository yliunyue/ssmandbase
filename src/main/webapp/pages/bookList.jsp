<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/3/29
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<h1>书籍列表</h1>
<table border="1">
    <tr>
        <th>书籍ID</th>
        <th>书籍名称</th>
        <th>书籍价格</th>
        <th></th>
        <th></th>
    </tr>

    <tr>
        <c:forEach items="${bookList}" var="book">
        <form action="" method="post" name="form1">
            <td><input type="text" value="${book.bookId}" name="bookId" readonly></td>
            <td><input type="text" value="${book.bookName}" name="bookName" ></td>
            <td><input type="text" value="${book.price}" name="price"></td>
            <td><input type="submit" value="删除" formaction="/book/delete"></td>
            <td><input type="submit" value="修改" formaction="/book/update"></td>

        </form>
    </tr>
    </c:forEach>


</table>
<a href="../index.jsp"><<</a>
</body>
</html>
