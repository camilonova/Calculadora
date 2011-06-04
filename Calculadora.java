/*
 * Created on 20-may-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Camilo Nova
 *
 * Parametros de HTML:
 * <html>
 * <body>
 * <center>
 * <applet code=Calculadora.class width="280" height="250" >
 * </applet>
 * </center>
 * </body>
 * </html>
 */

public class Calculadora extends JApplet {
	
	private JPanel pad;
	private JTextField display;
	private JButton boton;
	private String count;
	
	private boolean multiplicar = false;
	private boolean dividir = false;
	private boolean sumar = false;
	private boolean restar = false;
	
	private double ans;
    
	public Calculadora() {
		initComponents();
	}
    
	private void initComponents() {

		pad = new JPanel();
		display = new JTextField();
		ans = 0;
		
		display.setText(Double.toString(ans));
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setFocusable(false);

		getContentPane().add(display, BorderLayout.NORTH);

		pad.setLayout(new GridLayout(4, 6));
		
		boton = new JButton("7");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("7");
				else
					count += "7";
					
				display.setText(count);
			}
		});
		pad.add(boton);
		
		boton = new JButton("8");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("8");
				else
					count += "8";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("9");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("9");
				else
					count += "9";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("DEL");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = null;
				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);

		boton = new JButton("AC");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = null;
				ans = 0;
				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);

		boton = new JButton("4");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("4");
				else
					count += "4";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("5");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("5");
				else
					count += "5";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("6");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("6");
				else
					count += "6";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("X");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(multiplicar){
					ans *= Double.parseDouble(display.getText());
					count = null;
				}
				else{
					multiplicar = true;
					ans = Double.parseDouble(display.getText());
					count = null;
				}
				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);

		boton = new JButton("/");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dividir){
					if(Double.parseDouble(display.getText()) != 0)
						ans /= Double.parseDouble(display.getText());
					else
						ans = 0;
					count = null;
				}
				else{
					dividir = true;
					ans = Double.parseDouble(display.getText());
					count = null;
				}
				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);

		boton = new JButton("1");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("1");
				else
					count += "1";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("2");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("2");
				else
					count += "2";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("3");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("3");
				else
					count += "3";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("+");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sumar){
					ans += Double.parseDouble(display.getText());
					count = null;
				}
				else{
					sumar = true;
					ans = Double.parseDouble(display.getText());
					count = null;
				}
				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);

		boton = new JButton("-");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(restar){
					ans -= Double.parseDouble(display.getText());
					count = null;
				}
				else{
					restar = true;
					ans = Double.parseDouble(display.getText());
					count = null;
				}
				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);

		boton = new JButton("0");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("0");
				else
					count += "0";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("·");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == null)
					count = new String("0.");
				if(!count.contains("."))
					count += ".";
					
				display.setText(count);
			}
		});
		pad.add(boton);

		boton = new JButton("=");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(multiplicar){
					multiplicar = false;
					ans *= Double.parseDouble(display.getText());
					count = null;
				}
				if(dividir){
					dividir = false;
					
					if(Double.parseDouble(display.getText()) != 0.0)
						ans /= Double.parseDouble(display.getText());
					else
						ans = 0;
					
					count = null;
				}
				if(sumar){
					sumar = false;
					ans += Double.parseDouble(display.getText());
					count = null;
				}
				if(restar){
					restar = false;
					ans -= Double.parseDouble(display.getText());
					count = null;
				}

				display.setText(Double.toString(ans));
			}
		});
		pad.add(boton);
		
		boton = new JButton("");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton.setEnabled(false);
		pad.add(boton);
		
		boton = new JButton("");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton.setEnabled(false);
		pad.add(boton);

		getContentPane().add(pad, BorderLayout.CENTER);
	}
}
