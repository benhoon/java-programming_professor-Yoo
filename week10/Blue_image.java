package example_001;

import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class Blue_image {
	private BufferedImage SourceImage = null;
	private BufferedImage TargetImage = null;
	
	private int width, height;
	private int row, column;
	private int red, green, blue;
	
	private Color color, new_color, white_color;
	private File U_InputFile = null;
	private File U_OutputFile = null;
	
	Blue_image(String U_InputFile_Path, String U_Outputfile_Path){
		U_InputFile = new File(U_InputFile_Path);
		U_OutputFile = new File(U_Outputfile_Path);
		
		try {
			SourceImage = ImageIO.read(U_InputFile);
			TargetImage = ImageIO.read(U_InputFile);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		///////////////////////////////
		/// get image width and height
		width = SourceImage.getWidth();
		height = SourceImage.getHeight();
		
		white_color = new Color(255, 255, 255);
		
		for (column = 0; column <= height-1; column++) {
			for (row = 0; row <= width-1; row++) {
				TargetImage.setRGB(row, column, white_color.getRGB());
			}
		}
		
		for (column = 0; column <= height-1; column++) {
			for (row = 0; row <= width-1; row++) {
				color = new Color(SourceImage.getRGB(row, column));
				blue = (int)(color.getBlue());
				color = new Color(0, 0, blue);
				TargetImage.setRGB(row, column, color.getRGB());
			}
		}
		//////////////////////////////////////
		/// write out the result image
		try {
			ImageIO.write(TargetImage,"png", U_OutputFile);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
