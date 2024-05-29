public class ReplacingStrings{
    public static void main(String[] args) {
        String str1 = "Today is Monday";

        System.out.println(str1.replace("Monday", "Friday"));
        // Note that this method don't change the structure of the String str1
        System.out.println(str1);

        // To replace and save the variable with the changes, we use
        String UpdatedStr = str1.replace("Monday", "Sunday");
        System.out.println(UpdatedStr);
    }
}