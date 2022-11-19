import java.util.Locale;

public class Lec15_ps1 {
    public static void main(String [] args){
        // Problem no 1
        //String name = "Harry Potter";
        //name = name.toLowerCase(Locale.ROOT);
        //System.out.println(name);

        // Problem no 2
        //String text = "To Lower Case ";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem no 3
        String latter = "Dear <|name|> Thanks a lot";
        latter = latter.replace("<|name|>","shad");
        System.out.println(latter);

        // Problem no 4
        String myString = "This string contain double and  triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));

        // Problem no 5

        String myLatter = "Dear shad , this is java course is nice.\n \t Thanks!";
        System.out.println(myLatter);
    }
}
