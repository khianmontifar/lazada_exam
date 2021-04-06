<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addInsModal">
  Add Student
</button>

<!-- Modal -->
<div class="modal fade" id="addInsModal" tabindex="-1" role="dialog" aria-labelledby="addInsModalLabel" aria-hidden="true">
<form id="studentForm">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Student</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		  <div class="form-group">
		    <label for="firstName">First Name</label>
		    <input type="text" class="form-control" id="firstName" aria-describedby="firstName" placeholder="Enter First Name">
		  </div>
		  <div class="form-group">
		    <label for="lastName">Last Name</label>
		    <input type="text" class="form-control" id="lastName" placeholder="Enter Last Name">
		  </div>
		  <div  class="form-group">
               <label for="select_active">Program</label>
               <select id='programOption' class="custom-select">
         			<c:forEach var="item" items="${program}">
		     			<option value="${item.id}" selected>${item.programName}</option>
		 			</c:forEach>
     			</select>
           </div>
		  
		
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button id='btnAddStudent' type="submit" class="btn btn-primary">Add Student</button>
      </div>
    </div>
  </div>
 </form>
</div>

<script>
$('#studentForm').submit(function(event){
	var firstName = $('#firstName').val();
	var lastName = $('#lastName').val();
	var programId = $('#programOption').val();
	$('#studentForm').attr("action","/student/"+lastName+"/"+firstName+"/"+programId);
	
	
});
</script>