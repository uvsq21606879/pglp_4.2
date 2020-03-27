package uvsq.pglp_4_2.pglp_4_2;

public class CommandeUndo implements Commande {


	@SuppressWarnings("static-access")
	public void exec(MoteurRPN RPN) {
		
		
		float lastResult = (Float) RPN.getOperands().pop();
		float lastSav  = RPN.operandHistorique.pop();
		
		Operation o = RPN.operationHistorique.pop();
	
		Operation io = getInverse(o);
		
		
		try {
			RPN.operands.push(io.eval(lastSav, lastResult));
		} catch (IllegalOperator e) {
			
			e.printStackTrace();
		}
	
		RPN.operands.push(lastSav);
	}
	
	public Operation getInverse(Operation o) {
		if(o.symbole == '+') return Operation.MOINS;
		if(o.symbole == '-') return Operation.PLUS;
		if(o.symbole == '/') return Operation.MULT;
		if(o.symbole == '*') return Operation.DIV;
		return null;
	}
	
	
}
