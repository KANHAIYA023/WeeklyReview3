package Com.WeeklyReview3;

public class EvenFibbNumber {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int n = 5;  //nth number of fibonacci series
        System.out.print(n1 + " " + n2); //printing 0 and 1

        for (int i = 0; i < n*2; i++) {
            n3 = n1 + n2;
            //  System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;


            n3 = n1 + n2;
            if (n3%2==0){
                System.out.print(n3 + " ");
            }
        }
    }
}
