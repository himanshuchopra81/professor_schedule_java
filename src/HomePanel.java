import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HomePanel implements MouseListener{
	JFrame jf;
	JButton add, view, add_prof_button;
	JLabel backpic, header;
	public static void main(String args[]) {
		new HomePanel();	
	}
	HomePanel() {
		jf = new JFrame("Professor Schedule Management)");
		
		//adding image to button
		add = new JButton("Professor"+"\n"+"Schedule");
		
		  try {
		    Image img = ImageIO.read(getClass().getResource("images/images.png"));
		    add.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		  		  add.setBackground(null);
		  add.setBorderPainted(false);
		  
		  add.setHorizontalTextPosition(SwingConstants.CENTER);
		  add.setVerticalTextPosition(SwingConstants.BOTTOM);

		view = new JButton("View Programs");
		  try {
			    Image img = ImageIO.read(getClass().getResource("images/prog.png"));
			    view.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		  view.setBackground(null);
		  view.setBorderPainted(false);
		  view.setHorizontalTextPosition(SwingConstants.CENTER);
		  view.setVerticalTextPosition(SwingConstants.BOTTOM);
		//add professor button
		add_prof_button = new JButton("Add Professor");
		  try {
			    Image img = ImageIO.read(getClass().getResource("images/add_prof.png"));
			    add_prof_button.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		  add_prof_button.setBackground(null);
		  add_prof_button.setBorderPainted(false);
		  add_prof_button.setHorizontalTextPosition(SwingConstants.CENTER);
		  add_prof_button.setVerticalTextPosition(SwingConstants.BOTTOM);
		backpic=new JLabel();
		ImageIcon bg=new ImageIcon("images/logo.png");
		backpic.setIcon(bg);
		//setting header
		header = new JLabel("Professor Schedule Management", SwingConstants.CENTER);
		header.setFont(new Font("Calibri", Font.BOLD, 22));
		
		header.setBackground(Color.cyan);
		
		jf.setLayout(null);
		//setbounds
		backpic.setBounds(0,0,200,200);
		jf.setBounds(330,130,960,680);
		add.setBounds(325, 70, 300, 150);
		view.setBounds(325, 270, 300, 150);
		header.setBounds(0, 0, 960, 60);
		add_prof_button.setBounds(325, 470, 300, 150);

		add.setOpaque(true);
		header.setOpaque(true);

		jf.add(add);
		jf.add(backpic);
		jf.add(header);
		jf.add(view);
		jf.add(add_prof_button);
		jf.getContentPane().setBackground(Color.white); 
		jf.setVisible(true);
		jf.setResizable(false);
		
		add.addMouseListener(this);
		view.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
			jf.dispose();
		//	new Add();
			
		}
		if(e.getSource() == view) {
			jf.dispose();
			new View_program();
		}
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
