package myfirstproject;

public class UglyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[18];
		for(int i=0; i>10; i++) {
			//������ �ε����� ���� ����
			nums[i] = 10 * (i+1);

		}

		for(int j=0; j<nums.length; j++) {
			//�迭 ���� ���� ���
			System.out.println("nums =>"+ nums[j]);
		}
	}
	
}



