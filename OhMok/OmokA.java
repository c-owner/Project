package OhMok;

public class OmokA implements OmokB {

	int[][] Line = new int[10][10]; //

	public void show() {  // show	
		int numX = 64; // 하단 좌표 값 
		int numY = 0; // 좌측 좌표 값  초기화 

		for(int[] Y : Line) {
			numY++; // Line 인덱스 값에 맞춰 반복 Y증가
			System.out.print(numY < 10 ? numY+ " " : numY);
			// 3항 연산을 써서 라인을 간단하게 출력해버리기 
			// 세로는 0부터 9까지 (10줄)라면 10 + " " : 그게아니어도 10 
			// 이렇게 안하면 true false
			
			// ?연산은 if문,else문을 간결하게 쓰는 용도임
			// 좌측에 Y좌표 표시 
			
			for (int j : Y ) {
				if(j == 1 ) {
					System.out.print(" o"); // o돌
				} else if ( j == 2 ) { // j 차례는 2
					System.out.print(" x"); // x 돌
				} else {
					System.out.print(" ."); //Line을 구분 짓고, 오목알을 넣기 위한 .공백
				}
			} 
			System.out.println();
		} 
		System.out.print("  ");
	for(int[] X : Line ) {
		numX++; // 하단X  // X좌표는 A-J (10개)
		System.out.print(" "+(char)numX);
		}
	System.out.println();
	} // 하단 라인 

	@Override // 오버라이드
	public int OmokAct(char x, int y, int turn) { // x축을 char형으로 y축은 정수값으로 해보면 
		int chX = ((int) x) - 97;
		// x축은 아스키코드 숫자로 변경 돌 박을거니까!! X 좌표값

		int chY = --y; 
		// 배열에 넣는 값 -1
		int cnt = 0;
		// 가로,세로,킹각선 체킹 용도
		int _x,_y = 0; // 오목알 역할을 할?것이면서,  .을 바꿔줄 변수임
		// 언더바 = 리터럴 
		String name = new String();
		// 사용자 name 클래스 선언
		name = (turn == 1 ) ? "o돌 유저" : "x돌 유저";
		// 사용자의 차례변경문 turn값이 1이라면 o돌 그게 아니라면 x돌
		// player1 사용자를 o player2 사용자를 x로 둘 예정
		// 마찬가지로 3항 연산을 이용
		
		if ( Line[chY][chX] != 0 ) {
			// 라인에 Y와 X축이 0이 아니라면 이미 있는거기 때문에 
			// 오목판을 만들어줄 필요가 없다. ㄴ알것ㅈ대ㅑ거
			System.out.println("이미 오목돌이 설치되어 있습니다."); 
			return 0; 
		} else { 
			Line[chY][chX] = turn; 
		} 

		// 가로 체크 .. 맞는건지 확인좀 해보고싶다 ..
		_x = chX; 
		_y = chY;
		cnt = 0;
		while(Line[_y][_x] == turn && _x > 0 ) {
			// 라인에 있는 _y축 _x축 오목알이 과 x축(오목알 가로)가 0보다 크다면
			_x--; // x축 .을 1개 제거
		} while(Line[_y][++_x] == turn && _x <= 10 ) {
			cnt++; // 오목알을 체크할거임 즉 5개가 되면 종료를 시킬거
		}
		if(cnt == 5) {
			System.out.println(name + "승리");
			return 1; // return값을 1로 주면  
		}
		
		_x = chX;
		_y = chY; //가로랑 똑같이
		cnt = 0; // cnt 초기화 
		while(Line[_y][_x] == turn && _y > 0 ) { 
			//이번엔 y값 기능 설정 (세로 체크를 할거라서)
			_y--;
		} while(Line[++_y][++_x] == turn && _y <= 10 && _x <= 10) {
			// 가로 while문 처럼 ++_Y 
			cnt++;
		} if (cnt == 5 ) {
			System.out.println(name+ "승리");
			return 1;
		}
		 
		
		_x = chX;
		_y = chY;
		cnt = 0; // 대각선 1
		while(Line[_y][_x] == turn && _y > 0 && _x > 0) {
			_y++;
			_x--;
		} while(Line[++_y][_x] == turn && _y <= 10 ) {
			cnt++;
		} if (cnt == 5 ) {
			System.out.println(name + " 승리 ");
			return 1;
		}
		_x = chX;
		_y = chY;
		cnt = 0;
		 
		
		// 우상은 세로축 플러스 x축 마이너스
		// 우하는 가로세로축 마이너스
		
		return 0;
	}
}
