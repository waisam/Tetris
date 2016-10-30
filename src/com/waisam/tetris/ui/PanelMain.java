package com.waisam.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by waisam on 2016/2/5.
 */
public class PanelMain extends JPanel {

    private int width;

    private int height;

    @Override
    public void paintComponent(Graphics g) {
        this.paintBackground(g);
        new Layer(30,60,200,180,10).drawLayer(g);
        new Layer(30,300,200,180,10).drawLayer(g);
        new Layer(290,60,200,420,10).drawLayer(g);
        new Layer(550,60,200,120,10).drawLayer(g);
        new Layer(550,210,200,120,10).drawLayer(g);
        new Layer(550,360,200,120,10).drawLayer(g);
    }

    /**
     * 绘制panel背景图
     * @param g
     */
    public void paintBackground(Graphics g) {
        //背景图
        Image background = new ImageIcon("graphics/background/Sea.jpg").getImage();
        //默认panel背景分辨率
        g.drawImage(background,0,0,this.width,this.height,0,0,800,450,null);
    }

    public PanelMain setWidth(int width) {
        this.width = width;
        return this;
    }

    public PanelMain setHeight(int height) {
        this.height = height;
        return this;
    }
}

