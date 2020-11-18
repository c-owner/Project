public class Player {
	String player1,player2;
	int score = 0; // score는 cnt식으로 전적을 표시할거임
	Player(){
		this.player1 = player1; this.player2=player2;
		// default 
	}
	void GameTextMessage() {
		System.out.println("\n\n\n\n");
		System.out.println("\t----오목 0.1b version----\t");
		System.out.println("* 게임이 시작하게 되면 Player 이름을 설정합니다.");
		System.out.println("* 이름 설정이 끝나면 오목판이 생성 됩니다.");
		System.out.println("* X좌표는 (A~J)까지의 좌표값만 받습니다.");
		System.out.println("* Y좌표는 (1~10)까지의 좌표값만 받습니다.");
		System.out.println("* 경고 : X와 Y좌표를 신중하게 입력하세요. ★★ *");
		System.out.println("\t----the end----\t");

	}
	void show() { // player들을 보여주는 method
		System.out.println(this.player1+"님과 "+this.player2+"님이 게임 준비를 마쳤습니다.");
	}

}
