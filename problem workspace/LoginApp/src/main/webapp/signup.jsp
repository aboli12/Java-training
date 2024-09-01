<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Sign up page</h2>
<form action="signup" method="post">
<label>EmailId</label>
<input type="email" name="emailid"/><br/>
<label>Password</label>
<input type="password" name="password"/><br/>
<label>Type of User</label>
<input type="text" name="typeofuser"/><br/>
<input type="submit" value="SignUp"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>