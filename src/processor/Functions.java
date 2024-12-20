package processor;

import GUI.Home;
import config.CommonConstants;
import java.io.*;
import java.text.Normalizer;


public class Functions {

    public Functions() {
        createDataFile();
    }

    public static void createDataFile() {
        try {
            File file = new File("data.txt");
            if (file.createNewFile()) {
                Home.chatArea.append(CommonConstants.CHATBOT + " File created: " + file.getName() + "\n");
            }
        } catch (IOException e) {
            Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
        }
    }
    public static void addItem(String id, String name, String category, String price, String quantity) {
        try (FileWriter fw = new FileWriter("data.txt", true); 
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(id + ", " + name + ", " + category + ", " + price + ", " + quantity);
            bw.newLine();
            Home.chatArea.append(CommonConstants.CHATBOT + " Item added: " + id + ", " + name + ", " + category + ", " + price + ", " + quantity + "\n");
        } catch (IOException e) {
            Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
        }
    }
    public static void removeItem(String id) {

        File inputFile = new File("data.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith(id + ", ")) {
                    writer.write(line);
                    writer.newLine();
                } else {
                    Home.chatArea.append(CommonConstants.CHATBOT + " Item removed: " + line + "\n");
                }
            }
        } catch (IOException e) {
            Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
        }
    }
    public static void editItem(String id, String newName, String newCategory, String newPrice, String newQuantity) {
        File inputFile = new File("data.txt");
        File tempFile = new File("temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(id + ", ")) {
                    if (newCategory == null && newPrice == null && newQuantity == null) {
                        writer.write(id + ", " + newName + ", " + line.split(", ")[2] + ", " + line.split(", ")[3] + ", " + line.split(", ")[4]);
                    }
                    if (newName == null && newPrice == null && newQuantity == null) {
                        writer.write(id + ", " + line.split(", ")[1] + ", " + newCategory + ", " + line.split(", ")[3] + ", " + line.split(", ")[4]);
                    }
                    if (newName == null && newCategory == null && newQuantity == null) {
                        writer.write(id + ", " + line.split(", ")[1] + ", " + line.split(", ")[2] + ", " + newPrice + ", " + line.split(", ")[4]);
                    }
                    if (newName == null && newCategory == null && newPrice == null) {
                        writer.write(id + ", " + line.split(", ")[1] + ", " + line.split(", ")[2] + ", " + line.split(", ")[3] + ", " + newQuantity);
                    }

                } else {
                    writer.write(line);

                }
                writer.newLine();
            }
        } catch (IOException e) {
            Home.chatArea.append(CommonConstants.CHATBOT + " Item not found.\n");
        }
    }
    public static boolean searchItem(String id){
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(id + ", ")) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
        }
        return false;
    }
    public static void listItems() {
        if (!FileHandler.check("data.txt")) {
            Home.chatArea.append(CommonConstants.CHATBOT + " No items found.\n");
            createDataFile();
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            Home.chatArea.append(CommonConstants.CHATBOT + " List of items:\n");
            while ((line = reader.readLine()) != null) {
                Home.chatArea.append(line + "\n");
            }
        } catch (IOException e) {
            Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
        }
    }
    public static String removeAccent(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        String noAccent = normalized.replaceAll("\\p{M}", "");
        return noAccent.replaceAll("đ", "d").replaceAll("Đ", "D");
    }
}