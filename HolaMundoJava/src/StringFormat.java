public class StringFormat {
    public static void main(String[] args) {

        // If we want to use the String format we need to specify to call each variables as follows:
        // String --> %s
        // Integer --> %d
        // Double or float  --> %f
        // Char --> %c
        // Booleans --> %b

        String day = "Monday";
        int number_day = 16;
        String month = "June";
        double temperature = 12.4;
        
        String formattingString = String.format("Today is %s %d of %s, with temperature %f C", day, number_day, month, temperature);

        System.out.println(formattingString);

        
        int a = 2;
        int b = 3;
        boolean c;
        c = (a == b);
        String stringWithRelation = String.format("Is %d equal to %d => %b", a,b,c);
        System.out.println(stringWithRelation);

    }
}
