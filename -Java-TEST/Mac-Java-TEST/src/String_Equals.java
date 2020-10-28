import java.util.Scanner;

public class String_Equals {
	public static void main(String[] args) {
		
		
		
		System.out.println("HELLO WORLD!!!");
		
		String o1 = new String("java");
		String o2 = new String("java");
		
		System.out.println(o1 == o2); // 같은 위치에 있냐. 
		System.out.println(o1.equals(o2)); // 같은 내용이냐.
		
		
		int p1 = 1;
		int p2 = 1;
		String p3 = new String("1");
		
		System.out.println(p1 == p2);
		
		String o3 = "java2";
		String o4 = "java2";
		System.out.println(o3 == o4);
		System.out.println(o3.equals(o4));
		// 원시 데이터 타입은 동등 비교 연산
//		원시 데이터 타입이 아닌 비원시데이터 타입은 euqals
//		직접 확인하고 따져야함.
		System.out.println(o1 == o3); // 새로운 객체 + 문자열 선언false
		System.out.println(o1.equals(o4)); // 새로운 객체 + 문자열 선언false
		
		// 제어문(while, if)과 문자열을 이용하기  // 
				Scanner sc = new Scanner(System.in);
				String n1 = "hi";
				String n2 = "hi";
				while (true) {
					n1=sc.nextLine();	
					if (!n1.equals(n2)) {
						continue;
					}
					System.out.println("Hey, Man~");
				}
				
	}
}