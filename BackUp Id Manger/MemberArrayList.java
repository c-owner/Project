package Health_Diary;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberArrayList {
	Scanner sc = new Scanner (System.in);
	
	// 생성자 정의
	private ArrayList<Member> list;
	
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 생성자 만들기
	}
	
	public void addMember(Member member) { // 메서드 반환형
		list.add(member);
	}
	
	public void removeMember(int id) {
		for (int i = 0; i < list.size(); i ++) {
			Member member = list.get(i); // i번째 요소 가져오기
			int tmpId = member.getmemberID(); // i번째 멤버요소 id getter -> tmp넣기 (교환)
			if (tmpId == id ) { // 입력한 아이디와 같으면
				list.remove(i); // i번째 요소 삭제 
				System.out.println(id + "] 삭제 되었습니다.");
				return;
			}
		}
		System.out.println(id + "회원이 존재하지 않습니다.");
		return ;
	}
	
	public void showAllMember() {
		for (Member m : list ){
			System.out.println(m);
		}
	}

	
	
}
