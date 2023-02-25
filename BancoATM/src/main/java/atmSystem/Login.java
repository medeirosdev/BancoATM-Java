package atmSystem;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;  
import javax.swing.JLabel; 
//JPanel: Inserido elementos em um JFrame - serve para isso

public class Login {
	
	
	//new FlowLayout(FlowLayout.CENTER, 10 , 5)
	StaticFrame Frame = new StaticFrame();
	public Login() {
		//===================================================================
		//Instanciar Static Frame
			
		//===================================================================
		//Criando Panel
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.CENTER , 10, 5));
			panel.setBackground(Color.DARK_GRAY);
		// irá cobrir todo o espaço, se for North, irá cobrir só em cima
		//===================================================================
		//====================================================================
		//Buttons Configuração
			Button buttonIniciar = new Button("Logar");
			panel.add(buttonIniciar);
			Button buttonFechar = new Button("Sair");
			panel.add(buttonFechar);
			Button buttonOutrasC = new Button("Configurações");
			panel.add(buttonOutrasC);
		//====================================================================
		//Como adicionar um evento quando o button é clicado
			buttonIniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StaticFrame FrameLogin = new StaticFrame();
					Frame.repaint();
					Frame.validate();
					Frame.setVisible(false);
					FrameLogin.setVisible(true);
					JTextField login1 = new JTextField(15);
					FrameLogin.add(login1);
					
					
					
					
				}
				
			});
			
		//====================================================================	
		//Adicionado Panel ao Frame
			Frame.add(panel , BorderLayout.CENTER);//Adicionar o Panel ao JFrame
		//====================================================================
			Frame.setVisible(true);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

		new Login();

	}




	


	











	
}
