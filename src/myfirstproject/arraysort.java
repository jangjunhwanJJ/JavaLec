package myfirstproject;

import java.util.Arrays;

public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {48,7,1,4,2,14,18,48,200};
		int length = array.length;

		for(int j=0; j<length; j++) {
			for(int i=0; i<length-1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] =array[i+1];
					array[i+1] = temp;


				}

			}


		}
		System.out.println(Arrays.toString(array));
		
		/*arrays sort  정렬  arrays fill 채우기
		 */

		/*for(int j=0; i<length-1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] =array[i+1];
				array[i+1] = temp;

			}


		}
		System.out.println(Arrays.toString(array));
	}
		for(int i=0; i<length-1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] =array[i+1];
				array[i+1] = temp;

			}


		}
		System.out.println(Arrays.toString(array));
		for(int i=0; i<length-1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] =array[i+1];
				array[i+1] = temp;

			}


		}
		System.out.println(Arrays.toString(array));
		for(int i=0; i<length-1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] =array[i+1];
				array[i+1] = temp;

			}


		}
		System.out.println(Arrays.toString(array));

	}*/
	}
}