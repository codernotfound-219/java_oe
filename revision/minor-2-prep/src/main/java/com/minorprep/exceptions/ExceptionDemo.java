package com.minorprep.exceptions;

public class ExceptionDemo {
  public static void main(String[] args) {
    SpecialNumberService service = new SpecialNumberService();
    int[] arr = { 59, 303, 0, -34 };
    
    for (int n : arr) {
      try {
        boolean test = service.isSpecial(n);
        if (test) {
          System.out.println("NUMBER " + n + ": YES");
        } else {
          System.out.println("NUMBER " + n + ": NO");
        }
      }

      catch (LessThanZeroException err) {
        System.out.println(err.getMessage());
      }

      catch (Exception e) {
        System.out.println("CRITICAL ERROR: " + e.getMessage());
      }

      finally {
        System.out.println("Iteration " + n + ": COMPLETED");
      }
    }
  }
}
