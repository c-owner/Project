import java.util.Scanner;
/*  반복문
 *  while ,do while 문, for문 
 */
public class Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//  정수 1개 입력 -> 절대값을 출력 , 음수를 양수로
		//	 양수1 음수1을 입력해도 1
		/* int num=sc.nextInt();
	if (num < 0) {
		num*=(-1);
	} 
	System.out.println(num);
		 */
		//		정수 1개 입력 했을 때 , 0~5 : 홀수만을 출력
		/*		int i = 0;
		int num = sc.nextInt();
		while (i < 5) {
			i++; 
			if(i%2 != 0) {
				System.out.println(i);	
			}
		}
		 */ // 홀수 개수(cnt카운팅)를 출력
		/*int n=sc.nextInt();
	int i = 0;
	int cnt = 0;
	while (i<=n) {
		if(i%2==1) {
			cnt++;
		}
		i++;
	} System.out.println(cnt+"개");
		 */
		//   '정수'를 '입력할 때' 짝수 '개수'만을 출력 
		/* int i = 1;
	int n = sc.nextInt();
	int cnt = 0;
	while (i<=n) {
		if (i%2 == 0) {
			cnt = cnt+1;
		} i = i + 1;
	} System.out.println(cnt+"개");
		 */
		/*
		// 문자열을 이용한 반복문
		String n2="hi";
		String n1="hi";
		while (true) {
			System.out.println("Hi.");
			n1=sc.nextLine();
			if(!n1.equals(n2)) {
				System.out.println("그만!");
				break;
			}
		} */
		/* continue를 이용하여 10보다 같거나 작은 짝수와 개수를 출력하라.
  		int i = 0;
		int cnt = 0;
		while (i<10) {
			i++;
			if(i%2 != 0) {
				continue;
			} cnt++; 
		System.out.print(i+" ");
		}System.out.println("\n짝수 개수: "+cnt);
		 */
//		예제: '정수'를 입력, '양수 => 양수', '음수 -> None', 0 -> '종료';
		/*
		 int i;
		while (true) {
			i = sc.nextInt();
			if (i < 0) {
				System.out.println("음수,NONE,다시 입력하세요.");
			continue;
			} else if (i == 0) {
				System.out.println("종료 하였습니다.");
				break;
			}
			System.out.println(i);
		}
		*/
//	 	예제 : '5'를 "입력했을 때," 1~5까지 홀수와 개수 나오게 출력하라. 단! continue; 이용
		/* 
		int i = 0;
		int cnt = 0;
		int n=sc.nextInt();
		while (i<n) {
			i++;
			if (i%2 == 0) {
				continue;
			} cnt++; 
			System.out.print(i+" ");
		}
		System.out.print("\n 총 개수:"+cnt);
		*/
	/*	
		// while문 -> 선조건후처리 => 최소수행횟수 0번
		// do-while문 -> 선처리후조건 => 최소수행횟수 1번
		// 1,2,3 -> -1,0,4 => 재입력
		int x;
		do {
			System.out.println("안내면 진거 가위 바위 보");
			x=sc.nextInt();
		} while (x<1 || x>3);
		if (x == 1) {
			System.out.println("가위를 내셨습니다.");
		} else if (x == 2) {
			System.out.println("바위를 내셨습니다.");
		} else {
			System.out.println("보를 내셨습니다.");
		} 
		*/
//	------------- for 문 -----------------
	/* 
	System.out.println("----------for문----------");
	int cnt=0;
	for (int i=0; i<10; i++) {
		cnt++;
		System.out.println("안녕하세요. 저는 for문입니다."+cnt); 
		}
	*/
//		예제: "1~10"까지 모두 출력 -> 그 합을 출력 
	/* 
		int total = 0;
		for (int i=1; i<=10; i++) {
			total = total + i;
			System.out.println(i+" ");
		}  System.out.println("\n총합:"+total);
	*/
//		예제: 정수 2개를 입력, 큰수와 작은수 일때 작은수 순서대로 출력
		/*
		int a,b;
		System.out.print("첫번째 정수 값을 입력하세요 : ");
		a=sc.nextInt();
		System.out.print("두번째 정수 값을 입력하세요 : ");
		b=sc.nextInt();
		System.out.println("작은수의 정수 값부터 출력합니다.");
		if (a>b) {
			int tmp=a; // 교환 알고리즘
			a=b;
			b=tmp;
			for (int i=a; i<=b; i++) {
//				 	if (i%2 == 0) { // 두개의 정수 값중에서 홀수만 나오게 하려면 
//				continue; // 
				System.out.print(i+" ");
			} 
		}
		System.out.print("입니다.");
		*/

		// while : 여러번,영원히,조건을 만족하는 동안
		// for : n번, n회, 시작점-종료점 분명할 때
//		 예제 : 정수 10번 입력 , 종합 출력, 만약 0 이하의 정수가 입력된다면 즉시종료
/*
 		int total = 0; // 종합 출력 선언
		for (int i=0; i<5; i++) { // i<5 조건문은 5번을 실행을 뜻함. 
			System.out.print("정수를 입력하세요 : ");
			int a = sc.nextInt();
		if (a <= 0) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
			} // if
		total = total + a;
		} // for 
		System.out.println("총 합 : "+total+" 입니다.");
		*/
//		예제: 정수 1개를 입력했을 때 약수를 구하시오.
		/*
		System.out.println("정수 1개를 입력하세요.");
		int num = sc.nextInt(); // num 입력할 정수 !
		System.out.println("약수의 값이 출력됩니다.");
		for (int i=1; i<=num; i++) { // i 값은 num을 나눌 약수 !
			if ((num%i) == 0) { // 약수를 출력해야 하므로 입력한 정수(num)을 나눈다.
				System.out.println(i+""); // if문 안에 넣어주어야 if문 안에 있는 
//				조건문에 맞춰서 약수만 출력된다.		
			}
		}
				*/
//		예제: 정수 1개를 입력했을 때 3배수의 값을 구하시오. 단 (50번 까지만.)
		/*
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt(); // 입력할 정수 
		System.out.print(num+"를 입력하셨습니다. \n설정한 배수 값이 출력됩니다. \n");
		for (int i=1; i<=50; i++) { // i=1 : 1부터, i<=50 : 50 숫자 까지만, 실행한다.
			if(i%num == 0) {
				System.out.print(i+" ");
			}
		} 
		*/
		

	} // public
} // public