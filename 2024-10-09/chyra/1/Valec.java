import java.util.Scanner;

public class Valec {
  Scanner input = new Scanner(System.in);

  private Obdlznik plast;
  private Kruh podstava;


  public Valec(Kruh podstava, Obdlznik plast) {
    this.podstava = podstava;
    this.plast = plast;
  }

  public Valec() {
    System.out.print("Zadaj polomer podstavy: ");
    podstava = new Kruh(input.nextFloat());

    System.out.print("Zadaj vysku valca: ");
    plast = new Obdlznik(podstava.obvod(), input.nextFloat());
  }
  

  public void setVyska(float vyska) {
    plast.setStranaB(vyska);
  }

  public void setRadius(float radius) {
    podstava.setRadius(radius);
    plast.setStranaA(podstava.obvod());
  }

  public Obdlznik getPlast() {
    return plast;
  }

  public Kruh getPodstava() {
    return podstava;
  }


  public float objem() {
    return podstava.obsah() * plast.getStranaB();
  }

  public float povrch() {
    return (podstava.obsah() * 2) + plast.obsah();
  }

  
  public String toString() {
    return "Vyska valca: " + plast.getStranaB() + 
           "\nPolomer valca: " + podstava.getRadius() + 
           "\nObjem valca: " + objem() + 
           "\nPovrch valca: " + povrch() + 
           "\n" + super.toString();
  }

  public void info() {
    System.out.println("\n****    Valec    ****");
    System.out.println(toString() + "\n");
  }
}
