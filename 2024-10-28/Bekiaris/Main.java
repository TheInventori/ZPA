import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  
  
  public static void main(String[] args) {


   int volba;
    float vyska;
    Scanner input = new Scanner(System.in);
    ArrayList<Tvar2D> tvar2D = new ArrayList<Tvar2D>(); //vytvorenie pola pre 2D tvary
    ArrayList<Tvar3D> tvar3D = new ArrayList<Tvar3D>(); //vytvorenie pola pre 3D tvary
    
    while (true){
      System.out.print("Zvolte jednu z možností (1 -> Obdlznik) (2 -> Trojuholnik) (3 -> Kruh) (4 -> Kvader) (5 -> Valec): ");
      volba = input.nextInt();

    /*if (volba == 1){
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
    
    System.out.println("Pocet objektov: " + Pocetobjektov.pocetObjektov());*/


    


      switch (volba) {
          case 1:
              System.out.println("Zadajte parametre pre obdlznik");
              tvar2D.add(new Obdlznik());
              break;
          case 2:
              System.out.println("Zadajte parametre pre trojuholnik");
              tvar2D.add(new Trojuholnik());
              break;
          case 3:
              System.out.println("Zadajte parametre pre kruh");
              tvar2D.add(new Kruh());
              break;
          case 4:
              System.out.println("Zadajte parametre pre kvader");
              tvar3D.add(new Kvader());
              break;
          case 5:
              System.out.println("Zadajte parametre pre valec");
              tvar3D.add(new Valec());
              break;
          default:
              throw new AssertionError();
      }

      int i;
      for (i = 0; i < tvar2D.size(); i++) {
        ((Tvar2D) tvar2D.get(i)).info();
      }

      for (i = 0; i < tvar3D.size(); i++){
        ((Tvar3D) tvar3D.get(i)).info();
      }
    }
  }
}
