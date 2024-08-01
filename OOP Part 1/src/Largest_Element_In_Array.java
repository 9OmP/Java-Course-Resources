public class Largest_Element_In_Array {

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}