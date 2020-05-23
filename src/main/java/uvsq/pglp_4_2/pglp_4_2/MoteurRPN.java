package uvsq.pglp_4_2.pglp_4_2;

import java.util.Stack;
public class MoteurRPN {

	
	public static Stack<Float> operands = new Stack<Float>();
	public static Stack<Float> operandHistorique = new Stack<Float>();
	public static Stack<Operation> operationHistorique = new Stack<Operation>();
	protected static Boolean lecture = true;
	
	public void lectureOff() {
		lecture=false;
	}
	
	public Boolean getLecture() {
		return lecture;
	}
	
	public static void addOperand(float op){
		operands.push(op);
	}
	
	public void calculOperation() throws Exception{
		
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
	
	
	public static Stack<Float> getOperands() {
        return operands;
    }
	
	 public String afficherExpression() {
	        if (operands.size() > 0) {
	            return "Expression courante :\n	"+operands.size() + " operande restant : " + operands.toString() + "\n";
	        }

	        return "la pile est vide";
	    }
	
}
