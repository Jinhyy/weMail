<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  c:foreach�� jstl ���̺귯������ ����Ҷ� ���� -->
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
			<th>�μ��ѹ�</th>
			<th>�μ��̸�</th>
			<th>�μ���ġ</th>
		</tr>
		
		<!--  if,else�� -->
		<c:choose>
		<c:when test="${deptList ne null}">
			<c:forEach items="${deptList}" var="deptModel">
				<tr>
					<td>${deptModel.dept_no}</td>
					<td>${deptModel.dept_name}</td>
					<td>${deptModel.dept_location}</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			deptList�� NULL�Դϴ�.
		</c:otherwise>
		</c:choose>
		
	</table>
</body>
</html>