package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AnimalManager;

public class WindowFrame extends JFrame{
	
	AnimalManager animalManager;
	MenuSelection menuselection;
	AnimalAdder animaladder;
	AnimalViewer animalviewer;
	
	public WindowFrame(AnimalManager animalManager) {
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.animalManager = animalManager;
		menuselection = new MenuSelection(this);
		animaladder = new AnimalAdder(this);
		animalviewer = new AnimalViewer(this,this.animalManager);
		
		this.add(menuselection);
		
		this.setVisible(true);
		
		
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AnimalAdder getAnimaladder() {
		return animaladder;
	}

	public void setAnimaladder(AnimalAdder animaladder) {
		this.animaladder = animaladder;
	}

	public AnimalViewer getAnimalviewer() {
		return animalviewer;
	}

	public void setAnimalviewer(AnimalViewer animalviewer) {
		this.animalviewer = animalviewer;
	}

}
