import java.util.Scanner;
//this is a java program replicating a bank form
public class bank_app_opening {
    public static void main( String[]args){
        try(Scanner scanner=new Scanner(System.in)){
        System.out.println("#######-Welcome to adonis bank ltd-#######");
      
        System.out.println("Enter your first name?");
        String first_name =scanner.nextLine();
        System.out.println("Enter your surname:");
        String second_name =scanner.nextLine();
        
        System.out.println("Thank you "+ first_name+" "+ second_name + " for trusting in adaonis bank ltd");
       
        System.out.println("Enter your email:");
         String email=scanner.nextLine();
        if (email.contains("@") && email.contains(".") ){
            System.out.println("email is valid"); 

            if (email.endsWith("@gmail.com")) {
            System.out.println("gmail account is valid");
        }  
                else if (email.endsWith("@yahoo.com")){
                    System.out.println("yahoo account is valid");
                }
                    else{
                        System.out.println("email is invalid");
                    }
        }
        System.out.println("create password:");
         String password=scanner.nextLine();
         String specailcharacters="!@#$%^&*()_+=-:'?><,./~`'";
        if ((password.length() >=10) && (password.contains(specailcharacters))){
            System.out.println("re-enter password");
                String re_password=scanner.nextLine();
            if(re_password.equals(password)){
                System.out.println("password accepted");

            } 
                else
                    System.out.println("password does not match");

        }
        }



       }
    }
    

