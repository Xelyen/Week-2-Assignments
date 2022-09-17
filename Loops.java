
public class Loops {

	public static void main(String[] args) {
		// i++ is the same as i = i + 1
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = 0; i < 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);				
//			}
//		}
		// While loops checks at the beginning of the loop
		int x = 0;
		while (x < 10) {
			System.out.println(x);
			//Add x++ else we will get an infinite loop
			x++;
		}
		// Do while loops checks at the end of the of the loop
		do {
			System.out.println(x);
			x++;
		} while (x < 2);

	}

}
