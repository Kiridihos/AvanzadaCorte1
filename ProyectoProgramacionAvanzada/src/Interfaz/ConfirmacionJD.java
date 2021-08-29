package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class  ConfirmacionJD extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private boolean confirmacion;
	
	
	public  ConfirmacionJD(java.awt.Frame parent, boolean modal) {
		super(parent,modal);
		setUndecorated(true);
		setTitle("The Star Rover Confirmacion");
		setType(Type.UTILITY);
		setBounds(100, 100, 450, 170);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Esta seguro de hacer esta accion?");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 80);
		contentPanel.add(lblNewLabel);
		
		JButton confirmarBtn = new JButton("Confirmar");
		confirmarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmacion=true;
				dispose();
			}
		});
		confirmarBtn.setBounds(84, 91, 107, 38);
		contentPanel.add(confirmarBtn);
		
		JButton cancelarBtn = new JButton("Cancelar");
		cancelarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmacion=false;
				dispose();
			}
		});
		cancelarBtn.setBounds(255, 91, 107, 38);
		contentPanel.add(cancelarBtn);
	}


	public boolean isConfirmacion() {
		return confirmacion;
	}


	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}
	
	
}
