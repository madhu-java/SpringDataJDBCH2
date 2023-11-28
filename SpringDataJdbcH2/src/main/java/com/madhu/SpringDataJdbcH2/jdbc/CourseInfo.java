package com.madhu.SpringDataJdbcH2.jdbc;

public class CourseInfo {
private int id;
private String cname;
public CourseInfo()
{
}
public CourseInfo(int i, String string) {

	// TODO Auto-generated constructor stub
	this.id=i;
	this.cname=string;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "CourseInfo [id=" + id + ", cname=" + cname + "]";
}


}
