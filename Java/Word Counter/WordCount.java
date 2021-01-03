import java.util.*;
import java.io.*;

public class WordCount {
    public HashSet<String> uniqueWordsSet;
    public String words;

    public void readFile(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              words = myReader.nextLine();
            }
            myReader.close();
            this.storeWords();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public void storeWords() {

        String[] splited = words.split("[\\s,]+");

        uniqueWordsSet = new HashSet<>(Arrays.asList(splited));

        this.singleString();
    }

    public void singleString() {
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            for (String word : uniqueWordsSet) {
                myWriter.write(word + ", ");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public boolean wordChecker(String inputWord) {
        boolean exists = false;
        for (String word : uniqueWordsSet) {
            if(word.equals(inputWord)){
                exists = true;
            }
        }

        return exists;
    }

    public static void main(String[] args) {
        WordCount word = new WordCount();

        word.readFile();

        /*
        Scanner newScan = new Scanner(System.in);
        String checkWord = newScan.nextLine();

        while(!checkWord.equals("-999")){
            if(word.wordChecker(checkWord)){
                System.out.println("Word Exists");
            }
            else {
                System.out.println("Word connot be found.");
            }

            checkWord = newScan.nextLine();
        }
        */
    }

}