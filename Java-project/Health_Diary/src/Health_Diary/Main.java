package Health_Diary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

class WorkOut {
	Scanner sc = new Scanner(System.in);
	String name; // 운동명 
	int set, sec; // 운동 세트와 시간(초), 초 단위를 이용하여 시 분 초 나오게 할 예정 
	
	WorkOut(){ // default 
	}
	WorkOut(String name, int set, int sec){ // 생성자 
		this.name=name; this.set=set; this.sec=sec; 
	}
	void workoutAdd () { // 운동 추가 함수 
		System.out.println("\n\n운동을 추가하시겠습니까? (Y/N)");
		String y = "y", Y = "Y", n = "n", N = "N"; // 결정 변수
		String sel = sc.nextLine(); 
		if (sel.equals(y) || sel.equals(Y)) {
			System.out.println("\n\n운동 추가를 진행합니다. ");
			// 운동 추가 기능 구현
			
		} else if ( sel.equals(n) || sel.equals(N)) {
			System.out.println("이전화면으로 돌아갑니다.");
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
	System.out.println("["+this.name+"]이(가) ["+this.set+"]세트["+this.sec+"]초로 추가 되었습니다.");	
	}
}

class Memo { // 기록 클래스
	Scanner sc = new Scanner(System.in);
	String txt;
	private int position;
	private Object Log;
	void memo() {
		String txt;     // 기록용 변수 선언
		   System.out.print("기록하실 내용을 입력하세요 : ");
			 txt = sc.nextLine(); // 기록을 하기 위한 입력값
		    String fileName = "G://OneDrive - 유원대학교//Windows 10 - Desktop//DiaryMemo.txt" ;
		        try{
		            // BufferedWriter / FileWriter를 조합 사용 (속도 향상)
		            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
		            fw.write(txt);
		            fw.flush();
		            fw.close();
		        }catch(Exception e){
		            e.printStackTrace();
		        } 
		        System.out.println();
	}
	void memoDel() { // 기록 특정 부분 삭제하는 함수 구현
		
	}
	void memoView() {
	
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
 // 다형성을 이용할 것임
		// 생성자
		 WorkOut wo = new WorkOut(); 
		Memo me = new Memo();
		
		while ( true ) {

			System.out.println("============메인 메뉴============");
			System.out.print("1.운동 추가 | 2.운동 삭제 | 3.운동 조회 "
							+ "\n4.기록 조회 | 5.기록 저장 | 6.기록 삭제");
			System.out.print("\n 프로그램을 종료하려면 0번");
			System.out.println("\n===============================");
			System.out.print("입력 >  ");
			int act = sc.nextInt();
			if ( act == 1 ) {
				wo.workoutAdd();
			} else if ( act == 2 ) {
				wo.workoutDel();
			} else if ( act == 3 ) {
				wo.workoutView(); 
			} else if ( act == 4 ) {
				
			} else if ( act == 5 ) {
				me.memo();
			} else if ( act == 6 ) {
				
			} else if ( act == 0 ) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n"
						+ " ★★프로그램을 종료합니다.★★");
				break;
			} else {
				int cls = 0;
				for (cls = 0; cls < 15; cls++) {
					System.out.println(); // 화면 클리어 
				} 
				System.out.println("WARNING : : 제대로 다시 입력하세요!!");
				for (cls = 0; cls < 5; cls++) {
					System.out.println(); // 화면 클리어 
					}
				continue;
				}
			}
		
	}
}