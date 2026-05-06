package example_001;

import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class FlipPointImage {
	private BufferedImage SourceImage = null;
	private BufferedImage TargetImage = null;
	
	private int width, height;
	private int row, column;
	private int red, gree, bule;
	
	private Color color, new_color, white_color;
	private int average;
	
	private File U_InputFile = null;
	private File U_OutputFile = null; 
	
	
	FlipPointImage (String U_InputFile_Path, String U_Outputfile_Path){
		/////////////////////////
		/// Read in the input image
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
		
		//////////////////////////////////
		/// make TargetImage white image
		white_color = new Color(255, 255, 255);
		
		for (column = 0; column <= height-1; column++) {
			for (row = 0; row <= width-1; row++) {
				TargetImage.setRGB(row, column, white_color.getRGB());
			}
		}
		
		
		/////////////////////////////////////////////////
		/// F L I P 	P O I N T	 	I M A G E
		/////////////////////////////////////////////////
		for (column = 0; column <= height-1; column++) {
			for (row = 0; row <= width-1; row++) {
				//픽셀 하나를 읽어온다
				color = new Color(SourceImage.getRGB(row, column));
				
				//출력 이미지 파일에 기록한다
				TargetImage.setRGB(width -1 - row, height -1 - column, color.getRGB());
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