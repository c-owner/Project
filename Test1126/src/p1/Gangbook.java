package p1;

public class Gangbook extends DeliveryClass {
	String gangbookCarrier = "김찬영";

	public Gangbook() {
	}

	public Gangbook(String gangbookCarrier) {
		this.gangbookCarrier = gangbookCarrier;
	}

	@Override
	void input(int timeVer, int volumeVer) {
		time[cnt] = timeVer;
		volume[cnt] = volumeVer;
		// 연산 값이 타임범위조건해서 해당입력된 시간의 timever을 산출
		while (time[cnt] > 0) {
			if (time[cnt] < 100) {
				timePrice[cnt] = timePrice[0];
			} else if (time[cnt] < 200) {
				timePrice[cnt] = timePrice[1];
			} else if (time[cnt] < 300) {
				timePrice[cnt] = timePrice[2];
			} else {
				timePrice[cnt] = timePrice[3];
			}
			break;
		}

	}

	@Override
	public int feeMethod(int totalPriceVer1, int timeVer1, int timePrice1, int volumePriceVer1) {
		// TODO Auto-generated method stub
		return totalPrice[cnt];
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
	}

}