
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
PrintStream consoleStream = System.out;
ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
PrintStream stream = new PrintStream(byteOut);
System.setOut(stream);
testString.printSomething();
String s = byteOut.toString();

System.setOut(consoleStream);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3+6=");
        }
    }
}