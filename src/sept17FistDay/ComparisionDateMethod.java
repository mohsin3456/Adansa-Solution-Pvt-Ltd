// Comparing Date using Date.before() and Date.after() Methods in Java

package sept17FistDay;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ComparisionDateMethod {
    public static void main(String[] args)throws ParseException {
        String requredDate="07/17/2017";
        String startDate="06/14/1990";
        String endDate="12/30/2017";
        SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
        Date sDate=sdf.ParseDate(startDate);
        Date eDate=sdf.ParseDate(endDate);
        Date Date=sdf.ParseDate(requiredDate);
        if(date.compareTo(sDate)>=0&&date.copmareTo(eDate)<=0)
        {
            System.out.println("Requred date with in the limit ");
        }
        else
        {
            System.out.println("Date is out of range ");
        }
    }
    
}
