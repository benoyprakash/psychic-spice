<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/resources/css/bootstrap-responsive.min.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/select2.css" />"
	rel="stylesheet" type="text/css" />
</head>
<body>
<h1>Classifieds</h1>
<div>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="body" />
</div>

<script src="<c:url value="/resources/js/jQuery-1.8.2.min.js"/>"></script>
<script src="<c:url value="/resources/js/validation/jquery.validate.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/select2.min.js"/>"></script>
</body>
</html>