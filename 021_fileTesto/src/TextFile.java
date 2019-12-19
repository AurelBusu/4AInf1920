import javax.annotation.processing.FilerException;
import java.io.*;

public class TextFile {
    private char mode;
    private BufferedReader reader;
    private BufferedWriter writer;

    public TextFile(String filename, char mode) throws IOException {
        this.mode = 'R';
        if(mode == 'W' || mode == 'w'){
            this.mode = 'W';
            writer = new BufferedWriter(new FileWriter(filename));
        }else{
            reader = new BufferedReader(new FileReader(filename));
        }
    }

    public void toFile(String line) throws FilerException, IOException{
        if (this.mode =='R') throw new FilerException("Read-only"+"file!");
        writer.write(line);
        writer.newLine();
    }

    public String fromFile() throws FilerException, IOException{
        String tmp;
        if(this.mode == 'W') throw new FilerException("Write-only"+"file!");
            tmp = reader.readLine();
            if(tmp==null) throw new FilerException("end of file!");
            return tmp;
    }

    public void closeFile() throws IOException{
        if(this.mode == 'W')
            writer.close();
        else
            reader.close();
    }

    public static void main(String[] args) throws IOException{
        TextFile out = new TextFile("file.txt", 'W');
        try{
            out.toFile("riga 1");
            out.toFile("riga 2");
            out.toFile("riga 3");
        } catch (FilerException exception) {
            System.out.println(exception.getMessage());
        }
        out.closeFile();

        TextFile in = new TextFile("file.txt",'R');
        String line;
        try{
            while(true){
                line = in.fromFile();
                System.out.println(line);
            }
        } catch (FilerException exception) {
            System.out.println(exception.getMessage());
        }
        out.closeFile();
    }
}
