<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- ���� ���� -->
<h1>ȸ������</h1>
<form id="signUpForm" action="/registerPage/register" method="post">
<table>
<tr>
    <td style="width: 200px;">���̵�</td>
    <td style="width: 390px"><input type="text" name="user_id" style="width: 99%;" /></td>
</tr>
<tr>
    <td>��й�ȣ</td>
    <td><input type="password" name="user_password" style="width: 99%;" /></td>
</tr>
<tr>
    <td>�����̸�</td>
    <td><input type="text" name="user_name" style="width: 99%;" /></td>
</tr>
<tr>
    <td>Slack��������</td>
    <td><input type="text" name="slack_info" style="width: 99%;" /></td>
</tr>
<tr>
    <td>�ڵ�����ȣ</td>
    <td><input type="text" name="phone_num" style="width: 99%;" /></td>
</tr>
<tr>
    <td>����</td>
    <td><input type="text" name="gender" style="width: 99%;" /></td>
</tr>
<tr>
    <td>�μ�</td>
    <td><input type="number" name="dept_no" style="width: 99%;" /></td>
</tr>
<tr>
    <td>����</td>
    <td><input type="number" name="position_no" style="width: 99%;" /></td>
</tr>
</table>
<div style="text-align: center;padding-bottom: 15px;">
    <input type="submit" value="Ȯ��" />
</div>
</form>
<!--  ���� �� -->
</body>
</html>