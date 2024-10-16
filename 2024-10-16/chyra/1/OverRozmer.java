import java.util.Scanner;

public class OverRozmer {
  private static float a;

  public static float overRozmer(Scanner sc, char pismeno) {
    do {
      System.out.print("Zadaj stranu " + pismeno + ": ");
      a = sc.nextFloat();
    } while (a <= 0);

    return a;
  }
}