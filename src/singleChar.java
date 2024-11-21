import java.io.*;
public class singleChar {
 public static void main(String[] arg){

    try {
        FileInputStream fout=new FileInputStream("C:/Users/hp/Desktop/newnwe.txt");
        fout.available();
      System.out.println(fout.read());
       fout.close();
        System.out.println("success full......");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
 }   
}