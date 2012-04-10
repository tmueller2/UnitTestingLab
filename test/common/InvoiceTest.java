/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author tmueller2
 */
public class InvoiceTest {
    
    public InvoiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDiscountedTotal method, of class Invoice.
     */
    @Test
    public void testGetDiscountedTotal() {
        System.out.println("getDiscountedTotal");
        Invoice instance = new Invoice(new Customer("Bob Jones","262-444-555"));
        instance.addLineItem(new Product("Mitts-X102Y450P1","Mistubishi Power Feeder",110.00), 5);
        double expResult = 550.0;
        double result = instance.getDiscountedTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDiscount method, of class Invoice.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        Invoice instance = new Invoice(new Customer("Bob Jones","262-444-555"));
        instance.addLineItem(new Product("Mitts-X102Y450P1","Mistubishi Power Feeder",110.00), 5);        
        double expResult = 0.1;
        double result = instance.getDiscount();
        assertEquals(expResult, result, 0.0);
    }



}
