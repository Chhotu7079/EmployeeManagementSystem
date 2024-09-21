package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image image = icon.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);

        ImageIcon icon1 = new ImageIcon(image);
        JLabel label = new JLabel(icon1);
        label.setBounds(0,0,1170,650);
        add(label);

        setSize(1170,650);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
