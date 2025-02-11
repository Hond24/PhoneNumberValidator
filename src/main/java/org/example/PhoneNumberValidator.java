package org.example;

import java.util.Scanner;

public class PhoneNumberValidator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String phoneNumber;

    while (true) {
      System.out.println("Enter your phone number: ");
      phoneNumber = scanner.nextLine();

      if (phoneNumber.matches("^0[789]0-\\d{4}-\\d{4}$")) {
        System.out.println(phoneNumber + ": Phone number is valid");
        break;
      } else {
        System.out.println(phoneNumber + ": Phone number is not valid. Please try again.");
      }
    }

    scanner.close();
  }
}
