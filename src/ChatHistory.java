import java.util.ArrayList;
import java.util.Scanner;

public class ChatHistory {
    private static ArrayList<String> arr = new ArrayList<String>();

    public ChatHistory(ArrayList<String> arr) {
        this.arr = arr;
    }
    public ArrayList<String> getArr() {
        return arr;
    }

    public void add(String s){
        arr.add(s);
    }

    /** checks if all the words in the chat history are lowercase
     * @return a boolean that is true if all words are lowercase
     */
    public boolean lowercase(){
        for (String s : arr) {
            if(s.equals(s.toLowerCase())){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    /** this method finds the number of unique words in the chat history.
     * @return an integer with the number of unique words.
     */
    public int numUniqueWords(){
        int count = 0;
        ArrayList<String> temp = new ArrayList<>();
        for (String s : arr){
            if(!temp.contains(s.toLowerCase())){
                temp.add(s.toLowerCase());
                count++;
            }
        }
        return count;
    }

    /** iterates through arr and finds the longest word
     * @return the longest word in the chat history
     */
    public String longestWord(){
        String longest = arr.get(0);
        for(String s : arr){
            if (s.length() > longest.length()){
                longest = s;
            }

        }
        return longest;
    }

    /** finds the number of "the"s ignoring case
     * @return number of times "the" appears
     */
    public int theCount(){
        int count = 0;
        for(String s : arr){
            if (s.equalsIgnoreCase("the")){
                count++;
            }
        }
        return count;
    }
    public ChatHistory(int capacity) {}

    /** returns the chat history without words that are 3 letters or fewer or duplicate words.
     * @return a description of chat history object
     */
    public String toString(){
        String output = "";
        arr.replaceAll(String::toLowerCase);
        for (String s : arr){
            if(s.length() > 3 && (!output.contains(s.toLowerCase()))){
                output += s + "\n";
            }
        }
        return output;
    }

    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        ChatHistory chat = new ChatHistory(arr);
        String sentence;
        System.out.print("Enter a sentence: ");
        while (!(sentence = s.nextLine()).equals("STOP")){
            System.out.print("Enter a sentence: ");
            String word = "";
            for(int i = 0; i < sentence.length(); i++){
                if (!sentence.substring(i, i+1).equals(" ")){
                    word += sentence.substring(i, i+1);
                }
                else{
                    chat.add(word);
                    word = "";
                }
            }
            if (!word.isEmpty()){
                chat.add(word);
            }

        }

        System.out.println("Chat report: ");
        System.out.println("You used " + chat.getArr().size() + " words");
        System.out.println("You used " + chat.numUniqueWords() + " unique words");
        System.out.println("\"the\" appears " + chat.theCount() + " times");
        System.out.println("\""+ chat.longestWord() + "\""+ " was the longest word.");
        System.out.println("Are all the words lowercase? " + chat.lowercase());
        System.out.println("\nCondensed chat history:\n" + chat.toString());
        }

    }

