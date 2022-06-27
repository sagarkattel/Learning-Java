import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;



public class EventDemo extends Frame implements ActionListener,KeyListener {



	Label l1;

	Button b1,b2,b3,b4;

	TextField tf1,tf2,tf3;

	public EventDemo() {

		

		l1=new Label("    ");

		tf1=new TextField();

		tf2=new TextField();

		tf3=new TextField();

		

		

		tf1.addKeyListener(this);

		tf2.addKeyListener(this);

		tf3.addKeyListener(this);

		

		l1.setBounds(160,80,80,20);

		b1=new Button("+");

		b2=new Button("-");

		b3=new Button("*");

		b4=new Button("/");

		

		setVisible(true);

		setSize(400,400);

		setLayout(null);

		add(l1);

		tf1.setBounds(50, 50, 80, 20);

		tf2.setBounds(50, 80, 80, 20);

		tf3.setBounds(50, 110, 80, 20);

		

		

		b1.setBounds(50, 180, 50, 30);

		b2.setBounds(90, 180, 50, 30);

		b3.setBounds(130, 180, 50, 30);

		b4.setBounds(170, 180, 50, 30);

		

		

		b1.addActionListener(this);

		b2.addActionListener(this);

		b3.addActionListener(this);

		b4.addActionListener(this);

		

		

		add(tf1);add(tf2);add(tf3);

		add(b1);add(b2);add(b3);add(b4);

		

		

		

	}

	

	public void actionPerformed(ActionEvent e) {

		int a=Integer.parseInt(tf1.getText());

		int b=Integer.parseInt(tf2.getText());

		

		if(e.getSource()==b1)

		{

	

			int c=a+b;

			tf3.setText(Integer.toString(c));

		}

		if(e.getSource()==b2)

		{



			int c=a-b;

			tf3.setText(Integer.toString(c));

		}	

			

	}

	

	public static void main(String[] args) {

		new EventDemo();



	}



	public void keyPressed(KeyEvent arg0) {

		if(arg0.getSource()==tf1)

		{

			l1.setText("KEY PRESSED");

		}

		

	}



	public void keyReleased(KeyEvent arg0) {

		if(arg0.getSource()==tf2){

		l1.setText("KEY RELEASED");}

		

	}



	public void keyTyped(KeyEvent arg0) {

		if(arg0.getSource()==tf3){

		l1.setText("KEY TYPED");}

		

	}



}