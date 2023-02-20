package Utility;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    public static ArrayList<String> leerFile(String path) {

        final var file = new File(path);
        final var list = new ArrayList<String>();

        try {
            final var scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return list;
    }

    public static void escribirFile(String path, ArrayList<String> lista) {
        try {
            final var fileWriter = new FileWriter(path);

            for (var string : lista) {
                fileWriter.write(string + "\n");
            }

            fileWriter.close();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
