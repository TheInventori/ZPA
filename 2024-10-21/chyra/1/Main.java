public class Main {
  public static void main(String[] args) {
    // Clovek c1 = new Clovek();
    // c1.info();

    Sportovec s1 = new Sportovec();
    s1.info();

    SportovyKlub sk1 = new SportovyKlub();

    sk1.addSportovec(s1);
    sk1.addSportovec(s1);

    sk1.infoSportovec(s1);

    // Sportovec s2 = sk1.vyhladajSportovec("Marek", "Chyra");

    // System.out.println(s2.getLname());
    
    sk1.info();
  }
}
