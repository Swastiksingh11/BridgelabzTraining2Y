import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String sent=sc.nextLine();
        String search=sc.nextLine();
        if(sent.contains(search)){
            System.out.println(search+" is found in the sentence");
            System.out.println(search+" not found in the sentence");

        }
    }
}
