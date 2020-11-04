package Health_Diary;

import java.util.Scanner;

public class WorkOut {
	Scanner sc = new Scanner(System.in);
	String name; // 운동명 
	int set, cnt,sec; // 운동 세트와 횟수, 시간(초), 초 단위를 이용하여 시 분 초 나오게 할 예정 
	WorkOut(){ // default 
	}
	WorkOut(String name, int set, int cnt,int sec){ // 생성자 
		this.name=name; this.set=set; this.cnt=cnt; this.sec=sec; 
	}
 
	void workoutAdd () { // 운동 추가 함수 
		System.out.println("\n\n운동을 추가하시겠습니까? (Y/N)");
		String y = "y", Y = "Y", n = "n", N = "N"; // 결정 변수
		sc.nextLine(); // 버퍼 방지
		String sel = sc.nextLine(); 
		if (sel.equals(y) || sel.equals(Y)) {
			System.out.println("\n\n 진행합니다. ");
			System.out.println("안내:: 횟수가 아닌 초(sec)단위로 입력하고 싶으시면 "
					+ "\n횟수 입력에서 0을 눌러 진행하십시오. ");
			// 운동 추가 기능 구현
			System.out.print("운동명 입력 : "); 
			this.name = sc.nextLine(); // 운동명 
			
			System.out.print("세트 수 입력 : ");
			this.set = sc.nextInt();
			if (this.set <= 0 ) {
				System.out.println("세트 수는 1 이상 입력하셔야 합니다. 다시 입력하세요.");
				return;
			}
			
			System.out.print("횟수 입력 : ");
			this.cnt = sc.nextInt();
			
			if	(this.cnt == 0) {
			System.out.print("초(sec) 입력 : ");
			this.sec = sc.nextInt();
			System.out.println("["+this.name+"] ["+this.set+"세트] ["+this.sec+"sec]가 저장 되었습니다.");
				} else {
				System.out.println("["+this.name+"] ["+this.set+"세트] ["+this.cnt+"개] 가 저장 되었습니다.");
			}
			
		} 
		else if ( sel.equals(n) || sel.equals(N)) {
			System.out.println("이전화면으로 돌아갑니다.");
			return;
		} else {
			int cls = 0;
			for (cls = 0; cls < 15; cls++) {
				System.out.println(); // 화면 클리어 
			} 
			System.out.println("WARNING : : 제대로 다시 입력하세요!!");
		}
	}
	void workoutDel() {
		System.out.println("\n: : WARNING : :\n운동을 삭제하시겠습니까? (Y/N)");
		
	}
	
	void workoutView() {
	if (cnt > 0 || sec <= 0 ) {
	System.out.println("["+this.name+"] ["+this.set+"세트] ["+this.cnt+"개]");	
		} else if ( sec > 0 || cnt <= 0) {
	System.out.println("["+this.name+"] ["+this.set+"세트] ["+this.sec+"초]");	
		}
	}

}
