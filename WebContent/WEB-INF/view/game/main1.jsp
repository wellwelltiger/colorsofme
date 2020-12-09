<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="root" value="${pageContext.request.contextPath }/" /> 
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Insert title here</title>
  <script>
  	let color = document.getEle
  	function yes(){
  		
  	}
  	
  </script>
</head>
<body>
	<%for(int i=0; i<5; i++){ %>
	<form action="${root }game/result">
		<button onclick="yes()" id="color" name="color" value="1">예</button>
		<button onclick="no()" id="color" name="color" value="0">아니요</button>
	</form>
	<%} %>
</body>
</html>