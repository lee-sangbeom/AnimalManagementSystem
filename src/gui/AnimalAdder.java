package gui;

import javax.swing.*;

public class AnimalAdder extends JFrame {
	
	public AnimalAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelWeight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelHeight = new JLabel("Height: ", JLabel.TRAILING);
		JTextField fieldHeight = new JTextField(10);
		labelHeight.setLabelFor(fieldHeight);
		panel.add(labelHeight);
		panel.add(fieldHeight);
		
		JLabel labelHabitat = new JLabel("Habitat: ", JLabel.TRAILING);
		JTextField fieldHabitat = new JTextField(10);
		labelHabitat.setLabelFor(fieldHabitat);
		panel.add(labelHabitat);
		panel.add(fieldHabitat);
		
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
	
}
