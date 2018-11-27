package com.company;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Laba4");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<Rectangle> list1 = new ArrayList<>();

        list1.add(new Rectangle(100, 100, 110, 110, MyGroups.hight, MyGroups.width, false, true));
        list1.add(new Rectangle(100, 100, 220, 220, MyGroups.hight, MyGroups.width, false, true));
        list1.add(new Rectangle(100, 100, 330, 330, MyGroups.hight, MyGroups.width, false, true));

        ArrayList<Rectangle> list2 = new ArrayList<>();

        list2.add(new Rectangle(100, 100, 550, 550, MyGroups.hight, MyGroups.width, true, true));
        //list2.add(new Rectangle(100, 100, 400, 450, MyGroups.hight, MyGroups.width, false, true));

        ArrayList<Rectangle> list3 = new ArrayList<>();

        list3.add(new Rectangle(100, 100, 800, 500, MyGroups.hight, MyGroups.width, false, false));

        Panel panel = new Panel(list1, list2, list3);

        frame.add(panel);
        frame.setSize(1300, 700);
        frame.setVisible(true);

        MyGroups group1 = new MyGroups(0,0, panel, list1, 3);
        MyGroups group2 = new MyGroups(0,350, panel, list2, 13);
        MyGroups group3 = new MyGroups(0,500, panel, list3, 0);

        MouseMover mouseMover = new MouseMover(panel);
    }
}