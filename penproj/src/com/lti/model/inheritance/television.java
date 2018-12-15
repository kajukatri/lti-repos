package com.lti.model.inheritance;

public class television extends Gadget{
private int screenSize;
private int changenum;
private boolean maxScreen;

television(Gadget g,int screenSize)
{
	this.manufacturer=g.manufacturer;
	this.yrOfMfg=g.yrOfMfg;
	this.pricce=g.pricce;
	this.screenSize=screenSize;
}

public void turnOn()
{int chnum=101;

	changechannel(chnum);
	maxScreen();
	
	}
private void changechannel(int channelnum)
{
	this.changenum=channelnum;
}
private void maxScreen()
{
	maxScreen=true;	
}
public void turnOff()
{
	this.changechannel(0);
	this.maxScreen=false;
	
	}
}
