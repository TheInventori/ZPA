public class Bmi {
  public static float vypocetBMI(float height, float weight) {
    return weight / (float) Math.pow(height / 100, 2);
  }
}
