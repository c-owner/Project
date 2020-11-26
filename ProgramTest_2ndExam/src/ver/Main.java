package ver;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Business bs = new Business(); // 인스턴스화 
		
		int act; // 선택 변수
		
		System.out.println("------------------");
		System.out.println("배달 현황 프로그램");
		System.out.println("------------------");
		System.out.println("Programmer : by_천기훈");
			while(true) {
			do {
				System.out.println("--------------------------------");
				System.out.println("1. 입력 | 2. 출력 | 3. 종료");
				System.out.println("--------------------------------");
				act = sc.nextInt();
			} while( act < 1 && act > 3 );
			
			switch (act) {
			case 1: bs.input() ;break;
			case 2: 
			System.out.println("1. 개별 지구 확인 | 2. 모든 지구 | 3. 종료");
			act = sc.nextInt();
			if (act == 1 ) {
				System.out.println("1.강동 2.강서 3.강남 4.강북");
				act = sc.nextInt();
				if(act ==1 ) { bs.Out(bs.east); break; }
				if(act ==2 ) { bs.Out(bs.west); break; }
				if(act ==3 ) { bs.Out(bs.south); break; }
				if(act ==4 ) { bs.Out(bs.north); break; }
			}
			else if(act == 2 ) { 
				System.out.println("--------------------");
				bs.Out(bs.east);
				bs.Out(bs.west);
				bs.Out(bs.south);
				bs.Out(bs.north);
				break;
			} else { 	}
			case 3: System.out.println("프로그램 종료"); 
			sc.close(); System.exit(0);
			}
		}
		
		}
	}
 
