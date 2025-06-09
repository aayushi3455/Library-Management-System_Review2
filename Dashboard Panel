package gui;
import javax.swing.*;
import dao.BookDAO;
import java.awt.*;

public class DashboardPanel extends JPanel {
    public DashboardPanel() {
        setLayout(new GridLayout(2, 2, 20, 20));

        int total = BookDAO.getAllBooks().size();
        int issued = (int) BookDAO.getAllBooks().stream().filter(Book::isIssued).count();
        int available = total - issued;

        add(createBox("Total Books", total));
        add(createBox("Issued Books", issued));
        add(createBox("Available Books", available));
    }

    private JPanel createBox(String title, int count) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(title));
        panel.add(new JLabel("Count: " + count));
        return panel;
    }
}
