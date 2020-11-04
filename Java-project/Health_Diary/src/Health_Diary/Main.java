package Health_Diary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
 
class Memo { // 기록 클래스 운동을 상속받아 운동 리스트를 호출할 예정
	Scanner sc = new Scanner(System.in);
	int day,time; // 날짜와 운동한 시간이 필요  

	 public Memo() {
		 super();
	}
	void memo() { 
		
		String txt;     // 기록용 변수 선언
		   System.out.print("기록하실 내용을 입력하세요 : ");
			 txt = sc.nextLine(); // 기록을 하기 위한 입력값
		    String fileName = "/Users/iyu/Desktop//DiaryMemo.txt";
		        try{
		            // BufferedWriter / FileWriter를 조합 사용 (속도 향상)
		            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
		           
		            fw.write(txt);
		            fw.flush();
		            fw.close();
		        } catch(Exception e){
		            e.printStackTrace();
		        } 
		        System.out.println();
	}
	void memoDel() { // 기록 특정 부분 삭제하는 함수 구현을 하고싶은데 흠흠..
		 
	}
	public void memoView() {
	System.out.println("==== 기록일지 오픈 ====");
	 try{ // 예외 처리
         //파일 객체 생성
         File file = new File("/Users/iyu/Desktop//DiaryMemo.txt");
         //스캐너로 파일 읽기
         Scanner scan = new Scanner(file);
         while(scan.hasNextLine()){
             System.out.println(scan.nextLine());
         }
     }catch (FileNotFoundException e) {
         // TODO: handle exception
     }
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean cnd = true;
		WorkoutArrayList list = new WorkoutArrayList();
		Memo me = new Memo();
		
		while (cnd ) {
			System.out.println("============메인 메뉴============  |");
			System.out.print("1.운동 추가 | 2.운동 삭제 | 3.운동 조회 |"
							+ "\n4.기록 조회 | 5.기록 저장 | 0. 종료    |");
			System.out.println("\n===============================  |");
			System.out.print("입력 >  ");
			int sel = sc.nextInt();
			sc.nextLine(); // 버퍼 증상 해결
			switch (sel) {
			case 1:
				System.out.print("추가할 운동명 : ");
				String name = sc.next();
				
				System.out.print("운동의 세트 수 : ");
				int set = sc.nextInt();
				if(set <= 0 ) {
					System.out.println("WARNING : 세트 수는 1이상 입력하셔야 합니다. 처음으로 돌아갑니다. ");
					continue;
				}
			
				System.out.print("몇 개 수행합니까? : ");
				int cnt = sc.nextInt();
				
				System.out.print("운동의 시간(sec) : ");
				int sec = sc.nextInt();
				
				WorkOut m = new WorkOut(name,set,cnt,sec);
				list.addWorkout(m); // 운동 저장
				System.out.println("성공적으로 추가를 마치셨습니다.");
				System.out.println(m);
				break;
				// 
				
			case 2:
				System.out.print("삭제하려는 운동의 이름을 입력 : ");
				name = sc.nextLine();
				list.removeWorkout(name); // 운동 삭제 함수 호출
				break;
			
			case 3:
				list.showAllWorkout(); // 조회 
				break;
				
			case 4: // 기록 조회 
				me.memoView();
				break;
			case 5: // 기록 저장 
				me.memo();
				break;
			case 0:
				cnd = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			
			default :
				for (int cls = 0; cls < 15; cls++) {
					System.out.println(); // 화면 클리어 
					}
				System.out.println("WARNING :: 잘못된 입력입니다. 다시 입력하세요 !! ");
			}
			
		}
	}
}
		/*
 // 다형성을 이용할 것임
		// 생성자 
		ArrayList<WorkOut> wo = new ArrayList<WorkOut>();
		int index = 0;
		WorkOut WO = new WorkOut();
		Memo me = new Memo();
		
		//배열 구현
		while ( true ) {

			System.out.println("============메인 메뉴============");
			System.out.print("1.운동 추가 | 2.운동 삭제 | 3.운동 조회 "
							+ "\n4.기록 조회 | 5.기록 저장 | 6.기록 삭제");
			System.out.print("\n 프로그램을 종료하려면 0번");
			System.out.println("\n===============================");
			System.out.print("입력 >  ");
			
			int act = sc.nextInt();
			if ( act == 1 ) {
				WO.workoutAdd();
			} else if ( act == 2 ) {
				WO.workoutDel();
			} else if ( act == 3 ) {
				for (WorkOut wl : wo) {
					System.out.println(wl);
				}
				WO.workoutView(); 
			} else if ( act == 4 ) {
				me.memoView();
			} else if ( act == 5 ) {
				me.memo();
			} else if ( act == 6 ) {
				me.memoDel();
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
*/