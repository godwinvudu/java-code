import java.util.Scanner;


class New {

    public static void main(String[] args){
     System.out.println("hello,welcome to this code section");
     Scanner input=new Scanner(System.in);
     System.out.println("whats your name?");
     String username=input.nextLine();
     System.out.println("hello," + username);
     System.out.print("How old are you? ");
     int age =input.nextInt();
     if (age <18) {
        System.out.println("GTFO LIL BRO!");
     } else if (age>18){
      System.out.println("damn unc!");
     } else{
      System.out.println("fuck off nigga!");
      input.close();
     }



    }
 }