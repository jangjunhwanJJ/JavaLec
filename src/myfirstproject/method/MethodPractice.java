package myfirstproject.method;

public class MethodPractice {
	public int method01(int x) {
		int y=x+3;
		return y ;
	}
	public int method02(int x) {
		int y=2*x+7;
		return y ;
	}
	public int method03(int x) {
		int y=2*x+x*x;
		return y ;
	}
	public int method04(int x,int y) {
		int z=x*x+2*y+x*y;
		return z ;
	}
	public void gugudan(int x) {
		int y;
		for(int i=0;i<10;i++) {
			y=x*i;
			System.out.println(x+"*"+i+"="+x*i);
		}
		
	}
	public void gugudan02(int x, int y) {
		
		int z;
		for(int i=x;i<=y;i++) {
			for(int j=1;j<10;j++) {
				z=i*j;
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	
	
	




}
