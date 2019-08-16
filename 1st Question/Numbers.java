
public class Numbers {
	public static void main(String[] ar) {
		int array[] = { 2, 3, 19, 13, 25, 23,11,13 };

		for (int i = 0; i < array.length; i++) {

			if (checkPrime(array[i])) {
				checkSumIsPrime(array[i]);
			}
		}
	}
	
	//checking if the sum is prime or not
	public static void checkSumIsPrime(int value) {
		int sum = 0, temp = 0;
		int realValue = value;
		while (true) {
			if (value == 0)
				break;
			else {
				temp = value % 10;
				sum = sum + temp;
				value = value / 10;
			}
		}
		if (checkPrime(sum))
			System.out.println(realValue);
	}
	
	//checking if the number is prime
	public static boolean checkPrime(int value) {
		for (int j = 2; j <= Math.sqrt(value); j++) {
			if ((value % j) == 0) {
				return false;
			}
		}
		return true;
	}
}

//Time Complexity = O(n*(n^1/2))
