import java.util.Scanner;

// WJP to find total number of repeated integers, uppercase and lowercase character in the give string 
public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		char[] c = str.toCharArray();
		int countNum = 0;// index of Number array;
		int countUpper = 0;// index of upper case array
		int countLower = 0;// index of lower case array
		char[] Num = new char[str.length()];// stored integers in char array
		char[] up = new char[str.length()];
		char[] low = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (c[i] >= 48 && c[i] <= 57) {
				Num[countNum] = c[i];
				countNum++;
			} else if (c[i] >= 65 && c[i] <= 90) {
				up[countUpper] = c[i];
				countUpper++;
			} else if (c[i] >= 97 && c[i] <= 122) {
				low[countLower] = c[i];
				countLower++;
			} else
				continue;
		}
		int total1 = repeated(Num, countNum);
		System.out.println("Total number of repeated integers are " + total1);
		int total2 = repeated(low, countLower);
		System.out.println("Total number of repeated lower case characters are " + total2);
		int total3 = repeated(up, countUpper);
		System.out.println("Total number of repeated uppercase characters are " + total3);

	}

	public static int repeated(char[] n, int l) {

		int[] repeat = new int[l];// to store repeated characters
		int k = 0;
		for (int i = 0; i < l; i++) {
			int count = 1;
			char a = 'x';// i dont want confuse for loop by giving any number, which would come in i loop
			if (n[i] != a) {
				for (int j = i + 1; j < l; j++) {
					if (n[i] == n[j])
						count++;
					if (count == 2)
						a = n[j];
				}
			}
			if (count >= 2) {
				repeat[k] = 1;// store all repeated numbers into an array
				k++;
				System.out.print("value " + n[i] + "  repeated  " + count + " times ");
			}

		}
		int sum = 0;
		for (int i = 0; i < l; i++) {
			sum = sum + repeat[i];
		}

		return sum;

	}
}

