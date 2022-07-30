package rahulshetty;

public class CoreJavabasicsBrushUPStringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is object in java which represent sequence of characters //String literal
		
		//String S = "Amol Chakre String Practice";
		//String S1 = "Amol Chakre String Practice";
		//String S4 = "Amol Chakre String Practice";
		String S5 = "Hello";
		
		// New object 
		String S2 = new String("AmolString");
		String S3 = new String("AmolString");
		
		// Run code space between char 
		String S = "Amol Chakre String Practice";
		String [] SplitString = S.split(" ");
		System.out.println(SplitString[0]);
		System.out.println(SplitString[1]);
		System.out.println(SplitString[2]);
		System.out.println(SplitString[3]);
		
		// Run code between middle condition char
		String S1 = "Amol Chakre String Practice";
		String [] SplitString1 = S.split("String");
		System.out.println(SplitString1[0]);
		System.out.println(SplitString1[1]);	
		System.out.println((SplitString1[1]).trim());
		
		// Run code for print char in reverse
		String S4 = "Amol Chakre String Practice";
		
		for  (int i=S4.length()-1; i>=0; i--)
		{
			System.out.println(S4.charAt(i));
		}
		
		 
		// Run code for print char
			String S6 = "Amol Chakre String Practice";
			
			for  (int i=0; i<S6.length();i++);
	}

}
