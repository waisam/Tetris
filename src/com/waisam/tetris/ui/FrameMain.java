package com.waisam.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by waisam on 2016/2/5.
 */
public class FrameMain extends JFrame {

    public FrameMain() {
        //设置标题
        this.setTitle("Java Tetris");
        //设置窗口大小
        this.setSize(800,600);
        //设置不可缩放
        this.setResizable(false);
        //设置默认关闭属性
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //获取屏幕的分辨率
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int screenWidth = dimension.width;
        int screenHeight = dimension.height;
        //设置窗口居中
        int x = (screenWidth - this.getWidth())/2;
        int y = (screenHeight - this.getHeight())/2;
        y-=40;
        this.setLocation(x,y);
        //设置窗口默认Panel
        this.setContentPane(new PanelMain());
        //设置窗口可见
        this.setVisible(true);
    }
}
