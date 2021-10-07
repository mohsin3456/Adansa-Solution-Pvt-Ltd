package mohsin.adansa.ejb.training.bank1;
mohsin.adansa.ejb.training.bank1.BankLocalLocal;
import javax.ejb.Statefull;
import javax.ejb.Ejb;
public interface BankRemote implements BankRemoterRemote {
 private BankLocalLocal local;
 private int amount=1000;
// method implementation
     public void widthrow(int amount){
     System.out.println("widthrow amount");
     if(amount<=this.amount){
     this.amount=this.amount-amount;
     local.widthrow(this.amount);
     }
    else
    local.widthrow(this.amount);
     }
//implements of deposit method
     public void deposit(int amount){
     System.out.println("widthrow amount");{
     this.amount=this.amount+amount;
     local.deposit(this.amount);
     }
//implenments of getbalance 
   public void getBalance(int amount){
     System.out.println("get balance object");
     local.getBalance(this.amount);
     }
    else
    local.widthrow(this.amount);
     }

}
