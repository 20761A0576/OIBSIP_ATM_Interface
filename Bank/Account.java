package Bank;
import java.util.*;
class Account{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //String Userid="Ram@123",Password="12345678";
        System.out.println("Enter a User Id");
        String uid = scan.nextLine();
        System.out.println("Enter a Password to create a New Account");
        String pass = scan.nextLine();
        ArrayList<User> user = new ArrayList<User>();
        user.add(new User("Ram123","12345678"));
        //user.add(new User("Ravi123","12345678"));
        //user.add(new User("Raki123","12345678"));
        while(true){
            int f=1;
            for(int i=0;i<user.size();i++){
                if(uid.equals(user.get(i).getName())){
                    f=0;
                    break;
                }
            }
            if(f==1){
                System.out.println("Your User Id Not Exist");
                System.out.println("To Create new Account Enter 1 otherwise 0");
                int k=scan.nextInt();
                if(k==1){
                    System.out.println("Enter a Password to create a New Account");
                    pass = scan.nextLine();
                    user.add(new User(uid, pass));
                    break;
                }else{
                    System.out.println("Enter Valid User Id");
                    uid = scan.nextLine();
                }
            }else{
                break;
            }
        }
        for(int i=0;i<user.size();i++){
            if(uid.equals(user.get(i).getName()) && pass.equals(user.get(i).getPassword())){
                int option;
                Transcation  obj = new Transcation(0,user.get(i).getName());
                System.out.println("Enter a Bank Account Number");
                int ban=scan.nextInt();
                while(true){
                    System.out.println("1.Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit");
                    System.out.println("Enter your option");
                    option = scan.nextInt();
                    if(option==1){
                        obj.history();
                    }else if(option==2){
                        System.out.println("Enetr amount to Withdraw");
                        int wd=scan.nextInt();
                        obj.withdraw(wd);
                    }else if(option==3){
                        System.out.println("Enetr amount to Deposit");
                        int dp=scan.nextInt();
                        obj.deposit(dp);
                    }else if(option==4){
                        System.out.println("Enter Bank account number To Tranfer");
                        int ba=scan.nextInt();
                        System.out.println("Enetr amount to Transfer");
                        int ts=scan.nextInt();
                        obj.transfer(ts,ba);
                    }else{
                        break;
                    }
                }
            }
        }
    }
}