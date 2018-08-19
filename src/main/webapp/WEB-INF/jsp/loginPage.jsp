<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<body>
	<form class="form-container" action="/loginPage/login" method="post" >
		<div class="form-title"><h2>WeMail</h2></div>
		<div class="form-title">ID</div>
		<input class="form-field" type="text" name="user_id" /><br />
		<div class="form-title">PASSWORD</div>
		<input class="form-field" type="text" name="user_password" /><br />
		<div class="submit-container">
		<input class="submit-button" type="submit" value="Submit" />
		</div>
	</form>
</body>
</head>
</html>