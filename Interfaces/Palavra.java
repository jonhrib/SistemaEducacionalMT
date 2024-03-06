package Interfaces;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Classes.MT1;
import Classes.Transicoes;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Palavra extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private char vet [] = new char [60];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palavra frame = new Palavra(1,1,null,null,'\0','\0',null,1);
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
	public Palavra(int tamanhodoalfabeto, int qtdestados, char [] alfabetogeral, Transicoes mat [][], char marcador, char branco, String[] finais, int estadoinicial) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		addWindowListener(new WindowAdapter() { // executa quando a janela é aberta
            @Override
            public void windowOpened(WindowEvent e) {
                textField.requestFocusInWindow(); //coloca o foco, inicialmente, no primeiro textfield
            }
        });
		
		JTextPane txtpnPalavraAceita = new JTextPane();
		JTextPane txtpnPalavraRecusada = new JTextPane();
		JButton btnNewButton = new JButton("Testar");
		JTextPane txtpnFitaI = new JTextPane();
		JTextPane txtpnFitaF = new JTextPane();
		
		JTextPane txtpnTransies = new JTextPane();
		txtpnTransies.setEditable(false);
		txtpnTransies.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		txtpnTransies.setText("Testando palavras");
		txtpnTransies.setBounds(386, 10, 199, 33);
		txtpnTransies.setOpaque(false);
		contentPane.add(txtpnTransies);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.doClick();
			}
		});
		textField.setBounds(283, 100, 173, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPalavraASer = new JTextPane();
		txtpnPalavraASer.setText("Palavra a ser testada");
		txtpnPalavraASer.setOpaque(false);
		txtpnPalavraASer.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		txtpnPalavraASer.setEditable(false);
		txtpnPalavraASer.setBounds(464, 100, 199, 33);
		contentPane.add(txtpnPalavraASer);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] resposta;
				
				MT1 m = new MT1();
				resposta = m.executapalavra(textField.getText(),tamanhodoalfabeto, qtdestados, alfabetogeral, mat, marcador, branco, finais, estadoinicial);
				
//				if (textField.getText().equals("palavrinha")) {
//					teste = true;
//				}
				
				boolean teste = Boolean.parseBoolean(resposta[0]);
				
				vet[0]= marcador;
				for (int i = 0; i < textField.getText().length(); i++) {
					vet[i+1] = textField.getText().charAt(i);
				}
				
				for (int i = textField.getText().length()+1; i < vet.length; i++) {
					vet[i] = branco;
				}
				
				String fitainicial = new String (vet);
				
				String fitafinal = new String (resposta[1]);
		        
		        txtpnFitaI.setText(" " + fitainicial);
		        
		        txtpnFitaF.setText(" " + fitafinal);
				
				if (teste) {
					txtpnPalavraAceita.setEnabled(true);
					txtpnPalavraRecusada.setEnabled(false);
				}
				else {
					txtpnPalavraRecusada.setEnabled(true);
					txtpnPalavraAceita.setEnabled(false);
				}
			}
		});
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNewButton.setBounds(438, 145, 85, 25);
		contentPane.add(btnNewButton);
		
		txtpnPalavraAceita.setEnabled(false);
		txtpnPalavraAceita.setForeground(new Color(0, 128, 0));
		txtpnPalavraAceita.setText("Palavra aceita!!");
		txtpnPalavraAceita.setOpaque(false);
		txtpnPalavraAceita.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		txtpnPalavraAceita.setEditable(false);
		txtpnPalavraAceita.setBounds(397, 220, 184, 33);
		contentPane.add(txtpnPalavraAceita);
		
		txtpnPalavraRecusada.setEnabled(false);
		txtpnPalavraRecusada.setText("Palavra recusada!!");
		txtpnPalavraRecusada.setOpaque(false);
		txtpnPalavraRecusada.setForeground(new Color(193, 0, 0));
		txtpnPalavraRecusada.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		txtpnPalavraRecusada.setEditable(false);
		txtpnPalavraRecusada.setBounds(381, 263, 216, 33);
		contentPane.add(txtpnPalavraRecusada);
		
		JButton btnNewButton1 = new JButton("Voltar para o menu");
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TelaInicial i = new TelaInicial ();
        		i.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton1.setBackground(new Color(240, 240, 240));
        btnNewButton1.setFont(new Font("Bauhaus", Font.BOLD, 10));
        btnNewButton1.setBounds(828, 524, 134, 21);
        contentPane.add(btnNewButton1);
        
        txtpnFitaI.setOpaque(false);
        txtpnFitaI.setForeground(new Color(0, 128, 0));
        txtpnFitaI.setFont(new Font("Bahnschrift", Font.BOLD, 18));
        txtpnFitaI.setEnabled(false);
        txtpnFitaI.setEditable(false);
        txtpnFitaI.setBounds(10, 387, 952, 33);
        contentPane.add(txtpnFitaI);
        
        txtpnFitaF.setOpaque(false);
        txtpnFitaF.setForeground(new Color(0, 128, 0));
        txtpnFitaF.setFont(new Font("Bahnschrift", Font.BOLD, 18));
        txtpnFitaF.setEnabled(false);
        txtpnFitaF.setEditable(false);
        txtpnFitaF.setBounds(10, 450, 952, 33);
        contentPane.add(txtpnFitaF);
        
        JTextPane txtpnFitaFinal = new JTextPane();
        txtpnFitaFinal.setText("Fita final");
        txtpnFitaFinal.setOpaque(false);
        txtpnFitaFinal.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        txtpnFitaFinal.setEditable(false);
        txtpnFitaFinal.setBounds(10, 430, 70, 33);
        contentPane.add(txtpnFitaFinal);
        
        JTextPane txtpnFitaInicial = new JTextPane();
        txtpnFitaInicial.setText("Fita inicial");
        txtpnFitaInicial.setOpaque(false);
        txtpnFitaInicial.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        txtpnFitaInicial.setEditable(false);
        txtpnFitaInicial.setBounds(10, 371, 70, 33);
        contentPane.add(txtpnFitaInicial);
	}

}
