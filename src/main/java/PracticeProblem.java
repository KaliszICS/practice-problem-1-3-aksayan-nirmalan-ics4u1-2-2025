import java.io.*;
import java.util.Scanner;
import java.io.FileReader;

public class PracticeProblem {

	public static String readFile(String filename) {
		Scanner scan=null;
		try {
			scan=new Scanner (new File(filename));//create empty string
			String file="";
			while(scan.hasNext()){
				//add onto that string what you read in
				file = file + scan.nextLine() + "\n";
			} 
			return file;
		}

		catch (FileNotFoundException e){
			System.out.println(e);
		}

		finally{
			if(scan!=null){
				scan.close();
			}
		}
		return " ";
	}
	public static String backwardsReadFile(String filename) {
		FileReader buff = null;

		try {
			buff = new FileReader(filename);
			int line;
			String result = "";
			while ((line = buff.read())!=-1) { 
				result= (char)line + result;
			}
			return result;
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if (buff != null) {
					buff.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
		return" ";
	}

}
