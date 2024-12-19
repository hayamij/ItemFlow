package GUI;

import config.CommonConstants;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Windows extends JFrame {
    public Windows () {
        setTitle(CommonConstants.WINDOW_TITLE);
        setSize(CommonConstants.WINDOW_WIDTH, CommonConstants.WINDOW_HEIGHT);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedpane = new JTabbedPane();

        Home hometab = new Home();
        Settings settingtab = new Settings();
        Help helptab = new Help();

        tabbedpane.addTab(CommonConstants.TABS[0], hometab);
        tabbedpane.addTab(CommonConstants.TABS[1], settingtab);
        tabbedpane.addTab(CommonConstants.TABS[3], helptab);

        add(tabbedpane);
    }
}