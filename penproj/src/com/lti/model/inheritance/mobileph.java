package com.lti.model.inheritance;

public class mobileph extends Gadget{

private String opSys;
private CoverColor covercolor;
private String brand;

public String getOpSys() {
	return opSys;
}

public void setOpSys(String opSys) {
	this.opSys = opSys;
}

public CoverColor getCovercolor() {
	return covercolor;
}

public void setCovercolor(CoverColor covercolor) {
	this.covercolor = covercolor;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public mobileph(String opSys,CoverColor covercolor,String brand)
{super();
	this.opSys=opSys;
	this.covercolor=covercolor;
	this.brand=brand;
	
}

public void turnOn()
{
displaylogo();
musicplay();
init();}
	public static void displaylogo()
	{
		System.out.println("displaying");
			}
	public static void musicplay()
	{
		System.out.println("playing music");
			}
	public static void init()
	{
		System.out.println("initialising");
			}
public void turnOff()
{
	closeallapps();
	
	}
public static void closeallapps()
{
	System.out.println("closing");
		}

@Override
public String toString() {
	return "mobileph [opSys=" + opSys + ", covercolor=" + covercolor + ", brand=" + brand + "]";
}

}
