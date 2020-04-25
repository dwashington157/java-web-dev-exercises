package exercises;

import java.util.Scanner;

public class Alice {

    Scanner input;

    public static void main(String[] args) {
        char word;
        Scanner input = new Scanner(System.in);
        String story = "Alice was beginning to get very tired of sitting by her\n" +
                "sister on the bank, and of having nothing to do: once or\n" +
                "twice she had peeped into the book her sister was\n" +
                " reading, but it had no pictures or conversations in it,\n" +
                "'and what is the use of a book,' thought Alice 'without\n" +
                "pictures or conversation?'";
        System.out.println(story);

        //prompt user for a term to search for within the string
        System.out.println("Enter a word from this story that you remember to test your memory?");
        System.out.print(story.contains(input.nextLine()));
    }
}

