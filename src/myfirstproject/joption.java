package myfirstproject;

import javax.swing.JOptionPane;

public class joption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input= JOptionPane.showInputDialog("please input");
			System.out.println(input);
			
			int parsedInput = Integer.parseInt(input);
			System.out.println("parsedInput:" + parsedInput);
		
	}

}
