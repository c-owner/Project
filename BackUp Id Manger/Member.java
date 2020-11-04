package Health_Diary;

public class Member {  // 운동 관리 
	private int memberId;
	private String memberName;
	
	public Member (int memberId, String memberName) {
		this.memberId = memberId; this.memberName = memberName;
	}
	
	public void setmemberId (int memberId) {
		this.memberId = memberId;
	}
	
	public int getmemberID() { //getter setter 세팅
		return memberId;
	}
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getmemberName() {
		return memberName;
	}
	
	public String toString() {
		return memberName + "님의 아이디는 "+memberId+"입니다.";
	}
	
}