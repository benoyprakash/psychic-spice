<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Hi-Post Your Ads for Free..!</title>
<link rel="stylesheet" type="text/css" href='<c:url value="resources/css/bootstrap.min.css" />' />
<link rel="stylesheet" type="text/css" href='<c:url value="resources/css/bootstrap-theme.min.css" />' />
<link rel="stylesheet" type="text/css" href='<c:url value="resources/css/select2.css" />' >
<link rel="stylesheet" type="text/css" href='<c:url value="resources/css/customcss.css" />' />
<c:url value="" />




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
      <div class="jumbotron text-center alert-info">
     	 <div class="container">
			<h1>Want to buy or sell something ???</h1>
			<p class="lead">Post an advertisement, get your customers :)</p>
			<p>	
				<span class="col-lg-4"></span>
				<span class="col-lg-4"><a class="btn btn-large btn-success btn-block" href="http://bootply.com/tagged/bootstrap-3" target="ext">Post your Ads</a></span>
				<span class="col-lg-4"></span>
			</p>
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
				<div class="col-lg-9">
					<div class="row">
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Home &amp; Lifestyle</h4>
							<p><a href="" title="">Furnitures</a></p>
							<p><a href="" title="">Kitchen wares</a></p>
							<p><a href="" title="">Floor Decors</a></p>
							<p><a href="" title="">Clothings</a></p>
						</div>
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Mobiles &amp; Gadgets</h4>
							<p><a href="" title="">Mobiles</a></p>
							<p><a href="" title="">Mobile Accessories</a></p>
							<p><a href="" title="">Tablets</a></p>
							<p><a href="" title="">Headphones</a></p>
						</div>
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Vehicles</h4>
							<p><a href="" title="">Cars</a></p>
							<p><a href="" title="">Bikes</a></p>
							<p><a href="" title="">Bicycles</a></p>
							<p><a href="" title="">Spares &amp; Tools</a></p>
						</div>
					</div>
					
					<div class="row">
					<hr>
					</div>
					
					<div class="row">
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Real Estate</h4>
							<p><a href="" title="">Houses</a></p>
							<p><a href="" title="">Flats &amp; villas</a></p>
							<p><a href="" title="">Hostels &amp PG</a></p>
							<p><a href="" title="">Hotels</a></p>
						</div>
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Services</h4>
								<p><a href="" title="">Painting</a></p>
								<p><a href="" title="">Cleaning</a></p>
								<p><a href="" title="">Packers &amp; Movers</a></p>
								<p><a href="" title="">Repairing Services</a></p>
						</div>
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Electronics</h4>
							<p><a href="" title="">Laptops &amp; Computers</a></p>
							<p><a href="" title="">Pen drives &amp; Hard disk</a></p>
							<p><a href="" title="">Cameras</a></p>
							<p><a href="" title="">Video Games</a></p>
						</div>
					</div>
					
					<div class="row">
					<hr>
					</div>					
					
					<div class="row">
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Pets</h4>
							<p><a href="" title="">Pets</a></p>
							<p><a href="" title="">Pet food</a></p>
							<p><a href="" title="">Toys for pets</a></p>
							<p><a href="" title="">Pet care services</a></p>
						</div>
					
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Books &amp; CDs</h4>
							<p><a href="" title="">Books / Novels</a></p>
							<p><a href="" title="">Academic Books</a></p>
							<p><a href="" title="">Music CDs</a></p>
							<p><a href="" title="">Softwares</a></p>
						</div>
					  
						<div class="col-lg-4">
							<h4>
							<span class="glyphicon glyphicon-asterisk">
							</span>
							Sports, Fitness &amp; Games</h4>
							<p><a href="" title="">Fitnes Equipments</a></p>
							<p><a href="" title="">Video games</a></p>
							<p><a href="" title="">Floor Decors</a></p>
							<p><a href="" title="">AC - Air Conditioning</a></p>
						</div>
					</div>

					<div class="row">
					<hr>
					</div>					
		
				</div>
				<div class="col-lg-3 full">
					Post your Ads :)

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
<script type="text/javascript" src='<c:url value="resources/js/jquery-1.11.1.min.js" />' ></script>
<script type="text/javascript" src='<c:url value="resources/js/bootstrap.min.js" />' ></script>

<script type="text/javascript" src='<c:url value="resources/js/alert.js" />' ></script>	
<script type="text/javascript" src='<c:url value="resources/js/select2.js" />' ></script>

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