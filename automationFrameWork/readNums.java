package automationFrameWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.*;

public class readNums {
    public static void main(String args[]){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("/Users/apple/Downloads/java项目/selenium test/src/job2.txt"));
            List<String[]> array = new ArrayList<>();
            int num = 0;
            double sum = 0;
            while(reader.ready()){
                String line = reader.readLine();
                String[] info = line.split(" ");
                array.add(info);
                num++;
                sum += Double.parseDouble(info[2]);
                System.out.println(line);
            }
            Thread.currentThread().sleep(1000);
            double average = sum / num;
            String averageString = String.format("%.2f",average);
            average = Double.parseDouble(averageString);
            System.out.println(average);

        }
        catch(Exception e){

        }
    }
}
