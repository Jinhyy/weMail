<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
 
<%@ include file="header.jsp" %>
 
<dir style="height: 500px">
    <%
        String subpage = "mailRead";
        if(request.getParameter("subpage") != null){
            subpage = request.getParameter("subpage");
        }
        subpage = "subpage/" + subpage + ".jsp";
    %>
    <jsp:include page="<%=subpage %>"></jsp:include>
</dir>
 
<%@ include file="footer.jsp" %>
 
</body>
</html>