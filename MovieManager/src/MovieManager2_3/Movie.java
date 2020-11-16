package MovieManager2_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Movie {
	
	private String movieName;
	private int movieTime;
	
	private int TicketNumber[];
	
	
	private String userId;
	private String userPassword;

	private ArrayList<Movie> list;

	private ArrayList users = new ArrayList();
	
	public Movie () {list = new ArrayList<Movie>();}	
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
	public void adminMovieAdd(Movie movie) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\n\t--영화 추가--");
		System.out.print("추가할 영화 제목을 입력하세요 >");
		String nm = sc.next();
		list.add(movie); 
	}
	public void adminMovieEdit() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < list.size(); i++ ) {
		System.out.print("수정할 영화 제목을 입력하세요 >");
		}
	}
	public void adminMovieDelete(String name) {
		for(int i = 0; i <list.size();i++) {
			Movie movie = list.get(i);
			String tmpName = movie.movieName;
			if ( tmpName.equals(name)) {
				list.remove(i);
				System.out.println("["+name+"] 영화 정보가 상영 목록에서 삭제 되었습니다.");
				return;
			}
		}
	}
	public void adminMovieShow() {
//		for(Movie show : movie) {System.out.println("영화 정보 : "+show);}
	}
	public String userSignUp(String userId, String userPw) {
		// TODO Auto-generated method stub
		return null;
	}
	public void adminMovieAdd() {
		// TODO Auto-generated method stub
		
	}
	public void adminMovieDelete() {
		// TODO Auto-generated method stub
		
	}
}

