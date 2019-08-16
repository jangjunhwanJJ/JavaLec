package myfirstproject;

public class UglyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[18];
		for(int i=0; i>10; i++) {
			//각각의 인덱스에 값을 저장
			nums[i] = 10 * (i+1);

		}

		for(int j=0; j<nums.length; j++) {
			//배열 안의 값을 출력
			System.out.println("nums =>"+ nums[j]);
		}
	}
	
}



