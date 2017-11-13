import java.io.File;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws Exception{
        System.out.println("This is a word counter routine.");
        File file = new File("ataleoftwocities.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordCount += line.split("").length;
        }
        System.out.println("The file contains " + wordCount + " word(s).");
    }
}
