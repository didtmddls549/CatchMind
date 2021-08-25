package login;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class login extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
 
    public login() {
    	super("캐치마인드");
        icon = new ImageIcon("C:\\catchmind.jpg");
       
     
        JPanel pan = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); 
                super.paintComponent(g);
            }
        };
       
       
	    JLabel idL =  new JLabel("닉네임:");
	    JTextField id = new JTextField(10);
        JButton btn = new JButton("입장하기");
        pan.add(btn);
        scrollPane = new JScrollPane(pan);
        setContentPane(scrollPane);
        
      
        pan.add(idL);
		pan.add(id);
		pan.add(btn);
		
		Dimension frameSize = getSize();
		 
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"접속성공!");
				new login2();
				setVisible(false);
			}
			});	
    }
 
    public static void main(String[] args) {
    	new login();
        login frame = new login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(660, 460);
        frame.setVisible(true);
        frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("캐치마인드");
    
    }
};


