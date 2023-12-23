package com.startech.lambda_expression;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaExpressionEventListener {

	public static void main(String[] args) {
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton jButton = new JButton("Click");
		jButton.setBounds(80, 100, 70, 30);
		
		// lambda expression implementing here.
		jButton.addActionListener( e -> tf.setText("Hello Swing"));
		JFrame frame = new JFrame();
		frame.add(tf);
		frame.add(jButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300, 200);
		frame.setVisible(true);

	}

}
