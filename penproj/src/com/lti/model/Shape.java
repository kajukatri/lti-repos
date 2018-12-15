package com.lti.model;

public abstract class Shape implements Changeable {
protected int length;
protected int breadth;
protected int numofsides;
public abstract float calArea();
public abstract float calVol();
public void draw()
{
	System.out.println("draw some shape");
	}
}
