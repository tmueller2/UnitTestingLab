/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author tmueller2
 */
public class CustomerTest {
    private Customer instance;
    
    
    
    @Before
    public void setUp() {
        // Insead of initializing in each test, just do it here
        // Declaration is above.
        instance = new Customer();
    }
    
    @After
    public void tearDown() {
        // clean up after yourself!
        instance = null;
    }


    /**
     * Test of setPhone method, of class Customer.
     * The phone number must be 12 characters
     * ex.  ###-###-#### 
     *      262-888-7777   
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        
        String phone = "262-888-7777";
        //elminated this because created it globally
        //Customer instance = new Customer();
        instance.setPhone(phone);
        int expResult = 12;
        int result = phone.length();
        assertEquals(expResult,result);
        //moved to Customer because should be testing for the exception there
//        if(phone.charAt(3) != '-' || phone.charAt(7) != '-') {
//            fail("The set phone number failed.");
//        }
     }
    
    /**
     * Test of State must be 2 characters
     * 
     */
    @Test
    public void testSetState(){
        String state = "WI";
        instance.setState(state);
        int expResult = 2;
        int result = state.length();
        assertEquals(expResult,result);
    }


}
