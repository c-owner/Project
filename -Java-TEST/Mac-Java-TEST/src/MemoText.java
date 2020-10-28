import java.util.Scanner;

// for ( 초기식 ; 조건식 ; 증감식 ) {
// 실행문;
//   } 
// 조건식에서 false(거짓)이 떠야만 종료
// while : 여러번,영원히,조건을 만족하는 동안
// for : n번, n회, 시작점-종료점 분명할 때
public class MemoText {

	public static void main(String[] args) {

		int total = 0;
		for (int i=1; i<100; i++) {
			if(i % 2 != 0 ) {
				continue;
			}
			total = total + i;
		}
		System.out.println(total);
	

/*
	String n3 = “Hi”;  // 라고 선언 하고 Hi 라고 입력했을때 Hi가 나오게 하고싶다.
	while (true) {
		System.out.println("Hi."); 
		n3=sc.nextInt(); // 어떻게 해야하나욘.
		if(n3 != num) {
			break;
		}
	}
*/
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