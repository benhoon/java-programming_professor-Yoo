package example_001;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Brighter_image {
	private BufferedImage SourceImage = null;
	private BufferedImage TargetImage = null;
	
	private int red, green, blue;
	private int width, height;
	private int row, column;
	
	private Color color, new_color, white_color;
	private File U_InputFile = null;
	private File U_OutputFile = null;
	
	Brighter_image(String U_InputFile_Path, String U_Outputfile_Path, int value){
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
				red = (int)(color.getRed()) + value;
				if(red > 255) red = 255;
				green = (int)(color.getGreen()) + value;
				if(green > 255) green = 255;
				blue = (int)(color.getBlue()) + value;
				if(blue > 255) blue = 255;
				color = new Color(red, green, blue);
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
