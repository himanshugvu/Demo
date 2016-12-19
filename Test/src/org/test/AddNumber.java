package org.test;

import java.util.ArrayList;

public class AddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7, b = 1, count = 0;
		ArrayList<String> number = new ArrayList<String>();
		ArrayList<String> finalNumber = new ArrayList<String>();
		for (int i = 1; i < a + 1; i++) {
			number.add(String.valueOf(i));
		}
		if (b == 1) {
			count++;
			System.out.println(a + " " + count);
		} else {
			for (int j = 0; j < b - 1; j++) {
				finalNumber.clear();
				for (int k = 1; k <= a; k++) {
					for (int l = 0; l < number.size(); l++) {
						String s1 = k + "," + number.get(l);
						finalNumber.add(s1);
						// }
					}
				}
				number.clear();
				number.addAll(finalNumber);

			}
		}
		if (b > 1) {
			for (String str : finalNumber) {
				int sum = 0;
				for (String s2 : str.split(",")) {
					sum = sum + Integer.parseInt(s2);
				}
				if (sum == a) {
					count++;
					System.out.println(str);
				}
			}
			System.out.println(count);
		}

	}

}
