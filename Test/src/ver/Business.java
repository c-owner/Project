package ver;
import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
	Seoul[] delivery = new Seoul[40]; // 서울 배열
	Seoul[] north = new Seoul[10]; // 강북
	Seoul[] south = new Seoul[10]; // 강남
	Seoul[] west = new Seoul[10]; // 강서
	Seoul[] east = new Seoul[10]; // 강동
	 int n=0,s=0,w=0,e=0,i=0; // 배열 인덱스 체크
	 int act; // 입력용 변수 
	
	public void input() { // 입력문
		System.out.println("배달 지구(1.강동지구|2.강서지구|3.강남지구|4.강북지구");
		do {
			System.out.println("1~4번중 선택하세요.");
			act = sc.nextInt();
		} while (act < 1 && act > 4 );
		
		if(act == 1 ) {
			Seoul s = new East(); // 강동지구 선택
			System.out.print("배달 시간 ? > ");
			s.time = sc.nextInt(); // 배달 시간
			System.out.print("배달량 개수 ? > ");
			s.cnt = sc.nextInt();

			deliveryPay(s); 	// 배달 요금 계산 메소드 자리
			Seoul east1 = new East("장동욱", s.time, s.cnt, s.pay);
			east[e++] = east1; // 배열에 저장
			delivery[i++] = east1;
		} else if ( act == 2 ) {
			Seoul s1 = new West(); // 강서지구 선택
			System.out.print("배달 시간 ? > ");
			s1.time = sc.nextInt(); // 배달 시간
			System.out.print("배달량 개수 ? > ");
			s1.cnt = sc.nextInt();

			deliveryPay(s1);
			s1 = new West("박영수", s1.time, s1.cnt,s1.pay);
			west[w++] = s1;
			delivery[i++] = s1;
		} else if ( act == 3 ) {
			Seoul s2 = new South(); 
			System.out.print("배달 시간 ? > ");
			s2.time = sc.nextInt(); // 배달 시간
			System.out.print("배달량 개수 ? > ");
			s2.cnt = sc.nextInt();

			deliveryPay(s2);
			s2 = new South("이기영", s2.time, s2.cnt, s2.pay);
			south[s++] = s2;
			delivery[i++] = s2;
		} else if ( act == 4 ) {
			Seoul s3 = new North();
			System.out.print("배달 시간 ? > ");
			s3.time = sc.nextInt(); // 배달 시간
			System.out.print("배달량 개수 ? > ");
			s3.cnt = sc.nextInt();

			deliveryPay(s3);
			s3 = new North("김찬영", s3.time, s3.cnt, s3.pay);
			north[n++] = s3;
			delivery[i++] = s3;
		}
		return;
	}

	public void Out(Seoul[] e) { // 개별 출력문
		System.out.println("------------------");
//		e[0].toString();
		System.out.println(e[0]+" 입니다.");
		for(int j = 0; j < e.length; j++ ) {
			if(e[j] == null ) break;
			System.out.println(e[j].name+"\t"+e[j].time+"\t"+e[j].cnt+"\t"+e[j].pay+"\n"); 
		}
		System.out.println("------------------");
	}
	public void deliveryPay(Seoul s) { // 배달 계산 메소드  
		// 배달 시간이 1시간 이내
		if (s.time <= 1 && s.time > 0) {
			s.pay = 1000; // 배달요금 천원
		} else if ( s.time > 1 && s.time < 2 ) { // 1~2
			s.pay = 2000;
		} else if ( s.time >= 2 && s.time < 3 ) { // 2~3
			s.pay = 3000;
		} else if ( s.time >= 3) { //3시간 이상
			s.pay = 4000;
		} else {
			System.out.println("ERROR 잘못된 시간!!");
		}
		if (s.cnt > 0 && s.cnt <= 100 ) { // 배달량  계산 
			s.val = 1000; // 단가 지정
		} else if ( s.cnt > 100 && s.cnt <= 200 ) {
			s.val = 2000;
		} else if ( s.cnt > 200 && s.cnt <= 300 ) {
			s.val = 3000;
		} else if ( s.cnt > 300 ) {
			s.val = 4000;
		} else { 
			System.out.println("-ERROR 잘못된 개수-");
		}
		s.pay = s.val + s.pay;
	}
}
