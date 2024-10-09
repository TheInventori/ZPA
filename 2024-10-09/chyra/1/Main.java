import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Obdlznik1 o1 = new Obdlznik1();

    // System.out.println("Pocet objektov: " + Obdlznik1.pocetObdlznikov(1));
    // System.out.println("Pocet objektov: " + Obdlznik1.pocetObd());
    // System.out.println("Pocet objektov: " + o1.pocetObdlznikov());

    // Trojuholnik t1 = new Trojuholnik();
    
    // t1.info();

    // Kvader k1 = new Kvader();

    // k1.info();

    // Kruh kruh1 = new Kruh();
    // kruh1.info();

    // Valec valec1 = new Valec();
    // valec1.info();
    // System.out.println(valec1.getPlast().getStranaB());

    ArrayList<Kruh> kruh = new ArrayList<Kruh>();

    ArrayList tvar2D = new ArrayList();
    tvar2D.add(new Kruh(3.5f));
    tvar2D.add(new Obdlznik(3.5f));
    tvar2D.add(new Trojuholnik(3.5f));

    int i;
    for (i = 0; i < tvar2D.size(); i++) {
      ((Tvar2D) tvar2D.get(i)).info();
    }
  }
}