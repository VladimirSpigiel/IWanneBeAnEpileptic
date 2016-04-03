package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Debug {
	public static void debugInFile(String s){
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filename.txt", true)))) {
		    out.println("\n" + s);
		    out.close();
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}
}
