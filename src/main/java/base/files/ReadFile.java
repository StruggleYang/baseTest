package base.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

   public String readFile(String file) throws Exception{

       BufferedReader buf = new BufferedReader(new FileReader(new File(file)));

       String str = null;

       StringBuffer sb = new StringBuffer();

       while ((str=buf.readLine())!=null){
           sb.append(str);
           sb.append("\r\n");
       }
       buf.close();
       return  sb.toString();
   }

   public  static void main (String [] args){
       ReadFile readFile = new ReadFile();
       try {
           System.out.println(readFile.readFile("D://test//test.tst"));
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}
