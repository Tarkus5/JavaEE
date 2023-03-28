import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(7);
        nums.add(9);

        nums.set(2, 25);

        nums.add(0, 13);
        nums.remove(2);

        //System.out.println(nums);

        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        List<Integer> nums2 = new LinkedList<>();
        nums2.add(4);
        nums2.add(3);
        nums2.add(7);
        nums2.add(8);

        /* for(int i = 0; i < nums2.size(); i++) {
            System.out.println(nums2.get(i));
        } */
        Iterator<Integer> itr = nums2.iterator();
        while (itr.hasNext()) {
            Integer value = itr.next();
            System.out.println(value);
        }
    }
}