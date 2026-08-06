public class MinElement {
    static void Display(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args){
        int[] arr = {100, 20, 30, 40, 50, 60};
        Display(arr);
    }
}
