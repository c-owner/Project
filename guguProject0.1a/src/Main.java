import java.util.Scanner;

/*
 *  0.1a
 *  타이머 기능 넣을 예정 
 *  
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2; // 구구단
		int total; // 구구단의 정답 변수
		int user; // 사용자
		int score = 0; // 점수제 설정
		String sel[] = { "yeah", "no", "exit" };

		System.out.println("게임을 시작하시겠습니까?, yeah/no");

		String select = sc.next();
		if (select.equals(sel[0])) {
			boolean bool = true;
			System.out.println("스코어가 100점이 되면 종료됩니다.");
			while (bool) { // 여기서 게임을 진행
				num1 = (int) (Math.random() * 9) + 1;
				// 1~9까지의 난수 저장
				num2 = (int) (Math.random() * 9) + 1;
				// 0~7사이를 +2씩 해서 2~9 까지의 난수 저장
				total = num1 * num2;
				System.out.print("QUIZ : " + num1 + " * " + num2 + " = ");
				
				user = sc.nextInt();
				if (user == total) {
					System.out.print("정답!!");
					score += 10; // 점수 상승
					System.out.println("\t 현재 점수 "+score);
				} else {
					System.out.print("오답!! 요것도 모르네 ㅋㅋ루삥뽕\n");
					score -= 10;
					System.out.println("\t 현재 점수 "+score);
				}

				if (score == 100) {
					System.out.println("현재 스코어는 " + score + "점 입니다.");
					System.out.println("게임을 종료합니다.");
					bool = false;
					break;
				}
			} // while 문 end

		} else if (select.equals(sel[1])) {
			System.out.println("진행하지 않습니다.");
		} else {
			System.out.println("똑바로 대답하세요.");
		}

	} // main

}
