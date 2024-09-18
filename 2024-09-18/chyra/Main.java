public class Main {
  public static void main(String[] args) {
    Obdlznik test1 = new Obdlznik();
    System.out.println(test1.getStranaA() + ", " + test1.getStranaB() + ", " + test1.getFarba());
    System.out.printf("Obvod: %,.2f, Obsah: %,.2f", test1.obvod(), test1.obsah());
    
    Obdlznik test2 = new Obdlznik(5, 2, "test");
    System.out.println(test2.getStranaA() + ", " + test2.getStranaB() + ", " + test2.getFarba());
    System.out.printf("Obvod: %,.2f, Obsah: %,.2f", test2.obvod(), test2.obsah());
  }
}
