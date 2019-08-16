package myfirstproject;

public class NN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		
		for(a=2; a<10; a++) {
			for(b=1; b<10; b++) {
				if(a%2 !=0)continue;
				System.out.println(a+ "*" + b + "=" + a*b);
				
			}System.out.println();
		}
	}

}
