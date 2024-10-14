import java.util.Scanner;
public class Overenie {

    public static float strana;
    public static float overenie(Scanner sc, char pismenko) {
        do{
        System.out.print("Zadaj stranu "  + pismenko + ": ");
        strana = sc.nextFloat();
        return strana;
        }while(strana <= 0);
    }
}
