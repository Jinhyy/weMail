<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  c:foreach등 jstl 라이브러리관련 사용할때 붙임 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>교수번호</th>
			<th>교수이름</th>
			<th>교수과목</th>
			<th>교수생일</th>
		</tr>
		
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${mailList ne null}">
			<c:forEach items="${mailList}" var="mailModel">
				<tr>
					<td>${mailModel.id }</td>
					<td>${mailModel.name }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			professorList가 NULL입니다.
		</c:otherwise>
		</c:choose>
		
	</table>
</body>
</html>