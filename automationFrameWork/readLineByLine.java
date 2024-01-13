package automationFrameWork;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.sql.Array;
import java.util.*;

public class readLineByLine {
    public static void main(String args[]) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src//job.txt"));
            List<String> array = new ArrayList<>();
            String str = "";
            int num = 0;
            System.out.println(num);
            while (reader.ready()) {
                str = reader.readLine();
                array.add(str);
                num++;
                System.out.println(str);
            }
            double sum = 0;
            for(String st:array){
                String[] country = st.split(" ");
                double score = Integer.valueOf(country[2]);
                sum += score;
            }
            double averageNum = sum / num;
            String aver = String.format("%.2f",averageNum);
            averageNum = Double.parseDouble(aver);
            System.out.println(num);
            System.out.println(averageNum);

        }
        catch (IOException e){

        }
    }
}
