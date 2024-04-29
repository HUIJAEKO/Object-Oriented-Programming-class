package Lec9;
import java.io.*;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText <RemoveWord> <FilePath>");
            System.exit(1);
        }

        String removeWord = args[0];
        File sourceFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[1] + " does not exist");
            System.exit(2);
        }

        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(sourceFile)) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            System.exit(3);
        }

        // 메모리에서 단어 제거
        String modifiedContent = content.toString().replace(removeWord, "");

        // 원본 파일 크기를 0으로 설정
        try (PrintWriter writer = new PrintWriter(sourceFile)) {
            writer.print(""); // 파일 내용을 비움
        } catch (FileNotFoundException e) {
            System.out.println("Error clearing the file: " + e.getMessage());
            System.exit(4);
        }

        // 수정된 내용을 다시 파일에 씀
        try (PrintWriter writer = new PrintWriter(sourceFile)) {
            writer.print(modifiedContent);
        } catch (FileNotFoundException e) {
            System.out.println("Error writing the modified content back to the file: " + e.getMessage());
            System.exit(5);
        }

        System.out.println("The word '" + removeWord + "' has been removed from " + args[1]);
    }
}