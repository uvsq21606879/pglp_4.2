package uvsq.pglp_4_2.pglp_4_2;

import java.util.Stack;
public class CommandRPN {

	public static Stack<Float> operands = new Stack();
	public static Stack<Float> operandHistorique = new Stack();
	public static Stack<Operation> operationHistorique = new Stack();
	protected static Boolean lecture = true;
	
	public static void lectureOff() {
		lecture=false;
	}
	
	public static void addOperand(float op){
		operands.push(op);
	}
	
	public static void CalculOperation() throws Exception{
		
		try {
    	
        	float a = operands.pop();
        	float b = operands.pop();
        	operandHistorique.push(a);
        	Operation o = operationHistorique.peek();
        
            operands.push(o.eval(a, b));
    	}catch(Exception E) {
    		System.err.println(E.getMessage());
    	}
	}
	
	public static Stack getOperands() {
        return operands;
    }
	
	 public static String showCurentExpression() {
	        if (operands.size() > 0) {
	            return "Expression courante :\n	"+operands.size() + " operande restant : " + operands.toString() + "\n";
	        }

	        return "la pile est vide";
	    }
	
}
