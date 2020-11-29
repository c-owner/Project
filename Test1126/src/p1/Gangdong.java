package p1;

public class Gangdong extends DeliveryClass {
	String gangdongCarrier = "장동욱";

	public Gangdong() {
	}

	public Gangdong(String gangdongCarrier) {
		this.gangdongCarrier = gangdongCarrier;
	}

	@Override
	void input(int timeVer, int volumeVer) {
		// TODO Auto-generated method stub
		super.input(timeVer, volumeVer);
	}

	@Override
	public int feeMethod(int totalPriceVer1, int timeVer1, int timePrice1, int volumePriceVer1) {
		// TODO Auto-generated method stub
		return super.feeMethod(totalPriceVer1, timeVer1, timePrice1, volumePriceVer1);
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
	}

}
