package application;

import entities.Retangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Retangle retangle = new Retangle();

    System.out.println("Enter rectangle width and height: ");
    retangle.width = sc.nextDouble();
    retangle.height = sc.nextDouble();

    System.out.printf("AREA = %.2f%n", retangle.Area());
    System.out.printf("PERIMETER = %.2f%n", retangle.Perimeter());
    System.out.printf("DIAGONAL = %.2f%n", retangle.Diagonal());

    sc.close();
  }
}