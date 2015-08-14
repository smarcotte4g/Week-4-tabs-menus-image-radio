package com.rickbird.radiobuttons;

import java.awt.*;
import javax.swing.*;

public class Utilities
{
	// make a default panel for my tabbedpane
	public static JPanel makeTextPanel( String text )
	{
		JPanel pnlDefault = new JPanel();
		JLabel lblFiller = new JLabel( text );
		lblFiller.setHorizontalAlignment( JLabel.CENTER );
		pnlDefault.setLayout( new GridLayout(1,1) );
		pnlDefault.add(lblFiller);
		return pnlDefault;
	}
	
	// create an ImageIcon based on a file path
	public static ImageIcon createImageIcon( String path )
	{
		java.net.URL imgURL = JavaSwingDemo.class.getResource( path );
		if( imgURL != null )
		{
			return new ImageIcon( imgURL );
		}
		else
		{
			ImageIcon icoImage = new ImageIcon( path );
			if( icoImage != null )
			{
				return icoImage;
			}
			else
			{
				System.err.println( "Couldn't find file: " + path );
				return null;
			}
		}
		
	}
}
