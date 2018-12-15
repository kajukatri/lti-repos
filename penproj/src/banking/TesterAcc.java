package banking;

import com.lti.misc.exceptionhandling.LessFundException;

public class TesterAcc {
	public static void main(String[] args) {
		Account acc1= new Account(1211,"savings",4500);
		try {
			acc1.withdraw(50);
		} catch (LessFundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(acc1.getAccountBalance());
	}
}
