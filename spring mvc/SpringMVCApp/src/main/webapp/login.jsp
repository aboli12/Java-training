<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login page with Get Method</h2>
<form action="checkuserwithget" method="get">
<label>EmailId</label>
<input type="email" name="emailid"/><br/>
<label>Password</label>
<input type="password" name="password"/><br/>
<input type="submit" value="SignIn"/>
<input type="reset" value="reset"/>
</form>
<br/>
<h2>Login page with Post Method</h2>
<form action="checkuserwithpost" method="post">
<label>EmailId</label>
<input type="email" name="emailid"/><br/>
<label>Password</label>
<input type="password" name="password"/><br/>
<input type="submit" value="SignIn"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>