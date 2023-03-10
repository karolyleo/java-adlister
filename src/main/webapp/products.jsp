

<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 3/10/23
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
        Product product1 = new Product("Tv", 400000);
        Product product2 = new Product("Computer", 20000);
        Product product3 = new Product("Hot-Dog", 400);
        List<Product> products = new ArrayList<>(Arrays.asList(
                product1,
                product2,
                product3
        ));
        request.setAttribute("products", products);
%>
<html>
<head>
    <title>Products</title>
</head>
<body>

<h1>Products</h1>

<c:choose>
    <c:when test="${products.isEmpty()}">
        <h3>No products</h3>
    </c:when>
    <c:otherwise>
        <c:forEach var="product" items="${products}">
            <h3>
                    ${product.name}
                <c:if test="${product.costInCents < 2000}">(cheap!)</c:if>
            </h3>
        </c:forEach>
    </c:otherwise>
</c:choose>


</body>
</html>
