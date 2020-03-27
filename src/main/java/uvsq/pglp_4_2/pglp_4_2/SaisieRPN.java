package uvsq.pglp_4_2.pglp_4_2;

import java.util.Scanner;

public class SaisieRPN {
		
	static MoteurRPN MoteurRPN = new MoteurRPN();
	static Interpreteur interpreteur = new Interpreteur();
	private static Scanner sc;
	
    public static void InputeStart() throws Exception {

        sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (MoteurRPN.getLecture()) {
        	Interpreteur.exec(MoteurRPN, str);
            str = sc.nextLine();
            
        }

        System.out.println(MoteurRPN.afficherExpression() + ".");
    }
	
}
