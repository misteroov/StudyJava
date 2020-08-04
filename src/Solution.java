import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

static {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
        firstFileName =reader.readLine();
        secondFileName=reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
public static class ReadFileThread  extends Thread implements ReadFileInterface{
  ArrayList <String> list = new ArrayList<>();
  String fileName;

    @Override
    public void setFileName(String fullFileName) {
       fileName  = fullFileName;

    }

    @Override
    public String getFileContent() {

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s + " ");
        }
        String finalLine = sb.toString();
        return finalLine;
    }
    public void run(){
       try  {
           Scanner sc = new Scanner(new File(fileName));
           while (sc.hasNextLine()){
               String line = sc.nextLine();
               list.add(line);
           }
           sc.close();
       }catch (IOException e){
           e.printStackTrace();
       }
        //fsdfsd
    }
}
    //add your code here - добавьте код тут
}

                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  