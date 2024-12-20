package config;
public class CommonConstants extends Object{
    // display
    public static final String WINDOW_TITLE = "itemflow";
    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    public static final int FONT_SIZE = 16;

    // tab
    public static final String[] TABS = {"Home", "Settings", "Console", "Help", "About"};

    // home 
    public static final String HOME_LABEL = "Welcome to ItemFlow!";
    public static final String SEND_BUTTON = "Send";
    public static final String VOICE_BUTTON = "Voice";
    public static final String USER = "User: ";
    public static final String CHATBOT = "ItemFlow: ";

    // settings

    // help

    //console
    public static final String[] COLUMN_NAMES = {"ID", "Name", "Category","Price", "Quantity",};


    //about

    // Natural Language 

    //// english

    // hello
    public static final String[] HELLO_COMMAND = {"hello", "hi", "hey", "hello itemflow", "hi itemflow", "hey itemflow", "hello itemflow app", "hi itemflow app", "hey itemflow app","hello itemflow application", "hi itemflow application", "hey itemflow application", "hello itemflow program", "hi itemflow program", "hey itemflow program", "hello itemflow software","hi itemflow software", "hey itemflow software", "hello itemflow tool", "hi itemflow tool", "hey itemflow tool", "hello itemflow utility", "hi itemflow utility", "hey itemflow utility","hello itemflow system", "hi itemflow system", "hey itemflow system", "hello itemflow service", "hi itemflow service", "hey itemflow service", "hello itemflow product", "hi itemflow product","hey itemflow product", "hello itemflow item", "hi itemflow item", "hey itemflow item", "hello itemflow itemflow", "hi itemflow itemflow", "hey itemflow itemflow", "hello itemflow itemflow app", "hi itemflow itemflow app", "hey itemflow itemflow app", "hello itemflow itemflow application", "hi itemflow itemflow application", "hey itemflow itemflow application",};
    public static final String[] QUESTION_COMMAND = {"what is", "what is this", "what is this app", "what is this application", "what is this program", "what is this software","what is this tool", "what is this utility", "what is this system", "what is this service", "what is this product", "what is this item", "what is this itemflow", "what is this itemflow app","what is this itemflow application", "what is itemflow", "what is itemflow app", "what is itemflow application", "what is itemflow program", "what is itemflow software","what is itemflow tool", "what is itemflow utility", "what is itemflow system", "what is itemflow service", "what is itemflow product", "what is itemflow item", "what is itemflow itemflow","what is itemflow itemflow app", "what is itemflow itemflow application",};
    public static final String[] HOW_COMMAND = {"how to use", "how to use this", "how to use this app", "how to use this application", "how to use this program", "how to use this software","how to use this tool", "how to use this utility", "how to use this system", "how to use this service", "how to use this product", "how to use this item", "how to use this itemflow","how to use this itemflow app", "how to use this itemflow application", "how to use itemflow", "how to use itemflow app", "how to use itemflow application", "how to use itemflow program","how to use itemflow software", "how to use itemflow tool", "how to use itemflow utility", "how to use itemflow system", "how to use itemflow service", "how to use itemflow product","how to use itemflow item", "how to use itemflow itemflow", "how to use itemflow itemflow app", "how to use itemflow itemflow application",};
    public static final String[] CAN_COMMAND = {"what can you do", "what can you do for me", "what can you do for me today", "what can you do for me right now", "what can you do for me right now","what can u do", "what can u do for me", "what can u do for me today", "what can u do for me right now", "what can u do for me right now"};
    public static final String[] HOW_ARE_YOU_COMMAND = {"how are you", "how are you doing", "how are you today", "how are you feeling", "how are you feeling today", "how are you feeling right now","how are you feeling today", "how are you feeling right now", "how are u", "how are u doing", "how are u today", "how are u feeling", "how are u feeling today", "how are u feeling right now"};
    public static final String[] NAME_COMMAND = {"what is your name", "what is your name app", "what is your name application", "what is your name program", "what is your name software","what is ur name", "what is ur name app", "what is ur name application", "what is ur name program", "what is ur name software"};
    public static final String[] GOODBYE_COMMAND = {"goodbye", "good bye", "bye", "bye bye", "see you", "see you later", "see you soon", "see you next time", "see you tomorrow", "see you next week","see you next month", "see you next year", "see you next decade", "see you next century", "see you next millennium", "see you next era", "see you next epoch", "see you next period"};
    public static final String[] THANK_YOU_COMMAND = {"thank you", "thanks", "thank you so much", "thanks so much", "thank you very much", "thanks very much", "thank you a lot", "thanks a lot", "thx","thnx", "ty", "tq", "tks", "tysm", "thx so much", "thnx so much", "ty so much", "tq so much", "tks so much", "tysm so much", "thx very much", "thnx very much"};
    public static final String[] OKAY_COMMAND = {"okay", "ok", "sure", "alright", "yes", "yup", "yep", "ya", "yea", "ye", "y", "affirmative", "correct", "right", "indeed", "absolutely", "definitely"};

