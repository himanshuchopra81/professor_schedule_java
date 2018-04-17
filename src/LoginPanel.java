import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel implements ActionListener, MouseListener{
	JFrame jf;
	JButton loginbt,exitbt;
	JTextField usertext;
	JPasswordField passtext;
	JLabel userlab,passlab,backpic,header,change;
	Font f;
	
	LoginPanel() {
	
			//instantiation
		jf=new JFrame("SAM(Student Administration Management)");
		jf.setLayout(null);
		backpic=new JLabel();
		header=new JLabel();
		change=new JLabel("Change Password");
		loginbt=new JButton("LOGIN");
		ImageIcon bg=new ImageIcon("images/logo.png");

		backpic.setIcon(bg);

		
		usertext=new JTextField();
		passtext=new JPasswordField();
		userlab=new JLabel("USERNAME :");
		passlab=new JLabel("PASSWORD :");
		f=new Font("Calibri",Font.BOLD,14);
		exitbt=new JButton("EXIT");
		//setBounds
		jf.setBounds(260,180,560,380);
		userlab.setBounds(250,80,80,25);
		passlab.setBounds(250,130,80,25);
		usertext.setBounds(350,80,150,25);
		passtext.setBounds(350,130,150,25);
		loginbt.setBounds(350,190,80,25);
		exitbt.setBounds(250,190,80,25);
		backpic.setBounds(0,40,200,200);
		
		header.setBounds(-135,0,755,65);
		//design
		userlab.setFont(f);
		userlab.setForeground(Color.WHITE);
		userlab.setBackground(Color.BLACK);
		userlab.setOpaque(true);
		passlab.setFont(f);
		
		passlab.setForeground(Color.WHITE);
		passlab.setBackground(Color.BLACK);
		passlab.setOpaque(true);
		usertext.setBackground(new Color(41,48,46));
		usertext.setForeground(Color.WHITE);
		passtext.setBackground(new Color(41,48,46));
		passtext.setForeground(Color.WHITE);
		
		loginbt.setForeground(Color.BLUE);
		loginbt.setBackground(Color.BLACK);
		exitbt.setForeground(Color.BLUE);
		exitbt.setBackground(Color.BLACK);
		//exitbt.setOpaque(true);
		
		//add
		//jf.add(js);
		jf.add(userlab);
		jf.add(passlab);
		jf.add(usertext);
		jf.add(passtext);
//		jf.add(change);
		jf.add(loginbt);
		jf.add(exitbt);
		jf.add(header);
		jf.add(backpic);
		jf.getContentPane().setBackground(Color.white);
		
		
		//events
		usertext.addMouseListener(this);
		passtext.addMouseListener(this);
		loginbt.addActionListener(this);
		exitbt.addActionListener(this);
		
		
		//behavior
//		jf.setUndecorated(true);
		jf.setVisible(true);
		jf.setResizable(false);
		usertext.setText("ENTER USERNAME");
		passtext.setText("ENTER PASSWORD");
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==exitbt) {
			
			System.exit(0);
		}
		if (ae.getSource()==loginbt) {

			if(usertext.getText().equals("admin") && String.valueOf(passtext.getPassword()).equals("admin123")){
				jf.dispose();
				//JOptionPane.showMessageDialog(null, "Correct username or password");
				new HomePanel();
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect username or password");
			}
		}
	}

	public void mouseClicked(MouseEvent me) {}
	public void mouseEntered(MouseEvent me) {
		if(me.getSource()==usertext) {
			if(usertext.getText().equals("ENTER USERNAME")) {
			usertext.setText("");
		}}
		if(me.getSource()==passtext) {
			if(String.valueOf(passtext.getPassword()).equals("ENTER PASSWORD"))
			passtext.setText("");
		}
		
	}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {
		
	}
	
	
	public static void main(String args[]) {
		
		new LoginPanel();
	}
}