/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author chris
 */
public class InvalidNameException Extends Exception {
            private String error_msg = "Wrong Info Entered. ";

       public InvalidNameException(String message, Throwable cause) {
        super(error_msg, cause);
    }

    public InvalidNameException(String message) {
        super(error_msg);
    }

    public InvalidNameException() {
        super(error_msg);
    }
            
            
            
  
    
    
}
