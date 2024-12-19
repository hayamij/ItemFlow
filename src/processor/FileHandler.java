package processor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import GUI.Home;
import config.CommonConstants;

public class FileHandler {

    public String data = "data.txt";

    public FileHandler() {
    }
    public static boolean check(String file){
        if (new File(file).exists()) {
            return true;
        } else {
            return false;
        }
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
