import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money=0; // 무조건 초기화!
		while(true) {
			System.out.println("1.코카콜라 2.파워에이드 3.TOP 4.우유 5.종료");
			// 5-자판기 프로그램 종료
			int b; // 블록구간에 유의!!!
			do {
				b=sc.nextInt();
			}while(b<1 || 5<b);
			if(b==5) {
				break;
			}
			// 1~5 외의 입력 -> 재입력

			String m1="코카콜라";
			String m2="파워에이드";
			String m3="TOP";
			String m4="우유";
			int p1=900;
			int p2=1200;
			int p3=1000;
			int p4=800;

			String menu=m1;
			int price=p1;
			switch(b) {
			case 2:
				menu=m2;
				price=p2;
				break;
			case 3:
				menu=m3;
				price=p3;
				break;
			case 4:
				menu=m4;
				price=p4;
				break;
			}

			System.out.print("동전을 넣어주세요! : ");
			
			int my;
			do {
				my=sc.nextInt();
			}while(my<=0);// 0이하의 입력 -> 재입력
			money+=my;
			
			if(money>=price) {
				System.out.println(menu+"가 나옵니다!");
				money-=price;
			}
			else {
				System.out.println("돈이 부족합니다!");
			}
		} // ctrl+A -> ctrl+I : 줄정렬
		// 바로반환xxx -> 프로그램 종료시 반환
		if(money>0) {
			System.out.println(money+"원 반환");
		}
		
	}
}
