package Ex4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex4 {
    public void getFileByExtension(String folderPath, String extension) {
        File folder = new File(folderPath);
        if(folder.exists() && folder.isDirectory()){
            File[] files = folder.listFiles();
                for(File file : files){
                    if(file.isFile() && file.getName().endsWith(extension)){
                        System.out.println(file.getName());
                    }
                }
        }
        else {
            System.out.println("Folder does not exist or is not a directory.");
        }
    }

    public boolean checkExist(String path){
        File file = new File(path);
        return file.exists();
    }

    public void checkType(String path){
        File file = new File(path);

        if(file.isDirectory()){
            System.out.println("This is a directory.");
        }
        else if(file.isFile()){
            System.out.println("This is a file.");
        }
        else {
            System.out.println("The path does not exist.");
        }   
    }

    public void appendToFile(String filePath, String content){
        BufferedWriter bfWrite = null;
        try {
            bfWrite = new BufferedWriter(new FileWriter(filePath, true));
            bfWrite.write(content);
            bfWrite.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (bfWrite != null) {
                    bfWrite.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public String findLongestWord(String path){
        BufferedReader bfRead = null;
        String longestWord = "";
        try {
            bfRead = new BufferedReader(new FileReader(path));
            String text;
            while((text = bfRead.readLine()) != null){
                String[] words = text.split("\\s+");
                for(String word : words){
                    if(word.length() > longestWord.length()){
                        longestWord = word;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bfRead != null) {
                    bfRead.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return longestWord;
    }
}