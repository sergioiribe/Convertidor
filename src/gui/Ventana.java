package gui;
import convertidores.ConvertidorMoneda;
import java.text.DecimalFormat;

	
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
	import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
	import javax.swing.JTextField;
	import javax.swing.JSplitPane;
	import java.awt.Component;
	import javax.swing.Box;
	import javax.swing.JSeparator;
	import java.awt.Color;
	import javax.swing.JComboBox;
	import javax.swing.JButton;

	public class Ventana extends JFrame {

		private JPanel panelPrincipal;
		private JTextField textImporte;
		private JTextField textResultado;
		

		public Ventana() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 350, 400);
			setTitle("Mi primera aplicación");
			setLocationRelativeTo(null);
			
			ImageIcon logo = new ImageIcon("C:\\Users\\sergi\\Videos\\Programing\\Eclipse\\eclipse\\workspace\\Convertidor\\img/moneda.png");
			setIconImage(logo.getImage()); // Establecer logo
			
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(240, 240, 240));
			panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(panelPrincipal);
			panelPrincipal.setLayout(null);
			
			
			JLabel lblImporte = new JLabel("Importe");
			lblImporte.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblImporte.setBounds(10, 60, 365, 25);
			panelPrincipal.add(lblImporte);
			
			textImporte = new JTextField();
			textImporte.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textImporte.setBounds(10, 95, 316, 40);
			panelPrincipal.add(textImporte);
			textImporte.setColumns(10);
			
			JComboBox cbDeMoneda = new JComboBox();
			cbDeMoneda.setBounds(10, 145, 316, 40);
			cbDeMoneda.addItem("Peso mexicano (MXN)"); // Agregando las 4 monedas en el 1er JComboBox
			cbDeMoneda.addItem("Dolar estadounidense (USD)");
			cbDeMoneda.addItem("Libra esterlina (GBP)");
			cbDeMoneda.addItem("Euro (EUR)");
			panelPrincipal.add(cbDeMoneda);
			
			JComboBox cbAMoneda = new JComboBox();
			cbAMoneda.setBounds(10, 195, 316, 40);
			cbAMoneda.addItem("Peso mexicano (MXN)"); // Agregando las 4 monedas en el 2do JComboBox
			cbAMoneda.addItem("Dolar estadounidense (USD)");
			cbAMoneda.addItem("Libra esterlina (GBP)");
			cbAMoneda.addItem("Euro (EUR)");
			panelPrincipal.add(cbAMoneda);
		
			JButton btnConvertir = new JButton("Convertir");
			btnConvertir.setForeground(new Color(255, 255, 255));
			btnConvertir.setBackground(new Color(0, 128, 255));
			btnConvertir.setBounds(10, 245, 316, 35);
			btnConvertir.setBorderPainted(false);
			panelPrincipal.add(btnConvertir);
			
			textResultado = new JTextField();
			textResultado.setEditable(false);
			textResultado.setBounds(10, 290, 316, 50);
			textResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textResultado.setHorizontalAlignment(SwingConstants.CENTER);
			panelPrincipal.add(textResultado);
			textResultado.setColumns(10);
			
			JLabel lblTitulo = new JLabel("Convertidor");
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTitulo.setBounds(10, 10, 316, 40);
			panelPrincipal.add(lblTitulo);
			
			ConvertidorMoneda convertidor = new ConvertidorMoneda();
			
			btnConvertir.addActionListener(e -> {
			String monedaDe = (String) cbDeMoneda.getSelectedItem();
			String monedaA = (String) cbAMoneda.getSelectedItem();
			double importe = Double.parseDouble(textImporte.getText());
			
			DecimalFormat decimalFormat  = new DecimalFormat("#.##"); //Elegir los decimales
			
				if(monedaDe.equals("Peso mexicano (MXN)") && monedaA.equals("Dolar estadounidense (USD)")) {
					double resultado = convertidor.convertirMXNtoUSD(importe);
					textResultado.setText(decimalFormat.format(resultado) + " USD");
				} else if(monedaDe.equals("Dolar estadounidense (USD)") && monedaA.equals("Peso mexicano (MXN)")) {
					double resultado = convertidor.convertirUSDtoMXN(importe);
					textResultado.setText(decimalFormat.format(resultado) + " MXN");
				}  else if(monedaDe.equals("Peso mexicano (MXN)") && monedaA.equals("Libra esterlina (GBP)")) {
					double resultado = convertidor.convertirMXNtoGBP(importe);
					textResultado.setText(decimalFormat.format(resultado) + " GBP");
				} else if(monedaDe.equals("Libra esterlina (GBP)") && monedaA.equals("Peso mexicano (MXN)")) {
					double resultado = convertidor.convertirGBPtoMXN(importe);
					textResultado.setText(decimalFormat.format(resultado) + " MXN");
				} else if(monedaDe.equals("Peso mexicano (MXN)") && monedaA.equals("Euro (EUR)")) {
					double resultado = convertidor.convertirMXNtoEUR(importe);
					textResultado.setText(decimalFormat.format(resultado) + " EUR");
				} else if(monedaDe.equals("Euro (EUR)") && monedaA.equals("Peso mexicano (MXN)")) {
					double resultado = convertidor.convertirEURtoMXN(importe);
					textResultado.setText(decimalFormat.format(resultado) + " MXN");
				} else if(monedaDe.equals("Dolar estadounidense (USD)") && monedaA.equals("Libra esterlina (GBP)")) {
					double resultado = convertidor.convertirUSDtoGBP(importe);
					textResultado.setText(decimalFormat.format(resultado) + " GBP");
				} else if(monedaDe.equals("Libra esterlina (GBP)") && monedaA.equals("Dolar estadounidense (USD)")) {
					double resultado = convertidor.convertirGBPtoUSD(importe);
					textResultado.setText(decimalFormat.format(resultado) + " USD");
				} else if(monedaDe.equals("Dolar estadounidense (USD)") && monedaA.equals("Euro (EUR)" )) {
					double resultado = convertidor.convertirUSDtoEUR(importe);
					textResultado.setText(decimalFormat.format(resultado) + " EUR");
				} else if(monedaDe.equals("Euro (EUR)") && monedaA.equals("Dolar estadounidense (USD)" )) {
					double resultado = convertidor.convertirEURtoUSD(importe);
					textResultado.setText(decimalFormat.format(resultado) + " USD");
				} else if(monedaDe.equals("Libra esterlina (GBP)") && monedaA.equals("Euro (EUR)" )) {
					double resultado = convertidor.convertirGBPtoEUR(importe);
					textResultado.setText(decimalFormat.format(resultado) + " EUR");
				} else if(monedaDe.equals("Euro (EUR)") && monedaA.equals("Libra esterlina (GBP)" )) {
					double resultado = convertidor.convertirEURtoGBP(importe);
					textResultado.setText(decimalFormat.format(resultado) + " GBP");
				}
				
			});
			
			
		}
		
		
}

