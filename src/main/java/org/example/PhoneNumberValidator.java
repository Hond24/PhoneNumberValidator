package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your phone number: ");

    String phoneNumber = scanner.nextLine();

    System.out.println(phoneNumber + "は有効な携帯電話番号です。");

  }
}
