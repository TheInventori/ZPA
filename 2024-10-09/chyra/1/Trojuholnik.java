import java.util.Scanner;

public class Trojuholnik implements Tvar2D {
  Scanner input = new Scanner(System.in);
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
    do {
      stranaA = OverRozmer.overRozmer(input, 'A');
      stranaB = OverRozmer.overRozmer(input, 'B');
      stranaC = OverRozmer.overRozmer(input, 'C');
    } while (!(obvodTroj() - Math.max(stranaA, Math.max(stranaB, stranaC)) > Math.max(stranaA, Math.max(stranaB, stranaC))));
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

  public float obvodTroj() {
    return stranaA + stranaB + stranaC;
  }

  public float obsahTroj() {
    float s = obvodTroj() / 2;
    return (float)Math.sqrt(s * (s - stranaA) * (s - stranaB) * (s - stranaC));
  }
    
  // implementaciou vznika povinnost zadefinovat metody 
  public float obvod() {
    return stranaA + stranaB + stranaC;
  }
  public float obsah() {
    float s = obvodTroj() / 2;
    return (float)Math.sqrt(s * (s - stranaA) * (s - stranaB) * (s - stranaC));
  }

  public String toString() {
    return "Strana A = " + stranaA + "\nStrana B = " + stranaB + "\nStrana C = " + stranaC + "\nObsah = " + obsahTroj() + "\nObvod = " + obvodTroj();
  }

  public void info() {
    System.out.println("****    Trojuholnik    ****");
    System.out.println(toString() + "\n");
  }
}
