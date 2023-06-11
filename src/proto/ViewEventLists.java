package proto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ViewEventLists extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnLogout;
	JButton btnCse;
	JButton btnMech;
	JButton btnEee;
	JButton btnEce;
	JButton btnCivil;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEventLists frame = new ViewEventLists();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewEventLists() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 527);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Constantia", Font.PLAIN, 15));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 223, 490);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewEventLists.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(761, 0, 223, 490);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ViewEventLists.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel_1.add(lblNewLabel_1);
		
		 btnLogout = new JButton("return");
		 btnLogout.setOpaque(false);
		btnLogout.setForeground(Color.BLUE);
		btnLogout.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(651, 10, 100, 35);
		contentPane.add(btnLogout);
		
		 btnCse = new JButton("CSE");
		btnCse.setForeground(new Color(255, 255, 255));
		btnCse.setBackground(new Color(30, 144, 255));
		btnCse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCse.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnCse.setBorder(null);
		btnCse.setBounds(343, 29, 270, 51);
		contentPane.add(btnCse);
		
		 btnMech = new JButton("MECH");
		btnMech.setBackground(new Color(30, 144, 255));
		btnMech.setForeground(new Color(255, 255, 255));
		btnMech.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnMech.setBorder(null);
		btnMech.setBounds(343, 102, 270, 51);
		contentPane.add(btnMech);
		
		 btnEee = new JButton("EEE");
		btnEee.setForeground(new Color(255, 255, 255));
		btnEee.setBackground(new Color(30, 144, 255));
		btnEee.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnEee.setBorder(null);
		btnEee.setBounds(343, 175, 270, 51);
		contentPane.add(btnEee);
		
		 btnEce = new JButton("ECE");
		btnEce.setBackground(new Color(30, 144, 255));
		btnEce.setForeground(new Color(255, 255, 255));
		btnEce.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnEce.setBorder(null);
		btnEce.setBounds(343, 249, 270, 51);
		contentPane.add(btnEce);
		
		 btnCivil = new JButton("CIVIL");
		btnCivil.setForeground(new Color(255, 255, 255));
		btnCivil.setBackground(new Color(30, 144, 255));
		btnCivil.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnCivil.setBorder(null);
		btnCivil.setBounds(343, 321, 270, 51);
		contentPane.add(btnCivil);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ViewEventLists.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel_2.setBounds(223, 0, 540, 490);
		contentPane.add(lblNewLabel_2);
		btnLogout.addActionListener(this);
		btnCse.addActionListener(this);
		btnMech.addActionListener(this);
		 btnEee.addActionListener(this);
		 btnEce.addActionListener(this);
		  btnCivil.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnLogout)
		{
			Proto frame = new Proto();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnCse)
		{
			Proto.DEPARTMENT="CSE";
			ViewEvent frame = new ViewEvent();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnMech)
		{
			Proto.DEPARTMENT="Mech";
			ViewEvent frame = new ViewEvent();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnEee)
		{
			Proto.DEPARTMENT="EEE";
			ViewEvent frame = new ViewEvent();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnEce)
		{
			Proto.DEPARTMENT="ECE";
			ViewEvent frame = new ViewEvent();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnCivil)
		{
			Proto.DEPARTMENT="Civil";
			ViewEvent frame = new ViewEvent();
			frame.setVisible(true);
		}
	}
}
