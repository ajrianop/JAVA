import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){
        System.out.println("Proporcionar el titulo: ");
        Scanner console= new Scanner(System.in);
        var title = console.nextLine();
        System.out.println("Proporcionar el autor ");
        var autor = console.nextLine();
        System.out.println(title + " fue escrito por " + autor);
    }
}

