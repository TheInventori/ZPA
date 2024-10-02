import java.util.Scanner;

public class Kvader{
    private Obdlznik podstava;
    private Obdlznik prednaStrana;
    private Obdlznik bocnaStrana;
    
    public Kvader(){
        
        this.podstava = new Obdlznik();
        Scanner  sc = new Scanner(System.in);
        System.out.print("Zadajte stranu c: ");
        float stranaC =  sc.nextFloat();

        this.prednaStrana = new Obdlznik(podstava.getStranaA(), stranaC);
        this.bocnaStrana = new Obdlznik(podstava.getStranaB(), prednaStrana.getStranaB());

    }

    public float povrch(){
        return 2 * (podstava.obsah() +
                prednaStrana.obsah() +
                bocnaStrana.obsah());
    }

    public float objem(){
        return podstava.obsah() * prednaStrana.getStranaB();
    }

    public String toString(){
        return "a = " + podstava.getStranaA() + 
                "\nb = " + podstava.getStranaB() + 
                "\nc = " + prednaStrana.getStranaB() + 
                "\npovrch = " + povrch() +
                "\nobjem = " + objem() + 
                "\n" +
                super.toString();
    }

    public void info(){
        System.out.println("KVADER: ");
        System.out.println(toString());
        System.out.println("////////////////////////////////////");
    }

}