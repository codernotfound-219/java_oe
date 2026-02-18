package exceptions.special_number;
import exceptions.special_number.special_number_exceptions.*;
import exceptions.special_number.special_number_service.*;

public class TestSpecialNumber {
  public static void main(String[] args) {
    SpecialNumberService service = new SpecialNumberService();
    int[] numbers = { 59, 0, 12, 45, 566, 1005, -24 };
    
    for (int n : numbers) {
      try {
        service.processNumber(n);
      } 

      catch (NotSpecialNumberException e) {
        System.err.println("VALIDATION FAILED: " + e.getMessage());
      }

      catch (IllegalArgumentException e) {
        System.err.println("INVALID INPUT: " + e.getMessage());
      } 

      catch (Exception e) {
        System.err.println("CRITICAL SYSTEM FAILURE: " + e.getMessage());
        e.printStackTrace();
      }
    }
  }
}
