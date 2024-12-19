package GUI;
import javax.swing.*;
import java.awt.*;

public class Help extends JPanel {
    public Help() {
        setLayout(new BorderLayout());

        JTextArea helpText = new JTextArea();
        helpText.setEditable(false);
        helpText.setText(getHelpText());

        JScrollPane scrollPane = new JScrollPane(helpText);
        add(scrollPane, BorderLayout.CENTER);
    }

    private String getHelpText() {
        return "Bot Help Commands:\n\n" +
                "1. Type 'help' to display this help message.\n" +
                "2. Type 'search <item>' to search for an item.\n" +
                "3. Type 'add <item>' to add an item to the database.\n" +
                "4. Type 'delete <item>' to delete an item from the database.\n" +
                "5. Type 'list' to list all items in the database.\n" +
                "6. Type 'settings' to open the settings window.\n" +
                "7. Type 'exit' to exit the program.\n";
    }
}