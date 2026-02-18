import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    ArrayList<String> arrlist = new ArrayList<String>();
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ChatHistory a = new ChatHistory();
        while (!s.nextLine().equals("STOP")){
            String sentence = s.nextLine();
            System.out.println("Enter a sentence: ");
            for(int i = 0; i < sentence.length(); i++){
                String word = "";
                if (!sentence.substring(i, i+1).equals(" ")){
                    word += sentence.substring(i, i+1);
                }
                else{
                    a.add(word);
                }
            }

        }
        System.out.println("Chat report: ");
        System.out.println("You used _ words");
        System.out.println("You used _ unique words");
        System.out.println("You used the _ times");
        System.out.println("_ was the longest word.");
        System.out.println("Are all the words lowercase? _");
        System.out.println("Condensed chat history:");
        System.out.println(a);
    }
}
