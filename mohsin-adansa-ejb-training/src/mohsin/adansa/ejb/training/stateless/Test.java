
package mohsin.adansa.ejb.training.stateless;  
import javax.naming.Context;  
import javax.naming.InitialContext;  
public class Test {  
public static void main(String[] args)throws Exception {  
    Context context=new InitialContext();  
    AdderImplRemote remote=(AdderImplRemote)context.lookup("st1");  
    System.out.println(remote.add(32,32));  
}  
}  