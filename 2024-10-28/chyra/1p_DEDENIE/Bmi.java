public class Bmi {
  public static float vypocetBMI(float height, float weight) {
    return (float) Math.round((weight / (float) Math.pow(height / 100, 2)) * 100) / (float) 100;
  }
}
