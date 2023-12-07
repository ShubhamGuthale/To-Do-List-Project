<%@page import="com.DB.DBConnect"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="component/all_css.jsp" %>
</head>
<body>
<%@include file="component/navbar.jsp" %>

<%
Connection conn=DBConnect.getConn();
out.print(conn);
%>
           
<h1 class="text-center text-success"> To Do List </h1>
<div class="container">
<table class="table table-striped" border="1px">
  <thead class="bg-success text-white">
    <tr>
      <th scope="col">No</th>
      <th scope="col">Name</th>
      <th scope="col">ToDo</th>
      <th scope="col">Status</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <%
  TodoDAO dao=new TodoDAO(DBConnect.getConn()));
  List<TodoDtls> todo=dao.getTodo();
  for(TodoDtls t:todo)
  %>
    <tr>
      <th scope="row">1</th>
      <th scope="col">Prince</th>
      <td>Java Tutorial</td>
      <td>Pending</td>
      <td>
      <a href="" class="btn btn-sm btn-success">Edit</a>
      <a href="" class="btn btn-sm btn-danger">Delete</a>
      </td>
    </tr>
  </tbody>
</table>
</div>
</body>
</html>