package package1;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int divisors = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					divisors++;
			}
			if (divisors == 2)
				System.out.println("prime");
			else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
	}
}
