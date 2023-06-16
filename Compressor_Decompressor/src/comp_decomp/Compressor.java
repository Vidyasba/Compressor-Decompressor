package comp_decomp;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class Compressor {
	
	public static void method(File file)throws IOException {
		//to store the compressed file in same folder from which it was picked
		String fileDirectory=file.getParent();
		
		//to read input file
		FileInputStream fis= new FileInputStream(file);
		FileOutputStream fos= new FileOutputStream(fileDirectory+"/CompressedFile.gz");//appends compressedfile.gz to compressed file
		GZIPOutputStream gzip= new GZIPOutputStream(fos);
		
		//array of byte datatype is created to read data and write in output(compressed data) file GZ
		byte buffer[]= new byte[1024];
		int len;
		
		//reads buffer untill it reaches end of file(EOF) and it will store the complete file into len  
		while((len=fis.read(buffer))!=-1) {
		//gzip.write(bytes array,offset length(start of set), len--> no of bytes / end at last byte( its range 0 to len).
		gzip.write(buffer, 0, len);
		}
		
		gzip.close();
		fos.close();
		fis.close();
		
	}
	
	public static void main(String args[]) throws IOException {
		File path=new File("C:/Users/VIDYASHREE/Documents/AccioJob/java-project");
		method(path);
	}
}
