import java.util.Scanner;

public class Obdlznik1 implements Tvar2D{
    // datove polozky
    Scanner vstup = new Scanner(System.in);

    private float stranaA;
    private float stranaB;
    private String farba;
    private static int pocetObdlznikov;
    private static int pocetObd;
    
    // metody
    public Obdlznik1(float stranaA, float stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;

        PocetObjektov.pocetObjektov++;
    }
    
    public Obdlznik1(float stranaA) {
        this(stranaA, stranaA);
    }
    
    public Obdlznik1(float stranaA, float stranaB, String farba) {
        this(stranaA, stranaB);
        this.farba = farba;
    }
    
    public Obdlznik1(float stranaA, String farba) {
        this(stranaA, stranaA, farba);
    }
    
    public Obdlznik1() {
        System.out.print("hehe: ");
        stranaA = OverRozmer.overRozmer(vstup, 'A');
        stranaB = OverRozmer.overRozmer(vstup, 'B');
        System.out.print("Zadaj farbu: ");
        farba = vstup.next();
    }

    public void setStranaA(float stranaA) {
        this.stranaA = stranaA;
    }
    
    public void setStranaB(float stranaB) {
        this.stranaB = stranaB;
    }
    
    public void setFarba(String farba) {
        this.farba = farba;
    }

    public float getStranaA() {
        return stranaA;
    }
    
    public float getStranaB() {
        return stranaB;
        
    }
    public String getFarba() {
        return farba;
    }
    
    public float obvodObd() {
        return 2 * (stranaA + stranaB);
    }
    public float obsahObd() {
        return stranaA * stranaB;
    }
    
    // implementaciou vznika povinnost zadefinovat metody 
    public float obvod() {
        return 2 * (stranaA + stranaB);
    }
    public float obsah() {
        return stranaA * stranaB;
    }
    
    public double uhlopriecka() {
        return Math.sqrt(Math.pow(stranaA, 2)+ Math.pow(stranaB, 2));
    }

    public String toString() {
        return "a = " + getStranaA() +
               "\nb = " + getStranaB() + 
               "\nfarba: " + getFarba() + 
               "\nobvod: " + obvodObd() + 
               "\nobsah: " + obsahObd() +
               "\nulhopriecka: " + uhlopriecka() +
               "\n" + super.toString();
    }

    public void info() {
        System.out.println("****    Obdlznik    ****");
        System.out.println(toString() + "\n");
    }

    public static int pocetObdlznikov(int i) {
        return ++pocetObdlznikov;
    }

    public int pocetObdlznikov() {
        return PocetObjektov.pocetObjektov;
    }

    public static int pocetObd() {
        return pocetObd;
    }
}