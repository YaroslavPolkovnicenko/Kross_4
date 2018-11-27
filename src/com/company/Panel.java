package com.company;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel extends JPanel {

    ArrayList<Rectangle> list1;
    ArrayList<Rectangle> list2;
    ArrayList<Rectangle> list3;
    Rectangle rectangle;

    public Panel(ArrayList<Rectangle> list1, ArrayList<Rectangle> list2, ArrayList<Rectangle> list3) {

        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
        this.rectangle = new Rectangle();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        for(Rectangle rectangle : list1) {
            rectangle.draw(g);
        }

        for(Rectangle rectangle : list2) {
            rectangle.draw(g);
        }

        for(Rectangle rectangle : list3) {
            rectangle.draw(g);
        }
    }
}