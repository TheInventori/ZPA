
import java.util.Scanner;

public class Main extends SportsClub{
    public static int value; // pomocna premenna pre volenie moznosti v ponuke
    public static String name;
    static Scanner sc = new Scanner(System.in);


    public static void table(){
        System.out.println("ZOZNAM SPORTOVCOV:");
        System.out.println("Pre pridanie sportovca zadajte 1");
        System.out.println("Pre vymazanie sportovca zadajte 2");
        System.out.println("Pre vypis zoznamu zadajte 3");
        System.out.println("Pre vyhladanie sportovca zadajte 4");
        System.out.print("Volba: ");
    }

    public static void main(String[] args) {

        SportsClub sk = new SportsClub();
        
        
        while (true){
            table();
            value = sc.nextInt();
            switch (value) {
                case 1:
                    sk.addMember();
                    break;
                case 2:
                    System.out.print("Zadajte meno sportovca ktoreho chcete vymazat: ");
                    name = sc.next() + ' ' + sc.next();
                    sk.delMember(name);
                    break;
                case 3:
                    System.out.println(sk.sportsMenList);
                    break;
                case 4:
                    System.out.print("Zadajte meno sportovca: ");
                    name = sc.next() + ' ' + sc.next();
                    sk.findMember(name);
                    break;
                default:
                    break;
            }
        }
    }
}
