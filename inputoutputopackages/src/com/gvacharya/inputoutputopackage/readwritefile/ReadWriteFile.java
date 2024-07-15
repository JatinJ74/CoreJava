package com.gvacharya.inputoutputopackage.readwritefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadWriteFile {

	public static void main(String[] args) {
		
		try(
				FileOutputStream fos = new FileOutputStream("demo.txt");
				FileChannel channel = fos.getChannel();
				){
			
				ByteBuffer buffer = ByteBuffer.allocate(1024);
				int charVal = channel.read(buffer);
				while(charVal!=-1) {
					buffer.flip(); //for read/write buffer flip
					while(buffer.hasRemaining())
						System.out.print((char)buffer.get());
					
					buffer.clear();
					//read data for next chunk of data for outer loop
					charVal = channel.read(buffer);
					
				}
				
				
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try(
				FileInputStream fis = new FileInputStream("nioFile.txt");
				FileChannel channel = fis.getChannel();
				){
			
				ByteBuffer buffer = ByteBuffer.allocate(1024);
				int charVal = channel.read(buffer);
				
				while(charVal!=-1) {
					buffer.flip(); // method moves cursor to the  starting position
					System.out.println(buffer.getChar());
					
					charVal = channel.read(buffer);
				}
				
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
