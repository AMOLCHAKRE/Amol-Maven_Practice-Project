package amolselfpractice;

import java.rmi.UnexpectedException;

public class User_Defined_Exceptions_Demo {

	public void testCheckedException() throws CheckedUserDefinedException {

		try {
			Class<?> test = Class.forName("java.lang.Strings");
			// System.out.println("Uncheked ex:-");
		} catch (ClassNotFoundException e) {
			throw new CheckedUserDefinedException(e.getMessage());
		}
	}

	public void testUnCheckedException() {
		try {
			int result = 10 / 0;
		} catch (RuntimeException e) {
			throw new UncheckedUserDefinedException(e.getMessage());
		}
	}

	public static void main(String[] args) {
		User_Defined_Exceptions_Demo obj = new User_Defined_Exceptions_Demo();
		/*
		 * try { obj.testCheckedException(); } catch (CheckedUserDefinedException e) {
		 * System.out.println("excpetion while fetching class"+e.getMessage()); }
		 */
		try {
			obj.testUnCheckedException();
		} catch (UncheckedUserDefinedException e) {
			//log.debug(e.getMessage());
			System.out.println("10 cannot divided by 0");
		}
	}

	/*
	 * // class JavaException{ // public static void main(String args[]){ try { int
	 * result = 0/10; // throw is used to create a new exception and throw it. }
	 * catch (Exception e) { //throw new MyException(e.getMessage()); //buisness
	 * logic
	 * 
	 * System.out.println("try after some time"); } }
	 */
}

class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	int a;

	MyException(int b) {
		a = b;
	}

	MyException(String message) {
		super(message);
	}

	public String toString() {
		return ("Exception Number =  " + a);
	}
}
