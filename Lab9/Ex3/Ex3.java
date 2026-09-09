package Ex3;
import java.io.*;
import java.util.ArrayList;
public class Ex3 {
    public static <E> boolean writeFile(String path, ArrayList<E> lst){
        BufferedWriter bfWrite = null;
        try {
            bfWrite = new BufferedWriter(new FileWriter(path));
            for(E item :lst){
                bfWrite.write(item.toString());
                bfWrite.newLine();
            }
            return true;
        }
        catch(IOException e){
            e.printStackTrace();
            return false;
        }
        finally {
            try {
            if(bfWrite != null) bfWrite.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}