<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../partials/head.jsp"/>
<body>
    <jsp:include page="../partials/navbar.jsp"/>
    <h1>All ads</h1>
    <c:forEach var="ad" items="${adList}">
        <div>
            <h2>${ad.title}</h2>
            <p>${ad.getDescription()}</p>
        </div>
    </c:forEach>
</body>
</html>