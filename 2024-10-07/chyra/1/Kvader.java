import java.util.Scanner;

public class Kvader {
  static Scanner input = new Scanner(System.in);
  private Obdlznik1 podstava;
  private Obdlznik1 prednaStena;
  private Obdlznik1 bocnaStena;

  public Kvader(float stranaA, float stranaB, float stranaC) {
    podstava = new Obdlznik1(stranaA, stranaB);
    prednaStena = new Obdlznik1(podstava.getStranaA(), stranaC);
    bocnaStena = new Obdlznik1(podstava.getStranaB(), prednaStena.getStranaB());
  }

  public Kvader(float stranaA, float stranaB) {
    this(stranaA, stranaB, stranaB);
  }

  public Kvader(float stranaA) {
    this(stranaA, stranaA, stranaA);
  }

  public Kvader() {
    this(OverRozmer.overRozmer(input, 'A'), OverRozmer.overRozmer(input, 'B'), OverRozmer.overRozmer(input, 'C'));
  }


  public float objem() {
    return podstava.getStranaA() * podstava.getStranaB() * prednaStena.getStranaB();
  }

  public float povrch() {
    return 2 * ((podstava.getStranaA() * podstava.getStranaB()) + 
           (prednaStena.getStranaA() * prednaStena.getStranaB()) + 
           (bocnaStena.getStranaA() * bocnaStena.getStranaB()));
  }


  public String toString() {
      return "a = " + podstava.getStranaA() +
              "\nb = " + podstava.getStranaB() + 
              "\nc = " + prednaStena.getStranaB() + 
              "\nobvod: " + objem() + 
              "\nobsah: " + povrch() +
              "\n" + super.toString();
  }

  public void info() {
      System.out.println("****    Kvader    ****\n" + toString() + "\n");
  }
}