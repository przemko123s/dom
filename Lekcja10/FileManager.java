package Lekcja10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public String readFile(String filename) {
        final File file = new File(filename);
        final StringBuilder sb = new StringBuilder();


        try (final Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sb.append(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void createFile(String fileName) throws FileCreationException {
        final File file = new File(fileName);
        try {
            file.createNewFile();
            throw new IOException("xD");
        } catch (IOException e) {
            throw new FileCreationException("Failed to create new file: "+fileName, e);
        }
    }

    public void writeToFile(String fileName, String content) {
        final File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(content);
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + fileName);
        }

    }
}

