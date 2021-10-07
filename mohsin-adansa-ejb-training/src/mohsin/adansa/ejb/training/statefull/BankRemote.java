package mohsin.adansa.ejb.training.statefull; 
import javax.ejb.Remote;  
@Remote  
public interface BankRemote {  
    boolean withdraw(int amount);  
    void deposit(int amount);  
    int getBalance();  
}  

