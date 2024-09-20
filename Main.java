import java.util.ArrayList;

public class Main {
  enum Options {
    A,
    B,
    C,
    D
  }

  public static Options doSmth() {
    for (Options opt : Options.values())
      System.out.println(opt);
    return Options.A;
  }

  public static void main(String[] args) {
    String name = "Asuna";
    int age = 18;
    float height = 166.4f;
    char gender = 'F';
    boolean isWaifu = true;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Gender: " + gender);
    System.out.println("isWaifu: " + isWaifu);

    ArrayList<Integer> numbers = { 1, 2, 3 };
    numbers.add(22);
    numbers.remove(2);
    numbers.set(1,3);
  }
}
