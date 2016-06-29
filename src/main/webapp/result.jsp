<%@ page import="java.util.*"%>

<html>

<head>
<title>Beer Recommendations</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
</head>

<body>
	<c:set var="root" value="${request.contextPath}/" />
			<%
				ArrayList styles = (ArrayList) request.getAttribute("styles");
			%>
		<h1 align="center">Beer Recommendations JSP</h1>
	<c:if test="${fn:length(styles) == 0}">
		<p> <c:out value="${requestScope.emptyStylesMessage}"/>
		<p/>
	</c:if>
	<c:if test="${not empty styles}">
		<p>

			<%

					Iterator it = styles.iterator();

					while (it.hasNext()) {
						out.print("<br>try " + it.next());
					}
			%>
		</p>
	</c:if>
	<a href="<c:url value="${root}BeerForm"/>">Back Home</a>
</body>
</html>