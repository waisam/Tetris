package com.waisam.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by waisam on 2016/2/10.
 */
public class Layer {

    //边框厚度
    private static final int BORDER = 7;

    //边框左上角点x坐标
    private int x;

    //边框左上角点y坐标
    private int y;

    //边框内宽度
    private int width;

    //边框内高度
    private int height;

    //Panel边框厚度
    private int borderPanel;



    public Layer(int x, int y, int width, int height, int borderPanel) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.borderPanel = borderPanel;
    }

    /**
     * 绘制游戏小窗口
     * @param g
     */
    public void drawLayer(Graphics g) {
        //边框图
        Image img = new ImageIcon("graphics/window/window.png").getImage();
        //图片宽
        int ImgWidth = img.getWidth(null);
        //图片高
        int ImgHeight = img.getHeight(null);
        //边框左上角
        g.drawImage(img,x,y,x + borderPanel,y + borderPanel,0,0,BORDER,BORDER,null);
        //左边框
        g.drawImage(img,x,y + borderPanel,x + borderPanel,y + height + borderPanel,0,BORDER,BORDER,ImgHeight - BORDER,null);
        //上边框
        g.drawImage(img,x + borderPanel,y,x + width + borderPanel,y + borderPanel,BORDER,0,ImgWidth - BORDER,BORDER,null);
        //边框右上角
        g.drawImage(img,x + width + borderPanel,y,x + width + (borderPanel<<1),y + borderPanel,ImgWidth - BORDER,0,ImgWidth,BORDER,null);
        //右边框
        g.drawImage(img,x + width + borderPanel,y + borderPanel,x + width + (borderPanel<<1),y + height + borderPanel,ImgWidth - BORDER,BORDER,ImgWidth,ImgHeight - BORDER,null);
        //边框右下角
        g.drawImage(img,x + width + borderPanel,y + height + borderPanel,x + width + (borderPanel<<1),y + height + (borderPanel<<1),ImgWidth - BORDER,ImgHeight - BORDER,ImgWidth,ImgHeight,null);
        //边框左下角
        g.drawImage(img,x,y + height + borderPanel,x + borderPanel,y + height + (borderPanel<<1),0,ImgHeight - BORDER,BORDER,ImgHeight,null);
        //下边框
        g.drawImage(img,x + borderPanel,y + height + borderPanel,x + width + borderPanel,y + height + (borderPanel<<1),BORDER,ImgHeight - BORDER,ImgWidth - BORDER,ImgHeight,null);
        //边框内背景
        g.drawImage(img,x + borderPanel,y + borderPanel,x + width + borderPanel,y + height + borderPanel,BORDER,BORDER,ImgWidth - BORDER,ImgHeight - BORDER,null);
    }
}
