import java.util.Scanner;

public class Sportovec extends Clovek {
  private String nazovSportu;
  private float bmi = Bmi.vypocetBMI(getHeight(), getWeight());

  public Sportovec() {
    super();
    Scanner input = new Scanner(System.in);
    System.out.print("Zadaj nazov sportu: ");
    nazovSportu = input.nextLine();
  }

  public Sportovec(String fname, String lname, int day, int month, int year, float weight, float height, String nazovSportu) {
    super(fname, lname, day, month, year, weight, height);
    this.nazovSportu = nazovSportu;
  }

  public String getNazovSportu() {
    return nazovSportu;
  }
  public float getBmi() {
    bmi = Bmi.vypocetBMI(getHeight(), getWeight());
    return bmi;
  }

  public void setNazovSportu(String nazovSportu) {
    this.nazovSportu = nazovSportu;
  }

  @Override
  public String toString() {
    return super.toString() + 
          "\nNazov sportu: " + nazovSportu + 
          "\nBMI: " + bmi;
  }

  @Override
  public void info() {
    System.out.println("**** Sportovec ****");
    System.out.println(toString() + "\n");
  }
}
