package gui;

import java.awt.ScrollPane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AnimalViewer extends JFrame{

	public AnimalViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Weight");
		model.addColumn("Height");
		model.addColumn("Habitat");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
