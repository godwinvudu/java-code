import java.util.Scanner;
//this is a java program replicating a bank form
public class bank_app_opening {


    public static void main( String[]args){
        try(Scanner scanner=new Scanner(System.in)){
        System.out.println("#######-Welcome to adonis bank ltd-#######");
      
        System.out.println("Enter your first name?");
        String first_name = scanner.nextLine();
//bio info block
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

        System.out.println("enter your age :");
        int age=scanner.nextInt();
        scanner.nextLine();
        if (age<16){
            System.out.println("you're too young to open an accoun");//things that we can't say in hollywood lol
            System.exit(1);
        }

        
        System.out.println("Thank you "+ (first_name)+" "+ (second_name) + " for trusting in adaonis bank ltd");
       //email validation block
        System.out.println("Enter your email:");
        String email=scanner.nextLine();
        //i'm not gonna lie this semester is cooking me
        
        while(email.trim().isEmpty()){
            System.out.println("invalid email");
            System.out.println("Enter email:(***google mail only****) ");
            email=scanner.nextLine();

        }
        while(!email.contains("@") || !email.contains(".") || !email.contains("com")||!email.contains("gmail")){
            System.out.println("email is invalid ");
            System.out.println("enter a valid email: ");
            email=scanner.nextLine();
        
        }
        //password validation block
        System.out.println("Enter password:");
        String password =scanner.nextLine();
        while(password.trim().isEmpty()){
            System.out.println("pasword should not be empty");
            System.out.println("Enter a valid password"); 
            password=scanner.nextLine();
        
        }

        

        }
    }
}
    