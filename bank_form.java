import java.util.Scanner;
//this is a java program replicating a bank form
public class bank_form {
    public static void main( String[]args){
        try(Scanner scanner=new Scanner(System.in)){
        System.out.println("#######-Welcome to adonis bank ltd-#######");
      
        System.out.println("Enter your first name?");
        String first_name =scanner.nextLine();
        System.out.println("Enter your surname:");
        String second_name =scanner.nextLine();
        
        System.out.println("Thank you "+ first_name+" "+ second_name + " for trusting in adaonis bank ltd");
        String email=scanner.nextLine();
        System.out.println("Enter your email:");
        if (email.contains("@") && email.contains(".") ){
            System.out.println("email is valid"); 

            if (email.endsWith("@gmail.com")) {
            System.out.println("email is valid");
        }  
                if (email.endsWith("@yahoo.com")){
                    System.out.println("email is valid");
                }
        }

        }



       }
    }
    
}
