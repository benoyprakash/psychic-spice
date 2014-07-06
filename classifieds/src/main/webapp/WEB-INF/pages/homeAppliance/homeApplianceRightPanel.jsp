<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div class="container-full" style="padding: 0% 0% 0% 2%;">
	<div class="row hidden">
		Intentionally left blank
	</div>
	<c:if test="${empty searchResultList}"></c:if>
	<div class="row">
		<div class="list-group">
			<div class="list-group-item " >
			   <strong>We are sorry</strong>
			</div>
			<div class="list-group-item"> 
				<div class="row">
					<div class="col-lg-8">
						Currently there are no results matching your criteria.
					</div>				
				</div>
			</div>
		</div>
	</div>

	<c:forEach items="${searchResultList}" var="resultPost">
		<div class="row">
			<div class="list-group">
				<div class="list-group-item " >
					<strong>${resultPost.title}</strong>
			   		<div class="pull-right">
					Price &nbsp;<strong>0.00</strong>
					</div>
				</div>
				<div class="list-group-item"> 
					<div class="row row-lg-6">
						<div class="col-lg-2">
							<img src="resources/img/twitter.png" alt="" class="img-thumbnail" style="width: 120px; height: 120px;">
						</div>
						<div class="col-lg-10">
							<div></div>
							This is a good product<br />
							blaaaaa this is a blaaa and nothing<br />
							blasss is a very good blasss why not<br />
							Ph : 0011 - 2233554477<br />
							<div class="pull-right">05 JUly 2014</div>				
						</div>			
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
	
