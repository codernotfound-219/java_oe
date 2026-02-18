package exceptions;

import exceptions.special_number.*;

public class TestSpecialNumber {
  private static boolean isSpecial(int number) {
    if (number == 0) return true;

    int sum = 0, prod = 1;
    int temp = number;

    while (temp != 0) {
      int ones = temp % 10;

      sum += ones;
      prod *= ones;

      temp /= 10;
    }

    return number == sum + prod;
  }

  public static void main(String[] args) {
    int[] numbers = { 59, 0, 12, 45, 566, 1005, -24 };
    
    for (int n : numbers) {
      try {
        if (n < 0) {
          throw new NegativeNumberException("Retry with a positive number"); // If thrown moves to Catch block
        }

        if (!isSpecial(n)) {
          throw new NotSpecialNumberException("Given number(" + n + ") is not Special"); // If thrown moves to Catch block
        }

        System.out.println("Given number(+" + n + ") is Special!");
      } catch (NotSpecialNumberException e) {
        System.out.println(e);
      } catch (NegativeNumberException e) {
        System.out.println(e);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println("Program Terminated");
  }
}
