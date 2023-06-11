package proto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class About extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnLogout;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 527);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Constantia", Font.BOLD, 21));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(-13, 0, 223, 490);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(About.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(761, 0, 223, 490);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(About.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel_1.add(lblNewLabel_1);
		
		btnLogout = new JButton("return");
		btnLogout.setIcon(null);
		btnLogout.setOpaque(false);
		btnLogout.setForeground(Color.BLUE);
		btnLogout.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(691, 10, 53, 35);
		contentPane.add(btnLogout);
		
		lblNewLabel_2 = new JLabel("About");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(224, 25, 91, 25);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Evntra is an event management system which allows for an effecient ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(242, 74, 502, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("sorting of events designed to fit all your events related needs.");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(220, 105, 502, 35);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("There are two types of users");
		lblNewLabel_3_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(220, 140, 502, 35);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("1.HOD");
		lblNewLabel_3_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(220, 168, 502, 35);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("2.ADMIN");
		lblNewLabel_3_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(220, 199, 502, 35);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("1.HOD");
		lblNewLabel_3_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(220, 238, 502, 35);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("        HOD user can create the events and requests the events to  the");
		lblNewLabel_3_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6.setBounds(224, 270, 502, 35);
		contentPane.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("ADMIN.HOD can view the events which are approved by  the ADMIN.");
		lblNewLabel_3_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_1.setBounds(242, 303, 502, 35);
		contentPane.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_5_2 = new JLabel("2.ADMIN");
		lblNewLabel_3_5_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_2.setBounds(220, 348, 502, 35);
		contentPane.add(lblNewLabel_3_5_2);
		
		JLabel lblNewLabel_3_5_3 = new JLabel("   ADMIN user can view events  that are requested and approved");
		lblNewLabel_3_5_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_3.setBounds(249, 386, 502, 35);
		contentPane.add(lblNewLabel_3_5_3);
		
		JLabel lblNewLabel_3_5_4 = new JLabel("events.ADMIN can accept or reject the events.");
		lblNewLabel_3_5_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_5_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5_4.setBounds(242, 419, 502, 35);
		contentPane.add(lblNewLabel_3_5_4);
		btnLogout.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnLogout)
		{
			Proto frame = new Proto();
			frame.setVisible(true);
		}
	}
}
