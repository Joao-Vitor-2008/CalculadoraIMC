package Executaveis;

import javax.swing.JOptionPane;

public class Exec {

	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog(null, "Informe seu peso");
		String alturaCm = JOptionPane.showInputDialog(null, "Informe sua altura em centímetros");
		
		float alturaM = Float.valueOf(alturaCm) / 100;
		
		float imc = Float.valueOf(peso) / (Float.valueOf(alturaM) * Float.valueOf(alturaM));
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do normal\nIMC : " + imc);
		} else if (imc >= 18.6 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Normal\nIMC : " + imc);
		} else if (imc >= 25 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "Sobrepeso\nIMC : " + imc);
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade\nIMC : " + imc);
		}
	}

}
