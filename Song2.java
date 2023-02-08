// author : shamar Gordon
// duedate : 02/06/2023
// purpose : to create a song using methods
//Assumptions : #2
//section :4

package Assignments; // package name

public class Song2 {


    // main method
    public static void main (String[] avg) {
        cat();                  // call the cat method
        hen();                  // call the hen method
        duck();                 // call the duck method
        goose();                // call the goose method
        sheep();                 // call the sheep method
        pig();                  // call the pig method 
    

    }

     // verses method
    private static void verses1() { 

        System.out.print("Cat goes fiddle-i-fee.");
    }

    // verses2 method
    private static void verses2() {

        System.out.println("Hen goes chimmy-chuck, chimmy-chuck");
        verses1();
    }  // verses3 method
    public static void verses3 () {

        System.out.println("Duck goes quack, quack,");
        verses2();
    }
      // verses4 method
    public static void verses4 () {

       
        System.out.println("Goose goes hissy, hissy");
        verses3();
    }
        // verses5 method
    public static void verses5() {
        
        System.out.println("Sheep goes baa, baa,");
        verses4();
    } 

  
     // cat method
    public static void cat() {

        System.out.println("\nBought me a cat and the cat pleased me, \n" + 
        "I fed my cat under yonder tree");
         
     verses1();
        System.out.println();

    }
     // hen method 
    public static void hen() {

        System.out.println("\nBought me a hen and the hen pleased me,\n" +  
        "I fed my hen under yonder tree "); 

        
     verses2();
        System.out.println(); // print a blank line

        
    }
      // duck method
    public static void duck() {

        System.out.println("\nBought me a duck and the duck pleased me,\n" +  
        "I fed my duck under yonder tree "); // print the first line of the song

     verses3();
        System.out.println();
    }

      // goose method
    public static void goose() {

        System.out.println("\nBought me a goose and the goose pleased me,\n" +  
        "I fed my goose under yonder tree "); 
        
        verses4();

        System.out.println(); // print a blank line
    

    }

     // sheep method
    public static void sheep() {

        System.out.println("\nBought me a sheep and the sheep pleased me,\n" +  
        "I fed my sheep under yonder tree ");


        verses5();
        System.out.println(); // print a blank line

    }

     // pig method
    public static void pig() {

        System.out.println("\nBought me a pig and the pig pleased me,\n" + 
         "I fed my pig under yonder tree \n" + "Pig goes oink, oink,");


        verses5();  // call the verses5 method
        System.out.println();  // print a blank line


    }


    
}
