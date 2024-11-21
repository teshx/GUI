import java.io.*;
public class fileinputstrea {
 public static void main(String[] arg){

    try {
        FileInputStream fout=new FileInputStream("C:/Users/hp/Desktop/newnwe.txt");
       int i=0;
       while ((i=fout.read())!=-1) {
        System.out.print((char)i);
        
       }
       fout.close();
        System.out.println("\nsuccess full......");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
 }   
}