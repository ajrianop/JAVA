
public class Concatenation {

    public static void main(String args[]) {
        var user = "Jose";
        var title = "Professor";

        var union = title + " " + user;
        System.out.println("union = " + union);

        var i = 12;
        var j = 5;
        System.out.println(i + j);
        // Concatenate the sum of the numbers and the string
        System.out.println(i + j + " " + user);
        // Concatenate all the values as string
        System.out.println(user + " " + i + j);
        // Concatenate the sum in the brackets and then concatenate with the string
        System.out.println(user + " " + (i + j));

        // Newline
        System.out.println("My name is: \n" + user);
        // Tabulate
        System.out.println("My age is: \t" + 25);
        // Retrocess (Note that avoid the previous characater)

        System.out.println("Retrocess: k\b" + "The end");
        var mom = "Jane"; // Simple quotetation mark 
        System.out.println("My mom is \'" + mom + "\'");
        var dad = "Ben"; // Quotetation mark
        System.out.println("My dad is \"" + dad + "\"");
    }
}
