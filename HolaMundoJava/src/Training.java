/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Training {
    public static void main(String args[]){
        //We define the value of a variable
        int myIntegerVariable = 10;
        System.out.println(myIntegerVariable);
        // We modify the value of our variable
        // We cannot define again our variable
        myIntegerVariable = 5;
        System.out.println(myIntegerVariable
        );
        
        String myVariable = "Hi darlings";
        System.out.println(myVariable);
        myVariable = "Bye";
        System.out.println(myVariable);
        
        // var - infers what kind of data do you have
        var myVariable2 = 15;
        System.out.println(myVariable2);
        System.out.println("myVariable2 = " + myVariable2);
        
        var myName="Andres";
        System.out.println("My name is : " + myName);
        
        
    }
}
