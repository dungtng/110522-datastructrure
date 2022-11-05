package datastrucday4;

import java.util.Arrays;

public class ex1 {

	static int countstep = 0;

	public static void main(String[] args) {
		int[] arr = { 50, 25, 5, 20, 10 };
//		for (int i = 0; i < arr.length; i++) {
//			if (i + 1 < arr.length) {
//				if (arr[i] > arr[i + 1]) {
//					int number = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = number;
//				}
//			}
//		}
		for (int i = 0; i < (arr.length); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j + 1 < arr.length) {
					if (arr[j] > arr[j+1]) {
						int number = arr [j];
						arr[j] = arr[j+1];
						arr[j+1] = number;
						
					}
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
