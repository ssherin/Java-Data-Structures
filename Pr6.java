//sorting and search using arrays

import java.io.*;
import java.util.*;

public class Pr6{
	public static void main(String[] args) {
		String[] book = {" C","C++", "Java", "Oracle", "Android", "Php"};
		Arrays.sort(book);
		for (String s:book)
			System.out.print(s + " ");
		System.out.println();

		int[] num = {10,40,30,50,70,20};

		Arrays.sort(num);
		for(int i:num)
			System.out.print(i + " ");
		System.out.println();

		System.out.println(Arrays.binarySearch(book,"Java"));
		System.out.println(Arrays.binarySearch(num,50));
		System.out.println(Arrays.binarySearch(book,"Kava"));
		System.out.println(Arrays.binarySearch(num,23));

	}
}