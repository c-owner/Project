package MovieManager2_2;

import java.util.Scanner;

public class Admin extends Movie {
	private final String adminId = "admin";
	private final String adminPw = "gangster123";

	public Admin() {
		System.out.println("\t -- 관리자 모드 --");
	}
	public void adminLogin() {
		Scanner sc = new Scanner (System.in);
		int cnt = 0;
		while(true) {
			System.out.print("Admin ID >");
			String Id = sc.next();
			System.out.print("Admin Password >");
			String Pw = sc.next();
			if( Id.equals(this.adminId) && Pw.equals(this.adminPw)) {
				// && 어느 하나라도 false 인 경우 연산 중지
				adminMenu();
				break;
				// 관리 메뉴 
			} else {
				System.out.println("ID/PW가 틀립니다. 다시 입력하세요. ("+(cnt+1)+"/3)");
				cnt++;
			}
			if ( cnt == 3 ) {
				System.out.println("입력 오류 - 초기화면으로 복귀 --");System.out.println("입력 오류 - 초기화면으로 복귀 --");
				break;
			}
			
		}
	}
	public void adminMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1. 영화 추가 || 2. 영화 수정 || 3. 영화 삭제 || 4.영화 목록 ||5. 메인 메뉴 ");
		int select = sc.nextInt(); 
		if (select == 1 ) {adminMovieAdd();
		} else if ( select == 2 ) {return;
		} else if ( select == 3 ) {return;
		} else if ( select == 4 ) {adminMovieShow();
		} else if( select == 5 ) {break;}
		}
	}
	@Override
	public void adminMovieAdd() {
		super.adminMovieAdd();
		return;
	}
	@Override
	public void adminMovieEdit() {
		super.adminMovieEdit();
		return;
	}
	@Override
	public void adminMovieDelete() {
		super.adminMovieDelete();
		return;
	}
	@Override
	public void adminMovieShow() {
		super.adminMovieShow();
	}
	
	
}
