package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 배열 
/*
		int s1=100;
		int s2=10;
		int s3=25;
		char[] s=new char[3];
		// 1. 서로 관련된 데이터 묶음,2. 자료형이 같아야함.
		int[] arr= new int[5]; // 인덱싱 방식;
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int[] arr2=new int[] {1,2,3,4,5};
		int[] arr3= {1,2,3,4,5};
		
		System.out.println(" arr 자료형의 저장할 배열을 입력하세요. : ");
		for (int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
			System.out.println("입력된 배열은 = "+arr[i]);
		}
		System.out.println("arr자료형에 저장된 배열은 총 = "+Arrays.toString(arr));
		// Arrays.toString()은 커맨드+쉬프트+O를 통해 java.util.Arrays;를 불러와야 함.
		*/
		/*
		String[] str = new String[3];
		for(int i=0; i<3; i++) {
			str[i]=sc.nextLine();
			 System.out.println(str[i]);
		} 
		System.out.println(Arrays.toString(str));
		// for Each == 향상된 for문
		for(String s : str ) {
			// ( 배열의 요소에 해당하는 자료형 : 배열명 ) 
			System.out.println(s);
		}
		*/
		/* 배열 선언하는 방식
		int[] arr = new int[2];
		arr[0]=1; arr[1]=2;
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		*/
/*
		//		예제 : 크기가 5인 int 배열 선언, 요소 입력(자연수 범위), 짝수의 개수를 출력 
		int [] arr = new int[5];
		for (int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			
		}  
		int count = 0;
		for (int v : arr) {
			if (v%2 == 0 ) {
				count++;
			}
		}	System.out.println("짝수 개수는 = "+count+" 개");
		*/
/*
		int[] data = new int[] {2,3,5,6,8,1,4,7,15,10} ;
//		최대값 찾기 알고리즘
		int max = data[0]; // 최대값 찾기
		int min = data[0];
		int minIndex=1; 
		int maxIndex=1;
		
		for(int i=1; i<data.length; i++) {
			if (max < data[i]) {
				//max의 값보다 data[i]이 크면 max = data[i] (data의 값을 max에 대입)
				max=data[i];
				maxIndex=i;
			}
			if (min>data[i]) {
				min=data[i];
				minIndex=i;
			}System.out.println("찾고 있는 중 .. "+i);
		} System.out.println("최대값 "+max);
		System.out.println("최대값이 몇번째의 자리에 위치하는가. = ["+maxIndex+"번째]");
		 System.out.println("최소값 "+min);
		System.out.println("최소값이 몇번째의 자리에 위치하는가. = ["+minIndex+"번째]");
		*/
/*
		// 예제: 정수를 여러번 입력 , 0보다 큰 짝수만 배열에 저장 , 5개를 모두 채우면 입력 종, 10이상인 정수의 개수 출력,
	int[] arr = new int[5];	
	int index=0;
	while (true) { //무한 루프, 
		int x=sc.nextInt(); // 내가 입력할 x값 
		if (x>0 && x%2==0) { // 0보다 큰 짝수 조건
			arr[index]=x; // x값이 arr 배열 index에 저장
			index++; // index에 값 추가 
			if (index==5) { // + 조건 추가,index에 5개가 저장되면 중지.
				break;
			}
		}
	} System.out.println(Arrays.toString(arr));
	int cnt=0; //10 이상 정수값을 카운트 변수 선언 
	for(int v:arr) { // for each 향상된 for문을 이용하여, v라는 요소에 저장된 배열명 대입
		if(v>=10) { // 배열에 저장된 값이 10보다 같거나 크면 
			cnt++; 	// 카운트 증가 
		}
	} 
	System.out.println("10 이상인 정수 개수 값 = "+cnt+" 개");
	*/
//		예제 :10개의 정수를 저장하는 배열 , 정수 1개를 입력 ,
//		ex) [1,3,5,7,2,4,6,8,10,9]  > 5를 입력하면 / [2] 인덱스 위치 출력 / 없는 숫자를 입력하면 [-1]출력 
	/*	System.out.println("저장할 10개의 정수를 입력하세요.");
		int[] arr = new int[10];
		for (int i=0; i<10; i++) {
			arr[i]= sc.nextInt(); 
		} System.out.println(Arrays.toString(arr));
		System.out.println("배열 저장이 완료 되었습니다.");
		System.out.println("\n인덱스 위치를 확인할 저장된 정수를 입력하세요.");
		int sw=0; // sw == 0; OFF, sw == 1; ON 이라는 뜻 
		int data=sc.nextInt();
		for(int i=0; i<10; i++) {
			if(arr[i]==data) {
				System.out.println("["+i+"]번째에 위치합니다.");
				sw=1; // 스위치 온 
			} 
		}
			if (sw==0) {
				System.out.println("-1"); // 스위치를 이용해도 되고 else 문을 이용해 break;로 중지 시켜도 된다.
			}
	*/
//		예제: 5개의 요소를 가진 배열(자연수 범위), 소수인지 아닌지 O,X로 판별, 
//		표시는 [2 3 4 5 6 ]
//			 [O  O X O X ]
		/* 
		System.out.println("5개의 자연수를 입력하세요. ");
		int[] arr=new int[5]; // 5개의 요소를 가진 배열 선
		for (int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for (int a=0; a<5; a++) { 
			int cnt=0; // 소수 판별 변수
			for (int i=1; i<=arr[a]; i++) { 
				if(arr[a]%i==0) {
					cnt++;
				}
			}System.out.print(" ");
			if(cnt==2) {
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		}
		*/
//		배열과 반복문의 조화
		String[] members = { "최진혁", "최유빈", "한이람" };
		for (int i = 0; i<members.length; i++) { // .length는 members라는 배열에 담을 수 있는 값의 개수.
			String member = members[i]; // 이 변수의 형식은 문자를 담는 변수.
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
		///////////////// for each 활용 ////////////
		System.out.println(" \n for-each \n");
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
		
		
		
		////////////////////////////////////////////////////////////
	}
}