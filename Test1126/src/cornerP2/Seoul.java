package cornerP2;

public abstract class Seoul implements DeliveryInter {
	Seoul s; // 지역명
	String name; // 배달자 이름
	int time; // 배달 소요 시간
	int cost; // 배달 단가
	int cnt; // 배달 개수
	int totalPrice; // 배달 총 요금

	public Seoul() {
	}

	@Override
	public void deliveryCost(Seoul s) { // 요금 재정의
		// 배달 시간이 1시간 이내
		if (s.time <= 1 && s.time > 0) {
			s.totalPrice = 1000; // 배달요금 천원
		} else if (s.time > 1 && s.time < 2) { // 1~2
			s.totalPrice = 2000;
		} else if (s.time >= 2 && s.time < 3) { // 2~3
			s.totalPrice = 3000;
		} else if (s.time >= 3) { // 3시간 이상
			s.totalPrice = 4000;
		} else {
			System.out.println("ERROR 잘못된 시간!!");
		}
		if (s.cnt > 0 && s.cnt <= 100) { // 배달량 계산
			s.cost = 1000; // 단가 지정
		} else if (s.cnt > 100 && s.cnt <= 200) {
			s.cost = 2000;
		} else if (s.cnt > 200 && s.cnt <= 300) {
			s.cost = 3000;
		} else if (s.cnt > 300) {
			s.cost = 4000;
		} else {
			System.out.println("-ERROR 잘못된 개수-");
		}
		s.totalPrice = s.cost + s.totalPrice;
	}
	// 동서남북
class East extends Seoul{
	public East() {	}
	
	@Override
		public void deliveryCost(Seoul s) {
			super.deliveryCost(s);
		}
	@Override
		public String toString() {
		 return "장동욱";
		}
}
class West extends Seoul{
	 public West() {	}
	 
	 @Override
	public void deliveryCost(Seoul s) {
		super.deliveryCost(s);
	}
	 @Override
	public String toString() {
		return "박영수";
	}
	 
}

class South extends Seoul {
	public South() {	}
	
	@Override
	public void deliveryCost(Seoul s) {
		// TODO Auto-generated method stub
		super.deliveryCost(s);
	}
	@Override
	public String toString() {
		return "이기영";
	}
}

class North extends Seoul{
	public North() {	}
	
	@Override
	public void deliveryCost(Seoul s) {
		super.deliveryCost(s);
	}
	@Override
	public String toString() {
		return "김찬영";
	}
}


}
