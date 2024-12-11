//Creating, Reading , Writing and Deleting a File


import java.io.*;
import java.util.Scanner;

public class FileHandler{
    public static void main(String [] args){
        try{
            File f=new File("myfile.txt");

            //Creating a file
            if(f.createNewFile()){
                System.out.println("File Created : "+ f.getName());
            }
            else{
                System.out.println("File already exits");
            }

            //Reading a file
            Scanner Reader = new Scanner(f);
            while(Reader.hasNextLine()){
                String data= Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
            
            //Writing in a file
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("This line is written using java program.\n");
            Writer.write("This line is also written using java program.");
            Writer.close();

            //Deleting a file
            if (f.delete()) { 
                System.out.println("Deleted the file: " + f.getName());
            } 
            else {
                System.out.println("Failed to delete the file.");
            } 

        }
        //To catch any exception
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}