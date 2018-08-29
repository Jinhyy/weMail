<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 본문 시작 -->
<h1>회원가입</h1>
<form id="signUpForm" action="/registerPage/register" method="post">
<table>
<tr>
    <td style="width: 200px;">아이디</td>
    <td style="width: 390px"><input type="text" name="user_id" style="width: 99%;" /></td>
</tr>
<tr>
    <td>비밀번호</td>
    <td><input type="password" name="user_password" style="width: 99%;" /></td>
</tr>
<tr>
    <td>유저이름</td>
    <td><input type="text" name="user_name" style="width: 99%;" /></td>
</tr>
<tr>
    <td>Slack연동정보</td>
    <td><input type="text" name="slack_info" style="width: 99%;" /></td>
</tr>
<tr>
    <td>핸드폰번호</td>
    <td><input type="text" name="phone_num" style="width: 99%;" /></td>
</tr>
<tr>
    <td>성별</td>
    <td><input type="text" name="gender" style="width: 99%;" /></td>
</tr>
<tr>
    <td>부서</td>
    <td><input type="number" name="dept_no" style="width: 99%;" /></td>
</tr>
<tr>
    <td>직급</td>
    <td><input type="number" name="position_no" style="width: 99%;" /></td>
</tr>
</table>
<div style="text-align: center;padding-bottom: 15px;">
    <input type="submit" value="확인" />
</div>
</form>
<!--  본문 끝 -->
</body>
</html>