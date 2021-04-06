<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<jsp:include page="imports.jsp" />

</head>
<body>
 <div class="container">
  <header>
   <h1>Lazada Exam</h1>
  </header>
  <jsp:include page="sidebar.jsp" />
  <div class="starter-template">
   <h2>Student List</h2>
   <form id='searchForm' >
	   <div class="input-group rounded">
		  <input id='searchInput' type="search" class="form-control rounded" placeholder="Search" aria-label="Search"
		    aria-describedby="search-addon" />
		  <span class="input-group-text border-0" id="search-addon">
		    <i class="fas fa-search"></i>
		  </span>
		</div>
	</form>
	<br/>
	<jsp:include page="util/addStudentModal.jsp" />
   <table
    class="table table-striped table-hover table-condensed table-bordered">
    <tr>
     <th>Id</th>
     <th>First Name</th>
     <th>Last Name</th>
     <th>Program</th>
    </tr>
    <c:forEach var="item" items="${student}">
     <tr>
      <td>${item.id}</td>
      <td>${item.firstName}</td>
      <td>${item.lastName}</td>
      <td>${item.getProgram().getProgramName()}</td>
     </tr>
    </c:forEach>
   </table>
  </div>

 </div>

 <script type="text/javascript"
  src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
$('#searchForm').submit(function(event){
	var search = $('#searchInput').val();
	if(search==null|| search == ""){
		$('#searchForm').attr("action","/student");
	}else{
		$('#searchForm').attr("action","/student/"+search);
	}
	
	
});
</script>
</body>

</html>