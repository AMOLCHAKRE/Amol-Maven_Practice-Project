package rahulshetty;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo a = new MethodDemo();
		String Name = a.getData();
		System.out.println(Name);
		MethodDemo1 Amol = new MethodDemo1();
		Amol.getUserData();
		getData2();
		
	};

	public static String getData()
	{
	
	System.out.println("Hello Selenium Methods");
		return "Amol Methods";
	}
	
	public static String getData2()
	
	{
		System.out.println("Amol Selenium Methods");
		return "Welcome Back";
		
	}
}
