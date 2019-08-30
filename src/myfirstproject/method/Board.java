package myfirstproject.method;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Board {
	int id;
	String title;
	String content;
	User writer;
	Date wdate;
	Date udate;

	public List<Board>getList(){
		List<Board>result=new ArrayList<Board>();
		return result;
	}

	public Board getBoard(int id) {
		Board result=new Board();
		return result;
	}

	public boolean insert(Board board) {
		System.out.println(board.writer+"님의 게시글이 작성되었습니다.");
		return true;

	}

	public boolean edit(Board board) {
		System.out.println(board.writer+"님의 게시글이 수정되었습니다.");
		return true;
	}
	
	public boolean delete(Board board) {
		System.out.println(board.writer+"님의 게시글이 삭제 되었습니다.");
		return true;
	}


}
