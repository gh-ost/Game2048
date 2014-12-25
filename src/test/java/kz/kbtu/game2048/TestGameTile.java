/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.kbtu.game2048;

import java.awt.Color;
import junit.awtui.TestRunner;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import kz.kbtu.game2048.model.GameTile;

/**
 *
 * @author User
 */
public class TestGameTile extends TestCase {
    GameTile g1;
    GameTile g2;
    GameTile expected;
    GameTile result;
    public TestGameTile(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("* UtilsJUnit3Test: setUp() method");
        g1=new GameTile();
        g2=new GameTile(4);
       
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("* UtilsJUnit3Test: tearDown() method");
    }
    public void testIsEmpty(){
        assertEquals("Error: IsEmpty", true,g1.isEmpty());
        assertEquals("Error: IsEmpty", false,g2.isEmpty());
    }
    
     public void testGetForeground(){
        assertEquals("Error: getForeGround", new Color(0x776e65),g1.getForeground());
        assertEquals("Error: getForeGround", new Color(0x776e65),g2.getForeground());
    }
     public void testgetBackground(){
         assertEquals("Error: getBackground",new Color(0xede0c8), g2.getBackground());
     }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
 /*    public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestSuite suite = new TestSuite();
    suite.addTest(new TestClass(“testIsEmpty”));
    suite.addTest(new TestClass(“testGetForeground”));
    suite.addTest(new TestClass(“testgetBackground”));
    runner.doRun(suite);
}*/
}
