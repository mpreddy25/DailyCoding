/******************************************************************************
[Easy]

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?

*******************************************************************************/

import java.util.*;

public class Main {
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  int arr[] = new int[n];
  for (int i = 0; i < n; i++) {
   arr[i] = s.nextInt();
  }
  int k = s.nextInt();

  if (findResult(arr, n, k)) {
   System.out.println("Found");
  } else {
   System.out.println("Not Found");
  }
 }

 public static boolean findResult(int arr[], int n, int k) {
  HashSet < Integer > resArr = new HashSet < Integer > ();

  for (int i = 0; i < n; i++) {
   int d = k - arr[i];
   if (d > 0 && resArr.contains(d)) {
    return true;
   } else {
    resArr.add(arr[i]);
   }
  }
  return false;
 }

}