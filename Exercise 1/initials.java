import java.util.Scanner;

public class initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String FullName = input.nextLine().toUpperCase();
        //System.out.println(FullName);

        String[] name = FullName.split(" ");

        System.out.print("Your initials are: ");

        for(String i: name){
            char firstLetter= i.charAt(0);
            System.out.print(firstLetter + ".");
            }
       }
}