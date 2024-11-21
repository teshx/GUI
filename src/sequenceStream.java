import java.io.*;
public class sequenceStream{
 public static void main(String[] arg){

    try {
        FileInputStream fout=new FileInputStream("C:/Users/hp/Desktop/newnwe.txt");
        FileInputStream fout1=new FileInputStream("C:/Users/hp/Desktop/Document.txt");
        SequenceInputStream in2= new SequenceInputStream(fout,fout1);
        FileOutputStream fout2=new FileOutputStream("C:/Users/hp/Desktop/NEWa.txt");
        int i=0;
       while ((i=in2.read())!=-1) {
        fout2.write(i);
       }
       fout.close();
        System.out.println("success full......");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
 }   
}