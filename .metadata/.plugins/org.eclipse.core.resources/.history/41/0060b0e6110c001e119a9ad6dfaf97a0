package comp_decomp;

import java.io.File;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Decompressor {
	
	public static void method(File file)throws IOException {
		String fileDirectory =file.getParent();
		//1 take input 2.decompress 3.output the decompressed file
		FileInputStream fis =new FileInputStream(file);
		GZIPInputStream gzip = new GZIPInputStream(fis);
		FileOutputStream fos = new FileOutputStream(fileDirectory+"/DecompressedFile");
		
		byte buffer[] =new byte[1024];
		int len;
		while((len=gzip.read(buffer))!=-1) {
			fos.write(buffer, 0, len);
		}
		gzip.close();
		fos.close();
		fis.close();
	}
	public static void main(String args[]) throws IOException {
		File path = new File("C:/Users/VIDYASHREE/Documents/AccioJob/CompressedFile.gz");
		method(path);
	}
}
