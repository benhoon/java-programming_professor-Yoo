package example_001;

import java.util.*;
import java.io.IOException;

public class week10_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String U_InputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\fish.png";
		
		
		String U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\red_fish.png";
		Red_image RI = new Red_image (U_InputFile, U_OutputFile);
		
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\green_fish.png";
		Green_image GI = new Green_image (U_InputFile, U_OutputFile);
		
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\blue_fish.png";
		Blue_image BI = new Blue_image (U_InputFile, U_OutputFile);

		
		String U_InputFile2 = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\red_fish.png";
		String U_InputFile3 = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\green_fish.png";
		String U_InputFile4 = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\blue_fish.png";
		U_OutputFile = "C:\\Users\\benle\\OneDrive\\Desktop\\26년 1학기\\자바프로그래밍\\fish\\Zip_fish.png";
		Zip_quarter ZI = new Zip_quarter (U_InputFile, U_InputFile2, U_InputFile3, U_InputFile4, U_OutputFile);
		
	}
}
