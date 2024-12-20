package GUI;

import config.CommonConstants;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Console extends JPanel{

    public Console() {
        setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn(CommonConstants.COLUMN_NAMES[0]);
        model.addColumn(CommonConstants.COLUMN_NAMES[1]);
        model.addColumn(CommonConstants.COLUMN_NAMES[2]);
        model.addColumn(CommonConstants.COLUMN_NAMES[3]);
        model.addColumn(CommonConstants.COLUMN_NAMES[4]);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        JButton btn = new JButton("Refresh");
        btn.addActionListener(e -> {
            try (BufferedReader br = new BufferedReader(new FileReader("data.txt"));) {
                String line;
                model.setRowCount(0);
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(", ");
                    model.addRow(data);
                }
                br.close();
            } catch (IOException ex) {
                Home.chatArea.append("Error: " + ex.getMessage() + "\n");
            }
        });
        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.NORTH);
        buttonPanel.add(btn);
    }
}