    // commands go here
    public static final String[] ADD_COMMAND = {"add", "I want to add", "i want to add", "add to list", "add item", "add to my", "add to my list", "add to my items", "add to my item", "add to my inventory", "add to my inventory list",};
    public static final String[] SHOW_COMMAND = {"show", "show list", "show my list", "show my items", "show my item", "show my inventory", "show my inventory list",};
    public static final String[] DELETE_COMMAND = {"delete", "delete item", "delete from list", "delete from my list", "delete from my items", "delete from my item",  "delete from my inventory", "delete from my inventory list", "remove", "I want to remove", "i want to remove", "remove from list", "remove item", "remove from my", "remove from my list", "remove from my items", "remove from my item", "remove from my inventory", "remove from my inventory list"};
    public static final String[] EDIT_COMMAND = {"edit", "edit item", "edit item info", "edit item information", "edit item details", "edit item detail", "edit item data", "edit item data info", "edit item data information", "edit item data details", "edit item data detail", "edit item data details", "edit item data detail",};
    
    public static final String[] EXIT_COMMAND = {"exit", "exit program", "exit app", "exit application", "exit itemflow", "exit itemflow app", "exit itemflow application",};
    public static final String[] HELP_COMMAND = {"help", "help me", "help me out", "help me please", "help me with this", "help me with this app", "help me with this application", "help me with this program", "help me with this software", "help me with this tool", "help me with this utility", "help me with this system", "help me with this service", "help me with this product", "help me with this item", "help me with this itemflow", "help me with this itemflow app", "help me with this itemflow application",};
    public static final String[] ABOUT_COMMAND = {"about", "about me", "about this", "about this app", "about this application", "about this program", "about this software", "about this tool", "about this utility", "about this system", "about this service", "about this product", "about this item", "about this itemflow", "about this itemflow app", "about this itemflow application",};

    public static final String[] SEARCH_COMMAND = {"search", "search item", "search item info", "search item information", "search item details", "search item detail", "search item data", "search item data info", "search item data information", "search item data details", "search item data detail", "search item data details", "search item data detail",
    "find", "find item", "find item info", "find item information", "find item details", "find item detail", "find item data", "find item data info", "find item data information", "find item data details", "find item data detail", "find item data details", "find item data detail",};
    // item info
    public static final String[] ITEM_ID = {"item id", "item identification", "item identification number", "item number", "item code", "item code number", "item code id", "item code identification", "item code identification number", "item code number", "item code id", "item code identification", "item code identification number",};
    public static final String[] ITEM_NAME = {"item name", "item title", "item title name", "item title info", "item title information", "item title details", "item title detail", "item title data", "item title data info", "item title data information", "item title data details", "item title data detail", "item title data details", "item title data detail",};
    public static final String[] ITEM_PRICE = {"item price", "item cost", "item cost price", "item cost info", "item cost information", "item cost details", "item cost detail", "item cost data", "item cost data info", "item cost data information", "item cost data details", "item cost data detail", "item cost data details", "item cost data detail",};
    public static final String[] ITEM_QUANTITY = {"item quantity", "item amount", "item amount quantity", "item amount info", "item amount information", "item amount details", "item amount detail",  "item amount data", "item amount data info", "item amount data information", "item amount data details", "item amount data detail", "item amount data details", "item amount data detail",};
    public static final String[] ITEM_CATEGORY = {"item category", "item type", "item type category", "item type info", "item type information", "item type details", "item type detail", "item type data", "item type data info", "item type data information", "item type data details", "item type data detail", "item type data details", "item type data detail",};
    public static final String[] CLEAR_COMMAND = {"clear", "clear list", "clear my list", "clear my items", "clear my item", "clear my inventory", "clear my inventory list",};
    
