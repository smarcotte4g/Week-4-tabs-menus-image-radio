package com.rickbird.radiobuttons;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Launcher
{

	public static void main(String[] args)
	{
		// launch our application
		SwingUtilities.invokeLater( new Runnable() {
			public void run()
			{
				// create frame and set the required frame settings
				JavaSwingDemo app = new JavaSwingDemo( "Java Swing Demo" );
				app.setBounds( 300, 300, 400, 300 );
				app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				app.setVisible( true );
			}
		} );
	}

}
