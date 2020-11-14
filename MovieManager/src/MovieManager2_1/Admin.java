package MovieManager2_1;

import java.util.Scanner;

public class Admin extends Movie {
	private final String adminId = "admin";
	private final String adminPw = "gangster123";

	public Admin() {
		System.out.println("\t -- 관리자 모드 --");
	}
	public void adminLogin() {
		Scanner sc = new Scanner (System.in);
		for(int i = 0; i < 3; i++ ) {
			System.out.print("Admin ID >");
			String Id = sc.next();
			System.out.print("Admin Password >");
			String Pw = sc.next();
			if( Id.equals(this.adminId) && Pw.equals(this.adminPw)) {
				// && 어느 하나라도 false 인 경우 연산 중지
				adminMenu();
				// 관리 메뉴 
			} else {
				System.out.println("재 입력");
			}
		}
	}
	public void adminMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 영화 추가 || 2. 영화 수정 || 3. 영화 삭제 || 4. 메인 메뉴 ");
		int select = sc.nextInt(); 
		if (select == 1 ) {adminMovieAdd();
		} else if ( select == 2 ) {return;
		} else if ( select == 3 ) {return;
		} else if ( select == 4 ) {return;
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
	public void userLogin() {
		return;
	}
	
	
}
