// author : shamar Gordon
// duedate : 02/06/2023
// purpose : to create a song using methods
//Assumptions : #2
//section :4

package Assignments;

public class Song {


    // main method
    public static void main (String[] avg) {
        cat();                  // call the cat method
        hen();                  // call the hen method
        duck();                 // call the duck method
        goose();                // call the goose method
        sheep();                 // call the sheep method
         pig();                  // call the pig method 
    

    }

     
    private static void sentence() { 

        System.out.print("Cat goes fiddle-i-fee.");
    }


    private static void sentence2() {

        System.out.println("Hen goes chimmy-chuck, chimmy-chuck");
    
    }
    public static void sentence3 () {

        System.out.println("Duck goes quack, quack,");

    }

    public static void sectence4 () {

        System.out.println("Sheep goes baa, baa,");

    }

    public static void sectence5() {

        System.out.println("Goose goes hissy, hissy");
    }

  

    public static void cat() {

        System.out.println("\nBought me a cat and the cat pleased me, \n" + 
        "I fed my cat under yonder tree");
         
        sentence();
        System.out.println();

    }

    public static void hen() {

        System.out.println("\nBought me a hen and the hen pleased me,\n" +  
        "I fed my hen under yonder tree ");

        
        sentence2();
        sentence();
        System.out.println();

        
    }

    public static void duck() {

        System.out.println("\nBought me a duck and the duck pleased me,\n" +  
        "I fed my duck under yonder tree ");

        sentence3();
        sentence2();
        sentence();
        System.out.println();
    }


    public static void goose() {

        System.out.println("\nBought me a goose and the goose pleased me,\n" +  
        "I fed my goose under yonder tree ");
        
        sectence5();
        sectence4();
        sentence3();
        sentence2();
        sentence();
        System.out.println();
    

    }


    public static void sheep() {

        System.out.println("\nBought me a sheep and the sheep pleased me,\n" +  
        "I fed my sheep under yonder tree ");


        sectence5();
        sectence4();
        sentence3();
        sentence2();
        sentence();
        System.out.println();

    }


    public static void pig() {

        System.out.println("\nBought me a pig and the pig pleased me,\n" + 
         "I fed my pig under yonder tree \n" + "Pig goes oink, oink,");


        sectence5();
        sectence4();
        sentence3();
        sentence2();
        sentence();
        System.out.println();


    }






    
}
