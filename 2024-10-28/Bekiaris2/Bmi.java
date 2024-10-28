
public class Bmi{

    static double bmi;
    public static double calculationBMI(double weight,double height){
        bmi = weight / Math.pow(height/100, 2);
        bmi = Math.round(bmi*100.0)/100.0;
        return bmi;
    }
}
