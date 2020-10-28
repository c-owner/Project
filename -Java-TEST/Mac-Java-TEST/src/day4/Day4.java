package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//		정수 1개 입력, 해당 정수가 소수인지 아닌지 출력
		System.out.println("정수가 소수인지 아닌지 출력");

		int num = sc.nextInt();
		int cnt = 0;
		for(int i=2; i<=cnt; i++) {
			if (num%i == 0 ) {
				cnt++;
			}
		}
		if (cnt == 2) {
			System.out.println("O");
		}
		else { 
			System.out.println("X");
		}

		 */
		/*
//		구구단
//		이중  for문 == 중첩 반복문 
		for (int a = 2; a<=9; a++) { // 구구단은 2단부터 시작 a = 2 
		for (int i = 1; i<=9; i++) { // 1부터 9까지 순차적으로 곱함
			System.out.println(a+"x"+i+"="+a*i);
		} // i for문 
			System.out.println("---다음---"); // a는 단이 올라가므로 단이 끝날때마다 문단을 나누고 싶으면
//			i for문 바깥에 넣어야한다.
		} // a for문
		 */
		/*
		// 별찍기
		System.out.println("삼각형 별찍기");

		for (int i=0; i<5; i++) {
			System.out.print("*");
			for (int a=0; a<1*i; a++) {
				System.out.print("*");
			} System.out.println("");
		}

		System.out.println("피라미드 별찍기");
		for (int x=0; x<4; x++) {
			for (int b=0; b<3-x; b++) {
				System.out.print(" ");
			}
				for (int b=0; b<2*x+1; b++) {
					System.out.print("*");
				} 
				System.out.println("");
		}
		 */
		//		System.out.println( " 역 삼각형 별 찍기 ");
		//		for (int n=0; n<4; n++) {
		//			for (int m=0; m<3-m; m++) {
		//				System.out.print(" ");
		//			}
		//				for (int m=0; m<2*n+1; m++) {
		//					System.out.print("*");
		//				} 
		//				System.out.println("");
		//		}
		//		
		/*
		System.out.println("-- 역 ---");
		for (int n=0; n<5; n++) {
			for (int m=0; m<5-n; m++) {
				System.out.print("*");
			}

			System.out.println(" ");
		}

		 */ 
		// a=4 i=0 ... a=4 i=4 
		// a = i 같을때 끝남
		// * -> a=0,i=0
		// 

		//		System.out.println(" ----Array---- ");

		/*
		int[] s=new int[3]; 
		// 1. 서로 관련되있어야함
		// 2. 자료형이 같아야함 
		int[] arr=new int[5]; // [5] 인덱스 
//		[0] [1] [2] [3] [4]
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.print(arr[0]+"/");
		System.out.print(arr[1]+"/");

		int [] arr2=new int[] {1,2,3,4,5};
		System.out.println("\n"+arr2[0]);
		int[] arr3 = {1,2,3,4,5};
		System.out.println("\n arr3"+arr3[0]+arr3[1]+arr3[2]+arr3[3]+arr3[4]);

		for (int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.println(arr3[i]+" ");
		}

		System.out.println(Arrays.toString(arr3));

		 */
		/*
//		요소가 5개인 배열을 생성, 원하는 요소 넣어서 출력

		System.out.println("요소가 5개인 배열을 생성, 원하는 요소 넣어서 출력");

		String[] str = new String[3];
		for (int i = 0; i<3; i++) {
			str[i] = sc.nextLine();
		}
		// forEach == 향상 for문
		for (String s : str) {// ( 배열의 요소에 해당하는 자료형 : 배열명)
			System.out.println(s);
		}

		 */ 
/*
		//		크기가 5인 int 배열 선언
		//		요소 입력 (자연수 범위), 짝수의 개수 출력   

		int[] arr = new int[5]; // 배열 선언 
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for (int i = 0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
			for (int v:arr) {
			if (v%2 == 0 ) {
				count++;
			}
		}
			System.out.println(count);
		*/
		/*
		int[] data=new int[] {2,3,5,6,8,10,15,4,7,9};
		// [최댓값 찾기] 알고리즘
		int max=data[0];
		for (int i=1; i<10;i++) {
			if(max<data[i]) {
//				max이 최대가 아니다.
				max=data[i];
			}
		} 
		System.out.println("max = "+max); 
		*/
		/*
//		최소값 찾기
		
		int minIndex=0;
		int[] data=new int[] {30,16,2,3,5,6,8,10,1,4,7,9};
		int min=data[0];
		for (int i=0; i<12; i++) {
			if (min>data[i]) { 
				min=data[i];
				minIndex=i;
			}
		}
		System.out.println(min);
		System.out.println("["+minIndex+"]");
		*/
		
//		-----------
//		정수를 여러번 입력 , 0 보다 큰 짝수만 배열에 저장
//		배열에 요소가 5개를 채우면 종료 ;
//	 	10 이상인 정수의 개수(cnt) 출력
/*		int[] arr = new int[5];
		for (int i=0;i<5;i++) {
			int x=sc.nextInt();
			if(x<=0 || x%2!=0) {
				
				continue;
			}arr[i]=x;
		}*/
/*		int[] arr = new int[5];
		int cnt = 0;
		for (int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
			for (int s : arr) {
			if (i%2 == 0) {
				cnt++;
				}
			}
			} System.out.println(cnt);  failed*/
/*		int[] arr=new int[5];
		int index=0;
		while(true) {
			int x=sc.nextInt();
			if( x>0 && x%2==0 ) {
				arr[index]=x;
				index++;
				if(index == 5 ) {
					break;
				} 
			}
		}
		int cnt = 0;
		for ( int v : arr) {
			if(v>=10) {
				cnt++;
			}
		} 	System.out.println(cnt); */
		
// 	 	10개의 정수를 저장하는 배열, 정수를 1개 입력
//		ex) [1,3,5,7,2,4,6,8,10,9]
//		: 5 를 입력하면 -> [몇번 째의 인덱스] 출력  
//		if 없는 숫자면 [-1]
/*		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int sw=0; // 스위치 변수  sw==0 OFF  sw==1 ON
		System.out.println("배열 저장 ");
		int data = sc.nextInt();
		for (int i=0; i<10;i++) {
			if(arr[i]==data) {
				System.out.println(i);
				sw=1;
			break;	
			}
		}
		if (sw==0) { // 스위치가 OFF
			System.out.println(-1);
		}
*/
		/* 		int data=arr[0];
		
		for (int i=0; i<10; i++) {
			int x = sc.nextInt();
			
			if (x<0) {
				System.out.println("-1");
			}
		}
		*/
		
//		 5개의 요소를 가진 배열 (자연수 범위)
//		해당 안에 있는 배열의 정수가 소수 -> O ,X
//		[ 2 3 4 5 6 ] 
//		[ O O X O X ]
		/*
		int[] arr = new int[5];
		for (int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int a=0; a<5; a++) {		
			int cnt = 0;
				for(int i=1; i<=arr[a]; i++) {
					if(arr[a]%i==0) {
					cnt++;
				}
	}
	if(cnt == 2) {
		System.out.print("O ");
	} else {
		System.out.print("X ");
	}
	} */
		//
		
	}

}
