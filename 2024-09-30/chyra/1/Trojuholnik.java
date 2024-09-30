import java.util.Scanner;

public class Trojuholnik {
  Scanner input = new Scanner(System.in)
  private float stranaA;
  private float stranaB;
  private float stranaC;

  public Trojuholnik(float stranaA, float stranaB, float stranaC) {
    this.stranaA = stranaA;
    this.stranaB = stranaB;
    this.stranaC = stranaC;
  }

  public Trojuholnik(float stranaA, float stranaB) {
    this(stranaA, stranaB, stranaB);
  }

  public Trojuholnik(float stranaA) {
    this(stranaA, stranaA, stranaA);
  }

  public Trojuholnik() {
    stranaA = OverRozmer.overRozmer(vstup, 'A');
    stranaA = OverRozmer.overRozmer(vstup, 'A');
    stranaA = OverRozmer.overRozmer(vstup, 'A');
  }
  
  public void setStranaA(float stranaA) {
    this.stranaA = stranaA;
  }

  public void setStranaB(float stranaB) {
    this.stranaB = stranaB;
  }

  public void setStranaC(float stranaC) {
    this.stranaC = stranaC;
  }

  public float getStranaA() {
    return stranaA;
  }

  public float getStranaB() {
    return stranaB;
  }

  public float getStranaC() {
    return stranaC;
  }

  public float obvod() {
    return stranaA + stranaB + stranaC;
  }

  public float obsah() {
    float s = obvod() / 2;
    return (float)Math.sqrt(s * (s - stranaA) * (s - stranaB) * (s - stranaC));
  }

  public Boolean troj() {
    if (obvod() - Math.max(stranaA, Math.max(stranaB, stranaC)) > Math.max(stranaA, Math.max(stranaB, stranaC))) {
      return true;
    }
    return false;
  }

  public String toString() {
    return "Strana A = " + stranaA + "\nStrana B = " + stranaB + "\nStrana C = " + stranaC + "\nObsah = " + obsah() + "\nObvod = " + obvod() + "\nJe trojuholnik = " + troj();
  }

  public void info() {
    System.out.println(toString() + "\n");
  }
}
