package topcrowd;

import java.util.Arrays;

public class ArrayGetRowSum {
	

	static int[] getRowSum(int arr[][]) {
// change in b1
		int i, j, sum = 0;
		int m = 3, n = 3;
		int op[] = new int[3];
		
		for (i = 0; i < m; ++i) {
			for (j = 0; j < n; ++j)
				sum = sum + arr[i][j];

			op[i] = sum;
			sum = 0;

		}
		
		return op;
	}

	public static void main(String[] args) {
		int input[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int outp[];
		outp = getRowSum(input);
		System.out.println(Arrays.toString(outp));

	}
}

