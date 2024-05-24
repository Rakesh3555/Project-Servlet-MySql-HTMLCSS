<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
	background-image:url(Images/plain-background.jpg);
	background-size: cover;
}

.box {
	text-align: center;
	margin-top: 10%;
}

.log {
	border: 1px solid rgb(26, 68, 206);
	padding: 20px;
	width: 300px;
	background-color: rgb(248, 248, 248);
	box-shadow: 5px 5px 7px 10px rgba(219, 103, 7, 0.185);
	text-align: justify;
	margin: 0 auto;
}

.b1 {
	border: 1px solid rgb(5, 1, 15);
	color: rgb(250, 250, 252);
	background-color: rgb(248, 248, 250);
	width: 100px;
	border-radius: 15px;
	text-decoration: none;
	text-align: center;
	text-decoration: none;
}

.btn {
	margin-left: 30%;
}
</style>
<body>
	<div class="box">
		<div class="log">
			<h2
				style="font-family: Arial, Helvetica, sans-serif; text-align: center;">Log-In</h2>
			<form action="RgServlet" method="post">
				<label for="EmployeeID">Employee ID : </label> <input type="text" name="EmployeeID" placeholder="EmployeeID" required><br>
				<br> <label for="EmployeePassword">Password : </label> <input type="password" name="EmployeePassword" placeholder="Password" required><br>
                <br><b style="font-size: xx-small;color: red;margin-left: 26%;">Incorrect username / password !</b><br>
				<br> <label>
					<div class="btn">
						<button class="b1" style="color: black">login</button>
						<br>
						<br>
					</div>
			</form>
		</div>
	</div>
</body>
</html>