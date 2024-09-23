public class Main {
  public static void main(String[] args) {
    Obdlznik test1 = new Obdlznik();
    // System.out.println(test1.getStranaA() + ", " + test1.getStranaB() + ", " + test1.getFarba());
    // System.out.printf("Obvod: %,.2f, Obsah: %,.2f\nUhlopriecka: %,.2f\n", test1.obvodObdlznika(), test1.obsahObdlznika(), test1.uhloprieckaObdlznika());
    // System.out.println(test1.toString());
    test1.info();

    Obdlznik test2 = new Obdlznik(7, 6, "modra");
    test2.info();
  }
}
