package ex;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame {
	double n1, n2, n3;
	
	JLabel lbln1 = new JLabel("Nota 1");
	JLabel lbln2 = new JLabel("Nota 2");
	JLabel lbln3 = new JLabel("Nota 3");
	JLabel lblmedia = new JLabel("Média");
	
	JTextField txtn1 = new JTextField();
	JTextField txtn2 = new JTextField();
	JTextField txtn3 = new JTextField();
	JTextField txtmedia = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	
	
	public Interface(){
		Calculos calc = new Calculos();
		
		Container paine = this.getContentPane();
		
		paine.add(lbln1); // label
		lbln1.setBounds(20,20,245,40);
		
		paine.add(txtn1);// caixa
		txtn1.setBounds(80,30,140,20);
		
		paine.add(lbln2);// label
		lbln2.setBounds(20,100,245,40);
		
		paine.add(txtn2);// caixa
		txtn2.setBounds(80,110,140,20);
		
		paine.add(lbln3);// label
		lbln3.setBounds(20,140,245,40);
		
		paine.add(txtn3);// caixa
		txtn3.setBounds(80,150,140,20);
		
		
		paine.add(lblmedia);// label
		lblmedia.setBounds(20,180,245,40);
		
		paine.add(txtmedia);// caixa
		txtmedia.setBounds(80,190,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 n1 = Double.parseDouble(txtn1.getText());
				 n2 = Double.parseDouble(txtn2.getText());
				 n3 = Double.parseDouble(txtn3.getText());
				 txtmedia.setText("" + calc.media(n1, n2, n3));
				 
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtmedia.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]){
		
		Interface inte = new Interface();
	}
	
}
