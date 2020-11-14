/*
 Ver 2.1
 updated : 틀 잡기 
 
 --- 예정 ---
LinkedList 출력 삭제 수정
admin Menu 구성
User Menu 구성 
*/


package MovieManager2_1;

import java.util.Scanner;

public class Main {
	static String Select[] = {"Y","y","n","N","1","2"};
	static String Select2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t===Corner Movie Manager===\t");

		while(true) {
			System.out.println("\t1. 일반 사용자\t||\t2.어드민 접속 || 종료 AnyKey");
			Select2 = sc.next();
			if(Select2.equals("1") ) {

			} else if ( Select2.equals("2") ) {
				Admin admin = new Admin();
				admin.adminLogin();
			} else {break;}
		}




	}

}
