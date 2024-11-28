package pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aritmatika {

	private JFrame frmAritmatika;
	private JTextField A;
	private JTextField B;
	private JTextField C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frmAritmatika.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAritmatika = new JFrame();
		frmAritmatika.setResizable(false);
		frmAritmatika.setTitle("Aritmatika");
		frmAritmatika.setBounds(100, 100, 193, 256);
		frmAritmatika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAritmatika.getContentPane().setLayout(null);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setBounds(47, 11, 86, 20);
		frmAritmatika.getContentPane().add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setColumns(10);
		B.setBounds(47, 96, 86, 20);
		frmAritmatika.getContentPane().add(B);
		
		C = new JTextField();
		C.setHorizontalAlignment(SwingConstants.CENTER);
		C.setColumns(10);
		C.setBounds(47, 186, 86, 20);
		frmAritmatika.getContentPane().add(C);
		
		JLabel lblNewLabel = new JLabel("Hasil");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 161, 46, 14);
		frmAritmatika.getContentPane().add(lblNewLabel);
		
		JComboBox OPcb = new JComboBox();
		OPcb.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "+", "-", "*", "/", "%"}));
		OPcb.setBounds(59, 58, 61, 22);
		frmAritmatika.getContentPane().add(OPcb);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(44, 127, 89, 23);
		frmAritmatika.getContentPane().add(btnNewButton);
	}
}
