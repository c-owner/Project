public class WorkOut {  // 운동 관리 클래스 // 틀
	 int workSet; // 세트 수  // 필드
	 int workSec; // 초(시간)
	 int workCnt; //개수 
	 String workName; // 운동명
	
	public WorkOut (String workName, int workSet, int workCnt, int workSec) {
		this.workName = workName; this.workSet = workSet;
		this.workCnt = workCnt; this.workSec = workSec;
	} // 메소드 (==기능)
	
	public String toString() { // 메소드 (==기능)
		return "["+ workName + "] ["+workSet+" 세트] ["+workCnt+" 개] ["+workSec+" 초]";
	}
	
}