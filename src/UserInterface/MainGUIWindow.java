package UserInterface;
import Controllers.GuiController;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainGUIWindow {

	private GuiController gui_controller;
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUIWindow window = new MainGUIWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUIWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gui_controller = new GuiController();
		
		frame = new JFrame("PoE Value Checker");
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(SystemColor.controlDkShadow);
		frame.setBounds(100, 100, 770, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(0, 0, 0));
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(30, 56, 367, 222);
		frame.getContentPane().add(textPane);
		
		JLabel lblCopiedItemString = new JLabel("Copied Item String");
		lblCopiedItemString.setForeground(Color.WHITE);
		lblCopiedItemString.setBounds(30, 27, 172, 28);
		frame.getContentPane().add(lblCopiedItemString);
		
		JLabel lblSGurgurich = new JLabel("S. Gurgurich");
		lblSGurgurich.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblSGurgurich.setBounds(707, 503, 60, 16);
		frame.getContentPane().add(lblSGurgurich);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(409, 55, 313, 435);
		frame.getContentPane().add(textArea);
		
		JLabel lblItemAttributes = new JLabel("Item Attributes");
		lblItemAttributes.setForeground(Color.WHITE);
		lblItemAttributes.setBounds(409, 33, 134, 16);
		frame.getContentPane().add(lblItemAttributes);
		
		JButton btnCheckItem = new JButton("Check Item");
		btnCheckItem.setBounds(211, 285, 186, 25);
		frame.getContentPane().add(btnCheckItem);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(30, 456, 367, 25);
		frame.getContentPane().add(btnClear);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(145, 351, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(264, 351, 133, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(145, 386, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(264, 386, 133, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(145, 421, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(264, 421, 133, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblLowestPrice = new JLabel("Lowest Price");
		lblLowestPrice.setForeground(Color.WHITE);
		lblLowestPrice.setBounds(30, 354, 90, 16);
		frame.getContentPane().add(lblLowestPrice);
		
		JLabel lblAvgPrice = new JLabel("Avg. Price");
		lblAvgPrice.setForeground(Color.WHITE);
		lblAvgPrice.setBounds(30, 389, 90, 16);
		frame.getContentPane().add(lblAvgPrice);
		
		JLabel lblHighestPrice = new JLabel("Highest Price");
		lblHighestPrice.setForeground(Color.WHITE);
		lblHighestPrice.setBounds(30, 424, 90, 16);
		frame.getContentPane().add(lblHighestPrice);
		
		JLabel lblWorthSelling = new JLabel("Worth Selling?");
		lblWorthSelling.setForeground(Color.WHITE);
		lblWorthSelling.setBounds(30, 323, 90, 16);
		frame.getContentPane().add(lblWorthSelling);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(145, 320, 252, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(30, 285, 172, 25);
		frame.getContentPane().add(btnImport);
	}
}