    // request commands
    public static final String[] NAME = {"name", "item name", "item title", "item title name", "item title info", "item title information", "item title details", "item title detail", "item title data", "item title data info", "item title data information", "item title data details", "item title data detail", "item title data details", "item title data detail",};
    public static final String[] PRICE = {"price", "item price", "item cost", "item cost price", "item cost info", "item cost information", "item cost details", "item cost detail", "item cost data", "item cost data info", "item cost data information", "item cost data details", "item cost data detail", "item cost data details", "item cost data detail",};
    public static final String[] QUANTITY = {"quantity", "item quantity", "item amount", "item amount quantity", "item amount info", "item amount information", "item amount details", "item amount detail",  "item amount data", "item amount data info", "item amount data information", "item amount data details", "item amount data detail", "item amount data details", "item amount data detail",};
    public static final String[] CATEGORY = {"category", "item category", "item type", "item type category", "item type info", "item type information", "item type details", "item type detail", "item type data", "item type data info", "item type data information", "item type data details", "item type data detail", "item type data details", "item type data detail",};
    public static final String[] ID = {"id", "item id", "item identification", "item identification number", "item number", "item code", "item code number", "item code id", "item code identification", "item code identification number", "item code number", "item code id", "item code identification", "item code identification number",};

    // request questions
    public static final String[] REQUEST_ID = {"what is the item ID?", "type the item ID", "enter the item ID", "input the item ID", "provide the item ID"};
    public static final String[] REQUEST_NAME = {"what is the item name?", "type the item name", "enter the item name", "input the item name", "provide the item name"};
    public static final String[] REQUEST_PRICE = {"what is the item price?", "type the item price", "enter the item price", "input the item price", "provide the item price"};
    public static final String[] REQUEST_QUANTITY = {"what is the item quantity?", "type the item quantity", "enter the item quantity", "input the item quantity", "provide the item quantity"};
    public static final String[] REQUEST_CATEGORY = {"what is the item category?", "type the item category", "enter the item category", "input the item category", "provide the item category"};
       
    
    
    // responses
    public static final String[] INTRODUCE_RESPONSE = {"Hi! I'm itemflow!, your personal iten manager!. How can I help you today?", "Hello! I'm itemflow!, your personal item manager!. How can I help you today?", "Hey! I'm itemflow!, your personal item manager!. How can I help you today?", "Hi! I'm itemflow!, your personal item manager!. How can I assist you today?"};
    public static final String[] HELLO_RESPONSE = {"Hello!", "Hi!", "Hey!", "Hello! How can I help you?", "Hi! How can I help you?", "Hey! How can I help you?", "Hello! How can I assist you?", "Hi! How can I assist you?", "Hey! How can I assist you?", "Hello! How can I support you?", "Hi! How can I support you?", "Hey! How can I support you?", "Hello! How can I aid you?", "Hi! How can I aid you?", "Hey! How can I aid you?", "Hello! How can I assist you today?"};
    public static final String[] QUESTION_RESPONSE = {"This is itemflow!", "This is itemflow app!", "This is itemflow application!", "This is itemflow program!", "This is itemflow software!", "This is itemflow tool!", "This is itemflow utility!", "This is itemflow system!", "This is itemflow service!", "This is itemflow product!", "This is itemflow item!", "This is itemflow itemflow!", "This is itemflow itemflow app!", "This is itemflow itemflow application!"};
    public static final String[] HOW_RESPONSE = {"You can use itemflow to manage your items!", "You can use itemflow to manage your inventory!", "You can use itemflow to manage your products!", "You can use itemflow to manage your items and inventory!", "You can use itemflow to manage your items and products!", "You can use itemflow to manage your inventory and products!", "You can use itemflow to manage your items, inventory, and products!", "You can use itemflow to manage your items, inventory, products, and more!"};
    public static final String[] CAN_RESPONSE = {"I can help you manage your items!", "I can help you manage your inventory!", "I can help you manage your products!", "I can help you manage your items and inventory!", "I can help you manage your items and products!", "I can help you manage your inventory and products!", "I can help you manage your items, inventory, and products!", "I can help you manage your items, inventory, products, and more!"};
    public static final String[] HOW_ARE_YOU_RESPONSE = {"I'm doing well, thank you!", "I'm doing great, thank you!", "I'm doing fine, thank you!", "I'm feeling good, thank you!", "I'm feeling great, thank you!", "I'm feeling fine, thank you!", "I'm feeling well, thank you!","I'm feeling good today, thank you!", "I'm feeling great today, thank you!", "I'm feeling fine today, thank you!", "I'm feeling well today, thank you!", "I'm feeling good right now, thank you!", "I'm feeling great right now, thank you!", "I'm feeling fine right now, thank you!", "I'm feeling well right now, thank you!"};
    public static final String[] NAME_RESPONSE = {"My name is itemflow!", "My name is itemflow app!", "My name is itemflow application!", "My name is itemflow program!", "My name is itemflow software!", "My name is itemflow tool!", "My name is itemflow utility!", "My name is itemflow system!"};
    public static final String[] GOODBYE_RESPONSE = {"Goodbye!", "Good bye!", "Bye!", "Bye bye!", "See you!", "See you later!", "See you soon!", "See you next time!", "Have a great day!"};

