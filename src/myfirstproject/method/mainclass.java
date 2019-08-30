package myfirstproject.method;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SungJuk rec = new SungJuk();

		rec.stdNum=JOptionPane.showInputDialog("학번");
		rec.stdName=JOptionPane.showInputDialog("이름");
		rec.kor=Integer.parseInt(JOptionPane.showInputDialog("국어 점수"));
		rec.eng=Integer.parseInt(JOptionPane.showInputDialog("영어 점수"));
		rec.mat=Integer.parseInt(JOptionPane.showInputDialog("수학 점수"));

		System.out.println(rec.stdNum+rec.stdName+"의 성적입니다.");

		rec.sum();
		rec.ave();*/


		/*for(int i=0;i<=50;i++) {
			double randomNum = Math.random();
			int random=(int)(randomNum*100)+1;
			System.out.println(random);*/

		List<Integer>list=new ArrayList<Integer>() ;
		list.size();


		while(list.size()<=100) {
			int randomNum=(int)(Math.random()*1000)+1;
			if(list.contains(randomNum)) {
				continue;
			}
			else {
				list.add(randomNum);



			}


		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}
	
}
