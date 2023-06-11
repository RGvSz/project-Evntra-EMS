package proto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.StringTokenizer;  

public class CreateEvent extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JButton btnNewButton;
	JButton btnReturn;
	private JTextField textField_4;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEvent frame = new CreateEvent();
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
	public CreateEvent() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1090, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(764, 57, 320, 87);
		contentPane.add(textField_4);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"VENUE", "S H SQUARE", "ANDO HALL", "GIRI AUDITORIUM"}));
		comboBox.setFont(new Font("Constantia", Font.BOLD, 15));
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255), new Color(0, 204, 255)));
		comboBox.setBounds(348, 391, 320, 35);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("CREATE EVENT");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 10, 202, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("EVENT NAME");
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(348, 53, 132, 25);
		contentPane.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(348, 83, 320, 35);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("EVENT DATE");
		lblNewLabel_1_2_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_1.setBounds(348, 128, 132, 25);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(348, 163, 320, 35);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("START TIME");
		lblNewLabel_1_2_2.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_2.setBounds(348, 208, 132, 25);
		contentPane.add(lblNewLabel_1_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(348, 238, 320, 35);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("STOP TIME");
		lblNewLabel_1_2_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2_3.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_3.setBounds(352, 295, 132, 25);
		contentPane.add(lblNewLabel_1_2_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(348, 328, 320, 35);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("");
		lblNewLabel_1_2_4.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblNewLabel_1_2_4.setBounds(572, 391, 132, 25);
		contentPane.add(lblNewLabel_1_2_4);
		
		btnNewButton = new JButton("CREATE EVENT");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(764, 328, 302, 92);
		contentPane.add(btnNewButton);
		
		btnReturn = new JButton("RETURN");
		btnReturn.setForeground(new Color(255, 255, 255));
		btnReturn.setBackground(new Color(30, 144, 255));
		btnReturn.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnReturn.setBorder(null);
		btnReturn.setBounds(764, 181, 302, 92);
		contentPane.add(btnReturn);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(1);
			}
		});
		/*lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		*/
		lblNewLabel_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(1037, 0, 64, 44);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setIcon(new ImageIcon(CreateEvent.class.getResource("/images/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel_1.setBounds(0, -352, 1465, 1081);
		contentPane.add(lblNewLabel_1);
		btnNewButton.addActionListener(this);
		btnReturn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNewButton)
		{
			try
			{	
				
				int id=0;
				String key = Proto.DEPARTMENT;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT count(*) FROM eventrequest");
				rs.next();
			    id = rs.getInt(1);
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			     
				Statement st2 = con2.createStatement();
				ResultSet rs2 = st2.executeQuery("SELECT * FROM accepted");
				String accdate="";
				String accVenue="";
				String accstart="";
				String accstop="";
				int flag = 0;
				String date = textField_1.getText();
				 String start = textField_2.getText();
				 String stop = textField_3.getText();
				 String Venue = comboBox.getSelectedItem().toString();
			    while(rs2.next())
			    {
			    	 accdate = rs2.getString(3);
			    	 accstart = rs2.getString(4);
			    	 accstop = rs2.getString(5);
			    	 accVenue = rs2.getString(6);
			    	 
					 StringTokenizer str1 = new StringTokenizer(accstart,":");
			    	StringTokenizer str2 = new StringTokenizer(accstop,":");
			    	String h1=str1.nextToken();
					String m1=str1.nextToken();
					String h2=str2.nextToken();
					String m2=str2.nextToken();
					int hint1 = Integer.parseInt(h1);
					int mint1 = Integer.parseInt(m1);
					int hours1 = hint1*60*60;
					int min1 = mint1*60;
					int acctimestart = hours1 + min1;
					int hint2 = Integer.parseInt(h2);
					int mint2 = Integer.parseInt(m2);
					int hours2 = hint2*60*60;
					int min2 = mint2*60;
					int acctimestop = hours2 + min2;
					StringTokenizer str3 = new StringTokenizer(start,":");
			    StringTokenizer str4 = new StringTokenizer(stop,":");
			    String h3=str3.nextToken();
				String m3=str3.nextToken();
				String h4=str4.nextToken();
				String m4=str4.nextToken();
				int hint3 = Integer.parseInt(h3);
				int mint3 = Integer.parseInt(m3);
				int hours3 = hint3*60*60;
				int min3 = mint3*60;
				int timestart = hours3 + min3;
				int hint4 = Integer.parseInt(h4);
				int mint4 = Integer.parseInt(m4);
				int hours4 = hint4*60*60;
				int min4 = mint4*60;
				int timestop = hours4 + min4;
				
					if(accVenue.equals(Venue))
					{
					  if(accdate.equals(date))
					  {
					  	if((timestart<=acctimestop&&timestart>=acctimestart)||(timestop<=acctimestop&&timestop>=acctimestart))
					  	{
					  		flag=1;
					  	}
					  }
					}
				
				
			    }
			    
				
			    if(flag==0)
			    {
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q = "insert into eventrequest (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Department,Venue)values(?,?,?,?,?,?,?)";
				PreparedStatement ps = con1.prepareStatement(q);
				String name = textField.getText();
				 
				String dep = key;
				 
				
				
				

				
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, date);
				ps.setString(4, start);
				ps.setString(5, stop);
				ps.setString(6, dep);
				ps.setString(7, Venue);
				int result = ps.executeUpdate();
				if(result == 1)
				{
					textField_4.setText("Successfully Created");
				}
				else
				{
					textField_4.setText("Error");
				}
			    }
			    else
			    {
			    	textField_4.setText("Date, Venue and Time already occupied");
			    }
			
			}
			catch(Exception E) {}
			
		}
		else if(e.getSource()==btnReturn)
		{
			HODMenu frame = new HODMenu();
			frame.setVisible(true);
		}
	}
}
