import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex2 {
    public void upperCaseContent(){
        BufferedReader bfRead = null;
        BufferedWriter bfWriter = null;
        try {
            bfRead = new BufferedReader(new FileReader("input.txt"));
            StringBuffer result = new StringBuffer();
            String text;
            while((text = bfRead.readLine()) != null){
                text = upperCaseString(text);
                result.append(text);
            }
            bfWriter = new BufferedWriter(new FileWriter("output.txt"));
            bfWriter.write(result.toString());
        }
        catch(IOException e){
            System.out.print("Error Occurred");
            e.printStackTrace();
        }
        finally {
            try {
                if (bfRead != null) bfRead.close();
                if (bfWriter != null) bfWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
            }
        }
    }
    public String upperCaseString(String text){
        String[]parts = text.split("\\s+");
        StringBuffer result = new StringBuffer();
        for(int i=0; i < parts.length;i++){
            String words = parts[i];
            result.append(words.substring(0).toUpperCase()).append(" ");
        }
        return result.toString();
    }

    public void sumAllFile(){
        BufferedReader bfRead = null;
        BufferedWriter  bfWriter = null;
        try {
            bfRead = new BufferedReader(new FileReader("input.txt"));
            bfWriter = new BufferedWriter(new FileWriter("output.txt"));
            String text;
            int sum=0;
            while((text = bfRead.readLine()) != null){
                String[] parts = text.split("\\s+");
                for(int i=0; i < parts.length; i++){
                    sum += Integer.parseInt(parts[i]);
                }
            }
            bfWriter.write(String.valueOf(sum));
        }
        catch(IOException e){
            System.out.print("Message");
            e.printStackTrace();
        }
        finally {
            try {
                if (bfRead != null) bfRead.close();
                if (bfWriter != null) bfWriter.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        //ex2.upperCaseContent();
        ex2.sumAllFile();
    }
}