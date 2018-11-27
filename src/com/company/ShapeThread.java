package com.company;

import java.util.ArrayList;

public class ShapeThread extends Thread {

    private Panel drawer;
    private ArrayList<Rectangle> list;
    private int speed;

    public ShapeThread(ArrayList<Rectangle> list, Panel drawer, int speed) {

        this.list = list;
        this.drawer = drawer;
        this.speed = speed;
    }

    @Override
    public void run() {

        while(true) {

            for(Rectangle rectangle : list) {

                rectangle.go(list);
                drawer.repaint();

                try {

                    Thread.sleep(speed);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
