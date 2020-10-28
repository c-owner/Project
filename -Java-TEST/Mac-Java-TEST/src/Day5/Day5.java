package Day5;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
//		정수를 여러번(while) 입력 후 
//		입력한 정수가 소수일 때만 배열에 data[]저장 
//		요소가 3개 가득 저장 되었을 때 모두 출력
		int[] data=new int[3];
		int index=0;
		System.out.println("정수를 입력하세요.");
		while(true) {
			int num = sc.nextInt();
			int cnt=0; // 약수 개수 변수 
			for(int i=1; i<=num; i++) { // 
				if(num%i == 0 ) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.println("저장");
				data[index++]=num;
				if (index == 3 ) {
					break; // index가 3개가 채워지면 break
				}
			} else { 
				System.out.println("저장안됨");
			}

		}
		for (int v : data) {
			System.out.print("소수인 정수"+v+" ");
		}
		 */

		/*
//		10개의 요소를 arr[] 배열에 저장 
//		저장된 배열중 가장 큰 값과 Index위치 출력
		System.out.println("저장할 값을 입력하세요.");
		int[] arr = new int[10];
		for (int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("배열 저장");

		int max = arr[0];
		int maxIndex=0;
		for (int i=0; i<10; i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxIndex=i;
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("Index 위치 : "+maxIndex);

		 */
		/*
		//		배열 오름차순 정렬 -> 버블 정렬 
		//		1. 비교-> (데이터 개수-1)번 ex) 4개의 데이터 ->3번
		//		2. 1회 -> 데이터 개수만큼 반복
		//		==> 제일 큰 데이터가 뒤에서 부터 정렬 됨.
		//		앞에있는 큰 데이터가 뒤로 넘어가는 과정
		int[] arr = new int[5];
		for ( int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		for (int v : arr) {
			System.out.print(v+" ");
		}
		System.out.println(); //줄 바꿈 

		for(int a=0; a<5; a++) { // 데이터 개수만큼 반복
		for (int i = 0; i<5-1; i++ ) {  // 비교 
				if (arr[i] > arr[i+1]) { //
					// 교환
					int tmp=arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		for (int v:arr) {
			System.out.print(v+" ");
		} 
		 */
		//		데이터 10 개 입력 , 
		//		1. 오름차순 정렬 -> 가장 큰 정수 출력 -> 가장 작은 정수 출력
		int[] arr = new int[10];
		for ( int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
		}
		for (int v : arr) {
			System.out.print(v+" ");
		}
		System.out.println(); //줄 바꿈 

		for(int a=0; a<10; a++) { // 데이터 개수만큼 반복
			for (int i = 0; i<10-1; i++ ) {  // 비교 
				if (arr[i] > arr[i+1]) { //
					// 교환
					int tmp=arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		for (int v:arr) {
			System.out.print(v+" ");
		}
		System.out.println("\n최대값 : "+arr[9] + " 최소값 : "+ arr[0]);
		
		int max=arr[0];
		int min=arr[0];
		for (int i=0; i<10; i++) {
			if (arr[i]<min) {
				arr[i] = min;
			}
			if (arr[i]>max) {
				max = arr[i];
			}
		} System.out.println("\n최소값"+min);
		System.out.println("최대값"+max);

//		//////////////////////////////////////////////
//		
		
		//////////////////////////////////////////////////
	}

}
