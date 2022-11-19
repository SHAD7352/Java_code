import java.util.Scanner;
public class Calculate_Percentage_Of_Marks {
    public static void main(String [] args){
        System.out.println("Enter Your physics number :-");
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        System.out.println("Enter your chemistry number :-");
        int chemistry = sc.nextInt();
        System.out.println("Enter your math number :- ");
        int math = sc.nextInt();
        System.out.println("Enter your english number :-");
        int english = sc.nextInt();
        System.out.println("Enter your hindi number :-");
        int hindi = sc.nextInt();
        int sum = physics+chemistry+math+english+hindi;
        float percentage = sum/5;
        System.out.print("Your total percentage :- ");
        System.out.print(percentage);

    }
}
