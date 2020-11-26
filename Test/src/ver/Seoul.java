package ver;
// 부모 클래스
// 1시간 이내 천원, 2시간 이내 2천원, 2~3시간이내 3천원, 3시간 이상 4천원
// 배달 단가 = 배달량 + 배달량 단가 + 배달시간
public class Seoul {
	Seoul s; // 배달 담당자 명 , toString 오버라이딩
	String name; // 배달 담당자 
	int time; // 배달 시간
	int val; // 배달 단가
	int cnt; // 배달량 
	int pay; // 배달 요금 
	public Seoul() {	}
	public Seoul(String name, int time,int cnt,int pay) {}
	public Seoul(String name, int cnt,int val,int time,int pay) {
		this.name=name;  this.time=time; this.cnt=cnt; this.val=val;
		this.pay=pay;
	}
}
class East extends Seoul { // 강동지구
	public East() {	}
	public East(String name, int time,int cnt,int pay) { this("장동욱", cnt, cnt, time, pay);}
	public East(String name, int cnt,int val,int time,int pay) {
		super("장동욱", cnt, val, time,pay);
	}
	@Override
		public String toString() {
		return "강동지구";
		}
}

class West extends Seoul { // 강서지구
	public West() {	}
	public West(String name, int time,int cnt,int pay) {
		this("박영수", cnt, cnt, time, pay);
	}
	public West(String name, int cnt,int val,int time,int pay) {
		super("박영수", cnt, val, time,pay);
	}
	@Override
		public String toString() {
		return "강서지구";
		}
}

class South extends Seoul { // 강남지구
	public South() {	}
	public South(String name, int time,int cnt,int pay) {
		this("이기영", cnt, cnt, time, pay);
	}
	public South(String name, int cnt,int val,int time,int pay) {
		super("이기영", cnt, val, time,pay);
	}
	@Override
		public String toString() {
		return "강남지구";
		}
}

class North extends Seoul { // 강북 지구 
	public North() {	}
	public North(String name, int time,int cnt,int pay) {
		this("김찬영", cnt, cnt, time, pay);
	}
	public North(String name, int cnt,int val,int time, int pay) {
		super("김찬영", cnt, val, time, pay);
	}
	@Override
		public String toString() {
		return "강북지구";
		}
}