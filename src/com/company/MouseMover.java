package com.company;

public class MouseMover extends Thread{
    private Panel panel;
    private Rectangle rectangle = new Rectangle();

    public MouseMover(Panel panel) {
        this.panel = panel;
        this.start();
    }

    @Override
    public void run() {
        while (true){
            try {
                this.panel.list3.get(0).setX(this.panel.getMousePosition().x);
                this.panel.list3.get(0).setY(this.panel.getMousePosition().y);
                rectangle.CheckLeft(panel.list1, panel.list2, panel.list3);
                rectangle.CheckRight(panel.list1, panel.list2, panel.list3);
                panel.repaint();
            }
            catch (NullPointerException e){
                e.printStackTrace();
            }

            try {
                sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}