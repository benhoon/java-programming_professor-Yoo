package example_001;

import java.util.*;
import java.io.IOException;

public class week09_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String U_InputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\fish.png";
		
		
		String U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\FlipVertical_fish.png";
		FlipVerticalImage FVI = new FlipVerticalImage (U_InputFile, U_OutputFile);
		
		
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\FlipHorizontal_fish.png";
		FlipHorizontalImage FHI = new FlipHorizontalImage (U_InputFile, U_OutputFile);
		
		
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\FlipPoint_fish.png";
		FlipPointImage FPI = new FlipPointImage (U_InputFile, U_OutputFile);
		
		
	}
}
