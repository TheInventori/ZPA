
import java.util.Scanner;


public class Valec {
    private Kruh podstava;
    private Obdlznik plast;

    public Valec(float vyska){
        this.podstava = new Kruh();
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
