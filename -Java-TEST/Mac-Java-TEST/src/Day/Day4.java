package Day;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 정수를 입력했을 때 소수인지 아닌지를 판별 Prime
		// 별찍기 // 배열 
		// 배열과 반복문을 이용한 예제 	
		/*
		 System.out.println("입력한 값을 판별합니다.\n값을 입력해주세요. : ");
		int a = sc.nextInt();
		System.out.println("입력한 값은 : "+a+" 입니다.");
		// 입력한 값을 a 변수에 저장함.
		int i = a-1 ;// 마지막 값
		int j = 2; // 시작값 : 제수 . 소수는 2부터 시작

		while (j <= i) {
			if(a%j == 0 ) {
				System.out.println("입력된 "+a+"의 값은 소수가 아닙니다.");
				break;
			} else {
				System.out.println("입력된 값"+a+"은 소수 입니다.");
				break;
			}
		}
		 */
		/* 정수1개 입력, 소수 0,X (count) 출력해주세요. */
		/*
		System.out.println("입력한 값의 정수를 판별합니다.");
		System.out.print("값을 입력 해주세요. : ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i=2; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		if (cnt==2) {
			System.out.println("입력한 값은 : "+num);
			System.out.println("소수 입니다.  ");
		} else {
			System.out.println("입력한 값은 : " + num);
			System.out.println("소수가 아닙니다. = X ");
		}
		 */
		//	 	구구단 
		//	 	이중 for문=다중 for문=(중첩 반복문)
		/*
		for (int a=2; a<10; a++) { // 2단부터 시작 ,9단까지, 차례로 증가, 단 숫자 반복문  	
				for (int i=1; i<10; i++ ) { // 곱할 숫자 반복문 
					System.out.println(a+"x"+i+" = "+a*i);
				} 
		System.out.println("-----------");
	}
		 */

		// 별 찍기 
		/* System.out.println("------ 별찍기 -----");
		 	for (int i=0; i<5; i++) { // 5번을 실행 
			for (int a=0; a<5; a++) { // a = *
				System.out.print("*");
			}
		System.out.println("");
		}
		*/
		/*
		// 삼각형 피라미드 별 찍기
		System.out.println("--------- 삼각형 별 찍기 -------");
		for (int i=0; i<5; i++) { // 5번을 실행 
			for (int a=0; a<=4-i; a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
	/*
	 	System.out.println("----- 삼각형 별 찍기 -------");
		for (int j=1; j<5; j++) { // 4번 반복문 실행 
			for (int k=4;k>0;k--) { //k=" "띄어쓰기를 하나씩 줄이는 회수 반복문 
				if (j<k) { // j가 k보다 작으면 * 대신 띄어쓰기로 모양을 갖춘다.
					System.out.print(" ");
				} else { // j가 k보다 크면 *을 채운다. *이 늘어난다.)
					System.out.print("*");
				}
			}System.out.println(""); //1번 실행할 때마다 반복하면서 줄바꿈한다.
		}
		System.out.println( " ------ 피라미드 모양 별찍기 ------");
		for (int x=0; x<5; x++) {
			for (int y=0; y<4-x; y++) {
				System.out.print(" "); // 
			}
			for (int y=0; y<2*x+1; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 역 삼각형 별 찍기 
		System.out.println("----------역삼각형 별찍기-----------");
		for (int a=0; a<5; a++) { 
			for (int b=0; b<=a; b++) {
				System.out.print(" ");
			}
			for (int b=9; b >= a*2+1; b--) {
				System.out.print("*");
			} System.out.println("");
		}
		
		*/
	}
}
