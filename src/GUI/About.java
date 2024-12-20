package GUI;
import java.awt.*;
import javax.swing.*;

public class About extends JPanel {
    public About() {
        setLayout(new BorderLayout());

        JTextArea aboutText = new JTextArea();
        aboutText.setEditable(false);
        aboutText.setText(getAboutText());

        JScrollPane scrollPane = new JScrollPane(aboutText);
        add(scrollPane, BorderLayout.CENTER);
    }

    private String getAboutText() {
        return """
               A simple chatbot.
               Bằng cách nào đó nó vẫn hoạt động.
               Dù đầy lỗi.
               
               
               Mainly made by @hayamij
               Supported by @noa_de_furrigechaft
               Bio link: https://bio.link/hayami
                              https://bio.link/noawacuti











































                              Nothing here, just a bunch of newlines.
               """;
    }
}
