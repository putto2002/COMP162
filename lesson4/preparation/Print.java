/**
 * A representation of a print subclasses Art
 * @author Put Suthisrisinlpa
 * @see Art
 */
public class Print extends Art {
    private int numberMade;

    /**
     * Contructor Print
     * @param wd width of the print
     * @param ht height of the print
     * @param num number of print made
     * @param value value of print
     */

    public Print(int wd, int ht, int num, int value) {
        super(wd, ht, value);
        this.numberMade = num;
    }

    
}
