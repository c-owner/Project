
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "corner";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
//		if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("master!");
//			} else {
//				System.out.println("Wrong password");
//			}
//		} else {
//			System.out.println("Who Are You?");
//		}
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("master!");
		} else {
			System.out.println("Who Are You?");
		}
		// input
//		Argument , File , Network , Audio , Program
//		input이 무엇이냐에 따라 프로그램이 다르게 동작하여 그에 따른
//		OUTPUT을 만들 수 있다. 
	}

}
