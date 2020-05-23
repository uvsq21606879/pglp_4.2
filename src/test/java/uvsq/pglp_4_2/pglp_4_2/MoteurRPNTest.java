package uvsq.pglp_4_2.pglp_4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
    public void testAddOperand() throws Exception {

        MoteurRPN.addOperand(-50);
        MoteurRPN.addOperand(7);
        MoteurRPN.addOperand(8);
        MoteurRPN.addOperand((float) - 1.3);
        MoteurRPN.addOperand(10);
        MoteurRPN.addOperand(0);
        assertEquals(8,MoteurRPN.getOperands().size());
	}

    @Test(expected = NumberFormatException.class)
    public void EmptyString() throws Exception {
        String string = " ";
        MoteurRPN.addOperand(Float.parseFloat(string));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertionnull() throws Exception {
        String string = "";
        Operation.contains(string.charAt(0));
    }

    
    @Test(expected = IllegalOperator.class)
    public void testDivisionByZero() throws Exception {
        float op1 = 10;
        float op2 = 0;
        MoteurRPN.addOperand(op1);
        MoteurRPN.addOperand(op2);
        Operation.DIV.eval(op2, op1);
    }

    @Test(expected = IllegalOperator.class)
    public void testDivZeroparZero() throws Exception {
        float opr1 = 0;
        float opr2 = 0;
        MoteurRPN.addOperand(opr1);
        MoteurRPN.addOperand(opr2);
        Operation.DIV.eval(opr1, opr2);
    }

}
