import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.lang.*;

class CountChar {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the character: ");
        char inputChar = input.next().charAt(0);

        //Read the text file
        FileReader fr = new FileReader("exercise2.txt");
        // Create a BufferedReader
        BufferedReader br = new BufferedReader(fr);

        String sCurrentLine;
        int count = 0;

        while ((sCurrentLine = br.readLine()) != null) {
            for (int i=0; i< sCurrentLine.length();i++){
                if (sCurrentLine.charAt(i)== Character.toLowerCase(inputChar) || sCurrentLine.charAt(i)== Character.toUpperCase(inputChar)){
                    count+=1; } } }

        if (count==0){
            System.out.println("Couldn't find this character!"); }
        else{
        System.out.println("The inputted character appears "+ count +" time(s) in your text file."); }

        // Closes the reader
        input.close();
        }
}