import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Brusio extends JFrame implements ActionListener{
	
	JFrame frame= new JFrame ("Registrazioni totali");
	
	JButton bv= new JButton ("VERDE");
	JButton bb= new JButton ("BLU");
	JButton br= new JButton ("ROSSO");
	JButton breg= new JButton ("REGISTRATI");
	JButton btot= new JButton ("REGISTRAZIONI TOTALI");
	
	JLabel label0= new JLabel ("REGISTRAZIONE");
	JLabel label1= new JLabel ("Nome");
	JLabel label2= new JLabel ("Cognome");
	JLabel label3= new JLabel ("Email");
	JLabel label4= new JLabel ("");
	JLabel label5= new JLabel ("");
	JLabel label6= new JLabel ("");
	JLabel label= new JLabel ();
	
	JTextArea a= new JTextArea(4,15);
	JTextArea b= new JTextArea(4,15);
	JTextArea c= new JTextArea(4,15);
	
	Font font= new Font("Bodoni MT", Font.PLAIN, 15); 
	Font fontt= new Font("Bodoni MT", Font.PLAIN, 10);
	
	ArrayList <String> arr=new ArrayList<>();
	
	public Brusio() {
		super("Registrazione");
		
		setSize (400, 400);
		Container cont= this.getContentPane();
		
		cont.add(bv);
		bv.setFont(fontt);
		bv.setBounds(20,20, 85, 20);
		
		cont.add(bb);
		bb.setFont(fontt);
		bb.setBounds(153,20, 85, 20);
		
		cont.add(br);
		br.setFont(fontt);
		br.setBounds(285,20, 85, 20);
		
		bv.setBackground(Color.GREEN);
		bb.setBackground(Color.BLUE);
		br.setBackground(Color.RED);
		
		
		cont.add(label0);
		label0.setBounds(135, 70, 150, 20);
		label0.setFont(font);
		
		cont.add(label1);
		label1.setBounds(80, 110,100, 20);
		label1.setFont(font);
		cont.add(a);
		a.setBounds(170, 110,190, 20);
		a.setFont(font);

		cont.add(label2);
		label2.setBounds(80, 140,100, 20);
		label2.setFont(font);
		cont.add(b);
		b.setBounds(170, 140,190, 20);
		b.setFont(font);
		
		cont.add(label3);
		label3.setBounds(80, 170,100, 20);
		label3.setFont(font);
		cont.add(c);
		c.setBounds(170, 170,190, 20);
		c.setFont(font);
		
		
		cont.add(breg);
		breg.setFont(fontt);
		breg.setBounds(120,200, 150, 20);
		
		cont.add(label4);
		label4.setBounds(20, 240,350, 30);
		label4.setFont(font);
		cont.add(label5);
		label5.setBounds(20, 265,350, 30);
		label5.setFont(font);
		cont.add(label6);
		label6.setBounds(20, 290,350, 30);
		label6.setFont(font);
		
		cont.add(btot);
		btot.setFont(fontt);
		btot.setBounds(95,330, 200, 20);
		
		cont.add(label);
	
		setVisible(true);
		bv.addActionListener(this);
		bb.addActionListener(this);
		br.addActionListener(this);
		breg.addActionListener(this);
		btot.addActionListener(this);
	}


	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bv) {
			
			getContentPane().setBackground(Color.GREEN);
		}else if (e.getSource() == bb) {
			getContentPane().setBackground(Color.BLUE);
		}else if (e.getSource() == br) {
			getContentPane().setBackground(Color.RED);
		}else if (e.getSource() == breg) {
			String s="Benvenuto "+a.getText()+" "+b.getText();
			label4.setText("Registrazione completata!");
			label5.setText(s);
			label6.setText("Email: "+c.getText());
			String ss="Nome: "+a.getText()+"   Cognome: "+b.getText()+"   Email: "+c.getText();
			arr.add(ss);
			a.setText("");
			b.setText("");
			c.setText("");
		}else if(e.getSource() == btot) {
			System.out.println("\nRegistrazioni totali: ");
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i));
		}
	}
	
	
	}
}
	


