
/**
 * representation of a pieace of art work 
 * @author Put Suthisrisinlpa
 */
public class Art{
    protected int height;
    protected int width;
    protected int value;

    /**
     * Contructor for Art
     * @param wd width of art work
     * @param ht height of art work
     * @param valu value of the art work
     */

    public Art(int wd, int ht, int valu){
        this.width = wd;
        this.height = ht;
        this.value = valu;
    }

}