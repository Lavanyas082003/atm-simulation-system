import java.util.Scanner;
public class ATM{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int currentbalance=20000;
        System.out.println("========ATM MACHINE========");
        System.out.println("Please Insert Your card");
        System.out.println("Press Enter to Continue");
        sc.nextLine();
         System.out.println("Enter Your PIN :");
        int correctpin=1188;
        int enterpin=sc.nextInt();
        if(correctpin==enterpin){
            System.out.println("Login Successfully!");
        }else{
            System.out.println("Invalid PIN");
        }
        while(true){
            System.out.println("========SELECT OPTION========");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt(); 
            switch(choice){
                case 1:System.out.println("=====CHECK BALANCE=====");
                  System.out.println("Available Balance :"+currentbalance);
                  break;
                case 2:System.out.println("=====DEPOSIT=====");
                  System.out.println("Enter Your Deposit Amount:");
                   int Depositamount=sc.nextInt();
                   currentbalance=currentbalance+Depositamount;
                  System.out.println("Amount Deposited Successfully");
                  System.out.println("Available Balance :"+currentbalance);
                  break;
                  case 3:System.out.println("=====WITHDRAW=====");
                  System.out.println("Enter Your Withdraw Amount:");
                   int withdrawamount=sc.nextInt();
                   if(withdrawamount>=currentbalance){
                    System.out.println("Insufficient Balance!");
                     System.out.println("Transaction Failed");
                     System.out.println("Available Balance :"+currentbalance);
                   }else{
                    currentbalance=currentbalance-withdrawamount;
                  System.out.println("Transaction Successfully");
                  System.out.println("Available Balance :"+currentbalance);
                   }
                  break;
                  case 4: System.out.println("=====EXIT=====");
                  System.out.println("Thank You For Using ATM");
                  return;
            }
        }
    }
}