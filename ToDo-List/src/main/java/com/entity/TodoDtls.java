package com.entity;
public class TodoDtls
{
	private int No;
	private String Name;
	private String ToDo;
	private String Status;
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getToDo() {
		return ToDo;
	}
	public void setToDo(String toDo) {
		ToDo = toDo;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return "Entity [No=" + No + ", Name=" + Name + ", ToDo=" + ToDo + ", Status=" + Status + "]";
	}

}