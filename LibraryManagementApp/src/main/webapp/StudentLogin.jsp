<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<html lang="en">
<head>
		<c:if test='${librarianId ne null}'>
		<% response.sendRedirect("LibrarianPortal.jsp"); %>
    	</c:if>
    	<c:if test='${studentId ne null}'>
		<% response.sendRedirect("StudentPortal.jsp"); %>
    	</c:if>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body style="background-color: lightcyan;">
  <br>
  <br>
  <br>
  <div style="background-color: rgb(227, 213, 226); width: 35%; margin: auto;">
    <h1 style="text-align: center; color:rgb(57, 147, 170) ;line-height: 200%;font-weight: 600;">Student Login</h1>
  </div>
    <br>
    <div style="height: 200px; width: 30%; margin: auto;">
    <c:if test='${status ne null}'>
    	<h2 style="background-color: crimson;color: cornsilk;">Invalid Login Details</h2>
    </c:if>
    <form action="${pageContext.request.contextPath}/student/login" method="post">
        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Student Id:</label>
          <input type="text" class="form-control" id="exampleInputEmail1" name="sid">
        </div>
        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">Password</label>
          <input type="password" class="form-control" id="exampleInputPassword1" name="spassword">
        </div>
        
        <button type="submit" class="btn btn-primary">Login</button>
        <br/>
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}" style="color: darkgreen;">Back To HomePage</a>
      </form>
      </div>
</body>
</html>