import java.util.Scanner;
import java.math.*;

public class Obdlznik{
    // datove polozky
    private float stranaA;
    private float stranaB;
    private String farba;

    // metody
    // konstruktor
    public Obdlznik(float stranaA, float stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
    }
    public Obdlznik(float stranaA, float stranaB, String farba) {
        this(stranaA, stranaB);
        this.farba = farba;
    }
    public Obdlznik(float stranaA) {
        this(stranaA, stranaA);
    }
    public Obdlznik(float stranaA, String farba) {
        this(stranaA, stranaA, farba);
    }
    public Obdlznik() {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadaj stranu A: ");
        stranaA = vstup.nextFloat();
        System.out.print("Zadaj stranu B: ");
        stranaB = vstup.nextFloat();
        System.out.print("Zadaj farbu: ");
        farba = vstup.next();
    }

    // getter/setter
    public float getStranaA() {
        return stranaA;
    }

    public float getStranaB() {
        return stranaB;
    }

    public String getFarba() {
        return farba;
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

    // tostring()
    public String toString() {
        return "a = " + this.getStranaA() +
            "\nb = " + this.getStranaB() +
            "\nfarba = " + this.getFarba() +
            "\n" +
            super.toString();
    }

    //  info()
    public void info() {
        System.out.println(toString());
    }

    // metody
    public float obvod() {
        return (stranaA + stranaB) * 2;
    }

    public float obsah() {
        return stranaA * stranaB;
    }

    public float uhlopriecka() {
        return sqrt(stranaA * stranaB);
    }
}