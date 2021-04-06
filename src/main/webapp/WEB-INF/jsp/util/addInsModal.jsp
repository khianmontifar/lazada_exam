<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addInsModal">
  Add Institution
</button>

<!-- Modal -->
<div class="modal fade" id="addInsModal" tabindex="-1" role="dialog" aria-labelledby="addInsModalLabel" aria-hidden="true">
<form>
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Institution</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		  <div class="form-group">
		    <label for="schoolName">School Name</label>
		    <input type="text" class="form-control" id="schoolName" aria-describedby="schoolName" placeholder="Enter School Name">
		  </div>
		  <div class="form-group">
		    <label for="schoolDescription">School Description</label>
		    <input type="password" class="form-control" id="schoolDescription" placeholder="Enter Description">
		  </div>
		
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
 </form>
</div>