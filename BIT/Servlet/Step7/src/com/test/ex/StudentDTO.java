package com.test.ex;

public class StudentDTO {
	 private String no;
	  private String pw;
	  private String  name;
	  private String hp;
	  
	  public StudentDTO() {
		  System.out.println("Student객체 생성");
	  }
	public StudentDTO(String no,String pw,String name,String hp) {
		super();
		this.no = no;
		this.pw = pw;
		this.name = name;
		this.hp = hp;
	}
	public String getNo() {
		return no;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public void setNo(String no) {
		this.no = no;
		System.out.println("setNo():"+no);
	}	
	public void setPw(String pw) {
		this.pw = pw;
		System.out.println("setPw():"+pw);
	}	
	public void setName(String name) {
		this.name = name;
		System.out.println("setName():"+name);
	}	
	public void setHp(String hp) {
		this.hp = hp;
		System.out.println("setHp():"+hp);
	}
  }