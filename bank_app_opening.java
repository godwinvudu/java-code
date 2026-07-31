import java.util.Scanner;
//this is a java program replicating a bank form
public class bank_app_opening {

}
    public static void main( String[]args){
        try(Scanner scanner=new Scanner(System.in)){
        System.out.println("#######-Welcome to adonis bank ltd-#######");
      
        System.out.println("Enter your first name?");
        String first_name = scanner.nextLine();

        while (first_name.trim().isEmpty()){
            System.out.println("invalid input");
            System.out.println("Enter your first name?");
            first_name =scanner.nextLine();
        
        }
        
        System.out.println("Enter your surname:");
        String second_name =scanner.nextLine();
        
        while(second_name.trim().isEmpty()){
            System.out.println("invalid second name");
            System.out.println("Enter your surname:");
            second_name =scanner.nextLine();
        
    
        }
        
        System.out.println("Thank you "+ (first_name)+" "+ (second_name) + " for trusting in adaonis bank ltd");
       
        System.out.println("Enter your email:");
        String email=scanner.nextLine();
        //i'm not gonna lie this semester is cooking me
        while(email.trim().isEmpty()){
            System.out.println("invalid email");
            System.out.println("Enter email: ");
            email=scanner.nextLine();

        }
        while(email.contains("@")&&!email.contains(".")&&!email.contains("com")){
            System.out.println("email is invalid.must countain");
            System.out.println("enter a valid email: ");
            email=scanner.nextLine();
        }
        
        System.out.println("Enter password:");
        String password =scanner.nextLine();
        while(password.trim().isEmpty()){
            System.out.println("pasword should not be empty");
     }
        

        }
    }
    
    