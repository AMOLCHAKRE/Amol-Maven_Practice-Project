package rahulshetty;

import java.util.ArrayList;

public class CoreJavabasicsBrushUP {

	private static int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int MyNum=5;
		String website = "Amol Chakre Selenium Practice";
		char letter = 'A';
		double dec = 5.99;
		boolean mycard = true;
		 
		
		System.out.println(MyNum+  "is value stored in MyNum variable");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(mycard);
		
		//Arrays - Used for storing multiple values
		int[] arr = new int[5];  //this will create memory for storing values//
		
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		arr [4] = 5;
		
		//alternate syntax
		int[] arr2 =  {1,2,3,4,5,10,20,30,50,80};
		
		System.out.println(arr[4]);
		
		//for loop
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]); 
		}
		
		//for loop for alternate syntax
		
		for (int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}

		// How to store string in arrays and see output
		String[] name = {"Amol", "Chakre", "Selenium", "Practice"};
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//Advanced loop
		
		String[] S= {"Selenium", "Practice", "Java"};
		
		for (i=0; i<S.length; i++)
		{
			System.out.println(S[i]);
		}
		int[] arr3 =  {1,2,3,4,5,10,20,30,50,80};
		{	
			for (int i=0; i<arr3.length; i++)
			
			{
				if (arr3[i] % 2 == 0);
				{
				
				System.out.println(arr3[i]);
				
			}
				//else
				{
					System.out.println(arr3[i] +"is not multiple of 2");
		}
			}
			
			ArrayList<String> a = new ArrayList<String>();
			a.add("Amol");
			a.add("Chakre");
			a.add("Java");
			a.add("Selenium");
			System.out.println(a.get(3));
			System.out.println(a.remove(2));
	}
}
	}

