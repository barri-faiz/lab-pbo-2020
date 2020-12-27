
/**
 * Kelas untuk mencoba projek makhluk-hidup
 * 
 * @author Viska
 * @version 4 December 2012
 */
public class CobaMakhlukHidup
{
    
    /**
     * Method main untuk mencoba kelas makhluk hidup, Manusia dan Hewan
     * 
     * 
     */
    public static void main (String args[])
    {
        Manusia mnsia = new Manusia();
        Hewan hwan = new Hewan();
        
        mnsia.bernapas();
        mnsia.makan();
        mnsia.berjalan();
        
        hwan.bernapas();
        hwan.makan();
        hwan.berjalan();
    }
}
