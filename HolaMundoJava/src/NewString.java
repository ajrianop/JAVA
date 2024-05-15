public class NewString {
    public static void main(String[] args) {
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        // As variables, the two variables are the same
        System.out.println(literalString1 == literalString2);
        
        // As an object, we have that unless we have the same characters, the object string are not equal
        System.out.println(objectString1 == objectString2);
    }
}
