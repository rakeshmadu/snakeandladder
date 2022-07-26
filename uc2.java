import java.util.*;
public class Uc2 {

	// Use method to roll die
    static void rolldie() {
	    int min=1;
	    int max=6;
	    int Number= (int) Math.floor(Math.random()*(max-min)+min);
	
	    System.out.println("Die_number = "+Number);
    }

    public static void main(String[] args) {

	    // Function call
        rolldie();
    }
}
