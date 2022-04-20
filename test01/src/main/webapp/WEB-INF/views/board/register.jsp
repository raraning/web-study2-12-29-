<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<center>

<h3>WRITER PAGE</h3>

<form  method="post">
<table>
	<tr>
		<td>제목</td>
		<td><input name="title"></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><textarea name="content" rows="3"></textarea></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input name="writer"></td>
	</tr>
	<tr>
		<td></td>
		<td><button type="submit">Submit</button></td>
	</tr>
</table>
</form>

</center>



<%@ include file="/WEB-INF/views/include/footer.jsp" %>