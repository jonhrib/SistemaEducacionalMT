package Interfaces;

import java.awt.EventQueue;

import Classes.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Canvas;

public class ExecutarMT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField qtdletras;
	private JTextPane txtpnQuantidadeDeLetras;
	private JTextField alfabeto;
	private JTextField letraestados;
	private JTextField qtdestados;
	private JTextField inicial;
	private JTextField qtdfinais;
	private JTextField finais;
	private JTextField marcinicio;
	private JTextField marcbranco;
	private JButton btnNewButton;
	private JTextPane txtpnErro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExecutarMT frame = new ExecutarMT();
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
	public ExecutarMT() {
		setResizable(false);
		addWindowListener(new WindowAdapter() { // executa quando a janela é aberta
            @Override
            public void windowOpened(WindowEvent e) {
                qtdletras.requestFocusInWindow(); //coloca o foco, inicialmente, no primeiro textfield (qtdletras)
            }
        });
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Gerar Descrição Formal");
		qtdletras = new JTextField();
		alfabeto = new JTextField();
		letraestados = new JTextField();
		qtdestados = new JTextField();
		inicial = new JTextField();
		qtdfinais = new JTextField();
		finais = new JTextField();
		marcinicio = new JTextField();
		marcbranco = new JTextField();
		alfabeto.setEnabled(false);
		letraestados.setEnabled(false);
		qtdestados.setEnabled(false);
		inicial.setEnabled(false);
		qtdfinais.setEnabled(false);
		finais.setEnabled(false);
		marcinicio.setEnabled(false);
		marcbranco.setEnabled(false);
		btnNewButton.setEnabled(false);
		txtpnErro = new JTextPane();
		txtpnErro.setVisible(false);
		
		qtdletras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (qtdletras.getText().matches("[0-9]+")) {
					alfabeto.setEnabled(true);
					alfabeto.requestFocusInWindow();
					txtpnErro.setVisible(false);
				}
				else { //se não for um número
					txtpnErro.setText("Dado incorreto, informe um número");
					txtpnErro.setVisible(true);
				}
			}
		});
		qtdletras.setBounds(21, 49, 47, 19);
		contentPane.add(qtdletras);
		qtdletras.setColumns(10);
		
		JTextPane txtpnForneaADescrio = new JTextPane();
		txtpnForneaADescrio.setEditable(false);
		txtpnForneaADescrio.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		txtpnForneaADescrio.setText("Forneça a descrição formal e uma palavra para testar");
		txtpnForneaADescrio.setBounds(21, 20, 312, 19);
		txtpnForneaADescrio.setOpaque(false);
		contentPane.add(txtpnForneaADescrio);
		
		txtpnQuantidadeDeLetras = new JTextPane();
		txtpnQuantidadeDeLetras.setText("Quantidade de letras do alfabeto");
		txtpnQuantidadeDeLetras.setOpaque(false);
		txtpnQuantidadeDeLetras.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnQuantidadeDeLetras.setEditable(false);
		txtpnQuantidadeDeLetras.setBounds(78, 49, 189, 19);
		contentPane.add(txtpnQuantidadeDeLetras);
	
		alfabeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanho = (Integer.parseInt(qtdletras.getText())*2)-1;
				if (alfabeto.getText().length() != tamanho || !alfabeto.getText().contains(",")) {
					txtpnErro.setText("Dado incorreto, informe a quantidade correta de letras, separadas por vírgula");
					txtpnErro.setVisible(true);
				}
				else { //se o tamanho estiver certo ou não tiver vírgula
					letraestados.setEnabled(true);
					letraestados.requestFocusInWindow();
					txtpnErro.setVisible(false);
				}
			}
		});
		alfabeto.setColumns(10);
		alfabeto.setBounds(21, 78, 152, 19);
		contentPane.add(alfabeto);
		
		JTextPane txtpnAsLetrasDo = new JTextPane();
		txtpnAsLetrasDo.setText("As letras do alfabeto (separadas por vírgula)");
		txtpnAsLetrasDo.setOpaque(false);
		txtpnAsLetrasDo.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnAsLetrasDo.setEditable(false);
		txtpnAsLetrasDo.setBounds(183, 78, 246, 19);
		contentPane.add(txtpnAsLetrasDo);
		
		letraestados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (letraestados.getText().length() != 1 || !letraestados.getText().matches("[a-zA-Z ]*")) {
					txtpnErro.setText("Dado incorreto, informe somente uma letra");
					txtpnErro.setVisible(true);
				}
				else { //se não for letra e se não for somente uma
					txtpnErro.setVisible(false);
					qtdestados.setEnabled(true);
					qtdestados.requestFocusInWindow();	
				}
			}
		});
		letraestados.setColumns(10);
		letraestados.setBounds(21, 107, 47, 19);
		contentPane.add(letraestados);
		
		JTextPane txtpnLetraParaRepresentar = new JTextPane();
		txtpnLetraParaRepresentar.setText("Letra para representar os estados");
		txtpnLetraParaRepresentar.setOpaque(false);
		txtpnLetraParaRepresentar.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnLetraParaRepresentar.setEditable(false);
		txtpnLetraParaRepresentar.setBounds(78, 107, 210, 19);
		contentPane.add(txtpnLetraParaRepresentar);
		
		qtdestados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (qtdestados.getText().matches("[0-9]+")) {
					inicial.setEnabled(true);
					inicial.requestFocusInWindow();
					txtpnErro.setVisible(false);
				}
				else { //se não for número
					txtpnErro.setText("Dado incorreto, informe somente um número");
					txtpnErro.setVisible(true);
				}
			}
		});
		qtdestados.setColumns(10);
		qtdestados.setBounds(21, 136, 47, 19);
		contentPane.add(qtdestados);
		
		JTextPane txtpnQuantidadeDeEstados = new JTextPane();
		txtpnQuantidadeDeEstados.setText("Quantidade de estados");
		txtpnQuantidadeDeEstados.setOpaque(false);
		txtpnQuantidadeDeEstados.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnQuantidadeDeEstados.setEditable(false);
		txtpnQuantidadeDeEstados.setBounds(78, 136, 152, 19);
		contentPane.add(txtpnQuantidadeDeEstados);
		
		JTextPane txtpnEstadoInicialsomente = new JTextPane();
		txtpnEstadoInicialsomente.setText("Estado inicial (somente o nº)");
		txtpnEstadoInicialsomente.setOpaque(false);
		txtpnEstadoInicialsomente.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnEstadoInicialsomente.setEditable(false);
		txtpnEstadoInicialsomente.setBounds(78, 165, 168, 19);
		contentPane.add(txtpnEstadoInicialsomente);
		
		inicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inicial.getText().length() != 1 || !inicial.getText().matches("[0-9]+")) {
					txtpnErro.setText("Dado incorreto, informe somente o número");
					txtpnErro.setVisible(true);
				}
				else { //se não for número e somente um
					txtpnErro.setVisible(false);
					qtdfinais.setEnabled(true);
					qtdfinais.requestFocusInWindow();
				}
			}
		});
		inicial.setColumns(10);
		inicial.setBounds(21, 165, 47, 19);
		contentPane.add(inicial);
		
		JTextPane txtpnQuantidadeDeEstados_1 = new JTextPane();
		txtpnQuantidadeDeEstados_1.setText("Quantidade de estados finais");
		txtpnQuantidadeDeEstados_1.setOpaque(false);
		txtpnQuantidadeDeEstados_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnQuantidadeDeEstados_1.setEditable(false);
		txtpnQuantidadeDeEstados_1.setBounds(78, 194, 168, 19);
		contentPane.add(txtpnQuantidadeDeEstados_1);
		
		qtdfinais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (qtdfinais.getText().matches("[0-9]+")) {
					finais.setEnabled(true);
					finais.requestFocusInWindow();
					txtpnErro.setVisible(false);
				}
				else {//se não for número
					txtpnErro.setText("Dado incorreto, informe somente um número");
					txtpnErro.setVisible(true);
				}
			}
		});
		qtdfinais.setColumns(10);
		qtdfinais.setBounds(21, 194, 47, 19);
		contentPane.add(qtdfinais);
		
		finais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanho = (Integer.parseInt(qtdfinais.getText())*2)-1;
				if (finais.getText().length() != tamanho || !alfabeto.getText().contains(",")) {
					txtpnErro.setText("Dado incorreto, informe a quantidade correta de estados finais, separados por vírgula");
					txtpnErro.setVisible(true);
				}
				else {
					marcinicio.setEnabled(true);
					marcinicio.requestFocusInWindow();
					txtpnErro.setVisible(false);
				}
			}
		});
		finais.setColumns(10);
		finais.setBounds(21, 223, 152, 19);
		contentPane.add(finais);
		
		JTextPane txtpnOsEstadosFinais = new JTextPane();
		txtpnOsEstadosFinais.setText("Os estados finais (somente o nº), separados por vírgula");
		txtpnOsEstadosFinais.setOpaque(false);
		txtpnOsEstadosFinais.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnOsEstadosFinais.setEditable(false);
		txtpnOsEstadosFinais.setBounds(183, 223, 303, 19);
		contentPane.add(txtpnOsEstadosFinais);
		
		marcinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(marcinicio.getText().length() != 1) {
					txtpnErro.setText("Dados incorreto, informe somente o marcador");
					txtpnErro.setVisible(true);
				}
				else {
					txtpnErro.setVisible(false);
					marcbranco.setEnabled(true);
					marcbranco.requestFocusInWindow();
				}
			}
		});
		marcinicio.setColumns(10);
		marcinicio.setBounds(21, 252, 47, 19);
		contentPane.add(marcinicio);
		
		JTextPane txtpnMarcadorDeIncio = new JTextPane();
		txtpnMarcadorDeIncio.setText("Marcador de início");
		txtpnMarcadorDeIncio.setOpaque(false);
		txtpnMarcadorDeIncio.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnMarcadorDeIncio.setEditable(false);
		txtpnMarcadorDeIncio.setBounds(78, 252, 152, 19);
		contentPane.add(txtpnMarcadorDeIncio);
		
		JTextPane txtpnMarcadorDeBranco = new JTextPane();
		txtpnMarcadorDeBranco.setText("Marcador de branco");
		txtpnMarcadorDeBranco.setOpaque(false);
		txtpnMarcadorDeBranco.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		txtpnMarcadorDeBranco.setEditable(false);
		txtpnMarcadorDeBranco.setBounds(78, 281, 152, 19);
		contentPane.add(txtpnMarcadorDeBranco);
		
		marcbranco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (marcbranco.getText().length() != 1) {
					txtpnErro.setText("Dados incorreto, informe somente o marcador");
					txtpnErro.setVisible(true);
				}
				else {
					btnNewButton.setEnabled(true);
					btnNewButton.doClick();
				}
			}
		});
		marcbranco.setColumns(10);
		marcbranco.setBounds(21, 281, 47, 19);
		contentPane.add(marcbranco);
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char vet [] = new char [60];
				
				MT1 executa = new MT1 ();
				MT1.Recebimento(vet, qtdletras.getText(), alfabeto.getText(), letraestados.getText(), qtdestados.getText(), inicial.getText(), qtdfinais.getText(), finais.getText(), marcinicio.getText(), marcbranco.getText());
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(51, 51, 51));
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton.setBounds(21, 310, 189, 31);
		contentPane.add(btnNewButton);
		
		txtpnErro.setForeground(new Color(213, 0, 0));
		txtpnErro.setText("");
		txtpnErro.setOpaque(false);
		txtpnErro.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		txtpnErro.setEditable(false);
		txtpnErro.setBounds(346, 165, 616, 31);
		contentPane.add(txtpnErro);
		
		JButton btnNewButton = new JButton("Voltar para o menu");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TelaInicial i = new TelaInicial ();
        		i.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton.setBackground(new Color(240, 240, 240));
        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
        btnNewButton.setBounds(828, 524, 134, 21);
        contentPane.add(btnNewButton);
	}
}
