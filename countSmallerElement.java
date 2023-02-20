package Com.WeeklyReview3;

public class countSmallerElement {
    public static int countSmallest(int [] arr){
        int countSmallest = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            if (smallest>arr[i]){
                smallest = arr[i];
                countSmallest++;
            }
        }
        System.out.println("total smallest element : " + countSmallest);
        return smallest;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,3,5,1,2};
        System.out.println("smallest element is: " + countSmallest(arr));
    }
}
