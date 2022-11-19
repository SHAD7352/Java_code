public class Lec_24_break_and_continue {
    public static void main(String[] args) {
        // Break and Continue using loops !

//        for(int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("java is great ");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
        // continue Statement !

        for(int i = 0; i<5; i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;

            }
            System.out.println(i);
            System.out.println("java the great programming language");

        }





    }
}
