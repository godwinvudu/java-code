import java.util.Scanner;
//this is a java program replicating a bank form
public class bank_form {
    public static void main( String[]args){
        try(Scanner scanner=new Scanner(System.in)){
        System.out.println("Welcome to adonis bank ltd");
      
        System.out.println("What's your name?");
        String name =scanner.nextLine();
        System.out.println("hello"+ name);
       }
    }
    
}
