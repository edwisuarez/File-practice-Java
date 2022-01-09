package FileRead;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public CreateFile(){}

    protected String fileName;

    public CreateFile(String fileName)
    {
        try
        {
            File archivo = new File("src/FileRead/"+fileName+".txt");
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
    }

}
