package gui;

import java.awt.ScrollPane;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import animal.AnimalInput;
import manager.AnimalManager;

public class AnimalViewer extends JPanel{

	WindowFrame frame;
	AnimalManager animalManager;
	
	public AnimalViewer(WindowFrame frame,AnimalManager animalManager) {
		this.frame = frame;
		this.animalManager = animalManager;
		
		System.out.println("***" + animalManager.size()+ "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Weight");
		model.addColumn("Height");
		model.addColumn("Habitat");
		
		for (int i=0; i< animalManager.size(); i++) {
			Vector row = new Vector();
			AnimalInput ai= animalManager.get(i);
			row.add(ai.getName());
			row.add(ai.getWeight());
			row.add(ai.getHeight());
			row.add(ai.getHabitat());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
