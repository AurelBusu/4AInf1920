import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {
	
	JLabel lPrimaSquadra;
	JLabel lSecondaSquadra;
	JTextField tPrimaSquadra;
	JTextField tSecondaSquadra;
	JButton bInvia;
	JLabel lCompleto;
	
	public Finestra()
	{
		setSize(800,600);
		setLocation(200, 200);
		setTitle("MyFirstFrame");
		initComponets();
		pack();
		JPanel myPanel = new JPanel();
		myPanel.setBackground(Color.BLUE);
		Container container = this.getContentPane();
		container.add(myPanel);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 }
	
	private void initComponets() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());
		lPrimaSquadra = new JLabel("prima squadra: ");
		this.add(lPrimaSquadra);
		tSecondaSquadra = new JTextField(20);
		this.add(tSecondaSquadra);
		lSecondaSquadra = new JLabel("seconda squadra: ");
		this.add(lSecondaSquadra);
		tPrimaSquadra = new JTextField(20);
		this.add(tPrimaSquadra);
		bInvia= new JButton("Invia");
		this.add(bInvia);
		lCompleto = new JLabel("prima squadra + seconda squadra");
		this.add(lCompleto);
		bInvia.addActionListener(this);
		System.out.println("\n");
	}

	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == bInvia)
		{
			lCompleto.setText(tSecondaSquadra.getText()+" "+ tPrimaSquadra.getText());
		}
	}
	
	public static void main(String[] args)
	{
		Finestra fs = new Finestra();
	}
}
