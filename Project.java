package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    public Project() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        add(image);

        JMenuBar mb = new JMenuBar();

        // Menu setup
        createMenu(mb, "New Information", Color.BLUE, "New Faculty Information", "New Student Information");
        createMenu(mb, "View Details", Color.RED, "View Faculty Details", "View Student Details");
        createMenu(mb, "Apply Leave", Color.BLUE, "Faculty Leave", "Student Leave");
        createMenu(mb, "Leave Details", Color.RED, "Faculty Leave Details", "Student Leave Details");
        createMenu(mb, "Examination", Color.BLUE, "Examination Results", "Enter Marks");
        createMenu(mb, "Update Details", Color.RED, "Update Faculty Details", "Update Student Details");
        createMenu(mb, "Fee Details", Color.BLUE, "Fee Structure", "Student Fee Form");

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        addMenuItem(utility, "Notepad");
        addMenuItem(utility, "Calculator");
        mb.add(utility);

        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        addMenuItem(about, "About");
        mb.add(about);

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        addMenuItem(exit, "Exit");
        mb.add(exit);

        setJMenuBar(mb);
        setVisible(true);
    }

    private void createMenu(JMenuBar mb, String title, Color color, String... items) {
        JMenu menu = new JMenu(title);
        menu.setForeground(color);
        for (String item : items) {
            addMenuItem(menu, item);
        }
        mb.add(menu);
    }

    private void addMenuItem(JMenu menu, String title) {
        JMenuItem item = new JMenuItem(title);
        item.setBackground(Color.WHITE);
        item.addActionListener(this);
        menu.add(item);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        try {
            switch (msg) {
                case "Exit" -> setVisible(false);
                case "Calculator" -> Runtime.getRuntime().exec("calc.exe");
                case "Notepad" -> Runtime.getRuntime().exec("notepad.exe");
                case "New Faculty Information" -> new AddTeacher();
                case "New Student Information" -> new AddStudent();
                case "View Faculty Details" -> new TeacherDetails();
                case "View Student Details" -> new StudentDetails();
                case "Faculty Leave" -> new TeacherLeave();
                case "Student Leave" -> new StudentLeave();
                case "Faculty Leave Details" -> new TeacherLeaveDetails();
                case "Student Leave Details" -> new StudentLeaveDetails();
                case "Update Faculty Details" -> new UpdateTeacher();
                case "Update Student Details" -> new UpdateStudent();
                case "Enter Marks" -> new EnterMarks();
                case "Examination Results" -> new ExaminationDetails();
                case "Fee Structure" -> new FeeStructure();
                case "Student Fee Form" -> new StudentFeeForm();
                case "About" -> new About();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
