package mohsin.adansa.ejb.training.bank1;
import javax.ejb.Stateful;
public interface BankLocal implements BankLocalLocal// concurent class
{
     public void widthrow(int amount)// implements method
      {
      System.out.println("amount="+amount);
      }
     public void deposite(int amount)
     {
     System.out.println("deposit amount="+amount);
     }
     public void grtBalance()
     {
     System.out.println("avalible balance="+ampunt)
     }
}
