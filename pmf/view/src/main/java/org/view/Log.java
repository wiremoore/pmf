package org.view;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import org.contract.Imodel;

/**
 * Tab containing logs
 * 
 * @author Lecomte Alexandre
 *
 */

public class Log extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	private TextArea textLog;
	private Imodel model;
	
	/**
	 * Constructor
	 * 
	 * @param model
	 */
	
	public Log(Imodel model) {
		
		this.model = model;
		this.model.observerAdd(this);
		
		this.textLog = new TextArea();
		this.textLog.setEditable(false);
		
		this.setLayout(new BorderLayout());
		this.add(this.textLog, BorderLayout.CENTER);
	}
	
	/**
	 * Displays a text for each action of the Arduino
	 */

	public void update(Observable o, Object arg) {
		this.textLog.setText(model.getLog());
	}
}
