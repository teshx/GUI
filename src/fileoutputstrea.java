import java.io.*;
public class fileoutputstrea {
 public static void main(String[] arg){

    try {
        FileOutputStream fout=new FileOutputStream("C:/Users/hp/Desktop/newnwe.txt");
        String hello="this is is dani";
        byte[] s=hello.getBytes();

        fout.write(s);
        fout.close();
        System.out.println("success full......");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
 }   
}
