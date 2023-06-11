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

public class AdminView extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnNewButton;
	JButton btnViewEvent;
	JButton btnLogout;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView frame = new AdminView();
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
	public AdminView() {
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
		panel.setBounds(-13, 0, 223, 490);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AdminView.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(761, 0, 223, 490);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdminView.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		panel_1.add(lblNewLabel_1);
		
		btnNewButton = new JButton("VIEW EVENT REQUESTS");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(342, 114, 302, 92);
		contentPane.add(btnNewButton);
		
		btnViewEvent = new JButton("VIEW EVENT LISTS");
		btnViewEvent.setForeground(new Color(255, 255, 255));
		btnViewEvent.setBackground(new Color(30, 144, 255));
		btnViewEvent.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnViewEvent.setBorder(null);
		btnViewEvent.setBounds(342, 281, 302, 92);
		contentPane.add(btnViewEvent);
		
		btnLogout = new JButton("logout");
		btnLogout.setIcon(null);
		btnLogout.setOpaque(false);
		btnLogout.setForeground(Color.BLUE);
		btnLogout.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(691, 10, 53, 35);
		contentPane.add(btnLogout);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setOpaque(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(342, 216, 302, 55);
		contentPane.add(textField);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AdminView.class.getResource("/images/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel_2.setBounds(207, 0, 555, 490);
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(this);
		btnViewEvent.addActionListener(this);
		btnLogout.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNewButton)
		{
			try
			{
			ViewEventRequests frame = new ViewEventRequests();
			frame.setVisible(true);
			}catch(Exception E) {textField.setText("No current requests");}
		}
		else if(e.getSource()==btnViewEvent)
		{
			ViewEventLists frame = new ViewEventLists();
			frame.setVisible(true);
		}
		else if(e.getSource()==btnLogout)
		{
			Proto frame = new Proto();
			frame.setVisible(true);
		}
	}
}
