package GUI;

import config.CommonConstants;
import javax.swing.*;

public class Windows extends JFrame {
    public Windows () {
        setTitle(CommonConstants.WINDOW_TITLE);
        setSize(CommonConstants.WINDOW_WIDTH, CommonConstants.WINDOW_HEIGHT);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedpane = new JTabbedPane();

        Home hometab = new Home();
        Help helptab = new Help();
        Console consoletab = new Console();
        About abouttab = new About();

        tabbedpane.addTab(CommonConstants.TABS[0], hometab);
        tabbedpane.addTab(CommonConstants.TABS[3], helptab);
        tabbedpane.addTab(CommonConstants.TABS[2], consoletab);
        tabbedpane.addTab(CommonConstants.TABS[4], abouttab);

        add(tabbedpane);
    }    
}