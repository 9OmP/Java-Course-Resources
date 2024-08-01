import java.util.ArrayList;

public class Frequency_Of_Elements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 10, 20, 30, 30};
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(arr[0]);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < unique.toArray().length; j++){
                if(unique.contains(arr[i])){
                    continue;
                }else{
                    unique.add(arr[i]);
                }
            }
        }
        System.out.println(unique);



    }
}
