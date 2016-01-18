import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Problema2 extends JFrame implements ActionListener{
	public JLabel rescalculado = new JLabel("");
	public JLabel axial = new JLabel("");
	public JLabel cortante = new JLabel("");
	public JLabel fletor = new JLabel("");
	public JLabel posfinal = new JLabel("");
	public JFrame frame = new JFrame("2ª Aplicação");
	
	public void inicia(){
		JLabel pergunta1 = new JLabel("Seja o sistema estrutural mostrado na Figura 2 que consiste em");
		JLabel pergunta2 = new JLabel(" três barras de suspensão e uma viga rígida. Se as três barras de suspensão");
		JLabel pergunta3 = new JLabel("são feitas do mesmo material e têm áreas de seção transversal iguais A");
		JLabel pergunta4 = new JLabel("e a viga rígida ACE for submetifa à força P. Despreze o peso da viga e das barras.");
		JLabel pergunta5 = new JLabel("Calcule:");
		JLabel pergunta6 = new JLabel("a) o deslocamento axial em cada barra;");
		JLabel pergunta7 = new JLabel("b) o diagrama de esforço cortante para a viga ACE;");
		JLabel pergunta8 = new JLabel("c) o diagrama de momento fletor para a viga ACE;");
		JLabel pergunta9 = new JLabel("d) uma representação gráfica da posição final da viga ACE carregada.");
		JPanel panel = new JPanel();
		JLabel info = new JLabel("Insira valores utilizando o SI");
		JLabel ptext = new JLabel("Força P = ");
		TextField P = new TextField(5);
		JLabel dtext = new JLabel("Distância d = ");
		TextField d = new TextField(5);
		JLabel Atext = new JLabel("Área da seção transversal A = ");
		TextField A = new TextField(5);
		JLabel Ltext = new JLabel("Comprimento da barra L = ");
		TextField L = new TextField(5);
		JButton calcularButton = new JButton("Calcular !");
		calcularButton.addActionListener(this);
		panel.add(pergunta1);
		panel.add(pergunta2);
		panel.add(pergunta3);
		panel.add(pergunta4);
		panel.add(pergunta5);
		panel.add(pergunta6);
		panel.add(pergunta7);
		panel.add(pergunta8);
		panel.add(pergunta9);
		panel.add(info);
		panel.add(ptext);
		panel.add(P);
		panel.add(dtext);
		panel.add(d);
		panel.add(Atext);
		panel.add(A);
		panel.add(Ltext);
		panel.add(L);
		panel.add(calcularButton);
		panel.add(rescalculado);
		panel.add(axial);
		panel.add(cortante);
		panel.add(fletor);
		panel.add(posfinal);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 1000);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
        this.calcula();
}
	
	public void calcula(){
		rescalculado.setText("Resultado Calculado #SQN");
		axial.setText("a) Trocar por deslocamento axial em cada barra;");
		cortante.setText("b) Trocar por o diagrama de esforço cortante para a viga ACE;");
		fletor.setText("c) Trocar por o diagrama de momento fletor para a viga ACE;");
		posfinal.setText("d) Trocar por uma representação gráfica da posição final da viga ACE carregada.");
	}
	
	public static void main(String[] args) {
		Problema2 aplicacao2 = new Problema2();
		aplicacao2.inicia();		
	}

}

