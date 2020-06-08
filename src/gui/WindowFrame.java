package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	AnimalAdder animaladder;
	AnimalViewer animalviewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.animaladder = new AnimalAdder(this);
		this.animalviewer = new AnimalViewer(this);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		this.setupPanel(menuselection);
		
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
