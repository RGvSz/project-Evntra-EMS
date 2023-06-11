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

public class HODMenu extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnNewButton;
	JButton btnLogout;
	JButton btnViewEvent;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HODMenu frame = new HODMenu();
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
	public HODMenu() {
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
		lblNewLabel.setIcon(new ImageIcon(HODMenu.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(761, 0, 223, 490);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HODMenu.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel_1.add(lblNewLabel_1);
		
		btnNewButton = new JButton("CREATE EVENTS");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(342, 114, 302, 92);
		contentPane.add(btnNewButton);
		
		btnViewEvent = new JButton("VIEW EVENTS");
		btnViewEvent.setForeground(new Color(255, 255, 255));
		btnViewEvent.setBackground(new Color(30, 144, 255));
		btnViewEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewEvent.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnViewEvent.setBorder(null);
		btnViewEvent.setBounds(342, 281, 302, 92);
		contentPane.add(btnViewEvent);
		
		btnLogout = new JButton("logout");
		btnLogout.setOpaque(false);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setForeground(new Color(0, 0, 255));
		btnLogout.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(651, 10, 100, 35);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(HODMenu.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel_2.setBounds(218, 0, 766, 490);
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(this);
		btnLogout.addActionListener(this);
		btnViewEvent.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNewButton)
		{
			CreateEvent frame = new CreateEvent();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnLogout)
		{
			Proto frame = new Proto();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnViewEvent)
		{
			ViewEvent frame = new ViewEvent();
			frame.setVisible(true);
		}
		
	}
}
