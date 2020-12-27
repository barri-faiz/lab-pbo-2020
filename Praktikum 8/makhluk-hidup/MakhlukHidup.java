
/**
 * Abstract class MakhlukHidup - write a description of the class here
 * 
 * @author Viska
 * @version 23 des 2011
 */
public abstract class MakhlukHidup
{
    
    /**
     * Method kongkrit bernapas
     * 
     */
    public void bernapas()
    {
        System.out.println("Makhluk hidup bernapas...");
    }
    
    /**
     * Method kongkrit makan
     * 
     */
    public void makan()
    {
        System.out.println("Makhluk hidup makan...");
    }
    
    /**
     * Method abstract berjalan yg wajib di override oleh subkelas
     * 
     */
    public abstract void berjalan();
    
}
