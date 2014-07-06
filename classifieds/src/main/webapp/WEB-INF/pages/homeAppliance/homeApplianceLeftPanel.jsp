<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-full">
	<form:form modelAttribute="homeNeedLeftMenu" action="${pageContext.request.contextPath}/homeAppliance/refine" method="post">
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active">
				   Category
				</div>
				<div class="list-group-item">
					<form:select id="selectCategory" path="category" >
						<c:forEach items="${categoryList}" var="category">
							<form:option value="${category.key}">${category.value}</form:option>
						</c:forEach>					
					</form:select>
				</div>
			</div>
		</div>
			
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active" >
				   Sub Category  
				</div>
				<div class="left-menu-block">
					<c:forEach items="${subCategoryList}" var="subCategory">
					<div class="list-group-item left-menu-block-item-height" > 
						<div class="row">
							<div class="col-lg-2">
								<form:checkbox value="${subCategory.key}" path="subCategory[]"/>
							</div>
							<div class="col-lg-8">
								${subCategory.value.label}
							</div>					
						</div>
					</div>
					</c:forEach>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active" >
				   Product Status
				</div>
				<div class="list-group-item left-menu-block-item-height"> 
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="1" path="productStatus" /> 
						</div>
						<div class="col-lg-10">
							New
						</div>					
					</div>
				</div>
				<div class="list-group-item">
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="0" path="productStatus" /> 
						</div>
						<div class="col-lg-10">
							Used
						</div>					
					</div>				
				</div>
				<div class="list-group-item">
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="2" path="productStatus" /> 
						</div>
						<div class="col-lg-10">
							Search both
						</div>					
					</div>				
				</div>
	
			</div>
		</div>
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active" >
				   Seller Type
				</div>
				<div class="list-group-item left-menu-block-item-height"> 
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="0" path="sellerType" /> 
						</div>
						<div class="col-lg-10">
							Individual
						</div>					
					</div>
				</div>
				<div class="list-group-item">
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="1" path="sellerType" /> 
						</div>
						<div class="col-lg-10">
							Commercial
						</div>					
					</div>				
				</div>
			</div>
		</div>
		
	
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active">
				   Location
				</div>
				<div class="list-group-item">
					<form:select id="selectSubCategory" path="location">
						<option value="0">Furniture</option>
						<option value="1">Washing machine</option>
						<option value="2">Kitchen wares</option>
					</form:select>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active" >
				   I want to : 
				</div>
				<div class="list-group-item left-menu-block-item-height"> 
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="0" path="buy" /> 
						</div>
						<div class="col-lg-10">
							Buy
						</div>					
					</div>
				</div>
				<div class="list-group-item">
					<div class="row">
						<div class="col-lg-2">
							<form:radiobutton class="radio" value="1" path="buy" /> 
						</div>
						<div class="col-lg-10">
							Sell
						</div>					
					</div>				
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="list-group">
				<div class="list-group-item active" >
				   Price Range
				</div>
				<div class="list-group-item left-menu-block-item-height"> 
					<div class="row">
						<div class="col-lg-5">
							<form:input type="text" class="form-control" style="padding: 3px 3px" path="priceMin" placeholder="min" />
						</div>
						<div class="col-lg-1" style="line-height: 12px;">
							&nbsp; to &nbsp;
						</div>	
						<div class="col-lg-5">
							<form:input type="text" class="form-control" style="padding: 3px 3px" path="priceMax" placeholder="max" />
						</div>						
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<form:button type="" class="btn btn-info btn-large"><Strong> Search</Strong>
			</form:button>
		</div>
	</form:form>
<script type="text/javascript">
$(document).ready(function() {
	console.log( "Home Needs Left Menu ready!" );

		$("#selectCategory").select2({}); 
	});
</script>
</div>