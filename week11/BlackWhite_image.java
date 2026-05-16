package example_001;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BlackWhite_image {
	private BufferedImage SourceImage = null;
	private BufferedImage TargetImage = null;
	
	private int red, green, blue;
	private int width, height;
	private int row, column;
	
	private Color color, new_color, white_color;
	private File U_InputFile = null;
	private File U_OutputFile = null;
	
	BlackWhite_image(String U_InputFile_Path, String U_Outputfile_Path){
		U_InputFile = new File(U_InputFile_Path);
		U_OutputFile = new File(U_Outputfile_Path);
		
		try {
			SourceImage = ImageIO.read(U_InputFile);
			TargetImage = ImageIO.read(U_InputFile);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		width = SourceImage.getWidth();
		height = SourceImage.getHeight();
		
		for(column = 0; column <= height-1; column++) {
			for(row = 0; row <= width-1; row++) {
				color = new Color(SourceImage.getRGB(row, column));
				blue = (int)(color.getBlue());
				color = new Color(blue, blue, blue);
				TargetImage.setRGB(row, column, color.getRGB());
			}
		}
		
		try {
			ImageIO.write(TargetImage,"png", U_OutputFile);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}
