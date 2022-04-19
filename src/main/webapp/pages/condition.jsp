<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2022/3/30
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>条件查询</h1>
    <table border="1">
        <tr>
            <td>书籍id</td>
            <td>书籍名称</td>
            <td>书籍价格</td>
        </tr>
        <tr>
            <form action="${pageContext.request.contextPath}/book/findByCondition" method="post" name="findByConditionForm">
                <td><input type="text" name="bookId"><br></td>
                <td><input type="text" name="bookName"><br><td>
                <input type="submit" value="查询">
            </form>
        </tr>
        <c:forEach items="${bookConditionList}" var="bookCondition">
            <tr>
                <td>${bookCondition.bookId}</td>
                <td>${bookCondition.bookName}</td>
                <td>${bookCondition.price}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="../index.jsp"><<</a>
</body>
</html>
