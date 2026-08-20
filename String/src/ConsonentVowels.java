import java .util.Scanner;
public class ConsonentVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int vow=0;
        int cons=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("vowels = "+vow);
        System.out.println("consonants = "+cons);
    }

    public static class Unique {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String s=sc.nextLine();

                    int[] freq = new int[256];

                    // Count frequency
                    for (int i = 0; i < s.length(); i++) {
                        freq[s.charAt(i)]++;
                    }

                    // Find first character with frequency 1
                    for (int i = 0; i < s.length(); i++) {
                        if (freq[s.charAt(i)] == 1) {
                            System.out.println(s.charAt(i));
                            return;
                        }
                    }
                }
            }
}
