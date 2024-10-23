import java.util.Scanner;
import java.util.ArrayList;

public class SportovyKlub {
  private String nazov;
  private int pocetSportovcov = 0;
  private ArrayList<Sportovec> sportovci = new ArrayList<Sportovec>();

  public SportovyKlub() {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Zadaj nazov sportoveho klubu: ");
      nazov = input.nextLine();
    }
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

  public void addSportovec() {
    sportovci.add(new Sportovec());
    pocetSportovcov = sportovci.size();
  }

  public void delSportovec(int index) {
    if (index < pocetSportovcov) {
      sportovci.remove(index);
      pocetSportovcov = sportovci.size();
    } else {
      System.out.println("Nepodarilo sa najst sportovca.");
    }
  }

  public void delSportovec(Sportovec e) {
    sportovci.remove(e);
    pocetSportovcov = sportovci.size();
  }

  public void delSportovec(String fname, String lname) {
    try {
      sportovci.remove(vyhladajSportovec(fname, lname));
      pocetSportovcov = sportovci.size();
    } catch (Exception e) {
      System.out.println("Nepodarilo sa najst sportovca.");
    }
  }

  public void delSportovec() {
    try {
      sportovci.remove(vyhladajSportovec());
      pocetSportovcov = sportovci.size();
    } catch (Exception e) {
      System.out.println("Nepodarilo sa najst sportovca.");
    }
  }

  public void infoSportovec(Sportovec e) {
    e.info();
  }

  public void infoSportovec(int index) {
    if (index < pocetSportovcov) {
      sportovci.get(index).info();
    } else {
      System.out.println("Nepodarilo sa najst sportovca.");
    }
  }

  public void infoSportovec(String fname, String lname) {
    try {
      vyhladajSportovec(fname, lname).info();
    } catch (Exception e) {
      System.out.println("Nepodarilo sa najst sportovca.");
    }
  }

  public void infoSportovec() {
    try {
      vyhladajSportovec().info();
    } catch (Exception e) {
      System.out.println("Nepodarilo sa najst sportovca.");
    }
  }

  public Sportovec vyhladajSportovec(String fname, String lname) {
    for (int i = 0; i < sportovci.size(); i++) {
      Sportovec s = sportovci.get(i);
      if (s.getFname().equals(fname) && s.getLname().equals(lname)) {
        return s;
      }
    }

    return null;
  }

  public Sportovec vyhladajSportovec() {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Zadaj meno: ");
      String fname = input.next();
      System.out.print("Zadaj priezvisko: ");
      String lname = input.next();

      for (int i = 0; i < sportovci.size(); i++) {
        Sportovec s = sportovci.get(i);
        if (s.getFname().equals(fname) && s.getLname().equals(lname)) {
          return s;
        }
      }
    }

    return null;
  }

  public void infoAll() {
    System.out.println("\n**** Sportovci ****");
    for (int i = 0; i < sportovci.size(); i++) {
      System.out.println("SPORTOVEC " + (i + 1) + ":");
      System.out.println(sportovci.get(i) + "\n");
    }
  }

  public void infoKlub() {
    System.out.println("\n**** Sportovy klub ****");
    System.out.println("Nazov klubu: " + nazov + "\nPocet sportovcov: " + pocetSportovcov + "\n");
  }

  public void info() {
    try (Scanner input = new Scanner(System.in)) {
      while (true) {
        System.out.println("\n\n(1) Pridat clena");
        System.out.println("(2) Vymazat clena");
        System.out.println("(3) Info o vsetkych clenoch");
        System.out.println("(4) Vyhladat clena");
        System.out.println("(5) Info o klube");
        System.out.println("(6) Exit\n");

        System.out.print("Zadaj moznost: ");
        int choice = input.nextInt();

        switch (choice) {
          case 1:
            addSportovec();
            break;
          case 2:
            delSportovec();
            break;
          case 3:
            infoAll();
            break;
          case 4:
            infoSportovec();
            break;
          case 5:
            infoKlub();
            break;
          case 6:
            return;
          default:
            System.out.println("Zadal si zlu moznost");
            break;
        }
      }
    }
  }
}
