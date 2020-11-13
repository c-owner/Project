import java.util.Scanner;

/*오목 0.1b ver

game 안내 메시지문 추가 */

public class Main { //  
	
	public static void main(String[] args) {
		// 오목 게임
		// 2차원 배열을 이용해서 .. 
		// Interface Omok.LOADING 
		// A.user B.user가 번갈아가면서 누를거임
		Scanner sc = new Scanner (System.in);

		Player p1 = new Player();// 플레이어를 정하기 위한 객체
		OmokA o1 = new OmokA(); //
		
		
		String y = "y", Y = "Y", n ="n", N="N"; 
		String sel,name1,name2;
		int turn = 0; // 차례를 알려주는 변수 (0 = player 1 // 1 = player 2 )
		char x ; // x축 입력받는 아스키코드 변수
		int y1 = 0;
		
		System.out.print("오목 게임을 시작 하시겠습니까? (Y/N)");
		sel = sc.next();
		if(sel.equals(y)||sel.equals(Y)) { 
			System.out.print("게임 안내를 들으시겠습니까? (y / n)");
			sel = sc.next();
			if(sel.equals(y)||sel.equals(Y)) { 
				p1.GameTextMessage();
			}
			else if (sel.equals(n) || sel.equals(N)) {
			System.out.println("안내를 스킵 합니다.\n");
		}
			System.out.println("게임을 시작합니다. Player1, Player2 순서를 정하세요.");
			System.out.print("Player1 이름 입력 >");
			name1 = sc.next(); 
			p1.player1 = name1;
			System.out.print("Player2 이름 입력 >");
			name2 = sc.next();
			p1.player2 = name2;
			System.out.println("플레이어 생성이 종료 되었습니다.");
			p1.show();
			
					boolean loop = true;
			while(loop) { // 플레이어 생성이 종료 되면 게임 시작
				o1.show(); 
				System.out.println("X 좌표를 입력하세요.");
				x = sc.next().charAt(0);
				System.out.println("y 좌표를 입력하세요.");
				y1 = sc.nextInt();
				turn = (turn == 1 ) ? 2 : 1; // x,y값 입력이 끝나면 턴 넘김
				o1.OmokAct(x, y1, turn);
				System.out.println(" 다음 턴 입니다. ");
				// turn이 1이 아니면 2 또는 1 // 턴제 바꿔주기
//				loop = false; // 누가 이겼는지 설정하고 loop 닫아야함
			} // while end
			System.out.println("게임 종료.");
			sc.close();
			} else if (sel.equals(n)|| sel.equals(N)) {
			System.out.println("프로그램 종료");
		}





	}

}