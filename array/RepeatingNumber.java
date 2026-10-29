public class RepeatingNumber {
    public static void Display (int []arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static int repeating(int []arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {100, 100, 30, 40, 50, 50};
        System.out.println(repeating(arr));
    }
}

