
public class Pair<TheType extends Comparable<TheType>> {

    private TheType firstVal;
    private TheType secondVal;

    /* Type the code for The constructor here. */
    public Pair(TheType firstVal, TheType secondVal) {
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }

    public String toString() {
        return "[" + firstVal + ", " + secondVal + "]";
    }

    // Implement Comparable's expected compareTo()
    public int compareTo(Pair<TheType> otherPair) {
        int result = firstVal.compareTo(otherPair.firstVal);
        if (result != 0) {
            return result;
        }
        return secondVal.compareTo(otherPair.secondVal);
    }

    // Return '<', '=', or '>' according to the ordering of this pair and otherPair
    public char comparisonSymbol(Pair<TheType> otherPair) {
        int result = this.compareTo(otherPair);
        if (result < 0) {
            return '<'; 
        }else if (result > 0) {
            return '>'; 
        }else {
            return '=';
        }
    }

}
