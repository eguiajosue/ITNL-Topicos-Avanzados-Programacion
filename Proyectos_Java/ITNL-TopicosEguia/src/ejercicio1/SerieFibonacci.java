package ejercicio1;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class SerieFibonacci {

	private JFrame frmSerieFibonacci;
	private JTextField txtIteraciones;
	private JTextArea txtSerie;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieFibonacci window = new SerieFibonacci();
					window.frmSerieFibonacci.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SerieFibonacci() {
		initialize();
	}

	private void initialize() {
		frmSerieFibonacci = new JFrame();
		frmSerieFibonacci.setTitle("Serie Fibonacci");
		frmSerieFibonacci.setBounds(100, 100, 306, 340);
		frmSerieFibonacci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSerieFibonacci.getContentPane().setLayout(null);
		
		
		JButton btnGenerarSerie = new JButton("Generar Serie");
		btnGenerarSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Iteraciones = txtIteraciones.getText();
				int Ciclos = Integer.parseInt(Iteraciones);
				
				int valor1 = 0;
		        int valor2 = 1;		        
		        int suma = 0;
		        
		        String Suma = "";
		        
		        for (int i = 0; i < Ciclos; i++) {
		            //System.out.println(valor1);
		            suma = valor1 + valor2;
		            valor1 = valor2;
		            valor2 = suma;   
		            
		            Suma = Suma + valor1 + " - ";
		        }
		        
		        txtSerie.setText(Suma);
			}
		});
		
		
		btnGenerarSerie.setBounds(10, 203, 270, 43);
		frmSerieFibonacci.getContentPane().add(btnGenerarSerie);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(159, 95, 65, 20);
		frmSerieFibonacci.getContentPane().add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		txtSerie = new JTextArea();
		txtSerie.setLineWrap(true);
		txtSerie.setEditable(false);
		txtSerie.setBounds(10, 120, 270, 72);
		frmSerieFibonacci.getContentPane().add(txtSerie);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Iteraciones");
		lblNewLabel.setBounds(10, 97, 156, 17);
		frmSerieFibonacci.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SERIE DE FIBONACCI");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Rubik", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(10, 47, 270, 37);
		frmSerieFibonacci.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Josue Francisco Eguia Rodriguez #20100191");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(10, 11, 270, 14);
		frmSerieFibonacci.getContentPane().add(lblNewLabel_2);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIteraciones.setText("");
				txtSerie.setText("");
				txtSerie.requestFocus();
			}
		});
		btnLimpiar.setBounds(10, 267, 89, 23);
		frmSerieFibonacci.getContentPane().add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(191, 267, 89, 23);
		frmSerieFibonacci.getContentPane().add(btnSalir);
	}
}
