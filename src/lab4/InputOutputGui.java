package lab4;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        
        if(fullName == null){
            System.exit(0);
        }
        String lastName = "";
        try{
        lastName = nameService.extractLastName(fullName);
        }catch(InvalidNameException ine){
            JOptionPane.showMessageDialog(null, ine);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            System.out.println("Mehtod Ran");
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
