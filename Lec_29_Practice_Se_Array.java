
//Create an array of 5 float and calculate their sum

public class Lec_29_Practice_Se_Array {
    public static void main(String[] args) {
        // Problem no 1
        float [] marks = {10.0f,20.0f,30.0f,40.0f,50.0f};
        float sum = 0;
        for (float element: marks){
            sum = sum + element;
        }
        System.out.println(sum);

        // Problem no 2
        /* write a program to find out whether a given integer is present in array or not !

         */
        System.out.println("Problem no 2");
        float [] ar = {10.0f,15.0f,20.0f,25.0f,30.0f};
        float num = 10.0f;
        boolean isInArray = false;
        for(float element: ar){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The valur is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");

        }
        // Problem no 3
        /* Calculate the average marks than an array containing marks if all students in physics using for-each loop!

         */
        System.out.println("Problem no 3");
        float  [] result ={30,40,50,60,70};
        float avg = 0;
        for(float element: result){
            avg = avg + element;
        }
        System.out.println("The value of average result is " + avg/ result.length);

        // Problem no 4

        int [][] mat1  = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{7,8,9},{10,11,12}};
        int [][] mat3 = {{13,14,15},{16,17,18}};

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){

            }
        }




    }
}
