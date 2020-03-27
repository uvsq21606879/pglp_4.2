package uvsq.pglp_4_2.pglp_4_2;

public class CommandeExit implements Commande  {
	
	@SuppressWarnings("static-access")
	public void exec(MoteurRPN RPN) {
		RPN.lectureOff();
	}
	
}
