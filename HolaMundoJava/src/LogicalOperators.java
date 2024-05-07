public class LogicalOperators {
    public static void main(String[] args){
        int age = 34;

        // age most than 18 and less than 50
        System.out.println(age > 18 && age < 50) ;

        boolean isStudent = false;
        boolean isLibraryMember = true;

        // See if the person is a student or if is a library member
        System.out.println(isStudent || isLibraryMember) ;  


        // Not operator
        System.out.println(!isStudent);

    }
}
