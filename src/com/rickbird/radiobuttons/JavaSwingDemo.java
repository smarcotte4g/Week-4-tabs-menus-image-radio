package com.rickbird.radiobuttons;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JavaSwingDemo extends JFrame
{
	// class level references
	private JMenuBar mnuBar;
	private JMenu mnuFile;
	private JMenuItem mnuItem;
	private JLabel lblPicture;
	
	public JavaSwingDemo( String title )
	{
		super(title);
		
		// create the menu bar
		mnuBar = new JMenuBar();
		
		// build the first menu
		mnuFile = new JMenu("File");
		mnuFile.setMnemonic( KeyEvent.VK_F );
		mnuBar.add(mnuFile);
		
		// create menu items
		mnuItem = new JMenuItem("Both icon and text", Utilities.createImageIcon("Images/Middle.gif"));
		mnuItem.setMnemonic( KeyEvent.VK_B );
		mnuItem.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// run some code when the "Both..." menu item is clicked
				JOptionPane.showMessageDialog(null,  "Hello from the menu!");
			}
		} );
		mnuFile.add( mnuItem );
		
		mnuFile.addSeparator();
		
		mnuItem = new JMenuItem("Exit", KeyEvent.VK_X);
		mnuItem.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// exit the application
				System.exit(0);
			}			
		} );
		mnuFile.add(mnuItem);		
		
		// add the menu bar to the frame
		this.setJMenuBar( mnuBar );
		
		// set up the picture label
		lblPicture = new JLabel( Utilities.createImageIcon("Images/Bird.gif") );
		
		// create radio buttons
		JRadioButton rdoBird = new JRadioButton("Bird");
		rdoBird.setMnemonic(KeyEvent.VK_B);
		rdoBird.setSelected(true);
		rdoBird.addItemListener( new ItemListener() {
			public void itemStateChanged(ItemEvent ev)
			{
				// display the Bird picture
				lblPicture.setIcon( 
						Utilities.createImageIcon("Images/Bird.gif") );
			}			
		} );
		
		JRadioButton rdoCat = new JRadioButton("Cat");
		rdoCat.setMnemonic(KeyEvent.VK_C);
		rdoCat.addItemListener( new ItemListener() {
			public void itemStateChanged(ItemEvent ev)
			{
				// display the Cat picture
				lblPicture.setIcon( 
						Utilities.createImageIcon("Images/Cat.gif") );
			}			
		} );
		
		JRadioButton rdoDog = new JRadioButton("Dog");
		rdoDog.setMnemonic(KeyEvent.VK_D);
		rdoDog.addItemListener( new ItemListener() {
			public void itemStateChanged(ItemEvent ev)
			{
				// display the Dog picture
				lblPicture.setIcon( 
						Utilities.createImageIcon("Images/Dog.gif") );
			}			
		} );
		
		JRadioButton rdoRabbit = new JRadioButton("Rabbit");
		rdoRabbit.setMnemonic(KeyEvent.VK_R);
		rdoRabbit.addItemListener( new ItemListener() {
			public void itemStateChanged(ItemEvent ev)
			{
				// display the Rabbit picture
				lblPicture.setIcon( 
						Utilities.createImageIcon("Images/Rabbit.gif") );
			}			
		} );
		
		JRadioButton rdoPig = new JRadioButton("Pig");
		rdoPig.setMnemonic(KeyEvent.VK_P);
		rdoPig.addItemListener( new ItemListener() {
			public void itemStateChanged(ItemEvent ev)
			{
				// display the Pig picture
				lblPicture.setIcon( 
						Utilities.createImageIcon("Images/Pig.gif") );
			}			
		} );
		
		// group the radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(rdoBird);
		group.add(rdoCat);
		group.add(rdoDog);
		group.add(rdoRabbit);
		group.add(rdoPig);
		
		// put the radio buttons in a column in a panel
		JPanel pnlRadios = new JPanel( new GridLayout(5,1) );
		pnlRadios.add(rdoBird);
		pnlRadios.add(rdoCat);
		pnlRadios.add(rdoDog);
		pnlRadios.add(rdoRabbit);
		pnlRadios.add(rdoPig);
		
		// create the tabbed pane
		JTabbedPane tabMain = new JTabbedPane();
		JPanel[] panels = new JPanel[4];
		for( short i=0; i < panels.length; i++ )
			panels[i] = Utilities.makeTextPanel( "Panel # " + (i+1) );
		
		// add panels to the tabs on the tabbed pane
		ImageIcon icon = Utilities.createImageIcon("Images/Middle.gif");
		tabMain.addTab("Tab 1", icon, panels[0], "Tooltip for the first panel");
		tabMain.addTab("Tab 2", icon, panels[1], "Tooltip for the second panel");
		tabMain.addTab("Tab 3", icon, panels[2], "Tooltip for the third panel");
		tabMain.addTab("Tab 4", icon, panels[3], "Tooltip for the fourth panel");
		
		// add stuff to the first panel
		panels[0].setLayout( new BorderLayout() );
		panels[0].add( pnlRadios, BorderLayout.LINE_START );
		panels[0].add( lblPicture, BorderLayout.CENTER );
		panels[0].setBackground(Color.PINK);
		
		
		tabMain.setMnemonicAt(0, KeyEvent.VK_1);
		tabMain.setMnemonicAt(1, KeyEvent.VK_2);
		tabMain.setMnemonicAt(2, KeyEvent.VK_3);
		tabMain.setMnemonicAt(3, KeyEvent.VK_4);
		
		// add the tabbed pane to the frame
		this.add(tabMain);
	}//constructor
}//class


















