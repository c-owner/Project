/*
 // 여기 수정해야함 << 체크 해볼 것 
  
 */
package MovieManager2_3;

import java.util.Scanner;

public class User extends Movie {
	
	private String userId;
	private String userPassword;
	
	public User() {} //비회원
	public User(String userId,String userPassword) { //회원
		System.out.println("----회원모드---- Id:"+userId);
	this.userId=userId; this.userPassword=userPassword;	
	}
	@Override
	public void userSignUp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----회원 가입----");
		System.out.println("ID를 입력하세요.");
		userId = sc.next();
		setUserId(userId);
		System.out.println("Pw를 입력하세요.");
		userPassword = sc.next();
		setUserPw(userPassword);
		
		// 여기 수정해야함
		if ( userId.length() <= 4 ) {System.out.println("ID가 올바르지 않습니다."); return;}
		else if (userPassword.length() <= 4 ) {System.out.println("Pw가 올바르지 않습니다.");return;}
		super.userSignUp(userId, userPassword);
	}
	@Override
	public void userSignIn() {
		// TODO Auto-generated method stub
		super.userSignIn();
	}
	@Override
	public void setUserId(String userId) {
		// TODO Auto-generated method stub
		super.setUserId(userId);
	}
	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		return super.getUserId();
	}
	@Override
	public void setUserPw(String userPassword) {
		super.setUserPw(userPassword);
	}
	public String getUserPw() {
		// TODO Auto-generated method stub
		return super.getUserPw();
	}
	
}
