package mypc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number");
		int b = sc.nextInt();
		int[] a = new int[b];
		for (int i = 0; i < b; i++) {
			System.out.println("Input the number whith will be at plase " + (i + 1));
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

	}

}
