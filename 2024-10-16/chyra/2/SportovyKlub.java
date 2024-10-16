import java.util.Scanner;
import java.util.ArrayList;

public class SportovyKlub {
  private Scanner input = new Scanner(System.in);
  private String nazov;
  private int pocetSportovcov = 0;
  private ArrayList<Sportovec> sportovci = new ArrayList<Sportovec>();

  public SportovyKlub() {
    System.out.print("Zadaj nazov sportoveho klubu: ");
    nazov = input.nextLine();
  }

  public SportovyKlub(String nazov) {
    this.nazov = nazov;
  }

  public String getNazov() {
    return nazov;
  }

  public void setNazov(String nazov) {
    this.nazov = nazov;
  }

  public int getPocetSportovcov() {
    pocetSportovcov = sportovci.size();
    return pocetSportovcov;
  }

  public void addSportovec(Sportovec e) {
    sportovci.add(e);
    pocetSportovcov = sportovci.size();
  }

  public void delSportovec(int index) {
    sportovci.remove(index);
    pocetSportovcov = sportovci.size();
  }

  public void delSportovec(Sportovec e) {
    sportovci.remove(e);
    pocetSportovcov = sportovci.size();
  }

  public void infoSportovec(Sportovec e) {
    e.info();
  }

  public Sportovec vyhladajSportovec(String fname, String lname) {
    for (int i = 0; i < sportovci.size(); i++) {
      Sportovec s = sportovci.get(i);
      if (s.getFname() == fname && s.getLname() == lname) {
        return s;
      }
    }
    return null;
  }
}
