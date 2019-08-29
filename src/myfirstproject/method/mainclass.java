package myfirstproject.method;

import javax.swing.JOptionPane;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPractice practice=new MethodPractice();

		String input= JOptionPane.showInputDialog("값1을 넣어주세요");
		String input2= JOptionPane.showInputDialog("값2을 넣어주세요");
		
		int x=Integer.parseInt(input);
		int y=Integer.parseInt(input2);
		 
		practice.gugudan02(x,y);
		System.out.println();


	}

}
