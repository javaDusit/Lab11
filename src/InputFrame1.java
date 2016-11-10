import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InputFrame1 extends JFrame{

	public InputFrame1() {
		JButton but1 = new JButton("แปลงค่าองศา");
		but1.setSize(100,100);
		
		JLabel lb1 = new JLabel("Celsius");
		getContentPane().add(lb1);
		
		JTextField tx1 = new JTextField("0");
		tx1.setColumns(10);
		getContentPane().add(tx1);
		
		JLabel lb2 = new JLabel("Fahrenhet");
		getContentPane().add(lb2);
		JLabel lb3 = new JLabel("0");
		
		getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("Fahrenhet");
		getContentPane().add(lb4);
		
		JTextField tx2 = new JTextField("0");
		tx2.setColumns(10);
		getContentPane().add(tx2);
		
		JLabel lb5 = new JLabel("Celsius");
		getContentPane().add(lb5);
		JLabel lb6 = new JLabel("0");
		
		getContentPane().add(lb6);
		
		getContentPane().add(but1);
		
		
		but1.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				String degree;
				double fahren1,celsius1;
				degree = tx1.getText();
				fahren1 = celsiusToFahrenheit(Double.parseDouble(degree));
				lb3.setText(Double.toString(fahren1));
				
				degree = tx2.getText();
				celsius1 = fahrenheitToCelsius(Double.parseDouble(degree));
				lb6.setText(Double.toString(celsius1));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			} });
		
		JButton but2 = new JButton("แปลงความยาว");
		but2.setSize(50,50);
		
		JLabel lo1 = new JLabel("Meter");
		getContentPane().add(lo1);
		
		JTextField tx3 = new JTextField("0");
		tx3.setColumns(10);
		getContentPane().add(tx3);
		
		JLabel lo2 = new JLabel("Foot");
		getContentPane().add(lo2);
		JLabel lo3 = new JLabel("0");
		
		getContentPane().add(lo3);
		
		JLabel lo4 = new JLabel("Foot");
		getContentPane().add(lo4);
		
		JTextField tx4 = new JTextField("0");
		tx4.setColumns(10);
		getContentPane().add(tx4);
		
		JLabel lo5 = new JLabel("Meter");
		getContentPane().add(lo5);
		JLabel lo6 = new JLabel("0");
		
		getContentPane().add(lo6);
		
		getContentPane().add(but2);
		
		but2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				String degree;
				double meter1,foot1;
				degree = tx3.getText();
				meter1 = footToMeter(Double.parseDouble(degree));
				lo3.setText(Double.toString(meter1));
				
				degree = tx4.getText();
				foot1 = meterToFoot(Double.parseDouble(degree));
				lo6.setText(Double.toString(foot1));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			} });
		
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (1.8)* celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return(5.0/9)*(fahrenheit - 32);
	}
	public static double meterToFoot(double foot) {
		return 0.305 * foot;
	}
	public static double footToMeter(double meter) {
		return 3.279 * meter;
	}
	
	
	public static void main(String[] args) {
		InputFrame1 in1 = new InputFrame1();
		in1.setLayout(new FlowLayout());
		in1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		in1.setTitle("Hello Lab11");
		in1.setSize(300, 300);
		in1.setVisible(true);
		
		
	}//main

}//class
