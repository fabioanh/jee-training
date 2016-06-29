<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Beer Recommender</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>

	<h1 align='center'>Beer Selection Page</h1>


	Select beer characteristics
	<p>
	<form action="/beer-app/BeerForm" method="POST" focus="color">

		Color: <select name="color">
			<c:forEach items="${requestScope.colors}" var="col">
				<option value="${col}">${col}</option>
			</c:forEach>
		</select> <br /> <br />

		<center>
			<input type="submit" value="Select Beer Style" />
		</center>

	</form>

</body>
</html>