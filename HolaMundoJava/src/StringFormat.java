public class StringFormat {
    public static void main(String[] args) {
        String day = "Monday";
        int number_day = 16;
        String month = "June";
        
        String formattingString = String.format("Today is %s %d of %s", day, number_day, month);

        System.out.println(formattingString);

    }
}
