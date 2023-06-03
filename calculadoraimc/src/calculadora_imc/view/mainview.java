package calculadora_imc.view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import calculadora_imc.control.imccontrole;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class mainview {

	private JFrame frmCalculadoraImc;
	private JTextField pesotextField;
	private JTextField alturatextField;
	private JTextPane resulttextPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainview window = new mainview();
					window.frmCalculadoraImc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraImc = new JFrame();
		frmCalculadoraImc.setAlwaysOnTop(true);
		frmCalculadoraImc.setTitle("Calculadora IMC");
		frmCalculadoraImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraImc.setType(Type.UTILITY);
		frmCalculadoraImc.setBounds(100, 100, 450, 300);
		frmCalculadoraImc.getContentPane().setLayout(null);
		
		JLabel pesoLabel = new JLabel("Digite seu Peso :");
		pesoLabel.setBounds(33, 65, 86, 14);
		frmCalculadoraImc.getContentPane().add(pesoLabel);
		
		pesotextField = new JTextField();
		pesotextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesotextField.setText("0.0");
		pesotextField.setBounds(121, 62, 86, 20);
		frmCalculadoraImc.getContentPane().add(pesotextField);
		pesotextField.setColumns(10);
		
		JLabel alturaLabel = new JLabel("Digite sua altura :");
		alturaLabel.setBounds(33, 96, 86, 14);
		frmCalculadoraImc.getContentPane().add(alturaLabel);
		
		alturatextField = new JTextField();
		alturatextField.setText("0.0");
		alturatextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturatextField.setColumns(10);
		alturatextField.setBounds(121, 93, 86, 20);
		frmCalculadoraImc.getContentPane().add(alturatextField);
		
		JButton calcButton = new JButton("Calcular");
		calcButton.addActionListener(new imccontrole(this));
			
		
		calcButton.setBounds(169, 140, 89, 23);
		frmCalculadoraImc.getContentPane().add(calcButton);
		
		resulttextPane = new JTextPane();
		resulttextPane.setBounds(121, 195, 179, 55);
		frmCalculadoraImc.getContentPane().add(resulttextPane);
	}

	public JFrame getFrmCalculadoraImc() {
		return frmCalculadoraImc;
	}

	public void setFrmCalculadoraImc(JFrame frmCalculadoraImc) {
		this.frmCalculadoraImc = frmCalculadoraImc;
	}

	public JTextField getPesotextField() {
		return pesotextField;
	}

	public void setPesotextField(JTextField pesotextField) {
		this.pesotextField = pesotextField;
	}

	public JTextField getAlturatextField() {
		return alturatextField;
	}

	public void setAlturatextField(JTextField alturatextField) {
		this.alturatextField = alturatextField;
	}

	public JTextPane getResulttextPane() {
		return resulttextPane;
	}

	public void setResulttextPane(JTextPane resulttextPane) {
		this.resulttextPane = resulttextPane;
	}
	
	
}
