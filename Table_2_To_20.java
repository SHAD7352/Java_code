import java.util.*;
public class Table_2_To_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter table no:- ");
        int n = sc.nextInt();
        if(n>=2 && n<=20){
            for(int i=1; i<=10; i++){
                System.out.printf("%d x %d = %d\n", n,i, n*i);
            }


        }

    }
}




