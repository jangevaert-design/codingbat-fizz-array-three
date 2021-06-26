package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatFizzArrayThree.fizzArray3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatFizzArrayThreeTest {

  private int[] int1Params = {5, 11, 1, 1, 1, 1000};

  private int[] int2Params = {10, 18, 3, 2, 1, 1005};

  private int[][] arrayExpected = {
      {5, 6, 7, 8, 9},
      {11, 12, 13, 14, 15, 16, 17},
      {1, 2},
      {1},
      {},
      {1000, 1001, 1002, 1003, 1004}
  };

  @Test
  void fizzTest() {
    for (int i = 0; i < int1Params.length; i++) {
      String actual = Arrays.toString(fizzArray3(int1Params[i], int2Params[i]));
      Assertions.assertEquals(actual, Arrays.toString(arrayExpected[i]));
    }
  }

}