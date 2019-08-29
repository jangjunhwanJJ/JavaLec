package myfirstproject;

import javax.swing.JOptionPane;

public class FuntionTest1 {
	public int sum(int a,int b) {
		int sum=a+b;
		return sum;
		/*return a+b;*/
	}
	/*public String append(String s1,String s2) {
		return s1+s2;
	}*/
	
	public int minus(int a,int b) {
		return a-b;
	}
	public int multi(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuntionTest1 object=new FuntionTest1();
				int num1=Integer.parseInt(JOptionPane.showInputDialog("°ª1"));
				int num2=Integer.parseInt(JOptionPane.showInputDialog("°ª2"));
				
				int sumResult=object.sum(num1,num2);
				System.out.println(sumResult);
				int minusResult=object.minus(num1, num2);
				System.out.println(minusResult);
				int multiResult=object.multi(num1, num2);
				System.out.println(multiResult);
		
		

	}

}
