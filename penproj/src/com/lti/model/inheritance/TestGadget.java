package com.lti.model.inheritance;

public class TestGadget {
public static void main(String args[])
{
	mobileph m1=new mobileph("android",CoverColor.ROSE_PINK,"LG");
	m1.turnOn();
	m1.turnOff();
	System.out.println(m1);
	Gadget g1= new television(new Gadget(),54);
	Gadget g2= new mobileph("IOS",CoverColor.GOLDEN,"SAM");
	gadgetOn(g1);
	gadgetOff(g1);
	gadgetOn(g2);
	gadgetOff(g2);
	
	}
public static void gadgetOn(Gadget g)
{
g.turnOn();
}
public static void gadgetOff(Gadget g)
{
g.turnOff();
}

}
