public class ComparStringMethods {
    public static void main(String[] args) {
        String str1 = new String("juan");
        String str2 = new String("juan");
        // We can note that the two string are the same, but using the string method are considered different as an object.
        System.out.println(str1 == str2);
        // Now if we use the method equal, the result is true
        System.out.println(str1.equals(str2));
        //To ignore the capital letters we can use the method equalIgnoreCase
        String str3 = new String("Juan");
        System.out.println(str1.equalsIgnoreCase(str3));
    
    }
}
