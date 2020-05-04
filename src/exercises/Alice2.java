package exercises;
import java.util.Scanner;

public class Alice2 {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term: ");
        String name = input.nextLine().toLowerCase();
        text = text.toLowerCase();
        if (text.contains(name)){
            System.out.print(name + " is located at index number " + text.indexOf(name) + "." + "\n");
            System.out.print(name + " is " + name.length() + " characters long." +"\n");
            text = text.replace(name, "");
            System.out.print(text);
        }
        else {
            System.out.print(name + " was not found");
        }
    }
}
