import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main implements Runnable{
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

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("This code is running in a thread");
    }
  }

  public static void main(String[] args) {
    Main mainObj = new Main();
    Thread thread = new Thread(mainObj);
    thread.start();

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
    idSet.add(04);
    idSet.add(2006);

    Iterator<Integer> it = idSet.iterator();

    while (it.hasNext()) {
      Integer num = it.next();
      if (num == 3)
        it.remove();
    }
    System.out.println(idSet);
  }
}
