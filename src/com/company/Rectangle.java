package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Rectangle {

    private Color color;
    private int width;
    private int height;
    private int x;
    private int y;
    private int direction;
    private int Height;
    private int Width;
    private boolean с;
    private final int temp = 4;
    private boolean move;

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isС() {
        return с;
    }

    public void setС(boolean с) {
        this.с = с;
    }

    public int getTemp() {
        return temp;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle(){

    }

    public Rectangle(int width, int height, int x, int y, int Height, int Width, boolean c, boolean move) {

        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.move = move;
        this.с = c;
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        this.color = new Color(r, g, b);
        this.Height = Height;
        this.Width = Width;
        if (move) {
            if (с) {
                direction = 1;
                с = false;
            } else {
                direction = -1;
                с = true;
            }

            //this.a = a;
        } else direction = 0;
    }

    public void draw(Graphics graphics) {

        graphics.setColor(color);
        graphics.fillRect(x, y, width, height);
    }

    public void CheckLeft(ArrayList<Rectangle> list1, ArrayList<Rectangle> list2, ArrayList<Rectangle> list3) {

        for (int i = 0; i < list1.size(); i++) {

            if ((list1.get(i).getX() + list1.get(i).getWidth()) >= list3.get(0).getX() && (list1.get(i).getX() + list1.get(i).getWidth()) <= (list3.get(0).getX() + list3.get(0).getWidth())) {
                if (list1.get(i).getY() <= (list3.get(0).getY() + list3.get(0).getHeight()) && (list1.get(i).getY() + list1.get(i).getHeight()) >= list3.get(0).getY()) {
                    for (int j = 0; j < list1.size(); j++) {
                        list1.get(j).setDirection(list1.get(j).getDirection() * (-1));
                    }
                   // break;
                }
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            if ((list2.get(i).getX() + list2.get(i).getWidth()) >= list3.get(0).getX() && (list2.get(i).getX() + list2.get(i).getWidth()) <= (list3.get(0).getX() + list3.get(0).getWidth())) {
                if (list2.get(i).getY() <= (list2.get(0).getY() + list2.get(0).getHeight()) && (list2.get(i).getY() + list2.get(i).getHeight()) >= list3.get(0).getY()) {
                    for (int j = 0; j < list2.size(); j++) {
                        list2.get(j).setDirection(list2.get(j).getDirection() * (-1));
                    }
                    //break;
                }
            }
        }
    }

        public void CheckRight(ArrayList<Rectangle> list1, ArrayList<Rectangle> list2, ArrayList<Rectangle> list3) {

        for (int i = 0; i < list1.size(); i++) {
            if ((list3.get(0).getX() + list3.get(0).getWidth()) >= list1.get(i).getX() && (list3.get(0).getX() + list3.get(0).getWidth()) <= (list1.get(i).getX() + list1.get(i).getWidth())) {
                if (list3.get(0).getY() <= (list1.get(i).getY() + list1.get(i).getHeight()) && (list3.get(0).getY() + list3.get(0).getHeight()) >= list1.get(i).getY())
                {
                    for (int j = 0; j < list1.size(); j++) {
                        list1.get(j).setDirection(list1.get(j).getDirection() * (-1));
                    }
                    //break;
                }
            }
        }

            for(int i = 0; i < list2.size(); i++) {
                if ((list3.get(0).getX() + list3.get(0).getWidth()) >= list2.get(i).getX() && (list3.get(0).getX() + list3.get(0).getWidth()) <= (list2.get(i).getX() + list2.get(i).getWidth())) {
                    if (list3.get(0).getY() <= (list2.get(i).getY() + list2.get(i).getHeight()) && (list3.get(0).getY() + list3.get(0).getHeight()) >= list2.get(i).getY())
                    {
                        for (int j = 0; j < list2.size(); j++) {
                            list2.get(j).setDirection(list2.get(j).getDirection() * (-1));
                    }
                        //break;

                    }
                }
            }
        }

    public void go(ArrayList<Rectangle> list) {

        if (move) {
            for(int i = 0; i < list.size(); i++) {
                if (list.get(i).getX() <= 0) {
                    for (int j = 0; j < list.size(); j++) {
                        list.get(j).setDirection(1);
                        direction = 1;
                    }
                } else if ((list.get(i).getX() + width) >= Width) {
                    for (int j = 0; j < list.size(); j++) {
                        list.get(j).setDirection(-1);
                        direction = -1;
                    }
                }
            }

            switch (direction) {

                case 1:
                    x += temp;
                    break;
                case -1:
                    x -= temp;
                    break;
            }
        }
    }
}
