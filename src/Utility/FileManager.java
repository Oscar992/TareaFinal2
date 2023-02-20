package Utility;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public ArrayList<String> leerFile(String path) {

        var file = new File(path);
        var list = new ArrayList<String>();

        try {
            var scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        return list;
    }

    public void escribirFile(String path, ArrayList<String> lista) {
        try {
            var fileWriter = new FileWriter(path);

            for (var string : lista) {
                fileWriter.write(string + "\n");
            }

            fileWriter.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
