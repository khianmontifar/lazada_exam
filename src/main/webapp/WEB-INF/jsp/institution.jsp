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
   <h2>Institution List</h2>
   <!-- Button trigger modal -->
<jsp:include page="util/addInsModal.jsp" />
   <table
    class="table table-striped table-hover table-condensed table-bordered">
    <tr>
     <th>Id</th>
     <th>Name</th>
     <th>Description</th>
    </tr>
    <c:forEach var="ins" items="${institution}">
     <tr>
      <td>${ins.id}</td>
      <td>${ins.schoolName}</td>
      <td>${ins.schoolDescription}</td>
     </tr>
    </c:forEach>
   </table>
  </div>

 </div>

 <script type="text/javascript"
  src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>