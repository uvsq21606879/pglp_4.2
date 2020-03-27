package uvsq.pglp_4_2.pglp_4_2;

public class CommandeCalcul {
	
	public void exec(CommandRPN RPN) {
		
		try {
			RPN.calculOperation();
		}
		catch(Exception E) {
			System.err.println(E.getMessage());
		}
	}	
	
}
