import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldErabiltzailea;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Botoia sakatu da");
			}
		});
		btnGorde.setForeground(Color.DARK_GRAY);
		btnGorde.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnGorde.setBackground(Color.LIGHT_GRAY);
		btnGorde.setBounds(136, 144, 89, 23);
		contentPane.add(btnGorde);
		
		JLabel lblNombre = new JLabel("Erabiltzailea :");
		lblNombre.setBounds(28, 35, 77, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Pasahitza :");
		lblApellidos.setBounds(28, 71, 59, 14);
		contentPane.add(lblApellidos);
		
		textFieldErabiltzailea = new JTextField();
		textFieldErabiltzailea.setBounds(115, 32, 147, 20);
		contentPane.add(textFieldErabiltzailea);
		textFieldErabiltzailea.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(115, 68, 147, 17);
		contentPane.add(passwordField);
	}
}