    public static final String[] DEFAULT_RESPONSE = {"I'm sorry, I don't understand. Can you please repeat that?", "I'm sorry, I didn't get that. Can you please say that again?", "I'm sorry, I'm not sure what you mean. Can you please clarify?", "I'm sorry, I didn't catch that. Can you please repeat?", "I'm sorry, I didn't hear that. Can you please say that again?"};

    public static final String[] EMPTY_RESPONSE = {"Please type something!", "Please say something!", "Please enter something!", "Please provide something!", "Please input something!"};
    public static final String[] OKAY_RESPONSE = {"Okay!", "Alright!", "Sure!", "Got it!", "Understood!", "Roger that!", "Copy that!", "Affirmative!", "Yes!", "Yes, I understand!"};
    public static final String[] THANKS_RESPONSE = {"You're welcome!", "No problem!", "No worries!", "Don't mention it!", "My pleasure!", "Anytime!", "Glad to help!", "Happy to help!"};
    // add item
    public static final String[] ADD_RESPONSE = {"Item added successfully!", "Item added to list!", "Item added to inventory!", "Item added to items!", "Item added to list!", "Item added to my inventory!", "Item added to my items!", "Item added to my item!", "Item added to my inventory list!"};
    public static final String[] ADD_ERROR = {"Error adding item!", "Failed to add item!", "Item not added!", "Item not added to list!", "Item not added to inventory!"};
    public static final String[] ADD_DUPLICATE = {"Item already exists!", "Item already in list!", "Item already in inventory!", "Item already in items!"};
    public static final String[] ADD_QUESTION_ID = {"What is the item ID?", "type the item ID", "enter the item ID", "input the item ID", "provide the item ID"};
    public static final String[] ADD_QUESTION_NAME = {"What is the item name?", "type the item name", "enter the item name", "input the item name", "provide the item name"};
    public static final String[] ADD_QUESTION_PRICE = {"What is the item price?", "type the item price", "enter the item price", "input the item price", "provide the item price"};
    public static final String[] ADD_QUESTION_QUANTITY = {"What is the item quantity?", "type the item quantity", "enter the item quantity", "input the item quantity", "provide the item quantity"};
    public static final String[] ADD_QUESTION_CATEGORY = {"What is the item category?", "type the item category", "enter the item category", "input the item category", "provide the item category"};
    // remove item
    public static final String[] REMOVE_RESPONSE = {"Item removed successfully!", "Item removed from list!", "Item removed from inventory!", "Item removed from items!", "Item removed from list!"};
    public static final String[] REMOVE_ERROR = {"Error removing item!", "Failed to remove item!", "Item not removed!", "Item not removed from list!", "Item not removed from inventory!"};
    public static final String[] REMOVE_NOT_FOUND = {"Item not found!", "Item not in list!", "Item not in inventory!", "Item not in items!"};
    public static final String[] REMOVE_QUESTION_ID = {"What is the item ID?", "type the item ID", "enter the item ID", "input the item ID", "provide the item ID"};
    // show list
    public static final String[] SHOW_RESPONSE = {"Showing list!", "Showing my list!", "Showing my items!", "Showing my item!", "Showing my inventory!", "Showing my inventory list!"};
    public static final String[] SHOW_ERROR = {"Error showing list!", "Failed to show list!", "List not shown!", "List not shown!", "Items not shown!", "Items not shown!"};
    public static final String[] SHOW_EMPTY = {"List is empty!", "My list is empty!", "My items are empty!", "My item is empty!", "My inventory is empty!", "My inventory list is empty!"};
    // delete item
    public static final String[] DELETE_RESPONSE = {"Item deleted successfully!", "Item deleted from list!", "Item deleted from inventory!", "Item deleted from items!", "Item deleted from list!"};
    public static final String[] DELETE_ERROR = {"Error deleting item!", "Failed to delete item!", "Item not deleted!", "Item not deleted from list!", "Item not deleted from inventory!"};
    public static final String[] DELETE_NOT_FOUND = {"Item not found!", "Item not in list!", "Item not in inventory!", "Item not in items!"};
    public static final String[] DELETE_QUESTION_ID = {"What is the item ID?", "type the item ID", "enter the item ID", "input the item ID", "provide the item ID"};
    // edit item info
    public static final String[] EDIT_RESPONSE = {"Item info edited successfully!", "Item info edited!", "Item info updated!", "Item info changed!", "Item info modified!"};
    public static final String[] EDIT_ERROR = {"Error editing item info!", "Failed to edit item info!", "Item info not edited!", "Item info not updated!", "Item info not changed!"};
    public static final String[] EDIT_NOT_FOUND = {"Item not found!", "Item not in list!", "Item not in inventory!", "Item not in items!"};
    public static final String[] EDIT_QUESTION_ID = {"What is the item ID?", "type the item ID", "enter the item ID", "input the item ID", "provide the item ID"};
    public static final String[] EDIT_QUESTION_NAME = {"What is the new item name?", "type the new item name", "enter the new item name", "input the new item name", "provide the new item name"};
    public static final String[] EDIT_QUESTION_PRICE = {"What is the new item price?", "type the new item price", "enter the new item price", "input the new item price", "provide the new item price"};
    public static final String[] EDIT_QUESTION_QUANTITY = {"What is the new item quantity?", "type the new item quantity", "enter the new item quantity", "input the new item quantity", "provide the new item quantity"};
    public static final String[] EDIT_QUESTION_CATEGORY = {"What is the new item category?", "type the new item category", "enter the new item category", "input the new item category", "provide the new item category"};
    public static final String[] EDIT_QUESTION = {"What would you like to edit?", "What do you want to edit?", "What do you want to change?", "What do you want to modify?", "What do you want to update?"};
    // help
    public static final String[] HELP_RESPONSE = {"I can help you manage your items!", "I can help you manage your inventory!", "I can help you manage your products!"};
    // search item
    public static final String[] SEARCH_RESPONSE = {"Item found!", "Item found in list!", "Item found in inventory!", "Item found in items!", "Item found in list!"};
    public static final String[] SEARCH_ERROR = {"Error searching item!", "Failed to search item!", "Item not found!", "Item not found in list!", "Item not found in inventory!"};
    public static final String[] SEARCH_NOT_FOUND = {"Item not found!", "Item not in list!", "Item not in inventory!", "Item not in items!"};
    public static final String[] SEARCH_ID_NOT_FOUND = {"ID not found", "ID is invalid"};
    public static final String[] SEARCH_NAME_NOT_FOUND = {"Item name not found!", "Item name not in list!", "Item name not in inventory!", "Item name not in items!"};
    public static final String[] SEARCH_QUESTION_ID = {"What is the item ID?", "type the item ID", "enter the item ID", "input the item ID", "provide the item ID"};
    // clear list
    public static final String[] CLEAR_RESPONSE = {"List cleared successfully!", "My list cleared!", "My items cleared!", "My item cleared!", "My inventory cleared!", "My inventory list cleared!"};
    public static final String[] CLEAR_ERROR = {"Error clearing list!", "Failed to clear list!", "List not cleared!", "List not cleared!", "Items not cleared!", "Items not cleared!"};
    public static final String[] CLEAR_EMPTY = {"List is empty!", "My list is empty!", "My items are empty!", "My item is empty!", "My inventory is empty!", "My inventory list is empty!"};
    // exit
    public static final String[] EXIT_RESPONSE = {"Goodbye!", "Good bye!", "Bye!", "Bye bye!", "See you!", "See you later!", "See you soon!", "See you next time!"};
    

    // error
    public static final String[] ID_EXISTS = {"Item ID already exists!", "Item ID already in list!", "Item ID already in inventory!", "Item ID already in items!"};
    public static final String ERROR = "An error occurred!";


    // Discord
    // Noa_de_Furrigechaft
    // Hayamij
    
}
