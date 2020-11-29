package p1;

public class Gangseo extends DeliveryClass {
	String gangseoCarrier = "박영수";

	public Gangseo() {
	}

	public Gangseo(String gangseoCarrier) {
		this.gangseoCarrier = gangseoCarrier;
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