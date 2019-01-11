package com.aoomiao.test;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test {

  private JPanel root;
  private JButton button1;
  public JFrame frame;

  public test() {
    button1.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        button1.setBounds(75, 60, 110, 30);
        frame.repaint();
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("test");
    test test = new test();
    test.frame = frame;
    frame.setTitle("test");
    frame.setContentPane(test.root);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
