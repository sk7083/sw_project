<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title>파일 다운로드 목록</title>
	</head>
	<body>
		<h3>폴더 내의 모든 파일 목록 출력</h3>
		
		<c:forEach var="file" items="${fileList}">
			<a href="<c:url value='/fileDownload/${file}'></c:url>">${file} 파일 다운로드</a><br><br>
		</c:forEach>
	</body>
</html>
