package core_Java_Practice;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 2 3 5 8 13
		
		int a = 0;
		int b = 1;
		int sum = a+b;
		
		for (int i=0;i<6;i++)
		{
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}

	}

}
