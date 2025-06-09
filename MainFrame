package gui;

import javax.swing.*;
import java.awt.*;
import dao.BookDAO;
import gui.DashboardPanel;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Library Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Books", new JPanel());
        tabs.addTab("Members", new JPanel());
        tabs.addTab("Issue/Return", new JPanel());
        tabs.addTab("Dashboard", new DashboardPanel());

        add(tabs);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
