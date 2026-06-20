import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient funds.");
        }
        else{
            System.out.println("Withdrawal successful");
        }
    }
    
}
