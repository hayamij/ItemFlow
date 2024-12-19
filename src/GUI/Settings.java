package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JPanel {
    public Settings(){

        JPanel setting = new JPanel(new BorderLayout());
        JPanel settingsPanel = new JPanel(new GridLayout(4, 2));
        setting.add(settingsPanel, BorderLayout.NORTH);
        

        String[] languages = {"English", "Vietnamese"};
        String[] databases = {"database1.txt", "database2.txt"};
        String[] fontSizes = {"12", "14", "16", "18", "20"};
        String[] fontTypes = {"Serif", "SansSerif", "Monospaced"};

        JLabel languageLabel = new JLabel("Language:");
        JComboBox<String> languageComboBox = new JComboBox<>(languages);

        JLabel databaseLabel = new JLabel("Database:");
        JComboBox<String> databaseComboBox = new JComboBox<>(databases);

        JLabel fontSizeLabel = new JLabel("Font Size:");
        JComboBox<String> fontSizeComboBox = new JComboBox<>(fontSizes);

        JLabel fontTypeLabel = new JLabel("Font Type:");
        JComboBox<String> fontTypeComboBox = new JComboBox<>(fontTypes);

        JButton applyButton = new JButton("Apply");
        JButton closeButton = new JButton("Close");

        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        settingsPanel.add(languageLabel);
        settingsPanel.add(languageComboBox);
        settingsPanel.add(databaseLabel);
        settingsPanel.add(databaseComboBox);
        settingsPanel.add(fontSizeLabel);
        settingsPanel.add(fontSizeComboBox);
        settingsPanel.add(fontTypeLabel);
        settingsPanel.add(fontTypeComboBox);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
        buttonPanel.add(applyButton);
        buttonPanel.add(closeButton);
        
        add(settingsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
}
