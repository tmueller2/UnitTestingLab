/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author tmueller2
 */
public class LineItemTest {
    private LineItem instance;
    
    public LineItemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        // Insead of initializing in each test, just do it here
        // Declaration is above.
        instance = new LineItem();        
    }
    
    @After
    public void tearDown() {
        // clean up after yourself!
        instance = null;        
    }

    /**
     * Test of setUnitCost method, of class LineItem.
     */
    @Test
    public void testSetUnitCost() {
        System.out.println("setUnitCost");
        double unitCost = 10.0;
        instance.setUnitCost(unitCost);
        double expectedResults = unitCost * .03;
        double results = instance.getUnitCost();
        assertEquals(expectedResults, results,4);
    }
    
    /**
     * Test of setExtPrice method
     */
    @Test
    public void testSetExtPrice(){
        System.out.println("setExtPrice");
        double extPrice = 10.25;
        instance.setExtPrice(extPrice);
        double expectedResults = extPrice;
        double results = instance.getExtPrice();
        assertEquals(expectedResults,results,4);
    }

}
