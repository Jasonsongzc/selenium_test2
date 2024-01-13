package automationFrameWork;
import java.io.*;

public class FirstTestCase {
    public static void main(String args[]){
        File file = new File("bb.txt");
        FileReader readFile = null;
        BufferedReader bufferFile = null;
        try{
            readFile = new FileReader(file);
            bufferFile = new BufferedReader(readFile);
            String str = null;
            LineNumberReader lineNumber = new LineNumberReader(bufferFile);
            lineNumber.skip(Long.MAX_VALUE);
            int line  = lineNumber.getLineNumber();
            System.out.println(line);
            int num = 0;
            str = bufferFile.readLine();
            System.out.println(str);
            while(str != null){
                System.out.println(str);
                str = bufferFile.readLine();
                num++;
            }
            System.out.println(num);

        }
        catch(Exception e){

        }
        finally {
            try{
                bufferFile.close();
                readFile.close();
            }
            catch(Exception e2){

            }
        }


    }


}
