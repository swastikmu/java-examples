<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Boot App</title>
</head>
<body>

<h4>Add/update Alien</h4>
<form action="addAlien">
	<input type="text" name="aid" /><br>
	<input type="text" name="aname" /><br>
	<input type="text" name="tech" /><br>
	<input type="submit" /><br>
</form>

<h4>get Alien</h4>
<form action="getAlien">
	<input type="text" name="aid" /><br>
	<input type="submit" /><br>
</form>

<h4>Delete Alien</h4>
<form action="deleteAlien">
	<input type="text" name="aid" /><br>
	<input type="submit" /><br>
</form>



</body>
</html>