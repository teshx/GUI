import java.io.*;
public class BYTEarrey {
 public static void main(String[] arg){

    try {
        FileOutputStream fout=new FileOutputStream("C:/Users/hp/Desktop/newnwe.txt");
        FileOutputStream fout1=new FileOutputStream("C:/Users/hp/Desktop/NEWa.txt");
  ByteArrayOutputStream abou=new ByteArrayOutputStream();
        String h1="hello momy i miss you";
        byte[] b=h1.getBytes();

        abou.write(b);
        abou.writeTo(fout);
        abou.writeTo(fout1);
        fout.close();
        System.out.println("success full......");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
 }   
}