package myfirstproject;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0; a<7 ; a++) {
			for(int b = 0 ; b<7 ; b++) {
				if(a<4) {
					if(3-a<=b && 3+a>=b) {
						System.out.print("*");
					}else {System.out.print(" ");
					}

				}else {
					if(7+a-10<=b && 7-a+2>=b) {
						System.out.print("*");
					}else { System.out.print(" ");


					}


				}
			}System.out.println();


		}
	}
}