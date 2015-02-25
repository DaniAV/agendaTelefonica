import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> agenda; 

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
      
    }

    /**
     * Metodo que permite introducir un contacto a la agenda
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }
    
    /**
     * Muestra el número asociado al nombre dado
     */
    public void lookupNumber(String name)
    {
        System.out.println(name + " : " + agenda.get(name));
    }
    
    /**
    * Print all keys
    */
   public void printAllNames()
   {
       System.out.println(agenda.keySet());
   }
    
}
