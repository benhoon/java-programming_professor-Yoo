package example_001;

import java.util.*;
import java.io.IOException;

public class week11_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String U_InputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\fish.png";
		
		
		String U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\Brighter_fish.png";
		Brighter_image BI = new Brighter_image (U_InputFile, U_OutputFile, 50);
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\Darker_fish.png";
		Darker_image DI = new Darker_image (U_InputFile, U_OutputFile, 50);
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\BlackWhite_fish.png";
		BlackWhite_image BWI = new BlackWhite_image (U_InputFile, U_OutputFile);
		
		String U_InputFile2 = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\Brighter_fish.png";
		String U_InputFile3 = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\BlackWhite_fish.png";
		String U_InputFile4 = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\Darker_fish.png";
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\Zip_fish_2.png";
		Zip_quarter ZI = new Zip_quarter (U_InputFile, U_InputFile2, U_InputFile3, U_InputFile4, U_OutputFile);
	}
}
