import java.util.*;
//This is a code to print repetition of a word in a sentence.
public class WordMatch {
    public static void main(String args[]) {
        String word, sentence;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        word = sc.nextLine();

        System.out.println("Enter the sentence");
        sentence = sc.nextLine();

        int count = 0;
        String[] splitsentence = sentence.split("\\s+");

        for (String i : splitsentence) {
            if (i.equals(word)) {
                count++;
            }
        }

        System.out.printf("The score of %s in %s is: %d", word, sentence, count);

 
        sc.close();
    }
}
