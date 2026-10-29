public class RemoveDuplicate {
    static void Duplicate(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]) {
                   // arr[i] = -1;
                   arr[j] = -1;
               }
            }
        }
    }
    static void Display(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 10, 30, 40, 50, 60};
        Duplicate(arr);
        Display(arr);
    }
}
