package uvsq.pglp_4_2.pglp_4_2;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class OperationsTest extends TestCase {
	

    @Test
    public void testMoinsOperation() throws IllegalOperator {
        float resultat = Operation.MOINS.eval((float) 5, (float) 10);
        Assert.assertEquals((float) 5, resultat);
    }
    
    @Test
    public void testPlusOperation() throws IllegalOperator {
        float resultat = Operation.PLUS.eval((float) 10, (float) 5);
        Assert.assertEquals((float) 15, resultat);
    }

    @Test
    public void testMultOperation() throws IllegalOperator {
        float resultat = Operation.MULT.eval((float) 10, (float) 5);
        Assert.assertEquals((float) 50, resultat);
    }

    @Test
    public void testDivOperation() throws IllegalOperator {
        float resultat = Operation.DIV.eval((float) 5, (float) 10);
        Assert.assertEquals((float) 2, resultat);
    }

    @Test
    public void testGetPlusFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('+'), Operation.PLUS);
    }

    @Test
    public void testGetMoinsFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('-'), Operation.MOINS);
    }


    @Test
    public void testGetDivFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('/'), Operation.DIV);
    }
    
    @Test
    public void testGetMultFromValue() {
        Assert.assertEquals(Operation.getOpFromValue('*'), Operation.MULT);
    }

    @Test
    public void testContainsPlus() {
        Assert.assertEquals(Operation.contains('+'), true);
    }

    @Test
    public void testContainsMoins() {
        Assert.assertEquals(Operation.contains('-'), true);
    }

    @Test
    public void testContainsMult() {
        Assert.assertEquals(Operation.contains('*'), true);
    }

    @Test
    public void testContainsDiv() {
        Assert.assertEquals(Operation.contains('/'), true);
    }

    //test de dévision par zero de 5
    @Test(expected = IllegalOperator.class)
    public void testDivisionByZero() throws Exception {
        Operation.DIV.eval(5, 0);
        
    }

}
