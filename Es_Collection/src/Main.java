import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> i = new HashSet<>();
        i.add(0);
        i.add(1);
        i.add(2);
        //System.out.println(i);

        Set<Integer> j = new HashSet<>();
        j.add(0);
        j.add(1);
        j.add(2);
        j.add(3);
        j.add(4);
        //System.out.println(j);

        // System.out.println(j.containsAll(i)); //J contiene tutti gli elementi di I?

        // i.addAll(j);
        // System.out.println(i); //Aggiungo tutto quello che sta in I all'interno di J

        // i.retainAll(j);
        // System.out.println(i); //Toglie tutti gli elementi comuni tra I e J

        i.removeAll(j);
        System.out.println(i); //Rimuove tutti gli elementi presenti in J da I
    }
}