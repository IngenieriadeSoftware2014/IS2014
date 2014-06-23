import java.io.*;

public class ReadFile{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("file.txt")));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace("error");
        }
    }

}