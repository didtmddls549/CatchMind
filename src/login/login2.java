package login;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class login2 extends JFrame {    

	    JPanel panel, paint; 

	    JButton pencil, pencil2, pencil3, pencil4, pencil5, eraser,erase; 

	    JButton color; 

	    JLabel thick_label;

	    JTextField thick_field;  //���� ���Ⱑ ������ �ؽ�Ʈ �ʵ�

	    Color selectedColor; 

	    

	    Graphics graphics; //Graphics 2D Ŭ������ ����� ���� ����

	    Graphics2D g;  // ���� Graphics�� ��������



	    

	    int thick = 10; 

	    int a ;

	    int startX; 

	    int startY; 

	    int endX; 

	    int endY; 

	    boolean tf = false; 

	    

	    public login2() { 

	        setLayout(null); 

	        setTitle("캐치마인드 게임방"); 

	        setSize(900,750); 

	        setLocationRelativeTo(null);  //���α׷� ���۽� ȭ�� �߾ӿ� ��µ�.

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	        

	        panel = new JPanel(); 

	        panel.setBackground(Color.WHITE);

	        panel.setLayout(null);  //panel�� ���̾ƿ��� null�� �����Ͽ� ������Ʈ ��ġ�� ���� ������ �� ����.

	        

	        ImageIcon icon = new ImageIcon("./image/p1.png");   //���� ��ư ����

	        Image img = icon.getImage();

	        Image changeimage1 = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

	        ImageIcon changeicon1 = new ImageIcon(changeimage1);

	        pencil = new JButton(changeicon1);

	        pencil.setFont(new Font("Serif", Font.BOLD, 25)); //��ư��Ʈ ũ�� �� �۾� ũ�� ����

	        pencil.setBackground(Color.WHITE); 

	      
	        ImageIcon icon2 = new ImageIcon("./image/p2.png");   //���� ��ư ����

	        Image img2 = icon2.getImage();
	        
	        Image changeimage2 = img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	        
	        ImageIcon changeicon2 = new ImageIcon(changeimage2);

	        pencil2 = new JButton(changeicon2);
	        
	        pencil2.setFont(new Font("Serif", Font.BOLD, 25)); //��ư��Ʈ ũ�� �� �۾� ũ�� ����
	        
	        pencil2.setBackground(Color.WHITE); 
	        
	        
	        ImageIcon icon3 = new ImageIcon("./image/p3.png");   //���� ��ư ����

	        Image img3 = icon3.getImage();
	        
	        Image changeimage3 = img3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	        
	        ImageIcon changeicon3 = new ImageIcon(changeimage3);

	        pencil3 = new JButton(changeicon3);
	        
	        pencil3.setFont(new Font("Serif", Font.BOLD, 25)); //��ư��Ʈ ũ�� �� �۾� ũ�� ����
	        
	        pencil3.setBackground(Color.WHITE); 
	        
	        
	        ImageIcon icon4 = new ImageIcon("./image/p4.png");   //���� ��ư ����

	        Image img4 = icon4.getImage();
	        
	        Image changeimage4 = img4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	        
	        ImageIcon changeicon4 = new ImageIcon(changeimage4);

	        pencil4 = new JButton(changeicon4);
	        
	        pencil4.setFont(new Font("Serif", Font.BOLD, 25)); //��ư��Ʈ ũ�� �� �۾� ũ�� ����
	        
	        pencil4.setBackground(Color.WHITE); 

	        
	        ImageIcon icon5 = new ImageIcon("./image/p5.png");   //���� ��ư ����

	        Image img5 = icon5.getImage();
	        
	        Image changeimage5 = img5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	        
	        ImageIcon changeicon5 = new ImageIcon(changeimage5);

	        pencil5 = new JButton(changeicon5);
	        
	        pencil5.setFont(new Font("Serif", Font.BOLD, 25)); //��ư��Ʈ ũ�� �� �۾� ũ�� ����
	        
	        pencil5.setBackground(Color.WHITE); 
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        ImageIcon icon6 = new ImageIcon("./image/e.png");   //���찳 ��ư ����

	        Image img6 = icon6.getImage();

	        Image changeimage6 = img6.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

	        ImageIcon changeicon6 = new ImageIcon(changeimage6);

	        eraser = new JButton(changeicon6); 

	        eraser.setFont(new Font("Serif", Font.BOLD, 25));  //��ư ��Ʈ ũ�� �� �۾� ũ�� ����

	        eraser.setBackground(Color.WHITE);  

	        

	        color = new JButton("색상");   //�� ���� ��ư ����

	        color.setBackground(Color.YELLOW); 

	        erase = new JButton("모두지우기");  //�������� ��ư ����

	        erase.setFont(new Font("Serif", Font.BOLD, 20));

	        erase.setBackground(Color.WHITE);

	        

	        thick_label = new JLabel("굵기");  //���� ���� �� ���� 

	        thick_label.setFont(new Font("Serif", Font.BOLD, 20));  //���� ���� �� ��Ʈ �� �۾� ũ�� ����    

	        thick_field = new JTextField(Integer.toString(thick), 5); // ���� ���� �Է� �ؽ�Ʈ �ʵ� ����

	        thick_field.setHorizontalAlignment(JTextField.CENTER); 

	        thick_field.setFont(new Font("Serif", Font.PLAIN, 25)); 

	        

	       

	        pencil.setBounds(10,30,50,55);  //���� ��ư ��ġ ����

	        pencil2.setBounds(70,30,50,55);  

	        pencil3.setBounds(130,30,50,55);  
	        
	        pencil4.setBounds(190,30,50,55);  
	        
	        pencil5.setBounds(250,30,50,55);  	        
	        
	        eraser.setBounds(310,30,50,55);  //���찳 ��ư ��ġ ����

	        erase.setBounds(370,30,150,55);  //��� ����� ��ư ��ġ ����

	        color.setBounds(785,30,90,55); // ������ ��ư ��ġ ����

	        thick_label.setBounds(640,30,100,55); //���� ���� �� ��ġ ����

	        thick_field.setBounds(720,42,50,35);  //���� ���� �ؽ�Ʈ �ʵ� ��ġ ����

	        

	        panel.add(pencil);  //panel�� ���� ��ư �߰�  
	        
	        panel.add(pencil2);   
	        
	        panel.add(pencil3);    
	        
	        panel.add(pencil4);    

	        panel.add(pencil5);  

	        panel.add(eraser);  //panel�� ���찳 ��ư �߰�

	        panel.add(erase);  //panel�� ��� ����� ��ư �߰�

	        panel.add(color);  //panel�� ������ ��ư �߰�

	        panel.add(thick_label); //panel�� �������� �� �߰�

	        panel.add(thick_field);  //panel�� �������� �ؽ�Ʈ ��Ʈ �߰�

	        panel.setBounds(0,600,900,100);  //panel�� �����ӿ� ��ġ�� ��ġ ����

	      

	        

	        

	        paint = new JPanel();   //�׸��� �׷��� �г� ���� 

	        paint.setBackground(Color.WHITE); 

	        paint.setLayout(null); //paint�� ���̾ƿ��� null���� �г� ��ü�� setBounds�� ��ġ�� ���� �� �� �ֵ��� ��.

	        

	        paint.setBounds(0,0,885,620); //paint �г��� ��ġ ����

	        

	        

	        

	        add(panel); //���������ӿ� ���� �г� �߰� - ��ġ�� ������ �� ������.

	        add(paint);  // ���������ӿ� ��ȭ�� �г� �߰� - ��ġ�� ������ �� ������

	            

	        setFocusable(true);  //����Ʈ ���� ��Ŀ���� ���� �� �ֵ��� ����

	        requestFocus();  //����Ʈ�ҿ� ��Ŀ�� ����

	        setVisible(true);  //������������ ���̰� ��.

	        

	       

	        graphics = getGraphics();  //�׷��� �ʱ�ȭ 

	        g = (Graphics2D)graphics;  

	        g.setColor(selectedColor); 

	        

	       

	        addKeyListener(new KeyListener() {       //key������ �߰�

	            public void keyPressed(KeyEvent e) { 

	            

	               switch(e.getKeyChar()) {    

	            case '[':                      //'[' ��ư ���� �� �� ���Ⱑ 10��ŭ �پ��       

	               a = a-10;

	               thick_field.setText(Integer.toString(a));

	               break;

	            

	            case ']':                    //']' ��ư ���� �� �� ���Ⱑ 10��ŭ �þ

	               a = a+10;

	               thick_field.setText(Integer.toString(a));  

	               break;

	               

	            case 'q':              //'q'��ư�� ���� ��  �г� ����                 

	               System.exit(0);

	               

	               }

	            }



	         @Override

	         public void keyReleased(KeyEvent e) {

	            // TODO Auto-generated method stub

	            

	         }



	         @Override

	         public void keyTyped(KeyEvent e) {

	            // TODO Auto-generated method stub

	            

	         }

	            

	        });

	      

	        

	        paint.addMouseListener(new MouseListener() {  //MouseListener �̺�Ʈ ó��

	            public void mousePressed(MouseEvent e) { 

	                startX = e.getX(); //���콺�� �������� �׶��� X��ǥ������ �ʱ�ȭ

	                startY = e.getY(); //���콺�� �������� �׶��� Y��ǥ������ �ʱ�ȭ

	            }

	            public void mouseClicked(MouseEvent e) {} //Ŭ���̺�Ʈ ó��

	            public void mouseEntered(MouseEvent e) {} //paint(��ȭ��) ���� ���� ���Խ� �̺�Ʈ ó��

	            public void mouseExited(MouseEvent e) {}

	            public void mouseReleased(MouseEvent e) {}

	        });

	        paint.addMouseMotionListener(new PaintDraw());  //�׸� �׷��� �гο� ���콺 ��� ������ �߰�

	        pencil.addActionListener(new ToolActionListener()); //���ʹ�ư �׼�ó��

	        pencil2.addActionListener(new ToolActionListener()); //���ʹ�ư �׼�ó��

	        pencil3.addActionListener(new ToolActionListener()); //���ʹ�ư �׼�ó��
	        
	        pencil4.addActionListener(new ToolActionListener()); //���ʹ�ư �׼�ó��
	        
	        pencil5.addActionListener(new ToolActionListener()); //���ʹ�ư �׼�ó��
	        
	        eraser.addActionListener(new ToolActionListener()); //���찳 ��ư �̹�Ʈ ó��

	        erase.addActionListener(new ToolActionListener()); //�������� ��ư �̺�Ʈ ó��

	        

	        color.addActionListener(new ActionListener() {  /// �������ư �׼�ó���� �͸� Ŭ������ ����

	            public void actionPerformed(ActionEvent e) {  //// �������̵�

	                tf = true; 

	                JColorChooser chooser = new JColorChooser();

	                selectedColor = chooser.showDialog(null, "Color", Color.ORANGE); 

	                g.setColor(selectedColor);

	            }

	        });   ///

	        

	        

	    }

	    

	    public class PaintDraw implements MouseMotionListener{



	        public void mouseDragged(MouseEvent e) { //paint �гο��� ���콺 �巡�� �׼��� ó���ɋ� �żҵ� ����

	            thick = Integer.parseInt(thick_field.getText());

	            

	                endX = e.getX(); 



	                endY = e.getY(); 



	                g.setStroke(new BasicStroke(thick, BasicStroke.CAP_ROUND,0));

	                g.drawLine(startX+10, startY+121, endX+10, endY+121);       

	                

	                startX = endX; 

	                startY = endY;

	        }

	        

	        @Override

	        public void mouseMoved(MouseEvent e) {}

	    }

	    

	    

	    

	    public class ToolActionListener implements ActionListener {  // ����,���찳, �������� ��ư�� �׼�ó���� ����Ǵ� Ŭ����

	        public void actionPerformed(ActionEvent e ) { //���� ���̵� �� actionPerformed �޼ҵ� ����



	            if(e.getSource() == pencil) { 

	                if(tf == false) g.setColor(Color.BLACK); //�켱 ���� ���������� ����

	                else g.setColor(selectedColor); 

	            } 

	 
	            else if(e.getSource() == pencil2) {
	            	
	            	 if(tf == false) g.setColor(Color.BLUE); //�켱 ���� ���������� ����

		                else g.setColor(selectedColor); 
	            	
	            }
	            
	            else if(e.getSource() == pencil3) {
	            	
	            	 if(tf == false) g.setColor(Color.YELLOW); //�켱 ���� ���������� ����

		                else g.setColor(selectedColor); 
	            	
	            }
	            
	            else if(e.getSource() == pencil4) {
	            	
	            	 if(tf == false) g.setColor(Color.RED); //�켱 ���� ���������� ����

		                else g.setColor(selectedColor); 
	            	
	            }
	            
	            else if(e.getSource() == pencil5) {
	            	
	            	 if(tf == false) g.setColor(Color.GREEN); //�켱 ���� ���������� ����

		                else g.setColor(selectedColor); 
	            	
	            }

	            else if(e.getSource() == eraser) {

	                g.setColor(Color.WHITE);   //�׷��������찳 ���� ������� ���� -> ������� ���̴� ��ó�� ���̰� ��.



	            }

	            else if(e.getSource() == erase) {

	               

	               repaint();

	          
		
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				    (windowSize.height - frameSize.height) / 2);
	    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		

        }

     }

 }
	public static void main(String[] args) {
		new login2 ();
	}
	};





