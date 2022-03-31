package week_01;

public class HelloEx {

	public static void main(String[] args) {
		for(int i=2; i<=9; ++i) {
			for(int j=2; j<=5; ++j) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=2; i<=9; ++i) {
			for(int j=6; j<=9; ++j) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}