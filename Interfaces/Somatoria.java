package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Somatoria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextPane texto = new JTextPane();
	private JTextField textField;
	int cod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Somatoria frame = new Somatoria(3);
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
	public Somatoria(int cod) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		addWindowListener(new WindowAdapter() { // executa quando a janela é aberta
            @Override
            public void windowOpened(WindowEvent e) {
            	textField.requestFocusInWindow(); //coloca o foco, inicialmente, no primeiro textfield
            }
        });
		
		contentPane.setLayout(null);
		texto.setText("Questão");
		texto.setEditable(false);
		texto.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		texto.setBounds(10, 52, 952, 26);
		texto.setOpaque(false);
		contentPane.add(texto);

		setContentPane(contentPane);
		
		JButton btnNewButton_1_1 = new JButton("Voltar para o menu");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial ti = new TelaInicial ();
				ti.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(10, 515, 156, 30);
		contentPane.add(btnNewButton_1_1);
		
		JTextPane txtpnQuesto_1_1_2_1_1 = new JTextPane();
		txtpnQuesto_1_1_2_1_1.setText("O somatório correto é ");
		txtpnQuesto_1_1_2_1_1.setOpaque(false);
		txtpnQuesto_1_1_2_1_1.setFont(new Font("Bahnschrift", Font.ITALIC, 16));
		txtpnQuesto_1_1_2_1_1.setEditable(false);
		txtpnQuesto_1_1_2_1_1.setBounds(382, 343, 214, 26);
		txtpnQuesto_1_1_2_1_1.setVisible(false);
		contentPane.add(txtpnQuesto_1_1_2_1_1);
		
		JButton btnNewButton = new JButton("Ver resposta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cod == 1) {
					txtpnQuesto_1_1_2_1_1.setText("O somatório correto é \" 06 \"");
					txtpnQuesto_1_1_2_1_1.setVisible(true);
				}
				else if (cod == 2) {
					txtpnQuesto_1_1_2_1_1.setText("O somatório correto é \" 09 \"");
					txtpnQuesto_1_1_2_1_1.setVisible(true);
				}
				else if (cod == 3) {
					txtpnQuesto_1_1_2_1_1.setText("O somatório correto é \" 05 \"");
					txtpnQuesto_1_1_2_1_1.setVisible(true);
				}
				else if (cod == 4) {
					txtpnQuesto_1_1_2_1_1.setText("O somatório correto é \" 14 \"");
					txtpnQuesto_1_1_2_1_1.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(19, 293, 121, 21);
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(false);
		
		JTextPane txtpnQuesto = new JTextPane();
		txtpnQuesto.setText("1 -");
		txtpnQuesto.setOpaque(false);
		txtpnQuesto.setFont(new Font("Bahnschrift", Font.ITALIC, 16));
		txtpnQuesto.setEditable(false);
		txtpnQuesto.setBounds(19, 101, 942, 26);
		contentPane.add(txtpnQuesto);
		
		JTextPane txtpnQuesto_1_1 = new JTextPane();
		txtpnQuesto_1_1.setText("2 - ");
		txtpnQuesto_1_1.setOpaque(false);
		txtpnQuesto_1_1.setFont(new Font("Bahnschrift", Font.ITALIC, 16));
		txtpnQuesto_1_1.setEditable(false);
		txtpnQuesto_1_1.setBounds(19, 138, 944, 26);
		contentPane.add(txtpnQuesto_1_1);
		
		JTextPane txtpnQuesto_1_1_1 = new JTextPane();
		txtpnQuesto_1_1_1.setText("4 -");
		txtpnQuesto_1_1_1.setOpaque(false);
		txtpnQuesto_1_1_1.setFont(new Font("Bahnschrift", Font.ITALIC, 16));
		txtpnQuesto_1_1_1.setEditable(false);
		txtpnQuesto_1_1_1.setBounds(19, 174, 942, 26);
		contentPane.add(txtpnQuesto_1_1_1);
		
		JTextPane txtpnQuesto_1_1_2 = new JTextPane();
		txtpnQuesto_1_1_2.setText("8 - ");
		txtpnQuesto_1_1_2.setOpaque(false);
		txtpnQuesto_1_1_2.setFont(new Font("Bahnschrift", Font.ITALIC, 16));
		txtpnQuesto_1_1_2.setEditable(false);
		txtpnQuesto_1_1_2.setBounds(19, 210, 938, 47);
		contentPane.add(txtpnQuesto_1_1_2);
		
		JTextPane Correto = new JTextPane();
		Correto.setForeground(new Color(0, 128, 0));
		Correto.setText("Resposta correta!!");
		Correto.setOpaque(false);
		Correto.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		Correto.setEditable(false);
		Correto.setBounds(378, 313, 229, 33);
		contentPane.add(Correto);
		Correto.setVisible(false);
		
		JTextPane Incorreto = new JTextPane();
		Incorreto.setForeground(new Color(210, 0, 0));
		Incorreto.setText("Resposta incorreta!!");
		Incorreto.setOpaque(false);
		Incorreto.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		Incorreto.setEditable(false);
		Incorreto.setBounds(378, 313, 229, 33);
		contentPane.add(Incorreto);
		Incorreto.setVisible(false);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cod == 1) {
					if (textField.getText().equals("6")) {
						textField.setEnabled(false);
						btnNewButton.setVisible(false);
						Correto.setVisible(true);
						Incorreto.setVisible(false);
						txtpnQuesto_1_1_2_1_1.setVisible(false);
					}
					else {
						btnNewButton.setVisible(true);
						Correto.setVisible(false);
						Incorreto.setVisible(true);
					}
				}
				else if (cod == 2) {
					if (textField.getText().equals("9")) {
						textField.setEnabled(false);
						btnNewButton.setVisible(false);
						Correto.setVisible(true);
						Incorreto.setVisible(false);
						txtpnQuesto_1_1_2_1_1.setVisible(false);
					}
					else {
						btnNewButton.setVisible(true);
						Correto.setVisible(false);
						Incorreto.setVisible(true);
					}
				}
				else if (cod == 3) {
					if (textField.getText().equals("5")) {
						textField.setEnabled(false);
						btnNewButton.setVisible(false);
						Correto.setVisible(true);
						Incorreto.setVisible(false);
						txtpnQuesto_1_1_2_1_1.setVisible(false);
					}
					else {
						btnNewButton.setVisible(true);
						Correto.setVisible(false);
						Incorreto.setVisible(true);
					}
				}
				else if (cod == 4) {
					if (textField.getText().equals("14")) {
						textField.setEnabled(false);
						btnNewButton.setVisible(false);
						Correto.setVisible(true);
						Incorreto.setVisible(false);
						txtpnQuesto_1_1_2_1_1.setVisible(false);
					}
					else {
						btnNewButton.setVisible(true);
						Correto.setVisible(false);
						Incorreto.setVisible(true);
					}
				}
			}
		});
		textField.setBounds(19, 259, 88, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnQuesto_1_1_2_1 = new JTextPane();
		txtpnQuesto_1_1_2_1.setText("Somatório das respostas corretas");
		txtpnQuesto_1_1_2_1.setOpaque(false);
		txtpnQuesto_1_1_2_1.setFont(new Font("Bahnschrift", Font.ITALIC, 16));
		txtpnQuesto_1_1_2_1.setEditable(false);
		txtpnQuesto_1_1_2_1.setBounds(117, 259, 259, 26);
		contentPane.add(txtpnQuesto_1_1_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Próxima pergunta");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cod < 4) {
					int aux = cod;
					aux++;
					Somatoria s = new Somatoria (aux);
					s.setVisible(true);
					dispose();
				}
				else {
					btnNewButton_1_1_1.setVisible(false);
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(806, 515, 156, 30);
		contentPane.add(btnNewButton_1_1_1);

		switch (cod) {
			case 1:
				texto.setText("(A) Sobre uma Máquina de Turing, as corretas são: ");
				txtpnQuesto.setText("1 - Uma MT pode reconhecer linguagens recursivamente numeráveis."); //ERRADA
				txtpnQuesto_1_1.setText("2 - Pode ser vista como o mecanismo reconhecedor com maior poder computacional.");
				txtpnQuesto_1_1_1.setText("4 - É um modelo abstrato concebido antes de uma implementação tecnológica.");
				txtpnQuesto_1_1_2.setText("8 - Se um problema não pode ser resolvido por uma MT, poderá ser resolvido apenas por um Autômato a Pilha.");
				break;
			case 2:
				texto.setText("(B) Acerca das comparações com a MT e um computador moderno, as corretas são: ");
				txtpnQuesto.setText("1 - O processador pode ser visto como o cabeçote da fita.");
				txtpnQuesto_1_1.setText("2 - A memória é a mesma coisa que um estado inicial.");
				txtpnQuesto_1_1_1.setText("4 - Os padrões de bits são semelhantes a uma função de transição.");
				txtpnQuesto_1_1_2.setText("8 - A memória é semelhante a fita da MT.");
				break;
			case 3:
				texto.setText("(C) Nos dois tipos de Máquina de Turing: ");
				txtpnQuesto.setText("1 - O primeiro, a reconhedora, responde sim ou não para as palavras que são testadas.");
				txtpnQuesto_1_1.setText("2 - O primeiro, a transdutora, traduz textos de inglês para português ou tupi-guarani.");
				txtpnQuesto_1_1_1.setText("4 - O segundo, a transdutora, gera uma palavra na própria fita baseando-se nos estados e transições.");
				txtpnQuesto_1_1_2.setText("8 - Ambas somente terminam seus processamentos se o cabeçote da fita parar na mesma posição de início (à esquerda \n do marcador de início)");
				break;
			case 4:
				texto.setText("(D) Numa Máquina de Turing (MT):");
				txtpnQuesto.setText("1 - Existem três tipos de estados, o inicial, o mitoso e o final.");
				txtpnQuesto_1_1.setText("2 - A fita é utilizada para a escrita e leitura.");
				txtpnQuesto_1_1_1.setText("4 - O cabeçote da fita mostra a posição atual da fita, movendo-se para a direita e para esquerda.");
				txtpnQuesto_1_1_2.setText("8 - As funções de transição possuem três elementos, símbolo lido na fita, símbolo escrito na fita e o sentido do movimento (D ou E).");
				btnNewButton_1_1_1.setVisible(false);
				break;
		}
	}
}
