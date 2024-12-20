package GUI;
import java.awt.*;
import javax.swing.*;

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
        return """
                Bot Help Commands:

                1. Type 'search' to search for an item.
                2. Type 'add' to add an item to the database.
                3. Type 'delete' to delete an item from the database.
                4. Type 'list' to list all items in the database.
                5. Type 'edit' to edit an item in the database.
                """;
    }
}