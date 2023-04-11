package part4;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){
        String[] returns = getFileName();
        String filePath = returns[0];
        String fileName = returns[1];

        String content = readFile(filePath);
        writeContent(fileName, content);
        System.out.println("Wrote content");

    }

    public static String[] getFileName(){

        System.out.print("Enter the file name: ");
        Scanner scn = new Scanner(System.in);
        String filePath = scn.nextLine().trim();
        String fileName = filePath.contains("/") ? filePath.substring(filePath.lastIndexOf("/") + 1) : filePath;
        fileName = fileName.replaceFirst("[.][^.]+$", ".txt");

        return new String[] {filePath, fileName};
    }

    public static String readFile(String filePath) {
        // ASSUMING THE FILE WILL ALWAYS EXIST
        String content = "";

        try {
            Scanner scn = new Scanner(new File(filePath));

            while (scn.hasNext()){
                content += scn.nextLine() + "\n";
            }

            scn.close();

        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");

        }

        return content;
    }

    public static void writeContent(String fileName, String content){
        try {
            File file = new File(fileName);
            PrintWriter writer = new PrintWriter(file);
            String[] splitContent = content.split("\n");

            for (int i = 0; i < splitContent.length; i++){
                String line = splitContent[i];
                String lineNum = String.format("[%03d]", i+1);
                writer.println(lineNum + " " + line);
            }

            writer.close();
        }

        catch (FileNotFoundException e){
            System.out.println("File was not found!");
        }

    }
}














