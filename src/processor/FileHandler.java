package processor;
//import java.io.BufferedReader;
import GUI.Home;
import config.CommonConstants;
import java.io.File;
import java.io.IOException;

public class FileHandler {

    public String data = "data.txt";

    public FileHandler() {
    }
    public static boolean check(String file){
        return new File(file).exists();
    }
    public static void update(){
        File inputFile = new File("data.txt");
        File tempFile = new File("temp.txt");
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }
    public static void createFile() {
        if (!check("data.txt")) {
            try {
                File file = new File("data.txt");
                file.createNewFile();
            } catch (IOException e) {
                Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
            }
        }
    }
}
