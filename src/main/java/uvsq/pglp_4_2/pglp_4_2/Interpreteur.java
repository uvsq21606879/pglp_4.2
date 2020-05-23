package uvsq.pglp_4_2.pglp_4_2;



public class Interpreteur {

	private static CommandeExit exit = new CommandeExit();
	private static CommandeUndo undo = new CommandeUndo();
	private static CommandeCalcul calcul = new CommandeCalcul();


	public static void exec(MoteurRPN RPN, String str) throws Exception {
		try {
			// pour exit
			if (str.toLowerCase().equals("exit") || str.toLowerCase().equals("quit")
					|| str.toLowerCase().equals("stop")) {
				exit.exec(RPN);
				System.out.println("les operands dans la pile " + MoteurRPN.getOperands().toString());
				System.out.println("les operations dans la pile " + MoteurRPN.operationHistorique.toString());
			}

			else
			// pour undo
			if (str.toLowerCase().equals("undo") || str.toLowerCase().equals("cancel")
					|| str.toLowerCase().equals("back")) {
				System.out.println("les operands avant " + MoteurRPN.getOperands().toString());
				undo.exec(RPN);
				
				System.out.println("les operands apres " + MoteurRPN.getOperands().toString());
				//exit.exec(RPN);
			}

			else {
				// appliquer une operation ou ajouter une nouvelle
				if ((str.length() == 1) && Operation.contains(str.charAt(0))) {

					MoteurRPN.operationHistorique.push(Operation.getOpFromValue(str.charAt(0)));
					calcul.exec(RPN);
					System.out.println("resultat : " + MoteurRPN.getOperands().peek());
				}

				else {
					MoteurRPN.addOperand(Float.parseFloat(str));
				}
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
