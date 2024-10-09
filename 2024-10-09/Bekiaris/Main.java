import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  
  public static void main(String[] args) {

    ArrayList <Tvar2D> tvar2D;


    int volba;
    float vyska;
    Scanner input = new Scanner(System.in);
    
    while (true){
    System.out.print("Zvolte jednu z možností (1 -> Obdlznik) (2 -> Trojuholnik) (3 -> Kruh) (4 -> Kvader) (5 -> Valec): ");
    volba = input.nextInt();

    if (volba == 1){
      Obdlznik obd = new Obdlznik();
      obd.info();
    }

    else if (volba == 2){
      Trojuholnik trh = new Trojuholnik();
      trh.info();
    }

    else if (volba == 3){
      Kruh kru = new Kruh();
      kru.info();
    }

    else if (volba == 4){
      Kvader kvd = new Kvader();
      kvd.info();
    }

    else if (volba == 5){
      System.out.print("Zadajte vysku valca: ");
      vyska = input.nextFloat();
      Valec vlc = new Valec(vyska);
      vlc.info();

      
    }

    else{
      System.out.println("Nesprávná volba");
    }
    
    System.out.println("Pocet objektov: " + Pocetobjektov.pocetObjektov());
    }
  }
}
