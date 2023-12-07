package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.TodoDAO;
import com.DB.DBConnect;
@WebServlet("/add_todo")
public class AddServlet extends HttpServlet {
 
	   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// --------TODO Auto-generated method stub------
		super.doPost(req, resp);
		
		String username=req.getParameter("username");
		String todo=req.getParameter("todo");
		String status=req.getParameter("status");
		
		TodoDAO dao=new TodoDAO(DBConnect.getConn());
	 	boolean f=dao.addTodo(username, todo, status);
	 	
	 	//HttpSession session=req.getSession();
	 	
	 	if(f)
	 	{
	 		//session.setAttribute("sucMsg","Todo Added Sucessfully");
	 	//	resp.sendRedirect("index.jsp");
	 		System.out.println("Data Insert sucessfully");
	 	}
	 	else 
	 	{
	 	//	session.setAttribute("sucMsg","Todo Added Sucessfully");
	 		//System.out.println("index.jsp");	
	 		System.out.println("Failed");
	 	}
	  
		//System.out.println(username+ " "+todo +" "+status);
	   }

}

