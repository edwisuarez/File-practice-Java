package FileRead;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

    public WriteFile(){}

    String fileName;

    public void WriteFileWithMessage(String fileName)
    {

        try(FileWriter fileWriter = new FileWriter("src/FileRead/"+fileName+".txt")) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Ingrese su mensaje: ");
            String message = scan.nextLine();

            fileWriter.write(message);
            fileWriter.close();

            System.out.println("File wrote successfully");
        } catch (IOException e) {
            System.out.println("Error while writing file");
            e.printStackTrace();
        }

    }

}
