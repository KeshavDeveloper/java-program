 import java.io.*;
 class File
 {
	 public static void main(String[] args) throws IOException
	 {
		 int i;
		 FileInputStream fis=new FileInputStream("FileExample.txt");
		 do
		 {
			 i=fis.read();
			 if(i!=-1)
			 {
				 System.out.println((char)i);
				 
			 }
			 
		 }while(i!=-1);
		 fis.close();
	 }
 }