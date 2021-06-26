package edu.cnm.deepdive;

/*

Given start and end numbers, return a new array containing the sequence of integers from start up
to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
The end number will be greater or equal to the start number. Note that a length-0 array is valid

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
 */

import java.util.Arrays;

public class CodingBatFizzArrayThree {

  public static void main(String[] args) {
    System.out.println("Given the ints 5 and 10, the outcome will be "
        + Arrays.toString(fizzArray3(5, 10)));
    System.out.println("Given the ints 11 and 18, the outcome will be "
        + Arrays.toString(fizzArray3(11, 18)));
    System.out.println("Given the ints 1 and 3, the outcome will be "
        + Arrays.toString(fizzArray3(1, 3)));
  }

  public static int[] fizzArray3(int start, int end) {

    int n = end - start;
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      result[i] = start++;
    }


    return result;
  }

}
