import java.util.Arrays;

public class CoreJavaArrays {

	public static void main(String[] args) {

// 1		
		int[] myArray = { 1, 2, 3 };
		for (int a = 1; a <= myArray.length; a++) {
			System.out.println(a);
//		}

// 2
		int[] mid = {13, 5, 7, 68, 2};
		int m = mid.length / 2;
		System.out.println(mid[m]);

// 3
		String[] colors = {"red", "green", "blue", "yellow"};
		System.out.println(colors.length);
		String[] copy = colors.clone();
		System.out.println(Arrays.toString(copy));

// 4
		int[] myArray = {5, 10, 15, 20, 25};
		System.out.println(myArray[0] + ", " + myArray[myArray.length-1]);

// 5
		int[] newArray = new int[5];
		for (int i = 1; i < 5; i++) {
			newArray[i] = i;
//		}

// 6
		int[] nArray = new int[5];
		for (int i = 1; i < 5; i++) {
			nArray[i] = i * 2;
		} 

// 7
		int[] qArray = {1, 2, 3, 4, 5};
		for (int i = 0; i < qArray.length; i++) {
			if (i == qArray.length / 2)
				continue;
			}

// 8
		String[] sArray = {"one", "two", "three", "four", "five"};
		String s;
		s = sArray[sArray.length / 2];
		sArray[sArray.length / 2] = sArray[0];
		sArray[0] = s;
		
		System.out.println(Arrays.toString(sArray));

//9
		int[] maxArr = { 4, 2, 9, 13, 1, 0 };
		int con = 0;
		for (int i = 0; i < maxArr.length; i++) {
			for (int j = i + 1; j < maxArr.length; j++) {
				if (maxArr[i] > maxArr[j]) {
					con = maxArr[i];
					maxArr[i] = maxArr[j];
					maxArr[j] = con;
				}
			}
		}
		System.out.println(Arrays.toString(maxArr));
		
//10
		Object[] mixed = {40000, "one", "two", 1.5};
		System.out.println(Arrays.toString(mixed));
	}
}
