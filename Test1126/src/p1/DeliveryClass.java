package p1;

public class DeliveryClass implements Deliveryinter {
	String [] place;
	
	int []totalPrice= new int[100]; // 총 배달요금
	int []volumePrice = new int [] {1000,2000,3000,4000}; 
	int []timePrice = new int [] {1000,2000,3000,4000};
	int []time = new int[100]; // 배달 소요시간
	int []volume = new int[100]; // 배달 단가
	 
	static int cnt =0;
	void input(int timeVer,int volumeVer) {
		time[cnt] = timeVer;
		volume[cnt] = volumeVer;
		//연산 값이 타임범위조건해서 해당입력된 시간의 timever을 산출 
		while(time[cnt]>0) {
			if(time[cnt]<100) {
				timePrice[cnt] = timePrice[0];
			}else if(time[cnt]<200) {
				timePrice[cnt] = timePrice[1];
			}else if(time[cnt]<300) {
				timePrice[cnt] = timePrice[2];
			}else {
				timePrice[cnt] = timePrice[3];
			}
		break;
		}
		
		
	}
	@Override
	public int feeMethod(int totalPriceVer1,int timeVer1,int timePrice1, int volumePriceVer1) {
		//자식꺼에서 매개변수 제대로  
			totalPrice[cnt] =timePrice[cnt]+volumePrice[cnt];
			
			return totalPrice[cnt];
					
	}
	public void output() {
		for(int i=0;i<cnt; i++) {
			System.out.print(place[i]+"\t");
			//System.out.print(//배달담당+"\t ");
			System.out.print( time[i]+"\t ");
			System.out.print( volume[i]+"\t ");
			System.out.print( totalPrice[i]+"\t ");
			System.out.println();
		}
}
}
	


	
	

