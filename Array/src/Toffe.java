import java.util.*;
public class Toffe{
    public static void main(String[] args) {
        int money = 15;
        int price = 1;
        int wrap = 3;
        int chocolates = money / price;
        int wrappers = chocolates;
        while (wrappers >= wrap) {
            int newChocolates = wrappers / wrap;
            chocolates = chocolates+newChocolates;
            wrappers = newChocolates + (wrappers % wrap);
        }
        System.out.println(chocolates);
    }
}


