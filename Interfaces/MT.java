package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class MT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextPane txtpnTitulo = new JTextPane();
	private JTextPane txtpnReconhecedoraVerifica;
	private JTextPane txtpnParaReconhecerOu;
	JButton btnContinuarNoContedo = new JButton("Continuar no conteúdo");
	JButton btnNewButton = new JButton("Voltar para o menu");
	private JTextPane txtpnFita;
	private JTextPane txtpnCabeoteUtilizadaPara;
	private JTextPane txtpnFunoDeTransio;
	private JTextPane txtpnFita_1;
	private JTextPane txtpnFita_2;
	private JTextPane txtpnXSmbolo;
	private JTextPane txtpnXSmbolo_1;
	private JTextPane txtpnXSmbolo_2;
	private JTextPane txtpnXSmbolo_3;
	private JTextPane txtpnMte;
	private final JTextPane txtpnEConjunto = new JTextPane();
	private JTextPane txtpnEstadoInicial;
	private JTextPane txtpnEstadoFinal;
	private JTextPane txtpnEstadoComum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MT frame = new MT(null);
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
	public MT(String cod) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
        
		switch (cod) {
			case "1": //O que é Máquina de Turing?
					txtpnTitulo.setForeground(new Color(51, 51, 51));
					txtpnTitulo.setEditable(false);
					txtpnTitulo.setText("O que é uma MT?");
					txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 64));
					txtpnTitulo.setBounds(192, 29, 561, 71);
					txtpnTitulo.setOpaque(false);
			        contentPane.add(txtpnTitulo);
			        
			        JRadioButton rdbtnNewRadioButton = new JRadioButton("Modelo abstrato concebido antes mesmo de uma implementação tecnológica.");
			        rdbtnNewRadioButton.setForeground(new Color(0, 0, 160));
			        rdbtnNewRadioButton.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
			        rdbtnNewRadioButton.setSelected(true);
			        rdbtnNewRadioButton.setBounds(20, 217, 960, 47);
			        rdbtnNewRadioButton.setOpaque(false);
			        contentPane.add(rdbtnNewRadioButton);
			        
			        JTextPane txtpnAMquinaDe = new JTextPane();
			        txtpnAMquinaDe.setEditable(false);
			        txtpnAMquinaDe.setFont(new Font("Bahnschrift", Font.BOLD, 16));
			        txtpnAMquinaDe.setText("A Máquina de Turing  (MT) pode ser considerada como o mecanismo reconhecedor de maior poder computacional, uma vez que, se um problema não pode ser resolvido por uma MT, não poderá ser resolvido por qualquer sistema algoritmo. É importante destacar que as MT’s reconhecem linguagens recursivamente enumeráveis, estas que formam o tipo 0 da Hierarquia de Chomsky.");
			        txtpnAMquinaDe.setBounds(20, 110, 919, 93);
			        txtpnAMquinaDe.setOpaque(false);
			        contentPane.add(txtpnAMquinaDe);
			        
			        JRadioButton rdbtnConsideradoComoUma = new JRadioButton("Considerado como uma ferramenta para estudar a capacidade dos processos algorítmicos.");
			        rdbtnConsideradoComoUma.setForeground(new Color(0, 0, 160));
			        rdbtnConsideradoComoUma.setSelected(true);
			        rdbtnConsideradoComoUma.setOpaque(false);
			        rdbtnConsideradoComoUma.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
			        rdbtnConsideradoComoUma.setBounds(20, 266, 960, 47);
			        contentPane.add(rdbtnConsideradoComoUma);
			        
			        JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Mais complexo que outros tipos de “autômatos”, se aproximando de um computador.");
			        rdbtnNewRadioButton_1_1.setForeground(new Color(0, 0, 160));
			        rdbtnNewRadioButton_1_1.setSelected(true);
			        rdbtnNewRadioButton_1_1.setOpaque(false);
			        rdbtnNewRadioButton_1_1.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
			        rdbtnNewRadioButton_1_1.setBounds(20, 315, 960, 47);
			        contentPane.add(rdbtnNewRadioButton_1_1);
			        
			        JTextPane txtpnOsComputadoresModernos = new JTextPane();
			        txtpnOsComputadoresModernos.setEditable(false);
			        txtpnOsComputadoresModernos.setText("Ainda, os computadores modernos podem ser considerados Máquinas de Turing, pois:\r\n\t\t- O processador se assemelha ao cabeçote da fita;\r\n\t\t- A memória da máquina corresponde a fita;\r\n\t\t- Padrões de bits correspondem ao alfabeto da fita.\r\n");
			        txtpnOsComputadoresModernos.setOpaque(false);
			        txtpnOsComputadoresModernos.setFont(new Font("Bahnschrift", Font.BOLD, 16));
			        txtpnOsComputadoresModernos.setBounds(20, 381, 919, 88);
			        contentPane.add(txtpnOsComputadoresModernos);
			        
			        btnNewButton.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		TelaInicial i = new TelaInicial ();
			        		i.setVisible(true);
			        		dispose();
			        	}
			        });
			        btnNewButton.setBackground(new Color(240, 240, 240));
			        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
			        btnNewButton.setBounds(10, 524, 134, 21);
			        contentPane.add(btnNewButton);
			        
			        btnContinuarNoContedo.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		MT mt2 = new MT("2");
			        		mt2.setVisible(true);
			        		dispose();
			        	}
			        });
			        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
			        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
			        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
			        contentPane.add(btnContinuarNoContedo);
				
				break;
			case "2": //Quais os tipos 
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Quais os tipos?");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 64));
				txtpnTitulo.setBounds(202, 29, 561, 71);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        JTextPane txtpnText1 = new JTextPane();
		        txtpnText1.setEditable(false);
		        txtpnText1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnText1.setText("As máquinas de Turing podem ser dividas em dois principais tipos, reconhecedora e transdutora:");
		        txtpnText1.setBounds(20, 110, 919, 42);
		        txtpnText1.setOpaque(false);
		        contentPane.add(txtpnText1);
		        
		        txtpnReconhecedoraVerifica = new JTextPane();
		        txtpnReconhecedoraVerifica.setForeground(new Color(0, 0, 160));
		        txtpnReconhecedoraVerifica.setText("\t- Reconhecedora: verifica se uma palavra pertence ou não a uma linguagem, respondendo sim ou não.\r\n\t\t+ RECONHECEDORA = aquela que reconhece se a determinada palavra pode ser sua \"filha\" ou não. (Lembre do teste de paternidade)\r\n\r\n\t - Transdutora: gera uma palavra na própria fita, que será a saída da Máquina de Turing\r\n\t\t+ TRANSDUTORA = aquela que se TRANSforma, gerando, mutando uma palavra na própria fita.");
		        txtpnReconhecedoraVerifica.setOpaque(false);
		        txtpnReconhecedoraVerifica.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnReconhecedoraVerifica.setEditable(false);
		        txtpnReconhecedoraVerifica.setBounds(20, 150, 919, 144);
		        contentPane.add(txtpnReconhecedoraVerifica);
		        
		        txtpnParaReconhecerOu = new JTextPane();
		        txtpnParaReconhecerOu.setText("Para reconhecer ou traduzir uma palavra corretamente, a MT deve processá-la inteiramente e parar em um estado final. O chamado \"cabeçote da fita\" começa, obrigatoriamente, na posição à direita do marcador de início da fita, e, deve terminar o processamento com o cabeçote na mesma posição.\r\n\t\r\nOs elementos mencionados (estado final, fita e cabeçote) são alguns dos principais componentes de uma Máquina de Turing, que serão esmiuçados na próxima página.\r\n");
		        txtpnParaReconhecerOu.setOpaque(false);
		        txtpnParaReconhecerOu.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnParaReconhecerOu.setEditable(false);
		        txtpnParaReconhecerOu.setBounds(20, 304, 919, 151);
		        contentPane.add(txtpnParaReconhecerOu);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
				
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("2.1");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case "2.1": //do que é composta
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Composição");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 64));
				txtpnTitulo.setBounds(263, 29, 425, 71);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        JTextPane txtpnText2 = new JTextPane();
		        txtpnText2.setForeground(new Color(0, 0, 0));
		        txtpnText2.setEditable(false);
		        txtpnText2.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 18));
		        txtpnText2.setText("Uma Máquina de Turing é formada, principalmente, por:");
		        txtpnText2.setBounds(20, 110, 919, 42);
		        txtpnText2.setOpaque(false);
		        contentPane.add(txtpnText2);
		        
		        txtpnFita = new JTextPane();
		        txtpnFita.setForeground(new Color(0, 0, 0));
		        txtpnFita.setText("1 -          Utilizada para a leitura e escrita.");
		        txtpnFita.setOpaque(false);
		        txtpnFita.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnFita.setEditable(false);
		        txtpnFita.setBounds(10, 162, 346, 42);
		        contentPane.add(txtpnFita);
		        
		        txtpnCabeoteUtilizadaPara = new JTextPane();
		        txtpnCabeoteUtilizadaPara.setText("2 -                                  Mostra a posição atual da fita e se move para direita e/ou esquerda.");
		        txtpnCabeoteUtilizadaPara.setOpaque(false);
		        txtpnCabeoteUtilizadaPara.setForeground(new Color(0, 0, 0));
		        txtpnCabeoteUtilizadaPara.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnCabeoteUtilizadaPara.setEditable(false);
		        txtpnCabeoteUtilizadaPara.setBounds(10, 214, 319, 71);
		        contentPane.add(txtpnCabeoteUtilizadaPara);
		        
		        txtpnFunoDeTransio = new JTextPane();
		        txtpnFunoDeTransio.setText("3 -                                           Função que movimenta a MT a partir de um símbolo, indo para um estado, assim movendo o cabeçote da fita para uma de suas direções (Direita ou Esquerda)");
		        txtpnFunoDeTransio.setOpaque(false);
		        txtpnFunoDeTransio.setForeground(new Color(0, 0, 0));
		        txtpnFunoDeTransio.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnFunoDeTransio.setEditable(false);
		        txtpnFunoDeTransio.setBounds(10, 369, 929, 42);
		        contentPane.add(txtpnFunoDeTransio);
		        
		        txtpnFita_1 = new JTextPane();
		        txtpnFita_1.setText("1");
		        txtpnFita_1.setOpaque(false);
		        txtpnFita_1.setForeground(new Color(0, 0, 160));
		        txtpnFita_1.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		        txtpnFita_1.setEditable(false);
		        txtpnFita_1.setBounds(392, 162, 26, 42);
		        contentPane.add(txtpnFita_1);
		        
		        txtpnFita_2 = new JTextPane();
		        txtpnFita_2.setText("2");
		        txtpnFita_2.setOpaque(false);
		        txtpnFita_2.setForeground(new Color(255, 255, 255));
		        txtpnFita_2.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		        txtpnFita_2.setEditable(false);
		        txtpnFita_2.setBounds(436, 278, 26, 42);
		        contentPane.add(txtpnFita_2);
		        
		        
		        txtpnXSmbolo = new JTextPane();
		        txtpnXSmbolo.setText("x = símbolo lido na fita;\r\ny = símbolo escrito na fita;\r\nm = sentido do movimento (direita ou esquerda).");
		        txtpnXSmbolo.setOpaque(false);
		        txtpnXSmbolo.setForeground(new Color(0, 0, 160));
		        txtpnXSmbolo.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnXSmbolo.setEditable(false);
		        txtpnXSmbolo.setBounds(436, 454, 374, 71);
		        contentPane.add(txtpnXSmbolo);
		        
		        txtpnXSmbolo_1 = new JTextPane();
		        txtpnXSmbolo_1.setText("Função de Transição:");
		        txtpnXSmbolo_1.setOpaque(false);
		        txtpnXSmbolo_1.setForeground(new Color(0, 0, 160));
		        txtpnXSmbolo_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnXSmbolo_1.setEditable(false);
		        txtpnXSmbolo_1.setBounds(32, 369, 374, 71);
		        contentPane.add(txtpnXSmbolo_1);
		        
		        //JLabel imagem1 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteMT2.1.png"));
		        JLabel imagem1 = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteMT2.1.png")));
		        imagem1.setBounds(20, 121, 919, 329);
		        
		        contentPane.add(imagem1);
		        
		        //JLabel imagem2 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Teste2MT2.1.png"));
		        JLabel imagem2 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Teste2MT2.1.png")));
		        imagem2.setBounds(126, -40, 960, 585);
		        
		        contentPane.add(imagem2);
		        
		        txtpnXSmbolo_2 = new JTextPane();
		        txtpnXSmbolo_2.setText("Cabeçote da fita:");
		        txtpnXSmbolo_2.setOpaque(false);
		        txtpnXSmbolo_2.setForeground(new Color(0, 0, 160));
		        txtpnXSmbolo_2.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnXSmbolo_2.setEditable(false);
		        txtpnXSmbolo_2.setBounds(33, 214, 374, 71);
		        contentPane.add(txtpnXSmbolo_2);
		        
		        txtpnXSmbolo_3 = new JTextPane();
		        txtpnXSmbolo_3.setText("Fita:");
		        txtpnXSmbolo_3.setOpaque(false);
		        txtpnXSmbolo_3.setForeground(new Color(0, 0, 160));
		        txtpnXSmbolo_3.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnXSmbolo_3.setEditable(false);
		        txtpnXSmbolo_3.setBounds(31, 162, 374, 71);
		        contentPane.add(txtpnXSmbolo_3);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
				
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("2.2");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case "2.2":
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Composição");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 64));
				txtpnTitulo.setBounds(263, 29, 425, 71);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        JTextPane txtpnText4 = new JTextPane();
		        txtpnText4.setForeground(new Color(0, 0, 0));
		        txtpnText4.setEditable(false);
		        txtpnText4.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 18));
		        txtpnText4.setText("Uma Máquina de Turing é formada, principalmente, por três tipos de estados:");
		        txtpnText4.setBounds(128, 110, 919, 42);
		        txtpnText4.setOpaque(false);
		        contentPane.add(txtpnText4);
		        
		        txtpnEstadoInicial = new JTextPane();
		        txtpnEstadoInicial.setText("Estado Inicial:");
		        txtpnEstadoInicial.setOpaque(false);
		        txtpnEstadoInicial.setForeground(new Color(0, 0, 160));
		        txtpnEstadoInicial.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		        txtpnEstadoInicial.setEditable(false);
		        txtpnEstadoInicial.setBounds(10, 162, 133, 42);
		        contentPane.add(txtpnEstadoInicial);
		        
		        txtpnEstadoFinal = new JTextPane();
		        txtpnEstadoFinal.setText("Estado Final:");
		        txtpnEstadoFinal.setOpaque(false);
		        txtpnEstadoFinal.setForeground(new Color(0, 0, 160));
		        txtpnEstadoFinal.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		        txtpnEstadoFinal.setEditable(false);
		        txtpnEstadoFinal.setBounds(10, 363, 133, 42);
		        contentPane.add(txtpnEstadoFinal);
		        
		        txtpnEstadoComum = new JTextPane();
		        txtpnEstadoComum.setText("Estado Comum:");
		        txtpnEstadoComum.setOpaque(false);
		        txtpnEstadoComum.setForeground(new Color(0, 0, 160));
		        txtpnEstadoComum.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		        txtpnEstadoComum.setEditable(false);
		        txtpnEstadoComum.setBounds(525, 192, 164, 42);
		        contentPane.add(txtpnEstadoComum);
		        
		        //JLabel estadoi = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteEstadoInicial.png"));
		        JLabel estadoi = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteEstadoInicial.png")));
		        estadoi.setBounds(-167, 76, 919, 329);
		        contentPane.add(estadoi);
		        
		        //JLabel estadoc = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteEstadoFinal.png"));
		        JLabel estadoc = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteEstadoFinal.png")));
		        estadoc.setBounds(280, 192, 919, 329);
		        contentPane.add(estadoc);
		        
		        //JLabel estadof = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteEstadoF.png"));
		        JLabel estadof = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteEstadoF.png")));
		        estadof.setBounds(-157, 283, 919, 329);
		        contentPane.add(estadof);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
		        
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("3");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case "3": //Descrição formal
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Descrição Formal");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 64));
				txtpnTitulo.setBounds(160, 28, 696, 71);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        JTextPane txtpnText3 = new JTextPane();
		        txtpnText3.setEditable(false);
		        txtpnText3.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		        txtpnText3.setText("A descrição formal de uma Máquina de Turing é um conjunto de 8 itens, ou seja, uma óctupla.\r\nPara ser devidamente correta, deve possuir:");
		        txtpnText3.setBounds(20, 123, 919, 53);
		        txtpnText3.setOpaque(false);
		        contentPane.add(txtpnText3);
		        
		        txtpnMte = new JTextPane();
		        txtpnMte.setText("MT = {E, ∑, i, F, γ, <, β, δ}");
		        txtpnMte.setOpaque(false);
		        txtpnMte.setForeground(new Color(0, 0, 160));
		        txtpnMte.setFont(new Font("Stencil", Font.BOLD, 64));
		        txtpnMte.setEditable(false);
		        txtpnMte.setBounds(94, 410, 845, 71);
		        contentPane.add(txtpnMte);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
		        
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("4");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
		        txtpnEConjunto.setText("\tE = conjunto de estados;\r\n\t∑ = alfabeto da fita;\r\n\ti = estado inicial;\r\n \tF = conjunto de estados finais;\r\n\tγ = alfabeto auxiliar da fita;\r\n\t< = marcador de início;\r\n\tβ = símbolo branco;\r\n\tδ = função de transição.");
		        txtpnEConjunto.setOpaque(false);
		        txtpnEConjunto.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 20));
		        txtpnEConjunto.setEditable(false);
		        txtpnEConjunto.setBounds(276, 186, 449, 214);
		        
		        contentPane.add(txtpnEConjunto);
				break;
			case "4": //Exemplos
				//JLabel reco1 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Reconhecedora1.png"));
				JLabel reco1 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Reconhecedora1.png")));
				reco1.setBackground(new Color(240, 240, 240));
		        reco1.setBounds(212, -38, 919, 523);
		        
		        contentPane.add(reco1);
		        
		       // JLabel treco1 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Tabelarec1.png"));
		        JLabel treco1 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Tabelarec1.png")));
		        treco1.setBounds(-156, 121, 919, 523);
		        
		        contentPane.add(treco1);
		        
		        JTextPane txtpnExemplosL = new JTextPane();
		        txtpnExemplosL.setForeground(new Color(255, 128, 64));
		        txtpnExemplosL.setText("Exemplos - L = {a^n b^n / n> 0} - {a's e b's em quantidades iguais, sendo essa quantidade maior que 0}");
		        txtpnExemplosL.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnExemplosL.setBounds(10, 22, 952, 33);
		        txtpnExemplosL.setOpaque(false);
		        txtpnExemplosL.setEditable(false);
		        contentPane.add(txtpnExemplosL);
		        
		        txtpnEConjunto.setText("Descrição formal:\r\n\tE = {SO,S1,S2,S3,S4,S5,S6}\r\n\t∑ = {a,b,A,B}\r\n\ti = S0;\r\n \tF = {S6};\r\n\tγ = {*,<}\r\n\t< = <;\r\n\tβ = *\r\n\tδ = ");
		        txtpnEConjunto.setOpaque(false);
		        txtpnEConjunto.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 18));
		        txtpnEConjunto.setEditable(false);
		        txtpnEConjunto.setBounds(10, 88, 449, 243);
		        contentPane.add(txtpnEConjunto);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
		        
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("8");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case "5": //Variações de MT
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 64));
				txtpnTitulo.setBounds(174, 27, 585, 71);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
				
		        JTextPane text5 = new JTextPane();
		        text5.setEditable(false);
		        text5.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        text5.setText("Existem variações que alteram termos das Máquinas de Turing convencionais, no entanto, estas não alteram o seu poder computacional.\r\nTudo o que pode ser feito nas variações também poderá ser realizado numa MT padrão, e suas mudanças podem ser visualizadas na descrição formal.");
		        text5.setBounds(20, 110, 919, 93);
		        text5.setOpaque(false);
		        contentPane.add(text5);
		        
		        JRadioButton rdbtnNewRadioButton1 = new JRadioButton("MT Ilimitada");
		        rdbtnNewRadioButton1.setForeground(new Color(0, 0, 160));
		        rdbtnNewRadioButton1.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        rdbtnNewRadioButton1.setBounds(121, 301, 127, 47);
		        rdbtnNewRadioButton1.setOpaque(false);
		        contentPane.add(rdbtnNewRadioButton1);
		        
		        JRadioButton rdbtnMtComCabeote = new JRadioButton("MT com cabeçote imóvel");
		        rdbtnMtComCabeote.setOpaque(false);
		        rdbtnMtComCabeote.setForeground(new Color(0, 0, 160));
		        rdbtnMtComCabeote.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        rdbtnMtComCabeote.setBounds(344, 301, 220, 47);
		        contentPane.add(rdbtnMtComCabeote);
		        
		        JRadioButton rdbtnMtNoDeterminista = new JRadioButton("MT não determinista");
		        rdbtnMtNoDeterminista.setOpaque(false);
		        rdbtnMtNoDeterminista.setForeground(new Color(0, 0, 160));
		        rdbtnMtNoDeterminista.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        rdbtnMtNoDeterminista.setBounds(121, 365, 193, 47);
		        contentPane.add(rdbtnMtNoDeterminista);
		        
		        JRadioButton rdbtnMtDeMltiplas = new JRadioButton("MT de múltiplas fitas");
		        rdbtnMtDeMltiplas.setOpaque(false);
		        rdbtnMtDeMltiplas.setForeground(new Color(0, 0, 160));
		        rdbtnMtDeMltiplas.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        rdbtnMtDeMltiplas.setBounds(344, 365, 193, 47);
		        contentPane.add(rdbtnMtDeMltiplas);
		        
		        JRadioButton rdbtnMtDeMltiplas_2 = new JRadioButton("MT de múltiplas trilhas");
		        rdbtnMtDeMltiplas_2.setOpaque(false);
		        rdbtnMtDeMltiplas_2.setForeground(new Color(0, 0, 160));
		        rdbtnMtDeMltiplas_2.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        rdbtnMtDeMltiplas_2.setBounds(594, 301, 244, 47);
		        contentPane.add(rdbtnMtDeMltiplas_2);
		        
		        JRadioButton rdbtnMtDeMltiplas_2_1 = new JRadioButton("MT de múltiplas fitas e trilhas");
		        rdbtnMtDeMltiplas_2_1.setOpaque(false);
		        rdbtnMtDeMltiplas_2_1.setForeground(new Color(0, 0, 160));
		        rdbtnMtDeMltiplas_2_1.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        rdbtnMtDeMltiplas_2_1.setBounds(594, 365, 271, 47);
		        contentPane.add(rdbtnMtDeMltiplas_2_1);
		        
		        JTextPane txtpnSelecioneUmaOpo = new JTextPane();
		        txtpnSelecioneUmaOpo.setText("Selecione uma opção e confirme para visualizá-la");
		        txtpnSelecioneUmaOpo.setOpaque(false);
		        txtpnSelecioneUmaOpo.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		        txtpnSelecioneUmaOpo.setEditable(false);
		        txtpnSelecioneUmaOpo.setBounds(248, 254, 466, 41);
		        contentPane.add(txtpnSelecioneUmaOpo);
		        
		        ButtonGroup buttonGroup = new ButtonGroup(); //grupo que garante que apenas um radio button seja acionado
				
				buttonGroup.add(rdbtnNewRadioButton1);
				buttonGroup.add(rdbtnMtComCabeote);
				buttonGroup.add(rdbtnMtNoDeterminista);
				buttonGroup.add(rdbtnMtDeMltiplas);
				buttonGroup.add(rdbtnMtDeMltiplas_2);
				buttonGroup.add(rdbtnMtDeMltiplas_2_1);
				
				JButton btnNewButton_1 = new JButton("Confirma");
				btnNewButton_1.requestFocusInWindow();
		        btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		        btnNewButton_1.setBounds(405, 418, 115, 30);
		        btnNewButton_1.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		if(rdbtnNewRadioButton1.isSelected()) {
		        			Variacoes v = new Variacoes(1);
		        			v.setVisible(true);
		        			dispose();
		        		}
		        		else if (rdbtnMtComCabeote.isSelected()){
		        			Variacoes v = new Variacoes(2);
		        			v.setVisible(true);
		        			dispose();
		        		}
		        		else if (rdbtnMtNoDeterminista.isSelected()){
		        			Variacoes v = new Variacoes(3);
		        			v.setVisible(true);
		        			dispose();
		        		}
		        		else if (rdbtnMtDeMltiplas.isSelected()) {
		        			Variacoes v = new Variacoes(4);
		        			v.setVisible(true);
		        			dispose();
		        		}
		        		else if (rdbtnMtDeMltiplas_2.isSelected()) {
		        			Variacoes v = new Variacoes(5);
		        			v.setVisible(true);
		        			dispose();
		        		}
		        		else if (rdbtnMtDeMltiplas_2_1.isSelected()) {
		        			Variacoes v = new Variacoes(6);
		        			v.setVisible(true);
		        			dispose();
		        		}
		        	}
		        });
		        contentPane.add(btnNewButton_1);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
				break;
			case "6": //mais exemplos
				//JLabel trans1 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Transdutora1.png"));
				JLabel trans1 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Transdutora1.png")));
		        trans1.setBounds(291, 10, 919, 523);
		        
		        contentPane.add(trans1);
		        
		        //JLabel ttrans1 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TabelaTRANS1.png"));
		        JLabel ttrans1 = new JLabel(new ImageIcon(getClass().getResource("/imagens/TabelaTRANS1.png")));
		        ttrans1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 10));
		        ttrans1.setBounds(-150, 127, 919, 523);
		        
		        contentPane.add(ttrans1);
		        
		        JTextPane txtpnExemplosL1 = new JTextPane();
		        txtpnExemplosL1.setForeground(new Color(255, 128, 64));
		        txtpnExemplosL1.setText("Exemplos - Transdutora L1 = {Tem como entrada uma palavra qualquer com a e b, gerando como saída a palavra em caixa alta}");
		        txtpnExemplosL1.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 16));
		        txtpnExemplosL1.setBounds(10, 22, 952, 95);
		        txtpnExemplosL1.setOpaque(false);
		        txtpnExemplosL1.setEditable(false);
		        contentPane.add(txtpnExemplosL1);
		        
		        txtpnEConjunto.setText("Descrição formal:\r\n\tE = {qO,q1,q2,q3}\r\n\t∑ = {a,b,A,B}\r\n\ti = q0;\r\n \tF = {q3};\r\n\tγ = {*,<}\r\n\t< = <;\r\n\tβ = *\r\n\tδ = ");
		        txtpnEConjunto.setOpaque(false);
		        txtpnEConjunto.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 18));
		        txtpnEConjunto.setEditable(false);
		        txtpnEConjunto.setBounds(10, 126, 449, 243);
		        contentPane.add(txtpnEConjunto);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
		        
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("7");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case "7":
				//JLabel trans2 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Transdutora2.png"));
				JLabel trans2 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Transdutora2.png")));
				trans2.setBounds(197, 10, 919, 523);
		        
		        contentPane.add(trans2);
		        
		        //JLabel ttrans2 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TabelaTRANS2.png"));
		        JLabel ttrans2 = new JLabel(new ImageIcon(getClass().getResource("/imagens/TabelaTRANS2.png")));
		        ttrans2.setBounds(-218, 127, 919, 523);
		        
		        contentPane.add(ttrans2);
		        
		        JTextPane txtpnExemplosL2 = new JTextPane();
		        txtpnExemplosL2.setForeground(new Color(255, 128, 64));
		        txtpnExemplosL2.setText("Exemplos - Transdutora L2 = {Tem como entrada um número binário, gerando como saída o complemento desse binário}");
		        txtpnExemplosL2.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnExemplosL2.setBounds(10, 22, 952, 95);
		        txtpnExemplosL2.setOpaque(false);
		        txtpnExemplosL2.setEditable(false);
		        contentPane.add(txtpnExemplosL2);
		        
		        txtpnEConjunto.setText("Descrição formal:\r\n\tE = {qO,q1,q2,q3}\r\n\t∑ = {0,1}\r\n\ti = q0;\r\n \tF = {q3};\r\n\tγ = {*,<}\r\n\t< = <;\r\n\tβ = *\r\n\tδ = ");
		        txtpnEConjunto.setOpaque(false);
		        txtpnEConjunto.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 18));
		        txtpnEConjunto.setEditable(false);
		        txtpnEConjunto.setBounds(10, 127, 449, 243);
		        contentPane.add(txtpnEConjunto);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
		        
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("5");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case "8":
				//JLabel reco10 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Reconhecedora10.png"));
				JLabel reco10 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Reconhecedora10.png")));
				reco10.setBounds(43, 0, 919, 523);
		        
		        contentPane.add(reco10);
		        
		        //JLabel rreco10 = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\Tabelarec2.png"));
		        JLabel rreco10 = new JLabel(new ImageIcon(getClass().getResource("/imagens/Tabelarec2.png")));
		        rreco10.setBounds(-142, 127, 919, 523);
		        
		        contentPane.add(rreco10);
		        
		        JTextPane txtpnExemplosL10 = new JTextPane();
		        txtpnExemplosL10.setForeground(new Color(255, 128, 64));
		        txtpnExemplosL10.setText("Exemplos - Transdutora L2 = {Tem como entrada um número binário, gerando como saída o complemento desse binário}");
		        txtpnExemplosL10.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		        txtpnExemplosL10.setBounds(10, 22, 952, 95);
		        txtpnExemplosL10.setOpaque(false);
		        txtpnExemplosL10.setEditable(false);
		        contentPane.add(txtpnExemplosL10);
		        
		        txtpnEConjunto.setText("Descrição formal:\r\n\tE = {qO,q1,q2,q3,q4,q5,q6,q7,q8,q9}\r\n\t∑ = {a,b,c,A,B,C}\r\n\ti = q0;\r\n \tF = {q9};\r\n\tγ = {*,<}\r\n\t< = <;\r\n\tβ = *\r\n\tδ = ");
		        txtpnEConjunto.setOpaque(false);
		        txtpnEConjunto.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 18));
		        txtpnEConjunto.setEditable(false);
		        txtpnEConjunto.setBounds(10, 80, 449, 243);
		        contentPane.add(txtpnEConjunto);
		        
		        btnNewButton.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		TelaInicial i = new TelaInicial ();
		        		i.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnNewButton.setBackground(new Color(240, 240, 240));
		        btnNewButton.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnNewButton.setBounds(10, 524, 134, 21);
		        contentPane.add(btnNewButton);
		        
		        btnContinuarNoContedo.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		MT mt2 = new MT("6");
		        		mt2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
		}
	}
}
