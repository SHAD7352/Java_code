public class Lec_28_Multi_dim_Arrays {
    public static void main(String[] args) {
        int [] marks; // 1-D Array
        int [][] flat ; // 2-D Array

        flat = new int[2][3];
        flat[0][0] = 1;
        flat[0][1] = 2;
        flat[0][2] = 3;
        flat[1][0] = 4;
        flat[1][1] = 5;
        flat[1][2] = 6;

        // Displaying the 2D Array using For loop

        for(int i=0; i<flat.length; i++){
            for (int j=0; j<flat[i].length; j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }



    }
}
