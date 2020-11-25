import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NetworkPay np = new NetworkPay();
		Scanner sc = new Scanner(System.in);
		int act; // 선택용 변수 
		while(true) {
			try {
			System.out.println("-----------------");
			System.out.println("|1.입력 |2.출력 |3.종료 |");
			System.out.println("-----------------");
			do {
				act = sc.nextInt();
			} while(act < 1 && act > 3);
			switch (act) {
			case 1:
				np.inputScan(); break;
			case 2:
				np.show(np.gradeArr);
				break;
			case 3: 
				System.out.println("\t프로그램 종료 ");
				sc.close();
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Main ERROR");
			}
		}
	}

}
