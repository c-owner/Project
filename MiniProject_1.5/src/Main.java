import java.util.Scanner;
/*
미니 프로젝트에 걸맞게 미니미니하게 구현
 발견된 버그 = 여러 기능을 사용하다 기록을 삭제 할려고 하면 삭제 실패..
  원인 : 삭제할 파일이 사용중이라서 즉각 처리가 안되는 듯 함 ===> 윈도우만 안됨 다른 OS는 문제없었음  
  해결 : 기록삭제는 프로그램을 재실행(Run)을 하고나서 바로 기록삭제하면 가능.
* Patch ::
* + 기록을 작성할 때 지정된 경로가 존재하지 않다면 디렉토리까지 폴더 생성
* + 
*/


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		WorkoutArrayList list = new WorkoutArrayList();
		Memo me = new Memo();
		
		 String y = "y",Y="Y",N="N",n="n",P="P",p="p";
		// 자주 사용하는 선택문 클래스 선언
		
		 String wm; // os 선택 변수 
		
		boolean cnd = true;
		while (cnd ) {
			String os = System.getProperty(
					"os.name").toLowerCase(); 
			if (os.contains("win")) {
				System.out.println("User OS : Windows"); 
			} 
			else if (os.contains("mac")) { 
				System.out.println("User OS : Mac"); 
			} else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) { 
				System.out.println("User OS : Unix"); 
			} else if (os.contains("linux")) { 
				System.out.println("User OS : Linux");
			} else if (os.contains("sunos")) { 
				System.out.println("User OS : Solaris");
			}

			System.out.println("============메인 메뉴============ ");
			System.out.print("1.운동 추가 | 2.운동 삭제 | 3.운동 조회   \n"
							+"4.기록 조회 | 5.기록 저장 | 6.기록 삭제   \n"
							+"7.Clear   | 0. Program EXIT....    \n");
			System.out.println("\n===============================");
			System.out.print("입력 >  ");
			int sel = sc.nextInt();
			sc.nextLine(); // 버퍼 증상 해결
		
			switch (sel) {
			case 1:
				System.out.print("추가할 운동명 : ");
				String name = sc.next();
				
				System.out.print("운동의 세트 수 : ");
				int set = sc.nextInt();
				
				System.out.print("몇 개 수행합니까? : ");
				int cnt = sc.nextInt();
				
				System.out.print("운동의 시간(sec) : ");
				int sec = sc.nextInt();

				for (int cls = 0; cls < 15; cls++) { // 화면클리어 
					System.out.println(); // 화면 클리어 
					}
				
				if(set <= 0 || cnt <= 0 && sec <= 0) {
					System.out.println("WARNING : 세트 수는 1이상 입력하셔야 합니다. 처음으로 돌아갑니다. ");
					continue;
				}

				WorkOut m = new WorkOut(name,set,cnt,sec);
				list.addWorkout(m); // 운동 저장 
				
				System.out.println("성공적으로 추가를 마치셨습니다.");
				System.out.println(m);
				break;
				// 
				
			case 2:
				System.out.print("삭제하려는 운동의 이름을 입력 : ");
				name = sc.nextLine();
				
				for (int cls = 0; cls < 15; cls++) { // 화면클리어 
					System.out.println(); // 화면 클리어 
					}
				
				list.removeWorkout(name); // 운동 삭제 함수 호출
				System.out.println(); //줄바꿈
				break;
			
			case 3:
				for (int cls = 0; cls < 15; cls++) { // 화면클리어 
					System.out.println(); // 화면 클리어 
					}
				list.showAllWorkout(); // 조회 
				System.out.println("------------ CLOSE -----------"); 
				break;
			case 4: // 기록 조회 
				for (int cls = 0; cls < 15; cls++) { // 화면클리어 
					System.out.println(); // 화면 클리어 
					}
				System.out.println("사용자의 운영체제를 파악중입니다.");
				os = System.getProperty(
						"os.name").toLowerCase(); 
				if (os.contains("win")) {
					System.out.println("사용자의 운영체제는 Windows입니다.");
					me.memoView2(); // 윈도우 메모 
				} else if (os.contains("mac")) {
					System.out.println("사용자의 운영체제는 Mac OS입니다.");
					me.memoView1();
					System.out.println("------------ CLOSE -----------");
				}
				System.out.println();
				break;
			case 5: // 기록 저장 
				for (int cls = 0; cls < 15; cls++) { // 화면클리어 
					System.out.println(); // 화면 클리어 
					}
				System.out.println("사용자의 운영체제를 파악중입니다.");
				os = System.getProperty(
						"os.name").toLowerCase(); 
				if (os.contains("win")) {
					System.out.println("사용자의 운영체제는 Windows입니다.");
					me.folderWindows(); // 폴더 판별 함수 호출 
					System.out.println();
					me.memo2(); // 윈도우 메모 
				} else if (os.contains("mac")) {
					System.out.println("사용자의 운영체제는 Mac OS입니다.");
					me.folderMac();
					me.memo1();
				}
				break;
			case 6: // 기록 삭제
				for (int cls = 0; cls < 15; cls ++) {
					System.out.println();
				}
				System.out.println("시스템 운영체제를 파악하고 있습니다...");
				os = System.getProperty(
						"os.name").toLowerCase(); 
				if (os.contains("win")) {
					System.out.println("사용자의 운영체제는 Windows입니다."
							+ "\n\t*** Warning ***");
					System.out.println("*** 진행하면 되돌릴 수 없습니다. 그래도 진행하시겠습니까? ***");
					System.out.println("\t Y / N "); // YES Next <-> No Previous
					String a = sc.nextLine();
					if ( a.equals(y) || a.equals(Y) ) {
						me.memoDeleteWin(); //메모 삭제 함수 진행
						}  
					  else if ( a.equals(n) || a.equals(N) ) {
						System.out.println("삭제를 중지합니다.");
						break;
					} else {
						System.out.println("다시 입력하세요.");
						break;
					}
				} else if (os.contains("mac")) {
					System.out.println("사용자의 운영체제는 Mac OS입니다.\n\t *** Warning ***");
					System.out.println("*** 진행하면 되돌릴 수 없습니다. 그래도 진행하시겠습니까? ***");
					System.out.println("\t Y / N "); // YES Next <-> No Previous
					String a = sc.nextLine();
					if ( a.equals(y) || a.equals(Y) ) {
						System.out.println(" *** LAST WARNING ***\n    정말 삭제합니까?\n 입력 >");
						a = sc.nextLine();
						if ( a.equals(y) || a.equals(Y) ) {
							me.memoDeleteMac();//메모 삭제 함수 진행
						} else { 
							System.out.println("삭제를 중지합니다.");
							break;
						}
					} else if ( a.equals(n) || a.equals(N) ) {
						System.out.println("삭제를 중지합니다.");
						break;
					} else {
						System.out.println("다시 입력하세요.");
						break;
					}
				}
				break;
			case 7: // 클리어
				for(int i = 0; i < 25; i++ ) {
					System.out.println();
				}
				break;
			case 0:
				for (int cls = 0; cls < 15; cls++) {
					System.out.println(); // 화면 클리어 
					}
				cnd = false; //   종료지점
				System.out.println(" 프로그램을 종료합니다. ");
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