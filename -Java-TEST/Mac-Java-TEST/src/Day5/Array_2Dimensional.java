package Day5;

public class Array_2Dimensional {

	public static void main(String[] args) {
		// 2차원 배열에 대해..
		int[][] array4 = new int[3][4]; // 
		array4[0][1] = 10;

		int[][] array5 = new int[3][]; 
		array5[0] = new int[1]; // 0번째 인덱스에 1개짜리 배열을 생성,
		array5[0][0] = 10; // [0]번 인덱스에 [0]번째 자리에 10이라 지정.

		int[][] array6 = {{1},{1,2},{1,2,3}};
		System.out.println(array6[0][0]+"[0][0]");
		System.out.println(array6[2][2]+"[2][2]");
// 		0 -	O 
//		1 -	O O
//		2 -	O O O 
//		= int[][] array6 = new int[2][2];
		
		////////////////////////////////////////////
		//	2차 배열을 이용한 구구단
		System.out.println("구구단");
		int[][] gop = new int[10][10]; 

		for (int i=2; i<gop.length; i++) {
			System.out.println(i+" 단 ");
			for (int j=1; j<gop.length; j++) {
				gop[i][j] = i*j;
				System.out.print(i+"x"+j+"="+gop[i][j]+"//");
				if (j == 9) {
					System.out.println("\n-----------------");
				}
			}
		}
		////////////////////////////////
		//		2차 배열을 이용하여 숫자를 1부터 차례대로 나오게하기.
		/*
		int[][] arr = new int[5][5];
		int num=1;
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[0].length; j++) {
				arr[i][j] = num;
				System.out.print(arr[i][j]+" ");
				num++;
			}
			System.out.println(); 	
		}
		 */
		/*
		System.out.println("예제");
		System.out.println("1,2,3,4,5\n10,9,8,7,6\n11,12,13,14,15\n20,19,18,17,16"); 
		System.out.println("-----이런식으로 나오게 하기-----");
		int[][] arr2 = new int[5][5];
		int num = 1;//대입 할 숫자를 1로 초기화 한다 
		for (int i = 0; i < arr2.length; i++) { //배열의 길이만큼 반복문을 수행한다 
			if(i%2==0) {//2로 나눠서 나머지가 0이라면 0번째,2번째,4번째 행이다 
				for (int j = 0; j < arr2.length; j++) {//각 행의 열에 대해서 반복문을 수행한다 
					arr2[i][j] = num;//num을 배열에 대입한다
					num++;//num의 크기를 1 증가시킨다 
				} 
			} else {//i를 2로 나눠서 나머지가 0이 아닌 경우,즉 1번째 3번째 행인 경우 
				for (int j = 4; j >=0 ; j--) {//각 행의 열에 대해서 반복문을 수행한다 
					arr2[i][j] = num;//num을 배열에 대입한다 
					num++;//num의 크기를 1 증가 시킨다 
				} 
			} 
		} for (int i = 0; i < arr2.length; i++) {//각 행에 대한 반복문 
			for (int j = 0; j < arr2.length; j++) {//각 열에 대한 반복문 
				System.out.print(arr2[i][j]+ " ");//반복문을 수행하며 배열에 있는 값들을 모두 출력한다
			}
			System.out.println(); //줄바꿈
		}

		*/
//		예제 : 5행 5열의 2차원 배열을 선언하고 각 요소에 1부터 1씩 증가한 값을 설정하되 각 행의 맨 끝과 각 열의 맨끝에
//		합이 누적이 되도록 한다
//		모든 배열의 요소를 출력한다.
		int[][] arr = new int[5][5];
		int num=1; // 
		for (int i=0; i<4; i++ ) {
			for (int j=0; j<4; j++) {
				arr[i][j] = num;
				num++;		
				arr[i][4] = arr[i][4] + arr[i][j];
				arr[4][j] = arr[4][j] + arr[i][j];
				arr[4][4] = arr[4][4] + arr[i][j];
			}
		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
					System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
//		/////////////////////////////////////
	}

}
