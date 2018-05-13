package lab11;

import java.io.*;
import java.util.*;

public class Part1Main {
	public static void main(String[] args){
		try{
			File file = new File("CourseForProgram.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ProgramOfStudy pos = (ProgramOfStudy) ois.readObject();
			ois.close();
		}
		catch(Exception e){
			System.out.println("File not Found");
		}
	}
}
