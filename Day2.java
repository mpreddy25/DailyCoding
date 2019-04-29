/******************************************************************************
[Hard]

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

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

  printResult(arr, n);
 }

 public static void printResult(int arr[], int n) {
  int lProd[] = new int[n];
  int rProd[] = new int[n];
  int fProd[] = new int[n];

  lProd[0] = 1;
  rProd[n - 1] = 1;

  for (int i = 0; i < n - 1; i++) {
   lProd[i + 1] = lProd[i] * arr[i];
  }

  for (int i = n - 1; i > 0; i--) {
   rProd[i - 1] = rProd[i] * arr[i];
  }

  for (int i = 0; i < n; i++) {
   fProd[i] = lProd[i] * rProd[i];
   System.out.println(fProd[i]);
  }

 }
}