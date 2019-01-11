package com.aoomiao.test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class showMessageFrame extends javax.swing.JFrame {
  private JLabel text;
  Toolkit tk = Toolkit.getDefaultToolkit();
  public static final int screenWidth =
      (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
  public static final int screenHeight =
      (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
  private String str = null;
  private int x = 0;
  private int y = 0;

  public showMessageFrame(String str) {
    this.str = str;
    start();
  }

  public showMessageFrame(String str,int x,int y) {
    this.x = x;
    this.y = y;
    this.str = str;
    start();
  }

  private void start(){
    new Thread(() -> initGUI()).start();
  }

  public static void main(String[] args) {
    new showMessageFrame("1111");
  }

  private void initGUI() {
    try {
      setUndecorated(true);
      setLocationRelativeTo(null);
      setVisible(true);
      setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      {
        text = new JLabel("<html>" + str + "</html>", JLabel.CENTER);
        getContentPane().add(text, BorderLayout.CENTER);
        text.setBackground(new java.awt.Color(255, 251, 240));
      }
      pack();
      setBounds(screenWidth / 2 - x, screenHeight/2 - y, 200, 80);
      setAlwaysOnTop(true);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e1) {
        e1.printStackTrace();
      }
      dispose();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}