import java.awt.*;
import javax.swing.*;


public class bank extends JFrame{
    bank(){
        getContentPane().setBackground(Color.WHITE);
       
       setLayout(null);
       setSize(800,500);
       setVisible(true);
       setTitle("ATM");
        setLocation(350,200);

        
        JLabel atm = new JLabel("Welcome to ATM");
        atm.setFont(new Font("Osward", Font.BOLD,38));
        atm.setBounds(230,40,450,50);
        add(atm);


        JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Raleway", Font.BOLD,20));
        cardno.setBounds(70,160,200,50);
        add(cardno);

        JTextField cardnotTextField = new JTextField();
        cardnotTextField.setBounds(275, 160,230,30);
        add(cardnotTextField);
        
        JLabel pin1 = new JLabel("PIN:");
        pin1.setFont(new Font("Raleway", Font.BOLD,20));
        pin1.setBounds(70,220,200,50);
        add(pin1);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(275, 220,230,30);
        add(pinTextField);

        JButton signin = new JButton("SIGN IN");
        signin.setBounds(230,300,160,40);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        add(signin);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(400,300,160,40);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);

        JButton signup = new JButton("SIGN UP");
        signup.setBounds(290,360,200,40);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup);


       
       // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("new.jpg"));em/icons/logo.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(70,10,100,100);
        add(img);
        

       //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Desktop/new.jpg"));
       
       
      
    }
    public static void main(String args[]){
        new bank();
    }
}