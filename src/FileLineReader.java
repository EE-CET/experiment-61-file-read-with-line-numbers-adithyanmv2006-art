import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "D:\\java\\Experiments\\CYCLE5\\experiment-61-file-read-with-line-numbers-adithyanmv2006-art\\input.txt";
        try (BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line;
            int lineNumber=1;

            while((line=br.readLine())!=null){
                System.out.println(lineNumber+": "+line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        
        
    }
}
