
 // convert array string to arrayList
//array to arraylist
package sept17FistDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ConvertStringArrayToArrayList {
    public static void main(String[] args) {
        String[] colors=new String[]{"blue","black","red"};
        //List list=Arrays.aslist(colors);
        //System.out.println("list");
       List<String> l=new ArrayList<>();
      // Collections.addAll(l,colors);
       for(String string:colors)
       {
           l.add(string);
       }
        System.out.println("l");
    }
    
}
