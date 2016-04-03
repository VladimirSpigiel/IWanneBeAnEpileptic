package utils;

public class Formats {
	public static byte[] toByte(String str){
		return str.getBytes();
	}
	
	public static String toString(byte[] data){
		return new String(data);
	}
}
