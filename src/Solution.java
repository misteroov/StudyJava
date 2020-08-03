import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
   private String fileName;

    @Override
    public void setFileName(String fullFileName) {
       fileName  = fullFileName;
    }

    @Override
    public String getFileContent() {
        return this.fileName;
    }
    public void run(){
        
    }
}
    //add your code here - добавьте код тут
}

                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  