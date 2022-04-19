<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>



	- productVO -<br>

	<span>상품명 : ${productVO.name }</span><br>

	<span>가격 : ${productVO.price }</span><br><br>	



	- product -<br>

	<span>상품명 : ${product.name }</span><br>

	<span>가격 : ${product.price }</span>

	
	msg : ${msg }<br>

	id : ${id }<br>

	age : ${param.age }<br>

</body>

</html>