
public class Factorial {

	public static void main(String[] args) {
	factorial(25);

	}
	static void factorial(int num) {
		long loi;
		loi = 1;
		for(int x = num;x>1;x--) {
			loi *=x;
			System.out.println(loi);
		}
		System.out.println("Answer: "+loi);
	}
}
