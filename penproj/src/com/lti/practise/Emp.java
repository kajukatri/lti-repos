package com.lti.practise;

@AuthorOfTheCode(Name="hemant",id=101,email="jsdhjh@gd.com")
public class Emp implements Comparable<Emp> {
private int id;
private String name;
private float sal;
@Deprecated
public Emp(int id, String name, float sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
@AuthorOfTheCode(Name="parag",id=900,email="hjh@gd.com")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}

@Override
public int compareTo(Emp e2) {
if(this.sal==e2.sal)
{return 0;
	}else if(this.sal>e2.sal)
	{
		return 1;
	}else
return -1;
}

}
