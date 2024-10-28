
import java.util.ArrayList;
import java.util.Scanner;

public class SportsClub{
    private String clubName;
    private int smCount; //sportsmen count -> pocet sportovcov
    
    private String finder; //premenna pre vyhladanie sportovca
    
    ArrayList<Sportsmen> sportsMenList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    public SportsClub(){
        System.out.print("Zadajte nazov klubu: ");
        clubName = sc.nextLine();
    }

    public void addMember(){
        Sportsmen sm = new Sportsmen();
        sportsMenList.add(sm);
        smCount++;
    }
    
    public void delMember(String name){
        for (Sportsmen sp : sportsMenList){
            if  (sp.getName().equals(name)){
                System.out.println("Sportovec " +  name + " bol odstraneny");
                sportsMenList.remove(sp);
                smCount--;
            }
            else {
                System.out.println("Sportovec sa nenasiel");
            }
        }
        
    }

    public void findMember(String name){
        for (Sportsmen sp : sportsMenList){
            if  (sp.getName().equals(name)){
                System.out.println("Vysledok hladania: ");
                System.out.println(sp);
            }
            else {
                System.out.println("Sportovec sa nenasiel");
            }
        }
    }
}
