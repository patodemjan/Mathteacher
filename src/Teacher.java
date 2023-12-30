import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.KeyAdapter;

public class Teacher {

	private JFrame frmMathtest;
	private JTextField txtResult;		
	private JLabel lblExample;
	private JLabel lblcontrol2;
    private Random random = new Random();
    private int randnumb;
    private int number1,number2;
    private int result;
	private JButton btnOk;
	private JButton btnExit;
	private JLabel lblNewLabel_1;
	private JButton btnControl;
	private JLabel lblNewLabel_2;
	private JButton btn0;
	private JButton btn1;
	private JButton btn3;
	private JButton btn2;
	private JButton btn4;
	private JButton btn8;
	private JButton btn9;
	private JButton btn7;
	private JButton btn6;
	private JButton btn5;
	private JButton btnC;
	private JButton btnC_1;
	
   
    
    

	private int generateRandomNumber() {
		  int number=random.nextInt(0,10); 
        return number;
    }
 //create random operator 
	private String randop[]= {"+","-","/","*"};
	
    private String randomperator() {
    	randnumb=random.nextInt(0,1);
    	switch(randop.length) {
    	case 0:	randop.equals("+");
    			return "+";
    			
    	case 1:	randop.equals("-");
				return "-";
    	}
		return (this.randop[randnumb]);
    }
		


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher window = new Teacher();
					window.frmMathtest.setVisible(true);
					window.frmMathtest.setLocationRelativeTo(null);
	
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Teacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmMathtest = new JFrame();
		frmMathtest.getContentPane().setBackground(new Color(64, 128, 128));
		frmMathtest.setTitle("Mathtest");
		frmMathtest.setIconImage(Toolkit.getDefaultToolkit().getImage(Teacher.class.getResource("/icons/otaznik.png")));
		frmMathtest.setBounds(100, 100, 598, 365);
		frmMathtest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMathtest.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Example:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(138, 47, 73, 25);
		frmMathtest.getContentPane().add(lblNewLabel);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Dialog", Font.BOLD, 15));
		lblResult.setBounds(138, 84, 73, 25);
		frmMathtest.getContentPane().add(lblResult);
		
		JLabel lblControl = new JLabel("Control:");
		lblControl.setFont(new Font("Dialog", Font.BOLD, 15));
		lblControl.setBounds(138, 121, 73, 25);
		frmMathtest.getContentPane().add(lblControl);
		
		txtResult = new JTextField(result);
		txtResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				}
		});
		txtResult.setBounds(218, 87, 176, 22);
		frmMathtest.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		lblcontrol2 = new JLabel("");
		lblcontrol2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblcontrol2.setBounds(218, 121, 176, 25);
		frmMathtest.getContentPane().add(lblcontrol2);
		
		
		
		lblExample = new JLabel("");
		lblExample.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblExample.setBounds(218, 47, 176, 25);
		
		lblExample.getText();
		
		frmMathtest.getContentPane().add(lblExample);

//display first and next example
		btnOk = new JButton("Next");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=generateRandomNumber();
				number2=generateRandomNumber();
				lblExample.setText(number1+" "+randomperator()+" "+number2);
				
			}
		});
		btnOk.setBounds(444, 45, 98, 26);
		frmMathtest.getContentPane().add(btnOk);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(444, 121, 98, 26);
		frmMathtest.getContentPane().add(btnExit);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Teacher.class.getResource("/icons/otaznik.png")));
		lblNewLabel_1.setBounds(22, 37, 104, 109);
		frmMathtest.getContentPane().add(lblNewLabel_1);

//control user result		
		btnControl = new JButton("Control");
		btnControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Integer.parseInt(txtResult.getText());
				int realresult=number1+number2;
				if (realresult==result) {
					lblcontrol2.setText("your result is right");
				}else if(realresult!=result){
					lblcontrol2.setText("your result is wrong");
				}
			
			
			}
							
			
		});
		btnControl.setBounds(444, 83, 98, 26);
		frmMathtest.getContentPane().add(btnControl);
		
		lblNewLabel_2 = new JLabel("Autor: Patrik Demjan");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_2.setBounds(238, 296, 130, 16);
		frmMathtest.getContentPane().add(lblNewLabel_2);
		
		btn0 = new JButton("0");
		btn0.addKeyListener(new KeyAdapter() {
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String btn=txtResult.getText()+btn0.getText();
			txtResult.setText(btn);
		
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 20));
		btn0.setBounds(166, 173, 50, 50);
		frmMathtest.getContentPane().add(btn0);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn1.getText();
				txtResult.setText(btn);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn1.setBounds(228, 173, 50, 50);
		
		frmMathtest.getContentPane().add(btn1);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn3.getText();
				txtResult.setText(btn);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 20));
		btn3.setBounds(352, 173, 50, 50);
		frmMathtest.getContentPane().add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn2.getText();
				txtResult.setText(btn);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 20));
		btn2.setBounds(290, 173, 50, 50);
		frmMathtest.getContentPane().add(btn2);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn4.getText();
				txtResult.setText(btn);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 20));
		btn4.setBounds(414, 173, 50, 50);
		frmMathtest.getContentPane().add(btn4);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn8.getText();
				txtResult.setText(btn);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 20));
		btn8.setBounds(352, 235, 50, 50);
		frmMathtest.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn9.getText();
				txtResult.setText(btn);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 20));
		btn9.setBounds(414, 235, 50, 50);
		frmMathtest.getContentPane().add(btn9);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn7.getText();
				txtResult.setText(btn);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 20));
		btn7.setBounds(290, 235, 50, 50);
		frmMathtest.getContentPane().add(btn7);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn6.getText();
				txtResult.setText(btn);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 20));
		btn6.setBounds(228, 235, 50, 50);
		frmMathtest.getContentPane().add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn=txtResult.getText()+btn5.getText();
				txtResult.setText(btn);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 20));
		btn5.setBounds(166, 235, 50, 50);
		frmMathtest.getContentPane().add(btn5);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
			}
		});
		btnC.setFont(new Font("Dialog", Font.BOLD, 20));
		btnC.setBounds(104, 235, 50, 50);
		frmMathtest.getContentPane().add(btnC);
		
		btnC_1 = new JButton("<<");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().length()>0) {
					
					String backspace=null;
					StringBuilder strB=new StringBuilder(txtResult.getText());
					strB.deleteCharAt(txtResult.getText().length()-1);
					backspace=strB.toString();
					txtResult.setText(backspace);
			}
			}
		});
		btnC_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnC_1.setBounds(104, 173, 50, 50);
		frmMathtest.getContentPane().add(btnC_1);
	}
}
