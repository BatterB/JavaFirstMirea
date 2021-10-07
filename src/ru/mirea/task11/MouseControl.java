package ru.mirea.task11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseControl extends JFrame {
    JLabel eastText = new JLabel("east");
    JLabel westText = new JLabel("west");
    JLabel northText = new JLabel("north");
    JLabel southText = new JLabel("south");
    JLabel centerText = new JLabel("  center");
    JPanel panel = new JPanel();


    public MouseControl(){
        super("Java11");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);
        Container window = getContentPane();
        panel.add(northText, BorderLayout.NORTH);
        panel.add(southText, BorderLayout.SOUTH);
        panel.add(westText, BorderLayout.WEST);
        panel.add(eastText, BorderLayout.EAST);
        panel.add(centerText, BorderLayout.CENTER);
        window.add(panel);


        eastText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                eastText.setText("Welcome to east");
            }
        });

        eastText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                eastText.setText("east");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                westText.setText("Welcome to west");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                westText.setText("west");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                northText.setText("Welcome to north");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                northText.setText("north");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                southText.setText("Welcome to south");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                southText.setText("south");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                centerText.setText("Welcome to center");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                eastText.setText("  center");
            }
        });

    }



    public static void main(String[] args) {
        new MouseControl().setVisible(true);
    }
}
