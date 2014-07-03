<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hi-Post Your Ads for Free..!</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/select2.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/customcss.css" />
</head>
<body>
<div>
	<div class="container-full">
		<div class="navbar navbar-default">
			<tiles:insertAttribute name="headerBar" /> 
		</div>
		<div class="jumbotron text-center alert-info">
			<div class="container">
				<div class="row">
					<tiles:insertAttribute name="searchBoxRow" />
				</div>
			</div>	
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-2">
					<tiles:insertAttribute name="leftMenu" />
				</div>
				<div class="col-lg-9">
					<tiles:insertAttribute name="rightPanelSearchResults" />
				</div>
			</div>
		</div>
		<div class="jumbotron text-center" style="margin-bottom: 3px;">
			<tiles:insertAttribute name="footerBar" /> 
		</div>
	</div>

</div>





<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/alert.js" ></script>	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/select2.js"></script>

<script type="text/javascript">
	$(document).ready(function() { 
		
 		$("#selectlocationId").select2({
			placeholder: "Select a State",
			allowClear: true	
 		}); 
			
		
		$("div[id^='select']").select2({
				allowClear: true
			}); 
		
		});
	
	
</script>
</body>
</html>