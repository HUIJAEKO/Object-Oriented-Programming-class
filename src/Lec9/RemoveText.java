package Lec9;
import java.io.*;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("command : java RemoveText <RemoveWord> <FilePath>");
            System.exit(1);
        }

        String removeWord = args[0];
        File sourceFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[1] + " does not exist");
            System.exit(2);
        }

        StringBuilder sourceFileContent = new StringBuilder();
        try (Scanner scanner = new Scanner(sourceFile)) {
            while (scanner.hasNextLine()) {
                sourceFileContent.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(3);
        }

        String newContent = sourceFileContent.toString().replace(removeWord, "");

        try (PrintWriter writer = new PrintWriter(sourceFile)) {
            writer.print(""); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(4);
        }

        try (PrintWriter writer = new PrintWriter(sourceFile)) {
            writer.print(newContent);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(5);
        }

        System.out.println("complete");
    }
}