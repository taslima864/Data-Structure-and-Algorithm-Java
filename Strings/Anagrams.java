package Strings;

import java.util.*;

public class Anagrams {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string names:");

    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    sc.close();

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    System.out.println(Arrays.equals(arr1, arr2));
  }

}
