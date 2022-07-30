import java.util.*;  
public class ATM 
{  
    public static void main(String args[] )  
    { 
        int balance = 2500, withdraw, deposit, TranferAmount;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("\n\t Enter the Account User name  : ");
        String Account= sc.nextLine();
        String TranferAccount;
          
        while(true)  
        {  
            System.out.println("........................................................................................");
            
            System.out.println(" \n\t **********ATM INTERFACE**********"); 
            
            System.out.println("........................................................................................");

            System.out.println(" \n\t 1 : Withdraw       ");  
            System.out.println(" \n\t 2 : Deposit        ");  
            System.out.println(" \n\t 3 : Check Balance  ");  
            System.out.println(" \n\t 4 : transfer money ");
            System.out.println(" \n\t 5 : EXIT           ");
            System.out.print(  "\n\t   Choose the operation you want to perform  : "); 
            int choice = sc.nextInt();  
            System.out.println(".......................................................................................");
            switch(choice)  
            {  
                case 1:  
                    System.out.println("userName: "+Account);
                    System.out.print("Enter money to be withdrawn: ");  
                    withdraw = sc.nextInt();  
                    if(balance >= withdraw)  
                    {  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");  
                    }   
                    else  
                    {  
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
   
                case 2:  
                    System.out.println("user Name: "+Account);
                    System.out.print("Enter money to be deposited: ");  
                    deposit = sc.nextInt();  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully depsited");  
                    System.out.println("");  
                    break;  
   
                case 3: 
                    System.out.println("user Name: "+Account);
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;
                    
                case 4:
                    System.out.println("user name: "+Account);
                    System.out.print("Enter the Account to transfer: ");
                    TranferAccount=sc.nextLine();
                    System.out.print("Enter the amount to transfer: ");
                    TranferAmount = sc.nextInt();
                    balance-=TranferAmount;
                    System.out.println("Available balance: "+balance);
   
                case 5: 
                    System.exit(0);  
            }  
        }  
    }  
}  