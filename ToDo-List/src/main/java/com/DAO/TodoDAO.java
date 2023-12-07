package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.TodoDtls;
	
public class TodoDAO {
		private Connection conn;

		public TodoDAO(Connection conn) {
			super();
			this.conn = conn;
		}
		
		public boolean addTodo(String Name,String ToDo,String Status)
		{
			boolean f=false;
			try { 
			String sql="insert into todo_app(Name,ToDo,Status) values(?,?,?)";	
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,Name);
			ps.setString(2,ToDo);
			ps.setString(3,Status);
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			return f;
		}
		
		public List<TodoDtls> getTodo()
		{
		List<TodoDtls> list=new ArrayList<TodoDtls>();
		TodoDtls t=null;
		
		try {
			String sql="select * from todo_app";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
            {
            	t=new TodoDtls();
            	t.setNo(rs.getInt(1));
            	t.setName(rs.getString(2));
            	t.setToDo(rs.getString(3));
            	t.setStatus(rs.getString(4));
            	list.add(t);
            	
            }
		} catch (Exception e){
			e.printStackTrace();
		}
		return list;
		}
}