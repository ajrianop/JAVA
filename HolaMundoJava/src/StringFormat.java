public class StringFormat {
    public static void main(String[] args) {
        String day = "Monday";
        int number_day = 16;
        String month = "June";
        double temperature = 12.4;
        
        String formattingString = String.format("Today is %s %d of %s, with temperature %f C", day, number_day, month, temperature);

        System.out.println(formattingString);

    }
}
