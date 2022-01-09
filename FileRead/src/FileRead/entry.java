package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class entry {

    public static void main(String[] args)
    {


        try
        {
            File archivo = new File("LoveMessage.txt");
            if (archivo.createNewFile())
            {
                System.out.println("File created: " + archivo.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error creating file");
            e.printStackTrace();
        }

        try {
            Scanner scan = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter("LoveMessage.txt");
            System.out.println("Ingrese su mensaje: ");
            String message = scan.nextLine();
            fileWriter.write(message);
            fileWriter.close();

            System.out.println("File wrote successfully");
        } catch (IOException e) {
            System.out.println("Error while writing file");
            e.printStackTrace();
        }

        try{
            File myFile = new File("LoveMessage.txt");
            Scanner scanner = new Scanner(myFile);

            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                System.out.println(data);
            }

        }catch(FileNotFoundException e){
            System.out.println("Not Found File");
            e.printStackTrace();
        }

    }

}
