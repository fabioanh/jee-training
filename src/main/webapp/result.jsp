<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Beer Recommendations</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
</head>

<body>
	<c:set var="root" value="${request.contextPath}/" />
	<h1 align="center">Beer Recommendations JSP</h1>
	<c:if test="${fn:length(styles) == 0}">
		<p>
			<c:out value="${requestScope.emptyStylesMessage}" />
		<p />
	</c:if>
	<c:if test="${not empty styles}">
		<p>
			<c:forEach items="${requestScope.styles}" var="style">
				<br />
				<c:out value="${style}" />
			</c:forEach>
		</p>
	</c:if>
	<a href="<c:url value="${root}BeerForm"/>">Back Home</a>
</body>
</html>