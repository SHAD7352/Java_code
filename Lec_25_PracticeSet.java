public class Lec_25_PracticeSet {
    public static void main(String[] args) {
        /* // Problem no 1

        int n = 4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();

        }



        // Piroblem no 2

        int sum = 0;
        int n = 4;
        for(int i=0; i<n; i++){
            sum = sum + (2*i); // print even numbers :- 0,2,4,6

        }
        System.out.println("even no of sum :-");
        System.out.println(sum);
        */

        // Problem no 3

       /* int n = 5;
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d ", n,i, n*i);
            System.out.println();
        }*/

       /* // Problem no 4

        int r = 10;
        for(int i=10; i>=1; i--){
            System.out.printf("%d X %d = %d\n ",r,i, r*i);

        }*/

        // Problem no 5

        int n = 5;
        int factorial = 1;
        for(int i=1; i<=5; i++){
            factorial *= i ;
            System.out.println(factorial);
        }


    }
}
