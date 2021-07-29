/**
 * A representation of a sculpture subclasses Art
 * @author Put Suthisrisinlpa
 * @see Art
 */
public class Sculpture extends Art {
    private int weight;
    private int depth;

    /**
     * Contructor for Sculpture
     * @param wd width of sculpture
     * @param ht height of sculpture
     * @param dpth depth of sculpture
     * @param wt weight of sculpture
     * @param value value of sculpture
     */
    public Sculpture(int wd, int ht, int dpth, int wt, int value){
        super(wd, ht, value);
        this.depth = dpth;
        this.weight = wd;

    }
    
}
