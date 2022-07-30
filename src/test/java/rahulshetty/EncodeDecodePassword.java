package rahulshetty;
import org.apache.commons.codec.binary.Base64;

public class EncodeDecodePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "Rani@12345$";
		
		byte[] encodedpassword = Base64.encodeBase64(password.getBytes());
		System.out.println("Encoded password is"+new String(encodedpassword));
		
		//TXlwYXNzd29yZA==".getBytes()
		byte[] decodedpassword = Base64.decodeBase64(encodedpassword);
		System.out.println("decoded password is"+new String(decodedpassword));
		
		
	}

}
