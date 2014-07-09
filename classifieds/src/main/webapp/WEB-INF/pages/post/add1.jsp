<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
						<select id="locationId" style="width: 150px; padding-top: 12px;">
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
      	<div class="container hidden">
	      	<div class="alert alert-warning alert-dismissable">
				<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
				<strong>Welcome!</strong> To a new place to post your ads, and get benefited..!
			</div>
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
					<form:form modelAttribute="adpost" action="" method="post">
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
											<select >
												<option value"">Please Select</option>
											</select>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="col-lg-4">
											Sub Category
										</div>
										<div class="col-lg-4">
											<select >
												<option value"">Please Select</option>
											</select>
										</div>
									</div>
									<br />
									<div class="row">
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
											<div class="col-lg-4">
												<form:radiobutton class="radio" value="1" path="adType" /> Buy
											</div>
											<div class="col-lg-4">
												<form:radiobutton class="radio" value="1" path="adType" /> Sell
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col-lg-4">
											Condition
										</div>
										<div class="col-lg-8">
											<form:input class="form-control" type="condition" path="adTitle" />
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
											Title
										</div>
										<div class="col-lg-4">
											ABCDE
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
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/select2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/alert.js"></script>	


<script type="text/javascript">
	$(document).ready(function() { 
		$("#locationId").select2({
			placeholder: "Select a State",
			allowClear: true
			});
		});
</script>
</body>
</html>