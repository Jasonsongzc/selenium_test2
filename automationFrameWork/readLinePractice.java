package automationFrameWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class readLinePractice {
    public static void main(String args[]) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src//job.txt"));
            String str = "";
            List<String> array = new ArrayList<>();
            int num = 0;
            while (bufferedReader.ready()) {
                str = bufferedReader.readLine();
                num++;
                System.out.println(str);
                array.add(str);
            }
            double sum = 0;
            for (String aa : array) {
                String[] strs = aa.split(" ");
                String line = strs[1];
                sum += Integer.valueOf(line);
            }
            double aver = sum / num;
            String average = String.format("%.2f",aver);
            aver = Double.parseDouble(average);
            System.out.println(aver);


        }
        catch (IOException e){
        }
    }
}
