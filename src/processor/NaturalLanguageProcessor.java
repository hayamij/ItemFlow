package processor;

import GUI.Home;
import config.CommonConstants;
import java.io.BufferedReader;
import java.io.FileReader;

public class NaturalLanguageProcessor {
    public static String botState = "IDLE";
    public static String tempID = "";
    public static String tempName = "";
    public static String tempCategory = "";
    public static String tempPrice = "";
    public static String tempQuantity = "";

    public boolean add = false;
    public boolean remove = false;
    public boolean edit = false;
    public boolean search = false;
    public boolean show = false;
    public boolean help = false;

    //Console console = new Console();

    public NaturalLanguageProcessor() {
    }

    public void processUserInput(String userInput) {
        switch (botState){
            case "IDLE":
                for (String command : CommonConstants.THANK_YOU_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + CommonConstants.THANKS_RESPONSE[(int) (Math.random() * CommonConstants.THANKS_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                // respond to greetings
                for (String command : CommonConstants.HELLO_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + CommonConstants.INTRODUCE_RESPONSE[(int) (Math.random() * CommonConstants.INTRODUCE_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                for (String command : CommonConstants.QUESTION_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + CommonConstants.QUESTION_RESPONSE[(int) (Math.random() * CommonConstants.QUESTION_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                for (String command : CommonConstants.HOW_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.HOW_RESPONSE[(int) (Math.random() * CommonConstants.HOW_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                for (String command : CommonConstants.CAN_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.CAN_RESPONSE[(int) (Math.random() * CommonConstants.CAN_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                for (String command : CommonConstants.HOW_ARE_YOU_COMMAND){
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.HOW_ARE_YOU_RESPONSE[(int) (Math.random() * CommonConstants.HOW_ARE_YOU_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                for (String command : CommonConstants.NAME_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.NAME_RESPONSE[(int) (Math.random() * CommonConstants.NAME_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                for (String command : CommonConstants.GOODBYE_COMMAND) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.GOODBYE_RESPONSE[(int) (Math.random() * CommonConstants.GOODBYE_RESPONSE.length)] + "\n");
                        return;
                    }
                }
                // Check for commands
                for (String command : CommonConstants.ADD_COMMAND) {
                    if (userInput.contains(command)) {
                        add = true;
                    }
                }
                for (String command : CommonConstants.DELETE_COMMAND) {
                    if (userInput.contains(command)) {
                        remove = true;
                    }
                }
                for (String command : CommonConstants.EDIT_COMMAND) {
                    if (userInput.contains(command)) {
                        edit = true;
                    }
                }
                for (String command : CommonConstants.SEARCH_COMMAND) {
                    if (userInput.contains(command)) {
                        search = true;
                    }
                }
                for (String command : CommonConstants.SHOW_COMMAND) {
                    if (userInput.contains(command)) {
                        show = true;
                    }
                }
                for (String command : CommonConstants.HELP_COMMAND) {
                    if (userInput.contains(command)) {
                        help = true;
                    }
                }   
                // requests
                if (add == true) {
                    Home.chatArea.append(CommonConstants.CHATBOT + 
                    CommonConstants.REQUEST_ID[(int) (Math.random() * CommonConstants.REQUEST_ID.length)] + "\n");
                    botState = "WAITING_FOR_ID";
                } 
                if (remove == true) {Home.chatArea.append(CommonConstants.CHATBOT + 
                    CommonConstants.REQUEST_ID[(int) (Math.random() * CommonConstants.REQUEST_ID.length)] + "\n");
                    botState = "WAITING_FOR_ID";
                }
                if (edit == true) {Home.chatArea.append(CommonConstants.CHATBOT + 
                    CommonConstants.REQUEST_ID[(int) (Math.random() * CommonConstants.REQUEST_ID.length)] + "\n");
                    botState = "WAITING_FOR_ID";
                }
                if (search == true) {Home.chatArea.append(CommonConstants.CHATBOT + 
                    CommonConstants.REQUEST_ID[(int) (Math.random() * CommonConstants.REQUEST_ID.length)] + "\n");
                    botState = "WAITING_FOR_ID";
                }
                if (show == true){
                    Functions.listItems();
                    show = false;
                    break;
                }
                break;
            case "WAITING_FOR_ID":
                tempID = userInput;
                if (add == true) {
                    if (Functions.searchItem(tempID) == true) {
                        Home.chatArea.append(CommonConstants.CHATBOT +
                        CommonConstants.ID_EXISTS[(int) (Math.random() * CommonConstants.ID_EXISTS.length)] + "\n");
                        botState = "IDLE";
                        add = false;
                        break;
                    } else {
                        Home.chatArea.append(CommonConstants.CHATBOT +
                        CommonConstants.REQUEST_NAME[(int) (Math.random() * CommonConstants.REQUEST_NAME.length)] + "\n");
                        botState = "WAITING_FOR_NAME";
                        break;
                    }
                }
                if (remove == true) {
                    if (!Functions.searchItem(tempID)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + " Item not found.\n");
                        botState = "IDLE";
                        remove = false;
                        break;
                    } else {
                        Functions.removeItem(tempID);
                        FileHandler.update();
                        //console.updateTable();
                        botState = "IDLE";
                        remove = false;
                        break;
                    }
                }
                if (edit == true) {
                    if (!Functions.searchItem(tempID)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + " Item not found.\n");
                        botState = "IDLE";
                        edit = false;
                        break;
                    }
                    if (Functions.searchItem(userInput) == false) {
                        Home.chatArea.append(CommonConstants.CHATBOT +
                        CommonConstants.SEARCH_ID_NOT_FOUND[(int) (Math.random() * CommonConstants.SEARCH_ID_NOT_FOUND.length)] + "\n");
                        botState = "IDLE";
                        break;
                    } else {
                        Home.chatArea.append(CommonConstants.CHATBOT +
                        CommonConstants.EDIT_QUESTION[(int) (Math.random() * CommonConstants.EDIT_QUESTION.length)] + "\n");
                        botState = "WAITING_FOR_EDIT";
                        break;
                    }
                }
                if (search == true) {
                    if (Functions.searchItem(tempID) == true){
                        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
                            String line;
                            Home.chatArea.append(CommonConstants.CHATBOT +
                            CommonConstants.SEARCH_RESPONSE[(int) (Math.random() * CommonConstants.SEARCH_RESPONSE.length)] + ": ");
                            while ((line = reader.readLine()) != null) {
                                if (line.startsWith(tempID + ", ")) {
                                    Home.chatArea.append(line + "\n");
                                }
                            }
                        } catch (Exception e) {
                            Home.chatArea.append(CommonConstants.ERROR + " Error: " + e.getMessage() + "\n");
                        }
                    } else {
                        Home.chatArea.append(CommonConstants.CHATBOT +
                        CommonConstants.SEARCH_ID_NOT_FOUND[(int) (Math.random() * CommonConstants.SEARCH_ID_NOT_FOUND.length)] + "\n");
                    }
                    botState = "IDLE";
                    search = false;
                    break;
                }
                break;
            case "WAITING_FOR_EDIT":
                for (String command : CommonConstants.NAME) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.REQUEST_NAME[(int) (Math.random() * CommonConstants.REQUEST_NAME.length)] + "\n");
                        botState = "WAITING_FOR_NAME";break;
                    }
                }
                for (String command : CommonConstants.CATEGORY) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.REQUEST_CATEGORY[(int) (Math.random() * CommonConstants.REQUEST_CATEGORY.length)] + "\n");
                        botState = "WAITING_FOR_CATEGORY";break;
                    }
                }
                for (String command : CommonConstants.PRICE) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.REQUEST_PRICE[(int) (Math.random() * CommonConstants.REQUEST_PRICE.length)] + "\n");
                        botState = "WAITING_FOR_PRICE";break;
                    }
                }
                for (String command : CommonConstants.QUANTITY) {
                    if (userInput.contains(command)) {
                        Home.chatArea.append(CommonConstants.CHATBOT + 
                        CommonConstants.REQUEST_QUANTITY[(int) (Math.random() * CommonConstants.REQUEST_QUANTITY.length)] + "\n");
                        botState = "WAITING_FOR_QUANTITY";break;
                    }
                }
                break;
            case "WAITING_FOR_NAME":
                if (edit == true) {
                    tempName = userInput;
                    Functions.editItem(tempID, tempName, null, null, null);
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.EDIT_RESPONSE[(int) (Math.random() * CommonConstants.EDIT_RESPONSE.length)] + "\n");
                    FileHandler.update();
                    //console.updateTable();
                    botState = "IDLE";
                    edit = false;
                    break;
                }
                if (add == true) {
                    tempName = userInput;
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.REQUEST_CATEGORY[(int) (Math.random() * CommonConstants.REQUEST_CATEGORY.length)] + "\n");
                    botState = "WAITING_FOR_CATEGORY";
                    break;
                }
            case "WAITING_FOR_CATEGORY":
                if (edit == true) {
                    tempCategory = userInput;
                    Functions.editItem(tempID, null, tempCategory, null, null);
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.EDIT_RESPONSE[(int) (Math.random() * CommonConstants.EDIT_RESPONSE.length)] + "\n");
                    FileHandler.update();
                    //console.updateTable();
                    botState = "IDLE";
                    edit = false;
                    break;
                }
                if (add == true) {
                    tempCategory = userInput;
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.REQUEST_PRICE[(int) (Math.random() * CommonConstants.REQUEST_PRICE.length)] + "\n");
                    botState = "WAITING_FOR_PRICE";
                    break;
                }
            case "WAITING_FOR_PRICE":
                if (edit == true) {
                    tempPrice = userInput;
                    Functions.editItem(tempID, null, null, tempPrice, null);
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.EDIT_RESPONSE[(int) (Math.random() * CommonConstants.EDIT_RESPONSE.length)] + "\n");
                    FileHandler.update();
                    //console.updateTable();
                    botState = "IDLE";
                    edit = false;
                    break;
                }
                if (add == true) {
                    tempPrice = userInput;
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.REQUEST_QUANTITY[(int) (Math.random() * CommonConstants.REQUEST_QUANTITY.length)] + "\n");
                    botState = "WAITING_FOR_QUANTITY";
                    break;
                }
            case "WAITING_FOR_QUANTITY":
                if (edit == true) {
                    tempQuantity = userInput;
                    Functions.editItem(tempID, null, null, null, tempQuantity);
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.EDIT_RESPONSE[(int) (Math.random() * CommonConstants.EDIT_RESPONSE.length)] + "\n");
                    FileHandler.update();
                    //console.updateTable();
                    botState = "IDLE";
                    edit = false;
                    break;
                }
                if (add == true) {
                    tempQuantity = userInput;
                    Functions.addItem(tempID, tempName, tempCategory, tempPrice, tempQuantity);
                    Home.chatArea.append(CommonConstants.CHATBOT +
                    CommonConstants.ADD_RESPONSE[(int) (Math.random() * CommonConstants.ADD_RESPONSE.length)] + "\n");
                    botState = "IDLE";
                    //console.updateTable();
                    add = false;
                    break;
                }
            default:
                Home.chatArea.append(CommonConstants.CHATBOT +
                CommonConstants.DEFAULT_RESPONSE[(int) (Math.random() * CommonConstants.DEFAULT_RESPONSE.length)] + "\n");
                break;
        }
    }

}
