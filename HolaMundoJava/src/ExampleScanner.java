import java.util.Scanner;

public class ExampleScanner {
    public static void main(String args[]){
        System.out.println("Write your name: ");
        // To use the console to save information
        Scanner console= new Scanner(System.in);
        var user = console.nextLine();
        System.out.println("user = " + user);
        System.out.println("Write the title:");
        var title = console.nextLine();
        System.out.println("title = " + title + " "+ user);
    }
}
