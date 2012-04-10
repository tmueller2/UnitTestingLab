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
public class ProductTest {
    private Product instance;
    
    public ProductTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        instance = new Product();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }


    /**
     * Test of setProdId method, of class Product.
     */
    @Test
    public void testSetProdId() {
        System.out.println("setProdId");
        String prodId = "Mits-X102Y450P1";
        instance.setProdId(prodId);
        int expectedResults = 15;
        int results = prodId.length();
        assertEquals(expectedResults,results);
    }

    /**
     * Test of setUnitCost method, of class Product.
     * Must be greater than zero
     */
    @Test
    public void testSetUnitCost() {
        System.out.println("setUnitCost");
        double unitCost = 10.0;
        instance.setUnitCost(unitCost);
        double expectedResults = 10.0;
        double results = instance.getUnitCost();
        assertEquals(expectedResults,results,4);
       
    }

}
