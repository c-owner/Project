package OhMok;

public class Player {
	String player1,player2;
	int score = 0; // score는 cnt식으로 전적을 표시할거임
	Player(){
		this.player1 = player1; this.player2=player2;
		// default 
	}
	void show() { // player들을 보여주는 method
		System.out.println(this.player1+"님과 "+this.player2+"님이 게임 준비를 마쳤습니다.");
	}

}
