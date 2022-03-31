package week_01;

public class HelloEx {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 9, 1, 11, 29, 41, 3, 8, 10 };
		int len = arr.length, temp;
		
		for(int i=0; i<len-1; ++i) {
			for(int j=i+1; j<len; ++j) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int j=0; j<len; ++j) {
			System.out.print(arr[j] + "\t");
		}
		System.out.println();
	}
}