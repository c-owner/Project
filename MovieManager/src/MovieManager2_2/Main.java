/*
 Ver 2.1
 updated : 틀 잡기 
 
 --- 예정 ---
LinkedList 출력 삭제 수정
admin Menu 구성
User Menu 구성 
*/


package MovieManager2_2;

import java.util.Scanner;

public class Main {
	static String Select[] = {"Y","y","n","N","1","2"};
	static String Select2;
	static String userId = null;
	static String userPw = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user1 = new User();
		while(true) {
			System.out.println("\t==========Corner Movie Manager=============\t");
			System.out.println("\t1. 일반 사용자\t||  2.어드민 접속 || 종료 AnyKey");
			Select2 = sc.next();
			if(Select2.equals("1") ) {
				System.out.println("1. 로그인 || 2. 회원가입 || 3. 비로그인 || 4. 로그아웃");
				Select2 = sc.next();
				if (Select2.equals("1")){
					if(Select2.equals("1")) {
					System.out.println("현재 Id가 없습니다. 회원가입을 진행합니다.");
					user1.userSignUp(); }
					else if (Select2.equals("2")) {user1.userSignIn();}
					
				} else if(Select2.equals("2")) {
					System.out.print("Id 입력 >"); userId = sc.next();
					System.out.print("Pw 입력 >"); userPw = sc.next();
					User user2 = new User(userId, userPw);	}
			} else if ( Select2.equals("2") ) {
				Admin admin = new Admin();
				admin.adminLogin();
			} else {break;}
		}




	}

}
