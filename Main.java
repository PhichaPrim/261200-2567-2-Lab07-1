import java.awt.*;
import java.util.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world " + args[2] + " " + args[3]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);

        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);
        System.out.println(args[2]);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.remove("GG");
        System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("กขค");
        System.out.println(sSet);

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        Map<String, Color> favoriteColor = new HashMap<String, Color>();
        favoriteColor.put("Robert" , Color.BLACK);
        favoriteColor.put("Mark" , Color.WHITE);
        favoriteColor.put("Pedro" , Color.YELLOW);
        favoriteColor.put("Cole" , Color.BLUE);

        Set<String> keySet = favoriteColor.keySet();
        for (String key : keySet){
            Color value = favoriteColor.get(key);
            System.out.println(key + " : " + value);
        }

        Map<String, Color> favoriteColoro = new TreeMap<String, Color>();
        favoriteColoro.put("Robert" , Color.BLACK);
        favoriteColoro.put("Mark" , Color.WHITE);
        favoriteColoro.put("Pedro" , Color.YELLOW);
        favoriteColoro.put("Cole" , Color.BLUE);

        Set<String> keySeto = favoriteColoro.keySet();
        for (String key : keySeto){
            Color value = favoriteColoro.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
