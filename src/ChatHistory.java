import java.util.ArrayList;
public class ChatHistory {
    private static ArrayList<String> arr = new ArrayList<String>();

    public ArrayList<String> getArr() {
        return arr;
    }
    public void setArr(ArrayList<String> arr) {
        ChatHistory.arr = arr;
    }
    public static void add(String s){
        arr.add(s);
    }

    public String toString(){
        String output = "";
        for (String s : arr){
            output += s + "\n";
        }
        return output;
    }
}
