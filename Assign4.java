/**
 * Original program contains errors.
 * Add your name to this comment.
 * @author Jorge Soto-Ventura
 * Document the problems you found in comments, i.e., describe what
 * caused the problem in comments.  Make clear that you understand the
 * issues and.  Comment out the original and write the corrected code.
 * 
 * Make as few changes to the code as necessary to make the code work.
 */
public class Assign4 {

    // instance variable
    //public int oneVar;
    // Use private int instead of public int because in order to follow good black box coding practice. Also hides state from others.
    private int oneVar;

    // constructor
    //public Assign4( param ) { forgot to add a variable to the paramenter. Fixed by declaring param an int
    public Assign4( int param) {
        //oneVar = param;
        this.oneVar = param;
        //return this; Cannot return in constructor so removed.

    }

    // an accessor method
    //public getOneVar() { Does not have a variable declaration fixed by adding String.
    public int getOneVar() {
    
        return oneVar;
    }

    // a mutator method
    public int increment() {
        // oneVar++; Forgot return statement so nothing would return. Added return to fix error.
        return oneVar++;
    }
    
    public static void main(String[] args) {
        Assign4 assign4Var = new Assign4(8);

        //System.out.println("assign4Var's oneVar is " + assign4Var.getOneVar();  getOneVar does not have all parenthesises needed. Added one in order to fix error
        System.out.println("assign4Var's oneVar is " + assign4Var.getOneVar());

	assign4Var.increment();
	
        int actualValue = assign4Var.getOneVar();
        int expectedValue = 9;

	System.out.println("assign4Var's incremented oneVar is " + actualValue);
	
        if( actualValue != expectedValue ) {
            System.out.println("Error incrementing oneVar!");   
        }
    }

}
