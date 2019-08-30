package myfirstproject.method;

public class User {
	int id;
	String login;
	String password;
	String phone;
	String email;
	String address;
	String username;
	
	boolean signIn(User user) {
		System.out.println("로그인 했습니다.");
		return true;

	}
	
	public boolean signOut(User user) {
		System.out.println("로그아웃 했습니다.");
		return true;
	}
	
	public boolean signUp(User user) {
		System.out.println("회원가입 했습니다.");
		return true;
	}
	
	public boolean edit(User user) {
		System.out.println(user.username+"정보변경했습니다.");
		return true;
	}

}
