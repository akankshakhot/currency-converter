import java.util.Scanner;

public class currencyconvertor {
    public static void main(String[] args){
        System.out.println("1.Rupees");
        System.out.println("2.Dollars");
        System.out.println("3.Euros");
        
        Scanner s=new Scanner(System.in);
        System.out.println("choose the currency");
        int choice=s.nextInt();
        System.out.println("Enter the amoount");
        double amount=s.nextDouble();
        //switch case statement
        switch(choice){
            case 1:
            Rupee_to_other(amount);
            break;
            case 2:
            Dollar_to_other(amount);
            break;
            case 3:
            Euro_to_other(amount);
            break;
            default:
            System.out.println("Invalid choice");

        }


    }
    public static void Rupee_to_other(double amt){
        System.out.println("1 Ruppe =" + 0.013+ "Dollar");
        System.out.println();
        System.out.println(amt+"Ruppe=" + (amt*0.013) + "Dollar");
        System.out.println("1 Ruppe =" + 0.012+ "Euro");
        System.out.println();
        System.out.println(amt+"Ruppe=" + (amt*0.012) + "Euro");
        System.out.println();
        


    }
    public static void Dollar_to_other(double amt) {
        System.out.println("1 Dollar = " + 79.37 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
        System.out.println();
    
        System.out.println("1 Dollar= " + 0.98 + " Euro");
        System.out.println();
    
        System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
    }
    
        
    
    public static void Euro_to_other(double amt){
        System.out.println("1 Euro = " + 80.85 + " Ruppe");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
        System.out.println();
    
        System.out.println("1 Euro = " + 1.02 + " Dollar");
        System.out.println();
    
        System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
    }
    
    
}
