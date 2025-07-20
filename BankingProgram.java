import java.util.Scanner;
public class BankingProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance=1000;
        boolean isRunning =true;
        int choice;

        while(isRunning){
            System.out.println("---------------");
            System.out.println("BANKING PROGRAM");
            System.out.println("---------------");
            System.out.println("Menu is below:");
            System.out.println("--------------");
            System.out.println("1.Show Total Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("-----------------");
            System.out.println("Enter your Choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1->showBalance(balance);
                case 2->balance+=deposit();
                case 3->balance-=withdraw(balance);
                case 4->{
                        isRunning = false;
                System.out.println("Exiting Program.");
                }
                default -> System.out.println("INVALID CHOICE");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.printf("Your current balance is $%.2f\n",balance);
    }

    static double deposit() {
        System.out.println("Enter the amount to be deposited: ");
        double amount;
        amount=sc.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be Negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(double balance){
        System.out.println("Enter the amount to be withdrawn: ");
        double amount;
        amount=sc.nextDouble();
        if(amount>balance){
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount can't be Withdrawn");
            return 0;
        }
        else{
            System.out.printf("Successfully Withdrawn $%.2f\n",amount);
            return amount;
        }
    }

}