
// convert arraylist to array
package sept17FistDay;
import java.util.ArrayList;
import java.util.List;
public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] intArray=new Integer[list.size()];
        list.toArray(intArray);
        for(Integer integer:intArray)
        {
            System.out.println(integer);
        }
    }
    
}
