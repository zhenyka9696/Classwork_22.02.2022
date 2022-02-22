import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunAll {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Browser History");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        Font font = new Font("sans-serif", Font.PLAIN, 12);
        UIManager.put("Menu.font", font);
        UIManager.put("MenuItem.font", font);

        JMenu memuHelloCli = new JMenu("HelloCLI");
        JMenuItem itemHelloEn = new JMenuItem("HelloEn");
        JMenuItem itemHelloRu = new JMenuItem("HelloRu");
        memuHelloCli.add(itemHelloEn);
        memuHelloCli.add(itemHelloRu);
        menuBar.add(memuHelloCli);

        JMenu menuHelloGui = new JMenu("HelloGUI");
        JMenuItem itemHelloGuiEn = new JMenuItem("HelloEn");
        JMenuItem itemHelloGuiRu = new JMenuItem("HelloRu");
        menuHelloGui.add(itemHelloGuiEn);
        menuHelloGui.add(itemHelloGuiRu);
        menuBar.add(menuHelloGui);

        JMenu menuAlgs = new JMenu("Algorithms");
        JMenuItem itemAlgLinear = new JMenuItem("Linear");
        JMenuItem itemAlgBranched = new JMenuItem("Branched");
        JMenuItem itemAlgCyclic = new JMenuItem("Cyclic");
        menuAlgs.add(itemAlgLinear);
        menuAlgs.add(itemAlgBranched);
        menuAlgs.add(itemAlgCyclic);
        menuBar.add(menuAlgs);

        JMenu menuExit = new JMenu("Exit");
        menuBar.add(menuExit);

        itemHelloEn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello, world!");
            }
        });

        itemHelloRu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Привет, мир!");
            }
        });

        itemHelloGuiEn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hello, world!");
            }
        });

        itemHelloGuiRu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Привет, мир!");
            }
        });

        itemAlgLinear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                //Linear algorithm
                System.out.println("Wake up");
                System.out.println("Get up");
                System.out.println("Make the bed");
                System.out.println("Get dressed");
                System.out.println("Drink a glass of water");
                System.out.println("Brush teeth");
            }
        });

        itemAlgBranched.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                //Branched algorithm
                int points = 70;
                if (points<30)
                    System.out.println("Your mark is 3");
                else if (points<50)
                    System.out.println("Your mark is 4");
                else
                    System.out.println("Your mark is 5");
            }
        });

        itemAlgCyclic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                //Cyclic algorithm
                for (int i=0; i<10; i++){
                    System.out.print("Fall forward, ");
                    System.out.print("Push up, ");
                    System.out.println("Stand up");
                }
            }
        });

        menuExit.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                System.exit(0);
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    }

