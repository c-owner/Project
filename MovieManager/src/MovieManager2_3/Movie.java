package MovieManager2_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Movie {
	
	private String movieName;
	private int movieTime;
	
	private int TicketNumber;
	
	private String userId;
	private String userPassword;

	ArrayList movie = new ArrayList();
	ArrayList users = new ArrayList();
	
	public Movie (){}	
	public Movie(String movieName,int movieTime) {this.movieName=movieName;this.movieTime=movieTime;}
	// Users -------------
	public void userSignUp() {
	}
	public void userSignIn() {}

	// return = get
	public void setUserId(String userId) {this.userId=userId;}
	public String getUserId() {return userId;}
	public void setUserPw(String userPassword) { this.userPassword = userPassword; }
	public String getUserPw() { return userPassword; }
	
	// Admin ------------
	public void adminLogin() {}
	public void adminMovieAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\n\t--영화 추가--");
		System.out.print("추가할 영화 제목을 입력하세요 >");
		String nm = sc.next();
		movie.add(nm);
	}
	public void adminMovieEdit() {}
	public void adminMovieDelete() {}
	public void adminMovieShow() {
//		for(Movie show : movie) {System.out.println("영화 정보 : "+show);}
		// 여기 
		Iterator movieShow = movie.iterator();
		while(movieShow.hasNext()) {System.out.println(movieShow.next());}
	}
	public String userSignUp(String userId, String userPw) {
		// TODO Auto-generated method stub
		return null;
	}
}

