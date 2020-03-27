package uvsq.pglp_4_2.pglp_4_2;

public class CommandeCalcul implements Commande {
	
	public void exec(MoteurRPN RPN) {
		
		try {
			RPN.calculOperation();
		}
		catch(Exception E) {
			System.err.println(E.getMessage());
		}
	}	
	
}
