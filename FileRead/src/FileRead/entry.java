package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class entry {

    public static void main(String[] args)
    {

        Scanner scanArchivo = new Scanner(System.in);
        System.out.print("Bienvenido al sistema de archivos, ingresa el nombre del archivo que desea crear: ");
        String fileName = scanArchivo.nextLine();
        CreateFile createFile = new CreateFile(fileName);

        System.out.print("Digite el nombre del archivo que desea editar: ");
        String nameFile = scanArchivo.nextLine();
        WriteFile writeFile = new WriteFile();
        writeFile.WriteFileWithMessage(nameFile);

        ReadFile readFile = new ReadFile();
        readFile.readFileTXT(nameFile);

    }

}