<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
 
<hr>
<h1 align="center">weMail System</h1>
<p align="center">
    <a href="<%=request.getContextPath() %>/?subpage=mailRead">읽기</a> | 
    <a href="<%=request.getContextPath() %>/?subpage=mailWrite">쓰기</a> |
    <a href="<%=request.getContextPath() %>/?subpage=test">db테스트</a>
</p>
<hr>
 
</body>
</html>