import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class View_program {
	JLabel header, program_label;
	JTable jt;
	public static void main(String args[]) {
		new View_program();
	
	}
	public View_program() {
		instantiate();
	}
	public void instantiate() {
		JFrame jf = new JFrame("View Program and courses");
		String prog[]=getProg();
		
		final JComboBox<String> pc = new JComboBox<String>(prog);
		
		//setting header
		header = new JLabel("Professor Schedule Management", SwingConstants.CENTER);
		program_label = new JLabel("Select Program", SwingConstants.CENTER);
		header.setFont(new Font("Calibri", Font.BOLD, 22));
		program_label.setFont(new Font("Calibri", Font.ITALIC, 16));
		
		header.setBackground(Color.cyan);
		
		
		
		jf.setLayout(null);
		
		
		header.setBounds(0, 0, 960, 60);
		program_label.setBounds(70, 80, 120, 40);
		pc.setBounds(200,80,100,40);
		//add_prof_button.setBounds(325, 470, 300, 150);

	//	add.setOpaque(true);
		header.setOpaque(true);

	//add(backpic);
		jf.add(header);
		jf.add(program_label);
		jf.add(pc);
		//jf.add(getTableValue());
		//setbounds
		//backpic.setBounds(0,0,200,200);
		jf.setBounds(330,130,960,680);
		//ADD
		//jf.add(add_prof_button);
		jf.getContentPane().setBackground(Color.white); 
		jf.setVisible(true);
		jf.setResizable(false);

	}
	String[] getProg() {
		String temp[]=new String[4];
		//String accval[][]=new String[5][5];
		for(int i=0; i<SharedData.program.length; i++) {
			temp[i] = SharedData.program[i][0];
		}
		return temp;
	}
	
}
