
import java.util.Scanner;


public class Valec implements Tvar3D{
    private Kruh podstava;
    private Obdlznik plast;
    float vyska;

    Scanner sc = new Scanner(System.in);


    public Valec(){
        this.podstava = new Kruh();
        System.out.print("Zadaj vysku: ");
        this.vyska = sc.nextFloat();
        this.plast = new Obdlznik(podstava.obvod(),vyska);
    }

    public float povrch(){
        return (float)(plast.obsah() + 2 * podstava.obsah());
    }

    public float objem(){
        return (float)(podstava.obsah() * plast.getStranaB());
    }

    public String toString(){
        return "r = " + podstava.getPolomer() +
                "\nv = " + plast.getStranaB() +
                "\npovrch = " + povrch() +
                "\nobjem = " + objem() +
                "\n" +
                super.toString();
    }

    public void info(){
        System.out.println("VALEC: ");
        System.out.println(toString());
        System.out.println("///////////////////////////////////");
    }

}
