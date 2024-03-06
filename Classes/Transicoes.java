package Classes;

import java.util.Scanner;

public class Transicoes {
	private String vetaux[] = new String [3];
	Scanner s = new Scanner (System.in);
	
	public Transicoes (String estadofuturo, String alfabetofuturo, String direção) {
		this.vetaux[0] = estadofuturo;
		this.vetaux[1] = alfabetofuturo;
		if (direção.equalsIgnoreCase("D") || direção.equalsIgnoreCase("E") || direção.equalsIgnoreCase("x")) this.vetaux[2] = direção;
		else {
			int teste = 0;
			while (teste == 0) {
			System.out.print("A direção informada não é valida, digite D ou E: "); this.vetaux[2]=s.next();
			if (this.vetaux[2].equalsIgnoreCase("D") || this.vetaux[2].equalsIgnoreCase("E") || this.vetaux[2].equalsIgnoreCase("x")) teste = 1;
			}
		}
	}

	public String[] getVetaux() {
		return vetaux;
	}

	public void setVetaux(String[] vetaux) {
		this.vetaux = vetaux;
	}
	
	
}
