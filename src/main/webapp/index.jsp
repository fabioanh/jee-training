<html>
<body>

	<h1 align='center'>Beer Selection Page</h1>


	Select beer characteristics
	<p>
	<form action="/beer-app/BeerServlet" method="POST" focus="color">

		Color: <select name="color">
			<option value="light">light</option>
			<option value="amber">amber</option>
			<option value="brown">brown</option>
			<option value="dark">dark</option>
			<option value="red">red</option>
		</select> <br />
		<br />

		<center>
			<input type="submit" value="Select Beer Style" />
		</center>

	</form>

</body>
</html>