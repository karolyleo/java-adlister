<%@ page import="java.util.ArrayList" %>
<%@ page import="albums.Quote" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Quotes</title>
</head>
<body>

<c:set var="quotes" value="<%= new ArrayList<Quote>() %>"/>
<c:forEach items="<%= quotes %>" var="quote">
    <p>"<c:out value="${quote.content}"/> - <c:out value="${quote.author}"/></p>
</c:forEach>

<c:set target="${quotes}" property="0" value="<%= new Quote('Shakespear', 'To be or not to be. That is the true question!') %>"/>
<c:set target="${quotes}" property="1" value="<%= new Quote('Thomas Jefferson', 'Early to bed, early to rise. Makes a man healthy, wealthy, and wise.') %>"/>
<c:set target="${quotes}" property="2" value="<%= new Quote('El Chavo del 8', 'Pi pi pi pi piiiii!') %>"/>
<c:set target="${quotes}" property="3" value="<%= new Quote('Heinrich Heine', 'Ich weiß nicht, was soll es bedeuten, dass ich so traurig bin. Ein Märchen aus alten Zeiten, das kommt mir nicht aus dem Sinn.') %>"/>

</body>
</html>
