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
import javax.swing.ImageIcon;

public class ViewEvent extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	JButton btnReturn;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEvent frame = new ViewEvent();
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
	public ViewEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 162, 844, 186);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Constantia", Font.PLAIN, 15));
		table.setForeground(new Color(0, 0, 0));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Venue"
			}
		));
		
		JLabel lblViewEvent = new JLabel("VIEW EVENTS");
		lblViewEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewEvent.setForeground(new Color(255, 255, 255));
		lblViewEvent.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblViewEvent.setBounds(646, 20, 202, 47);
		contentPane.add(lblViewEvent);
		
		 btnReturn = new JButton("return");
		btnReturn.setForeground(new Color(0, 0, 255));
		btnReturn.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		btnReturn.setBorder(null);
		btnReturn.setBackground(new Color(30, 144, 255));
		btnReturn.setBounds(845, 416, 100, 35);
		contentPane.add(btnReturn);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ViewEvent.class.getResource("/proto/WhatsApp Image 2023-06-03 at 6.23.13 AM.jpeg")));
		lblNewLabel.setBounds(0, 0, 966, 496);
		contentPane.add(lblNewLabel);
		btnReturn.addActionListener(this);
		try
		{
		int i = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webinfo","root","coolguy@8328");
		Statement st = con.createStatement();
		if(Proto.DEPARTMENT.equals("CSE"))
		{
			ResultSet rs1 = st.executeQuery("select * from cse");
			while(rs1.next())
			{
				i++;
			}
			String [][]data = new String[i][6];
			ResultSet rs = st.executeQuery("select * from cse");
			i = 0;
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String date = rs.getString(3);
				String start = rs.getString(4);
				String stop = rs.getString(5);
				String ven = rs.getString(6);
				data[i][0]= "" + id;
				data[i][1] = name;
				data[i][2] = date;
				data[i][3] = start;
				data[i][4] = stop;
				data[i][5] = ven;
				i++;
			}
			table.setModel(new DefaultTableModel(
					data
					,
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Venue"
					}
				));

		}
		
		else if(Proto.DEPARTMENT.equals("Civil"))
		{
			ResultSet rs1 = st.executeQuery("select * from civil");
			while(rs1.next())
			{
				i++;
			}
			String [][]data = new String[i][6];
			ResultSet rs = st.executeQuery("select * from civil");
			i=0;
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String date = rs.getString(3);
				String start = rs.getString(4);
				String stop = rs.getString(5);
				String ven = rs.getString(6);
				data[i][0]= "" + id;
				data[i][1] = name;
				data[i][2] = date;
				data[i][3] = start;
				data[i][4] = stop;
				data[i][5] = ven;
				i++;
			}
			table.setModel(new DefaultTableModel(
					data
					,
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Venue"
					}
				));

		}

		else if(Proto.DEPARTMENT.equals("Mech"))
		{
			ResultSet rs1 = st.executeQuery("select * from mech");
			while(rs1.next())
			{
				i++;
			}
			String [][]data = new String[i][6];
			ResultSet rs = st.executeQuery("select * from mech");
			i=0;
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String date = rs.getString(3);
				String start = rs.getString(4);
				String stop = rs.getString(5);
				String ven = rs.getString(6);
				data[i][0]= "" + id;
				data[i][1] = name;
				data[i][2] = date;
				data[i][3] = start;
				data[i][4] = stop;
				data[i][5] = ven;
				i++;
			}
			table.setModel(new DefaultTableModel(
					data
					,
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Venue"
					}
				));

		}

		else if(Proto.DEPARTMENT.equals("EEE"))
		{
			ResultSet rs1 = st.executeQuery("select * from eee");
			i=0;
			while(rs1.next())
			{
				i++;
			}
			String [][]data = new String[i][6];
			ResultSet rs = st.executeQuery("select * from eee");
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String date = rs.getString(3);
				String start = rs.getString(4);
				String stop = rs.getString(5);
				String ven = rs.getString(6);
				data[i][0]= "" + id;
				data[i][1] = name;
				data[i][2] = date;
				data[i][3] = start;
				data[i][4] = stop;
				data[i][5] = ven;
				i++;
			}
			table.setModel(new DefaultTableModel(
					data
					,
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Venue"
					}
				));

		}
		
		else if(Proto.DEPARTMENT.equals("ECE"))
		{
			ResultSet rs1 = st.executeQuery("select * from ece");
			i=0;
			while(rs1.next())
			{
				i++;
			}
			String [][]data = new String[i][6];
			ResultSet rs = st.executeQuery("select * from ece");
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String date = rs.getString(3);
				String start = rs.getString(4);
				String stop = rs.getString(5);
				String ven = rs.getString(6);
				data[i][0]= "" + id;
				data[i][1] = name;
				data[i][2] = date;
				data[i][3] = start;
				data[i][4] = stop;
				data[i][5] = ven;
				i++;
			}
			table.setModel(new DefaultTableModel(
					data
					,
					new String[] {
						"ID", "Event Name", "Event Date", "Start Time", "Stop Time", "Venue"
					}
				));

		}
		
		}
		catch(Exception E) {System.out.println(E);}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnReturn)
		{
			String p = Proto.POSITION;
			if(p.equals("HOD"))
			{
				HODMenu frame = new HODMenu();
				frame.setVisible(true);
			}
			else if(p.equals("Admin"))
			{
				AdminView frame = new AdminView();
				frame.setVisible(true);
			}
		}
	}
}
