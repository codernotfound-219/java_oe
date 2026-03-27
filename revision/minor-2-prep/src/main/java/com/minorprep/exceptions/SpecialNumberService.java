package com.minorprep.exceptions;

public class SpecialNumberService {
  protected boolean isSpecial(int n) throws LessThanZeroException {
    if (n < 0) {
      throw new LessThanZeroException("Given number (" + n + "): is less than zero");
    }

    if (n == 0) return true;

    int temp = n;
    int sum = 0;
    int prod = 1;
    while (temp != 0) {
      int last = temp % 10;
      sum += last;
      prod *= last;
      temp /= 10;
    }

    return sum + prod == n;
  }
}
