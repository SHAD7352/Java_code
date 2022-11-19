public class Lec_27_Arrays {
    public static void main(String[] args) {
        int [] marks = {90,80,40,40,88};
        float[] mark = {40.4f,30.0f,20.4f,80};
        String [] name = {"shad","asif","Chandan"};
        System.out.println(marks.length); // Show total no of length of the array

        // Displaying the Array (Naive Way)
        System.out.println("Displaying the Array (Naive Way)");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        // And so on
        // may be 500 value then this type print not possible

        // Displaying the Array using for loop!

        System.out.println("Displaying the Array using for loop!");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        // Displaying array in the reverse order using for loop !

        System.out.println("Displaying array in the reverse order using for loop !");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array using (for each - loop)
        System.out.println("Displaying the Array using (for each - loop)");
        for(int element: marks){
            System.out.println(element);
        }


    }
}
