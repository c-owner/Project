package Day5;

import java.util.Scanner;

public class Func {

	//	함수를 구현하는 자리
	//	사용자 정의 함수 
	//	static 결과값자료형 함수명(입력값자료형 변수명)
/*	static void function(int num) { 
		System.out.println(num);
	}
	//	 void : 아무것도 없다. = 
	//	static : 객체와 무관하다. 
	
	static int fnc(int x,int y) {
		int res=x+y;
		return res; // 호출로 ㄱ 
	} */
	static int getMax(int x,int y) {
		int res = 0;
		if(x>y) { 
			res=x; 
		} if(x<y) {
			res=y;
		} 
		return res;
	}
//	static int sosu(int x) {
//		int cnt = 0;
//		for (int i =1 ; i<=x; i++) {
//			if ( x%i == 0 ) {
//				cnt ++;
//			}
//		} 
//		return cnt;
//	}
	static void sosu(int x) {
		int cnt = 0;
		for (int i =1 ; i<=x; i++) {
			if ( x%i == 0 ) {
				cnt ++;
			}
		} 
		if(cnt==2) {
			System.out.println(" 소수 O");
		} else {
			System.out.println(" 소수 X");
		}
	}
	static void sosu2(int x) {
		int cnt = 0;
		for (int i=2; i<=x; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j == 0 ) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.print(i+ " ");
			}
			cnt=0;
		}
	}
	
	static void fnc(int[] data) {
		for(int v:data) {
			System.out.println(v);
		}
	}
	static void f(int[] data2) {
		int max=data2[0];
		int maxIndex=0;
		for(int i=0; i<data2.length; i++) {
			if(max<data2[i]) {
				max=data2[i];
				maxIndex=i;
			}
		}
		System.out.println(max+" ["+maxIndex+"]"); // return 반환값은 2개 이상 불가능.
	}
	////////////////////
	static void add(int a, int b) {
		System.out.println("정수");
		System.out.println(a+b);
	}
//	함수명 중복을 허락 
//	: 입력값의 개수 or 입력값의 자료형(타입) 달라야함.
//	[오버로딩]
	static void add (double a, double b) {
		System.out.println("실수 계산");
		System.out.println(a+b);
	}
	/////////////////////////////////
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		int n = sc.nextInt();
		//		function(n);
/*		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(fnc(a,b));
//		코드의 재사용성이 증가함.
//		오류의 파급효과 줄임  + 비용 절감 + 코드의 간결화
		System.out.println(fnc(3,4));
		System.out.println(fnc(123123,123123));
*/      /*
//		두 정수를 입력, 둘 중에 더 큰 정수를 결과로 출력하는 함수 작성
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(getMax(a,b)); */
		
//		정수 1개 입력  소수이면 O 아니면 X 함수 
/*		int num;
		num = sc.nextInt();
		sosu(num);
*/
	/*	//		정수 1개 입력
//		 1부터 num 까지 소수를 모두 출력
//		eX) 7을 입력하면 -> 2,3,5,7 / 10-> 2,3,5,7 / 11-> 2,3,5,7,11
		int num2;
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		sosu2(num2);
	*/
	/* 다른 방법 -- 
	 static void sosu(int n) {
	 for (int i=1; i<=n; i++) {
	 if (n%i==0) {
	 cnt++;
	 		} 
	 	}
	 	if (cnt==2) {
	 	System.out.print(n+" ");
	 	}
	 }
	  
	 ---------------
	  int num;
	  num=sc.nextInt();
	  
	  for (int i=1; i<=num; i++) {
	  sosu(i);
	  }
	 */
/*  //		 입력값 배열에 넣기
		int[] arr = new int[3];
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		for(int v: arr) {
			System.out.print(v+" ");
		}
//		배열을 받아 출력 
		System.out.println("----함수 배열 출력----");
		fnc(arr);
		*/ /*
//	5개 짜리 [5] 배열 main()에서 생성
//	해당 배열을 함수에 보내면, 최대값과 그 위치(인덱스) 출력하는 함수 작성
		int[] arr2 = new int[5];
		for(int i=0; i<5; i++) {
			arr2[i] = sc.nextInt();
		} 
		f(arr2);
		*/
//		  
		int x=1,y=2;
		double a=1.2,b=1.3;
		add(x,y);
		add(a,b);

		
		
		
		//	day6	객체 지향
		
		/////////////////////////////
	}
}
