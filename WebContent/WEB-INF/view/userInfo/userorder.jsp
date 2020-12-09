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
<link rel="stylesheet" href="${root }css/userinfo.css">
</head>

<body class="payinfo">
<c:import url="/WEB-INF/view/include/top_menu.jsp" />

 <div class="container">
        <div class="list">
            <a class="name" href="#">홍길동</a>
            <ul>
                <li>쇼핑 정보</li>
                <li><a href="#">장바구니</a></li>
                <li><a href="information.html">주문내역</a></li>
                <li>계정설정</li>
                <li><a href="userInfoUpdate.html">회원정보 수정</a></li>
                <li>고객센터</li>
                <li><a href="manToMan.html">1:1 문의사항</a></li>
            </ul>
        </div>
        <div class="paylist">
            <div class="paytitle">
                <h1>최근 주문</h1>
                <a href="#">더 보기 ></a>
            </div>
            <div class="paynav">
                <ul>
                    <li>주문일</li>
                    <li>주문내역</li>
                    <li>주문번호</li>
                    <li>결제금액</li>
                </ul>
            </div>
            <div class="paylist-out">
                <div class="paylist-inlist">
                    <div class="inlist-first">
                        <p>2020.10.21</p>
                        <img src="" alt="a">
                        <p>asfasfasgdsgsdgsdgsafasfassgs</p>
                    </div>
                    <p>블라 블라 블라 블라 블라</p>
                    <p>20,0000원</p>
                </div>
            </div>
        </div>
    </div>


<c:import url="/WEB-INF/view/include/bottom_info.jsp" />

</body>
</html>