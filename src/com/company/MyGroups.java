package com.company;

import java.util.ArrayList;

public class MyGroups {

    public static final int hight = 700;
    public static final int width = 1300;
    private int x;
    private int y;
    private Panel panel;
    private ArrayList<Rectangle> list;

    public MyGroups(int x, int y, Panel panel, ArrayList<Rectangle> list, int speed) {

        this.list=list;
        this.panel=panel;
        this.x=x;
        this.y=y;
        ShapeThread thread = new ShapeThread(list, panel, speed);
        thread.start();
    }
}
