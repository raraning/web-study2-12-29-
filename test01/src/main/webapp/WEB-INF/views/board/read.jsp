<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

<center>

<h3>READ PAGE</h3>
<table border=1 width=570>
	<tr>
		<td width=70>제목</td>
		<td width=500>${boardVO.title }</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>${boardVO.content }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td>${boardVO.writer }</td>
	</tr>
</table>
<br>
<table border=0 width=570>
	<tr>
		<td width=50%><a href="listAll">[리스트]</a></td>
		<td width=50% align="right">
			<a href="/board/modify?bno=${boardVO.bno }">[수정]</a> 
			<a href="/board/remove?bno=${boardVO.bno }">[삭제]</a>
		</td>
	</tr>
</table>

</center>

<%@ include file="/WEB-INF/views/include/footer.jsp" %>