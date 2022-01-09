package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public ReadFile(){}

    String FileName;

    public void readFileTXT(String FileName)
    {
        try{
            File myFile = new File("src/FileRead/"+FileName+".txt");
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
