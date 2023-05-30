package Bank;

public class Transcation {
    private int balance;
    private String userid;
    private String history="";
    Transcation(int bal,String uid){
        this.balance=bal;
        this.userid=uid;
    }

    public String history(){
        System.out.println(history);
        return "";
    }

    public void withdraw(int wd){
        if(wd>balance){
            System.out.println("Balance insuffisant");
            history+="Balance insuffisant---------------------------\n";
        }else{
            System.out.println("Current Balance is Rs. "+balance);
            balance-=wd;
            System.out.println("Withdraw amount is Rs. "+wd);
            System.out.println("After Withdraw Balance is Rs. "+balance);
            history+="Withdraw amount is Rs. "+wd+"-----------------------\n";
        }    
    }
    public void deposit(int dp){
        System.out.println("Current Balance is Rs. "+balance);
        balance+=dp;
        System.out.println("Deposit amount is Rs. "+dp);
        System.out.println("After Withdraw Balance is Rs. "+balance);
        history+="Deposit amount is Rs. "+dp+"-----------------------\n";
    }
    public void transfer(int ts,int ba){
        if(ts>balance){
            System.out.println("Balance insuffisant");
            history+="Balance insuffisant to Tranfser-----------------------\n";
        }else{
            System.out.println("Current Balance is Rs. "+balance);
            balance-=ts;
            System.out.println("Transfer amount is Rs. "+ts);
            System.out.println("After Transfer Balance is Rs. "+balance);
            history+="Transfer amount is Rs. "+ts+"-----------------------\n";
        }
    }
    public int getBalance(){
        return balance;
    }
}
