package proto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class ViewEventRequests extends JFrame implements ActionListener {

	private JPanel contentPane;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JButton btnViewNextRequest;
	JButton btnReturn;
	int id;
	String name;
	String date;
	String start;
	String stop;
	String dep;
	String ven;
	String [][] data = new String[1][8];
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTable table_2;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEventRequests frame = new ViewEventRequests();
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
	public ViewEventRequests() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 533);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 159, 909, 42);
		contentPane.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Department", "Venue"
			}
		));
		table_2.setForeground(Color.BLACK);
		
		JLabel lblViewEvent = new JLabel("VIEW EVENT REQUESTS");
		lblViewEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewEvent.setForeground(new Color(255, 255, 255));
		lblViewEvent.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblViewEvent.setBounds(571, 20, 374, 47);
		contentPane.add(lblViewEvent);
		
		btnReturn = new JButton("return");
		btnReturn.setForeground(new Color(0, 0, 255));
		btnReturn.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnReturn.setBorder(null);
		btnReturn.setBackground(new Color(30, 144, 255));
		btnReturn.setBounds(845, 416, 100, 35);
		contentPane.add(btnReturn);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("ACCEPT EVENT");
		lblNewLabel_1_2.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(36, 138, 132, 25);
		contentPane.add(lblNewLabel_1_2);
		
		rdbtnNewRadioButton = new JRadioButton("YES");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(36, 248, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBounds(36, 284, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from eventrequest ORDER BY ID ASC");
		rs.next();
			 id = rs.getInt(1);
			 name = rs.getString(2);
			 date = rs.getString(3);
			 start = rs.getString(4);
			 stop = rs.getString(5);
			 dep = rs.getString(6);
			 ven = rs.getString(7);
			data[0][0]= "" + id;
			data[0][1] = name;
			data[0][2] = date;
			data[0][3] = start;
			data[0][4] = stop;
			data[0][5] = dep;
			data[0][6] = ven;
			table_2.setModel(new DefaultTableModel(
					data
					,
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Department", "Venue"
					}
				));
			btnViewNextRequest = new JButton("VIEW NEXT REQUEST");
			btnViewNextRequest.setForeground(new Color(0, 0, 255));
			btnViewNextRequest.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
			btnViewNextRequest.setBorder(null);
			btnViewNextRequest.setBackground(new Color(30, 144, 255));
			btnViewNextRequest.setBounds(10, 416, 225, 35);
			contentPane.add(btnViewNextRequest);
			
			textField = new JTextField();
			textField.setOpaque(false);
			textField.setColumns(10);
			textField.setBorder(null);
			textField.setBackground(Color.WHITE);
			textField.setBounds(162, 249, 156, 87);
			contentPane.add(textField);
			
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(ViewEventRequests.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
			lblNewLabel.setBounds(0, 0, 969, 543);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("ACCEPT EVENT");
			lblNewLabel_1_2_1.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 10));
			lblNewLabel_1_2_1.setBounds(36, 173, 120, 16);
			contentPane.add(lblNewLabel_1_2_1);
					
		}
		catch(Exception x) {}
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton_1.addActionListener(this);
		btnViewNextRequest.addActionListener(this);
		btnReturn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(rdbtnNewRadioButton.isSelected())
		{
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_1.setSelected(false);
			int id=0;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con3 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				Statement st3 = con3.createStatement();
				ResultSet rs3 = st3.executeQuery("SELECT count(*) FROM accepted");
				rs3.next();
			    id = rs3.getInt(1);
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q2 = "insert into accepted (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Venue)values(?,?,?,?,?,?)";
				PreparedStatement ps2 = con2.prepareStatement(q2);
				ps2.setInt(1,id);
				ps2.setString(2, name);
				ps2.setString(3, date);
				ps2.setString(4, start);
				ps2.setString(5, stop);
				ps2.setString(6, ven);
				int result2 = ps2.executeUpdate();
				if(result2 == 1)
				{
					textField.setText("Successfull");
				}
				else
				{
					textField.setText("Failed");
				}
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			Statement st = con.createStatement();
			if(dep.equals("CSE"))
			{
				ResultSet rs = st.executeQuery("SELECT count(*) FROM cse");
				rs.next();
			    id = rs.getInt(1);
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q = "insert into cse (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Venue)values(?,?,?,?,?,?)";
				PreparedStatement ps = con1.prepareStatement(q);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, date);
				ps.setString(4, start);
				ps.setString(5, stop);
				ps.setString(6, ven);
				int result = ps.executeUpdate();
				if(result == 1)
				{
					textField.setText("Successfull");
				}
				else
				{
					textField.setText("Failed");
				}

			}
			
			else if(dep.equals("Civil"))
			{
				ResultSet rs = st.executeQuery("SELECT count(*) FROM civil");
				rs.next();
			    id = rs.getInt(1);
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q = "insert into civil (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Venue)values(?,?,?,?,?,?)";
				PreparedStatement ps = con1.prepareStatement(q);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, date);
				ps.setString(4, start);
				ps.setString(5, stop);
				ps.setString(6, ven);
				int result = ps.executeUpdate();
				if(result == 1)
				{
					textField.setText("Successfull");
				}
				else
				{
					textField.setText("Failed");
				}
			}

			else if(dep.equals("Mech"))
			{
				ResultSet rs = st.executeQuery("SELECT count(*) FROM mech");
				rs.next();
			    id = rs.getInt(1);
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q = "insert into mech (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Venue)values(?,?,?,?,?,?)";
				PreparedStatement ps = con1.prepareStatement(q);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, date);
				ps.setString(4, start);
				ps.setString(5, stop);
				ps.setString(6, ven);
				int result = ps.executeUpdate();
				if(result == 1)
				{
					textField.setText("Successfull");
				}
				else
				{
					textField.setText("Failed");
				}
			}

			else if(dep.equals("EEE"))
			{
				ResultSet rs = st.executeQuery("SELECT count(*) FROM eee");
				rs.next();
			    id = rs.getInt(1);
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q = "insert into eee (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Venue)values(?,?,?,?,?,?)";
				PreparedStatement ps = con1.prepareStatement(q);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, date);
				ps.setString(4, start);
				ps.setString(5, stop);
				ps.setString(6, ven);
				int result = ps.executeUpdate();
				if(result == 1)
				{
					textField.setText("Successfull");
				}
				else
				{
					textField.setText("Failed");
				}
			}
			
			else if(dep.equals("ECE"))
			{
				ResultSet rs = st.executeQuery("SELECT count(*) FROM ece");
				rs.next();
			    id = rs.getInt(1);
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
				String q = "insert into ece (ID,Event_Name,Event_Date,Start_Time,Stop_Time,Venue)values(?,?,?,?,?,?)";
				PreparedStatement ps = con1.prepareStatement(q);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, date);
				ps.setString(4, start);
				ps.setString(5, stop);
				ps.setString(6, ven);
				int result = ps.executeUpdate();
				if(result == 1)
				{
					textField.setText("Successfull");
				}
				else
				{
					textField.setText("Failed");
				}
			}
			table_2.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Department", "Venue"
					}
				));			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			Statement stmt = con1.createStatement();
			String q = "DELETE FROM eventrequest LIMIT 1";
			stmt.executeUpdate(q);
			
			}
			catch(Exception E) {}
			
		}
		else if(rdbtnNewRadioButton_1.isSelected())
		{
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_1.setSelected(false);
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			Statement stmt = con1.createStatement();
			String q = "DELETE FROM eventrequest LIMIT 1";
			stmt.executeUpdate(q);
			table_2.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Department", "Venue"
					}
				));
			}
			catch(Exception E) {}
		}
		if(e.getSource()==btnViewNextRequest)
		{
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_1.setSelected(false);
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from eventrequest ORDER BY ID ASC");
			rs.next();
				 id = rs.getInt(1);
				 name = rs.getString(2);
				 date = rs.getString(3);
				 start = rs.getString(4);
				 stop = rs.getString(5);
				 dep = rs.getString(6);
				 ven = rs.getString(7);
				 
				data[0][0]= "" + id;
				data[0][1] = name;
				data[0][2] = date;
				data[0][3] = start;
				data[0][4] = stop;
				data[0][5] = dep;
				data[0][6] = ven;
				table_2.setModel(new DefaultTableModel(
						data,
						new String[] {
							"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Department", "Venue"
						}
					));
			}catch(Exception E) {}
		}
		else if(e.getSource()==btnReturn)
		{
			AdminView frame = new AdminView();
			frame.setVisible(true);
		}
	}
}
