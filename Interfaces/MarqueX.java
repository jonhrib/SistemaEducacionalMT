package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class MarqueX extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRespostaCorreta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarqueX frame = new MarqueX(1);
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
	public MarqueX(int xanterior) {
		setResizable(false);
		Random random = new Random();
		
		final int[] x = {0}; 
        do { //impedindo que a mesma página seja exibida em seguida
            x[0] = random.nextInt(5) + 1;
        } while (xanterior == x[0]);
	     
	        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAssinaleAAlternativa = new JTextPane();
		txtpnAssinaleAAlternativa.setEditable(false);
		txtpnAssinaleAAlternativa.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		txtpnAssinaleAAlternativa.setBounds(10, 47, 755, 26);
		txtpnAssinaleAAlternativa.setOpaque(false);
		contentPane.add(txtpnAssinaleAAlternativa);
		
		JRadioButton Botao1 = new JRadioButton("Uma MT com esta característica pode ter duas ou mais trilhas no mesmo cabeçote.");
		Botao1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Botao1.setBounds(10, 90, 622, 21);
		contentPane.add(Botao1);
		
		JRadioButton Botao2 = new JRadioButton("Neste tipo de MT, o cabeçote pode não se mover, mas pode escrever e apagar símbolos durante a transição.");
		Botao2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Botao2.setBounds(10, 125, 634, 21);
		contentPane.add(Botao2);
		
		JRadioButton Botao3 = new JRadioButton("Este tipo de MT possui mais de uma fita, permitindo operações simultâneas em várias posições de cabeçote.");
		Botao3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Botao3.setBounds(10, 160, 634, 21);
		contentPane.add(Botao3);
		
		JRadioButton Botao4 = new JRadioButton("Uma MT que não segue um único caminho de computação, permitindo várias possivilidades de transição para um mesmo estado,\r\npodendo ter mais de um estado ativo ao mesmo tempo.");
		Botao4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Botao4.setBounds(10, 186, 1048, 37);
		contentPane.add(Botao4);
		
		JRadioButton Botao5 = new JRadioButton("Este tipo de MT é capaz de manipular uma quantidade infinita de espaço na fita para a esquerda e direita");
		Botao5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Botao5.setBounds(10, 221, 1048, 37);
		contentPane.add(Botao5);
		
		JButton btnNewButton = new JButton("Conferir resposta");
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton.setBounds(14, 264, 156, 30);
		contentPane.add(btnNewButton);
		
		ButtonGroup buttonGroup = new ButtonGroup(); //grupo que garante que apenas um radio button seja acionado
		
		buttonGroup.add(Botao1);
		buttonGroup.add(Botao2);
		buttonGroup.add(Botao3);
		buttonGroup.add(Botao4);
		buttonGroup.add(Botao5);
		
		JTextPane txtpnRespostacorreta = new JTextPane();
		txtpnRespostacorreta.setEditable(false);
		txtpnRespostacorreta.setForeground(new Color(0, 128, 0));
		txtpnRespostacorreta.setFont(new Font("Adam Medium", Font.BOLD, 30));
		txtpnRespostacorreta.setText("Resposta Correta!!");
		txtpnRespostacorreta.setBounds(411, 347, 307, 48);
		txtpnRespostacorreta.setOpaque(false);
		contentPane.add(txtpnRespostacorreta);
		txtpnRespostacorreta.setVisible(false);
		
		JTextPane txtpnRespostaincorreta = new JTextPane();
		txtpnRespostaincorreta.setEditable(false);
		txtpnRespostaincorreta.setForeground(new Color(196, 0, 5));
		txtpnRespostaincorreta.setFont(new Font("Adam Medium", Font.BOLD, 30));
		txtpnRespostaincorreta.setText("Resposta Incorreta!!");
		txtpnRespostaincorreta.setBounds(411, 347, 307, 48);
		txtpnRespostaincorreta.setOpaque(false);
		txtpnRespostaincorreta.setVisible(false);
		contentPane.add(txtpnRespostaincorreta);
		
		JButton btnNewButton_1 = new JButton("Tentar novamente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarqueX rm = new MarqueX(x[0]);
        		rm.setVisible(true);
        		dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton_1.setBounds(954, 515, 156, 30);
		contentPane.add(btnNewButton_1);
		
		txtRespostaCorreta = new JTextField();
		txtRespostaCorreta.setBackground(new Color(255, 255, 255));
		txtRespostaCorreta.setForeground(new Color(0, 128, 0));
		txtRespostaCorreta.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtRespostaCorreta.setText("Resposta Correta:");
		txtRespostaCorreta.setEditable(false);
		txtRespostaCorreta.setBounds(10, 388, 1100, 84);
		contentPane.add(txtRespostaCorreta);
		txtRespostaCorreta.setColumns(10);
		txtRespostaCorreta.setOpaque(false);
		
		JButton btnNewButton_1_1 = new JButton("Voltar para o menu");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial ti = new TelaInicial ();
				ti.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(788, 515, 156, 30);
		contentPane.add(btnNewButton_1_1);
		txtRespostaCorreta.setVisible(false);

		switch (x[0]) {
			case 1:
				txtpnAssinaleAAlternativa.setText("Assinale a alternativa que descreva corretamente uma Máquina de Turing ilimitada.");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Botao5.isSelected()) {
							txtpnRespostacorreta.setVisible(true);
						}
						else {
							txtpnRespostacorreta.setVisible(false);
							txtpnRespostaincorreta.setVisible(true);
							txtRespostaCorreta.setText("Resposta Correta: Este tipo de MT é capaz de manipular uma quantidade infinita de espaço na fita para a esquerda e direita.");
							txtRespostaCorreta.setVisible(true);
						}
					}
				});
				break;
			case 2:
				txtpnAssinaleAAlternativa.setText("Assinale a alternativa que descreva corretamente uma Máquina de múltiplas trilhas.");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Botao1.isSelected()) {
							txtpnRespostacorreta.setVisible(true);
						}
						else {
							txtpnRespostacorreta.setVisible(false);
							txtpnRespostaincorreta.setVisible(true);
							txtRespostaCorreta.setText("Resposta Correta: Uma MT com esta característica pode ter duas ou mais trilhas no mesmo cabeçote.");
							txtRespostaCorreta.setVisible(true);
						}
					}
				});
				break;
			case 3:
				txtpnAssinaleAAlternativa.setText("Assinale a alternativa que descreva corretamente uma Máquina de Turing de múltiplas fitas.");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Botao3.isSelected()) {
							txtpnRespostacorreta.setVisible(true);
						}
						else {
							txtpnRespostacorreta.setVisible(false);
							txtpnRespostaincorreta.setVisible(true);
							txtRespostaCorreta.setText("Resposta Correta: Este tipo de MT possui mais de uma fita, permitindo operações simultâneas em várias posições de cabeçote.");
							txtRespostaCorreta.setVisible(true);
						}
					}
				});
				break;
			case 4:
				txtpnAssinaleAAlternativa.setText("Assinale a alternativa que descreva corretamente uma Máquina de Turing com cabeçote imóvel.");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Botao2.isSelected()) {
							txtpnRespostacorreta.setVisible(true);
						}
						else {
							txtpnRespostacorreta.setVisible(false);
							txtpnRespostaincorreta.setVisible(true);
							txtRespostaCorreta.setText("Resposta Correta: Neste tipo de MT, o cabeçote pode não se mover, mas pode escrever e apagar símbolos durante a transição.");
							txtRespostaCorreta.setVisible(true);
						}
					}
				});
				break;
			case 5:
				txtpnAssinaleAAlternativa.setText("Assinale a alternativa que descreva corretamente uma Máquina de Turing não determinista.");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Botao4.isSelected()) {
							txtpnRespostacorreta.setVisible(true);
						}
						else {
							txtpnRespostacorreta.setVisible(false);
							txtpnRespostaincorreta.setVisible(true);
							txtRespostaCorreta.setText("Resposta Correta: Uma MT que não segue um único caminho de computação, permitindo várias possivilidades de transição para um mesmo estado,\\r\\npodendo ter mais de um estado ativo ao mesmo tempo.");
							txtRespostaCorreta.setVisible(true);
						}
					}
				});
				break;
		}
		
	}
}
