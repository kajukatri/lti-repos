package banking;

import com.lti.misc.exceptionhandling.LessFundException;

public class Account
{private int accountid;
private String accounttype;
private double AccountBalance;
public Account(int accountid,String accounttype,double AccountBalance)
{
	super();
	this.accountid=accountid;
	this.accounttype=accounttype;
	this.AccountBalance=AccountBalance;
}
public int getAccountid() {
	return accountid;
}
public void setAccountid(int accountid) {
	this.accountid = accountid;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public double getAccountBalance() {
	return AccountBalance;
}
public void setAccountBalance(double accountBalance) {
	AccountBalance = accountBalance;
}
public void applyCharges() 
{
	class Audit
	{
		float chrgs=0.0f;
		void CalCharges(int daysoverdue)
		{
			if (daysoverdue>7 && daysoverdue<=10)
			{	chrgs=100.00f;}
			else if(daysoverdue>10)
			{chrgs=2000.00f;}
			System.out.println("before charge balance:"+AccountBalance);
			AccountBalance=AccountBalance-chrgs;
			System.out.println("charges amounted to"+chrgs);
		}	
	}
	Audit a1= new Audit();
	a1.CalCharges(100);
System.out.println(AccountBalance);
}
public void withdraw(double amt) throws LessFundException
{if(amt>this.AccountBalance)
	throw new LessFundException("not enough balance");
else
	this.AccountBalance=this.AccountBalance-amt;
}
public static void main(String args[])
{
Account a2= new Account(3432,"current",212121);
a2.applyCharges();
}
}
