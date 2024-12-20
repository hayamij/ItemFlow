package GUI;

import config.CommonConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import processor.FileHandler;
import processor.Functions;
import processor.NaturalLanguageProcessor;

public class Home extends JPanel {
    public static String userinput;
    public static JTextArea chatArea = new JTextArea();
    public static JPanel inputPanel = new JPanel(new BorderLayout());
    public static JTextField chatInput = new JTextField();

    public Home() {

        JLabel homeLabel = new JLabel(CommonConstants.HOME_LABEL, SwingConstants.CENTER);
        String name = "name";
        String price = "price";

        JComboBox<String> comboBox = new JComboBox<>(new String[]{name, price});
        comboBox.setLayout(new BorderLayout());
        JPanel custom = new JPanel();
        custom.add(comboBox, BorderLayout.NORTH);
    
        // chat
        chatArea.setEditable(false);

        // button panel
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton sendButton = new JButton(CommonConstants.SEND_BUTTON);
        JButton voiceButton = new JButton(CommonConstants.VOICE_BUTTON);
        buttonPanel.add(sendButton, BorderLayout.CENTER);
        buttonPanel.add(voiceButton, BorderLayout.EAST);

        // input panel

        inputPanel.add(buttonPanel, BorderLayout.EAST);
        inputPanel.add(chatInput, BorderLayout.CENTER);

        // chat panel
        JPanel chatPanel = new JPanel(new BorderLayout());
        JScrollPane chatScrollPane = new JScrollPane(chatArea);
        chatPanel.add(inputPanel, BorderLayout.SOUTH);
        chatPanel.add(chatScrollPane, BorderLayout.CENTER);
        chatPanel.add(custom, BorderLayout.EAST);

        // set font
        Font font = new Font("Arial,", Font.PLAIN, CommonConstants.FONT_SIZE);
        chatArea.setFont(font);
        chatInput.setFont(font);
        sendButton.setFont(font);
        voiceButton.setFont(font);

        // home tabs
        setLayout(new BorderLayout());
        add(homeLabel, BorderLayout.NORTH);
        add(chatPanel, BorderLayout.CENTER);

        // action listeners
        NaturalLanguageProcessor nlp = new NaturalLanguageProcessor();

        chatArea.append(CommonConstants.CHATBOT + "Hello! I am a chatbot. How can I help you today?" + "\n");
        chatArea.append(CommonConstants.CHATBOT + "Im listening..." + "\n");
        FileHandler.createFile();
        
        sendButton.addActionListener(e -> {
            userinput = chatInput.getText();
            if (userinput == null || userinput.isEmpty()) {
                return;
            }
            chatArea.append(CommonConstants.USER + userinput + "\n");
            chatInput.setText("");
            nlp.processUserInput(Functions.removeAccent(userinput));

        });
        chatInput.addActionListener(e -> {
            userinput = chatInput.getText();
            if (userinput == null || userinput.isEmpty()) {
                return;
            }
            chatArea.append(CommonConstants.USER + userinput + "\n");
            chatInput.setText("");
            nlp.processUserInput(Functions.removeAccent(userinput));
        });

        FileHandler.createFile();

    }
}
