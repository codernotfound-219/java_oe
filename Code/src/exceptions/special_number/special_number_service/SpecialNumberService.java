package exceptions.special_number.special_number_service;
import exceptions.special_number.special_number_exceptions.*;

public class SpecialNumberService {
  public boolean isSpecial(int number) {
    if (number == 0)
      return true;

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

  public void processNumber(int number) throws NotSpecialNumberException {
    if (number < 0) {
      throw new IllegalArgumentException("Input cannot be negative: " + number);
    }

    if (!isSpecial(number)) {
      throw new NotSpecialNumberException("Number " + number + " failed special criteria.");
    }

    // Success Path
    System.out.println("Success: " + number + " is a special number.");
  }
}
