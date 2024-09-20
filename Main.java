import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(22);
    numbers.remove(0);

    Collections.sort(numbers);

    for (Integer num : numbers)
      System.out.println(num);

    HashMap<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("en", "uz");

    for (String item : dictionary.keySet())
      System.out.println(item);


    for (String item : dictionary.values())
      System.out.println(item);

    HashSet<Integer> idSet = new HashSet<>();
    idSet.add(3);
    idSet.add(22);
    idSet.remove(3);

  }
}
