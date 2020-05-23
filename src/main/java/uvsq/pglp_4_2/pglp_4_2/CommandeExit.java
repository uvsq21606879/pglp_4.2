package uvsq.pglp_4_2.pglp_4_2;

public class CommandeExit implements Commande  {
	
	
	public void exec(MoteurRPN RPN) {
		RPN.lectureOff();
	}
	
}
