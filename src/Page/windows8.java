package Page;

import javax.swing.*;
import java.awt.*;

public class windows8 extends JFrame{
    public static void main(String[] args) {
        new windows8();
    }
    public windows8()
    {
        //this.setVisible(true);
        //插入图片
        ImageIcon icon1=new ImageIcon("src/picture/payment.jpg" );
        //添加JLabel 放置图片
        JLabel label1=new JLabel(icon1);
        //设置label的位置、大小，label大小为图片的大小
        label1.setBounds(500,250,icon1.getIconWidth(),icon1.getIconHeight());

        //在frame的底层容器添加label
        this.getLayeredPane().add(label1,(Integer.MIN_VALUE));

        //panel
        JPanel panel =new JPanel();

        //panelTop，顶层容器
        JPanel panelTop=new JPanel();
        panelTop=(JPanel)this.getContentPane();

        //panel和panelTop设置透明
        panelTop.setOpaque(false);
        panel.setOpaque(false);

        //label0，这个是对界面的自定义操作，用作效果展示
        JLabel label0=new JLabel("Please sweep the payment code");
        label0.setFont(new Font("微软雅黑", Font.BOLD, 50));
        label0.setBounds(400,10,800,200);

        panel.add(label0);

        //添加panel，设置大小，可视
        this.add(panel);
        this.setSize(1200, 800);

        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }
}