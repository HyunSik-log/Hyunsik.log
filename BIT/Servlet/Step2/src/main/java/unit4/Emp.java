package unit4;

public class Emp {
private String name;
private int sabun;
private String dept;
public Emp() {	super();  }
public Emp(String name, int sabun) {
	super();
	this.name = name;
	this.sabun = sabun;
}
public Emp(String name,int sabun, String dept) {
	super();
	this.name = name;
	this.sabun = sabun;
	this.dept = dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSabun() {
	return sabun;
}
public void setSabun(int sabun) {
	this.sabun = sabun;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
}
