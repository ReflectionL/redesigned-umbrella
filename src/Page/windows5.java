package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows5 extends JFrame {
    public static void main(String[] args){
        new windows5();
    }

    public windows5() {
        //this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);

        JLabel jLabel1 = new JLabel("Other service");
        jLabel1.setBounds(400,20,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));

        JLabel jLabel2 = new JLabel("Standard Plane meal (Pasta + hamburger)* 1： ￥58");
        jLabel2.setBounds(200,140,1000,25);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel3 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel3.setBounds(0,100,8000,25);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel5 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel5.setBounds(0,180,8000,25);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel6 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel6.setBounds(0,420,8000,25);
        jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel4 = new JLabel("Insurance：");
        jLabel4.setBounds(200,200,400,25);
        jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JButton jButton1 = new JButton("<html>"+"No insurance"+"<br>"+"Give up"+"<html>");
        JButton jButton2 = new JButton("<html>"+"Standard insurance"+"<br>"+"￥20"+"<html>");
        JButton jButton3 = new JButton("<html>"+"Supreme insurance"+"<br>"+"￥50"+"<html>");
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jButton3.setFont(new Font("微软雅黑", Font.BOLD, 16));

        JButton jButton4 = new JButton("Details");
        JButton jButton5 = new JButton("Reserve");
        JButton jButton6 = new JButton("Back");

        jButton1.setBounds(220,270,110,130);
        jButton1.setMargin(new Insets(0,0,0,0));
        jButton2.setBounds(400,270,110,130);
        jButton3.setBounds(580,270,110,130);
        JLabel jLabel7 = new JLabel("Price： ￥580");
        jLabel7.setBounds(200,450,400,25);
        jLabel7.setFont(new Font("微软雅黑", Font.BOLD, 25));

        jButton4.setBounds(400,450,50,20);
        jButton4.setMargin(new Insets(0,0,0,0));
        jButton5.setBounds(750,550,120,40);
        jButton5.setBackground(new Color(255, 140, 0));
        jButton6.setBounds(930,550,120,40);
        jButton6.setBackground(new Color(30, 144, 255));
        jButton6.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton5.setFont(new Font("微软雅黑", Font.BOLD, 20));

        container1.add(jLabel1);
        container1.add(jLabel3);
        container1.add(jLabel2);
        container1.add(jLabel5);
        container1.add(jLabel4);
        container1.add(jButton1);
        container1.add(jButton2);
        container1.add(jButton3);
        container1.add(jButton4);
        container1.add(jButton5);
        container1.add(jButton6);

        container1.add(jLabel6);
        container1.add(jLabel7);

        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(6);
            }
        });
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(4);
            }
        });
    }
}
