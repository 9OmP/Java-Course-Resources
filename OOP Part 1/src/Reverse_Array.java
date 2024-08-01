public class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        System.out.print("Reversed array: ");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
