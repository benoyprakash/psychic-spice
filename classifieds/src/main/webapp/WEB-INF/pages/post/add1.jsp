<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="net.tanesha.recaptcha.ReCaptcha" %>
<%@ page import="net.tanesha.recaptcha.ReCaptchaFactory" %>
<!-- 
Recaptcha Implementation Documentations
https://developers.google.com/recaptcha/intro?csw=1
 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Hi-Post Your Ads for Free..!</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/select2.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/customcss.css" />

</head>
<body>
	<div class="container-full">
		<div class="navbar navbar-default">
    		<div class="container">
        		<div class="navbar-header">
          			<a class="navbar-brand" href="#" style="padding-left: 2%;">Classifieds</a>
        		</div>
       			<ul class="nav navbar-nav pull-right">
			        <li class="active"><a href="#">Home</a></li>
			        <li class="divider-vertical"></li>
			        <li><a href="#">Sign In</a></li>
			        <li>
						<select id="selectlocationId" style="width: 150px; padding-top: 12px;">
							<option value="" selected="selected">Select a location</option>
							<option value="1">Cochin</option>
							<option value="2">Fort Kochi</option>
							<option value="3">Palluruthy</option>
							<option value="4">Kaloor</option>
							<option value="5">Aluva</option>
							<option value="6">Paravur</option>
							<option value="7">Angamaly</option>
							<option value="8">Palarivattom</option>
						</select> 
					</li>
				</ul>
			</div>
    	</div>

		<!-- body -->
		<div class="jumbotron text-center alert-info ">
	     	<div class="container">
			
			</div>	
		</div>
      	<div class="container">
		</div>
		<!-- body : category row 1 -->
		<div class="container">	
			<div class="row">
				<div class="col-lg-2" >
					
						<div class="panel panel-info">
							<div class="panel-heading">
							<h3 class="panel-title">Tips</h3>
							</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										1. Place your advertisements in the proper categories, and sub categories, which makes it easier for your customers to find it.
									</div>
								</div>
							</div>
						</div>

				</div>
				<div class="col-lg-7">
					<c:if test="${not empty captchaError}">
					<div class="alert alert-danger alert-dismissable">
						<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
						${captchaError}
					</div>
					</c:if>
					<form:form id="adPostForm" modelAttribute="adpost" action="${pageContext.request.contextPath}/post/add/save" method="post">
						<div class="row">
							<div class="panel panel-success">
								<div class="panel-heading">
								<h3 class="panel-title">Categorization</h3>
								</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-lg-4">
											Catogory
										</div>
										<div class="col-lg-4">
											<form:select id="selectCategory" path="category">
												<option value"0">Please Select</option>
												<c:forEach items="${adpost.allCategories}" var="category1">
													<option value"${category1.key}">${category1.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
											Sub Category
										</div>
										<div class="col-lg-4">
											<select id="selectSubCategory">
												<option value"">Please Select</option>
											</select>
										</div>
									</div>
									<br />
									<div class="row hidden">
										<div class="col-lg-4">
											Tags
										</div>
										<div class="col-lg-4">
											<select >
												<option value"">Please Select</option>
											</select>
										</div>
									</div>
								</div>
							</div>
						</div>	
						<div class="row">
							<div class="panel panel-info">
								<div class="panel-heading">
								<h3 class="panel-title">Advertisement</h3>
								</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-lg-4">
											What to do ?
										</div>
										<div class="col-lg-8">
											<div class="col-lg-3">
												<div class="col-lg-2">
													<form:radiobutton id="radioInputAdType" class="radio" value="1" path="adType" />
												</div>
												<div class="col-lg-4">
													Buy
												</div>
											</div>
											<div class="col-lg-3">
												<div class="col-lg-2">
													<form:radiobutton id="radioInputAdType" class="radio" value="1" path="adType" />
												</div>
												<div class="col-lg-4">
													Sell
												</div>
											</div>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
											Condition
										</div>
										<div class="col-lg-8">
											<div class="col-lg-3">
												<div class="col-lg-2">
													<form:radiobutton id="radioInputCondition" class="radio" value="1" path="condition" />
												</div>
												<div class="col-lg-4">
													New
												</div>
											</div>
											<div class="col-lg-3">
												<div class="col-lg-2">
													<form:radiobutton id="radioInputCondition" class="radio" value="0" path="condition" />
												</div>
												<div class="col-lg-4">
													Old
												</div>
											</div>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
											Title
										</div>
										<div class="col-lg-7">
											<form:input id="inputTitle" class="form-control" path="adTitle" placeholder="Title for your ad"/>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
											Description
										</div>
										<div class="col-lg-7">
											<form:textarea id="inputDescription" style="resize: vertical;max-height:200px;min-height:45px;" class="form-control" path="adDesc" 
											placeholder="Explain about your product or service." />
											<p style="font-family: monospace; font-size: small;">
												&nbsp; * Please make a simple and honest explanation.<br />
												&nbsp; * Please do not add your contact details in here.
											</p>
									
										</div>
									</div>	
									<br />
									<div class="row">
										<div class="col-lg-4">
											Price
										</div>
										<div class="col-lg-7">
											<form:input id="inputPrice" class="form-control" path="price" placeholder="Price : 0.00" style="width: 30%;"/>
										</div>
									</div>	
									<br />
									<div class="row">
										<div class="col-lg-4">
											Tag (Optional)
										</div>
										<div class="col-lg-7">
											<form:input class="form-control" path="tagWords" placeholder="Words matching your advertisements."/>
											<p style="font-family: monospace; font-size: small;">
												&nbsp; * Please mention words which is related to your ad<br />
												&nbsp; * Separate each words with space
											</p>
										</div>
									</div>							
								</div>
							</div>
						</div>	
						<div class="row">
							<div class="panel panel-warning">
								<div class="panel-heading">
								<h3 class="panel-title">Seller Details</h3>
								</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-lg-4">
											Type
										</div>
										<div class="col-lg-8">
											<div class="col-lg-3">
												<div class="col-lg-2">
													<form:radiobutton id="radioInputSellerType" class="radio" value="1" path="sellerType" />
												</div>
												<div class="col-lg-4">
													Individual
												</div>
											</div>
											<div class="col-lg-3">
												<div class="col-lg-2">
													<form:radiobutton id="radioInputSellerType" class="radio" value="0" path="sellerType" />
												</div>
												<div class="col-lg-4">
													Business
												</div>
											</div>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
											Name
										</div>
										<div class="col-lg-7">
											<form:input id="inputSellerName" class="form-control" path="name" placeholder="Name" />
										</div>
									</div>	
									<br />
									<div class="row">
										<div class="col-lg-4">
											Phone
										</div>
										<div class="col-lg-7">
											<form:input id="inputSellerPhone" class="form-control" path="phoneNo" placeholder="Phone Number" />
											<p style="font-family: monospace; font-size: small;">
												&nbsp; * Mention the STD code if necessary
											</p>
										</div>
									</div>	
									<br />
									<div class="row">
										<div class="col-lg-4">
											E - Mail
										</div>
										<div class="col-lg-7">
											<form:input id="inputEMail" class="form-control" path="eMail" placeholder="E - Mail id" />
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4 hidden">
										</div>
										<div class="col-lg-8" style="margin: 0% 0% 0% 35%;">
								        <%
      									ReCaptcha c = ReCaptchaFactory.newReCaptcha("6LeYwPYSAAAAAMXPjkBNmXbiT6O_JFxwol6EFJ8M", "6LeYwPYSAAAAAPBCnS05ah9eC7xhCxFX0Q4hdxXx", false);
								        	// public key and private key 
          									out.print(c.createRecaptchaHtml(null, null));
        								%>	
        								
        								<c:if test="${not empty captchaError}">
	        								<p style="font-family: monospace; font-size: small;color: red;">
												&nbsp; * Please type the captcha again.
											</p>
        								</c:if>
        								<p style="font-family: monospace; font-size: small;">
											&nbsp; * Please fill the text / numbers.
										</p>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
										</div>
										<div class="col-lg-7" >
											<form:button id="submitButton" class="btn btn-primary" type="submit" >Submit Ad !</form:button>
										</div>
									</div>								
								</div>
							</div>
						</div>					
					</form:form>				
				</div>
				<div class="col-lg-3 full" >
					<div class="panel panel-primary">
						Post an advertisement
					</div>
				</div>
			</div>
		
	</div>
	<div class="jumbotron text-center" style="margin-bottom: 3px;">
<!-- 
    	<div>
			<h1>Moving from Bootstrap 2.x to 3.0</h1>
        	<p class="lead">Everything has changed, so you can't just replace the 2.x with the 3.0 files. The folks at Bootply, the Bootstrap Playground have created a migration guide to help.</p>
		</div>
      	
      	<div class="container">	
      		<div class="row">
	        	<div class="col-lg-4">
	          		<h4>Category 1</h4>
	          		<p>Responsive by default, and a clean "flat" design.</p>
					<h4>Powerful Grid</h4>
	          		<p>3 responsive grid sizes to control the grid layout on tiny, small and large displays.</p>
	        	</div>
	
				<div class="col-lg-4">
					<h4>Category 2</h4>
					<p>New panels, list groups, glyphicons and justified navigation.</p>
					
					<h4>Less Bloat</h4>
					<p>The optimized CSS is in a single file. Glyphicons are now separate.</p>
				</div>
				
				<div class="col-lg-4">
					<h4>Category 3</h4>
					<p>Responsive by default, and a clean "flat" design.</p>
					
					<h4>Powerful Grid</h4>
					<p>3 responsive grid sizes to control the grid layout on tiny, small and large displays.</p>
				</div>
			</div>
    	</div>
 -->
    	<div class="container">
    		<div class="row text-center">
    			<div class="col-lg-1">
    				<a href="www.google.com">Help</a>
    			</div>
    			<div class="col-lg-1">
    				<a href="www.google.com">Contact</a>
    			</div>
    			<div class="col-lg-1">
    				<a href="www.google.com">Post Ads</a>
    			</div>
    			<div class="col-lg-2">
    				<a href="www.google.com">Tips &amp; Trade offs</a>
    			</div>
    			<div class="col-lg-1">
    				<a href="www.google.com">Pricing</a>
    			</div>
    			<div class="col-lg-2">
    				<a href="www.google.com">Advertise Here</a>
    			</div>
    			<div class="col-lg-1">
    				<a href="www.google.com">Feedback</a>
    			</div>
    			<div class="col-lg-1">
    				<a href="www.google.com">Privacy</a>
    			</div>
    			<div class="col-lg-2">
    				<a href="www.google.com">User Policy</a>
    			</div>
    		</div>
    		<div class="row text-center">
    			Classifieds &trade; - Copyright &reg;
    		</div>

		</div>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.min.js" ></script>	
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.validate.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/select2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/alert.js"></script>	


<script type="text/javascript">
	$(document).ready(function() { 
		
		$("select[id^='select']").select2({
			width: '100%' 
			});
	
		});
	
	$('#submitButton').on('click', function () {
	    $('#adPostForm').validate({
	        submitHandler: function (form) {
	            form.submit();
	        }
	    });
	    
	    $("#inputTitle").rules("add", {
	        required: true,
	        minlength: 12,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * This is a required field</p>",
	            minlength : "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * Minimum 3 words(15 characters)</p>"
	        }
	    });
	    $("#inputDescription").rules("add", {
	        required: true,
	        minlength: 30,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * This is a required field</p>",
	            minlength : "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * Minimum 30  characters</p>"
	        }
	    });
	    $("#inputPrice").rules("add", {
	        required: true,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * This is a required field</p>"
	        }
	    });
	    $("#inputSellerName").rules("add", {
	        required: true,
	        minlength: 5,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * This is a required field</p>",
	            minlength : "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * Minimum 5  characters</p>"
	        }
	    });
	    $("#inputEMail").rules("add", {
	        required: false,
	        email: true,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * This is a required field</p>",
	            email : "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * Please enter a valid E - Mail</p>"
	        }
	    });
	    $("#inputSellerPhone").rules("add", {
	        required: true,
	        minlength: 10,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * This is a required field</p>",
	            minlength : "<p style='font-family: monospace; font-size: small;color: red;'>&nbsp; * Please enter a valid number</p>"
	        }
	    });
	    $("#radioInputAdType").rules("add", {
	        required: true,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>Required</p>"
	        }
	    });
	    $("#radioInputCondition").rules("add", {
	        required: true,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>Required</p>"
	        }
	    });
	    $("#radioInputSellerType").rules("add", {
	        required: true,
	        messages: {
	            required: "<p style='font-family: monospace; font-size: small;color: red;'>Required</p>"
	        }
	    });
	});
</script>
</body>
</html>