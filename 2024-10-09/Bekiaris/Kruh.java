import java.util.Scanner;
public class Kruh implements Tvar2D{
    
    public float polomer;
    

    public Kruh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte polomer kruhu: ");
        polomer = sc.nextFloat();

        Pocetobjektov.pocetObj++;
    }

    //getters
    public float getPolomer() {
        return polomer;
    }

    //setters
    public void setPriemer(float polomer) {
        this.polomer = polomer;
    }

    public String toString(){
        return "priemer(r) = " + this.getPolomer() + 
                "\nobvod = " + obvod() + 
                "\nobsah = " + obsah() +
                "\n" + 
                super.toString();
    }

    public void info(){
        System.out.println("Kruh: ");
        System.out.println(toString());
        System.out.println("//////////////////////////////////////");
    }

    public double obsah(){
        return Math.pow(polomer,2) * Tvar2D.pi;
    }

    public float obvod(){
        return 2 * Tvar2D.pi * polomer;
    }
}
