package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.MT1;
import Classes.Transicoes;

import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

//Fazer o recebimento das transições e da palavra teste, numa página de diálogo retornar se a palavra foi aceita ou não
public class RecebeTransicoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEstado;
	private JTextField textFieldAlfabeto;
	private JTextField textFieldDireção;
	private JTextArea textArea = new JTextArea();
	int i = 0; // de 0 a qtdestados
	int j = 0; // de 0 a tamanhoalfabeto

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecebeTransicoes frame = new RecebeTransicoes(1,1,null,'\0','\0', null,1);
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
	public RecebeTransicoes(int tamanhodoalfabeto, int qtdestados, char [] alfabetogeral, char marcador, char branco, String[] finais, int estadoinicial) {
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
                textFieldEstado.requestFocusInWindow(); //coloca o foco, inicialmente, no primeiro textfield
            }
        });
		
		Transicoes mat [][] = new Transicoes [qtdestados][tamanhodoalfabeto];
		
		JTextPane txtpnTransies = new JTextPane();
		txtpnTransies.setEditable(false);
		txtpnTransies.setFont(new Font("Bahnschrift", Font.BOLD, 22));
		txtpnTransies.setText("Transições");
		txtpnTransies.setBounds(410, 10, 130, 33);
		txtpnTransies.setOpaque(false);
		contentPane.add(txtpnTransies);
		
		textFieldEstado = new JTextField();
		textFieldAlfabeto = new JTextField();
		JTextPane txtpnEstadoFuturoDa = new JTextPane();
		JTextPane txtpnAlfabetoFuturoDa = new JTextPane();
		textFieldDireção = new JTextField();
		JTextPane txtpnDireoDaTransio = new JTextPane();
		textFieldAlfabeto.setVisible(false);
		txtpnAlfabetoFuturoDa.setVisible(false);
		textFieldDireção.setVisible(false);
		txtpnDireoDaTransio.setVisible(false);
		JTextPane txtpnErro = new JTextPane();
		txtpnErro.setVisible(false);
		JButton btnNewButton = new JButton("Continuar");
		
		txtpnEstadoFuturoDa.setText("Estado futuro da transição (" + (i+1) + "," + (j+1) + ")");
		
		textFieldEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldEstado.getText().equalsIgnoreCase("x")){
					atualizamat(mat,i,j,1);
					btnNewButton.doClick();
				}
				else {
					if (textFieldEstado.getText().length() != 2) {
						txtpnErro.setText("Estado não aceito - tente o formato X0");
						txtpnErro.setVisible(true);
					}
					else {
						txtpnErro.setVisible(false);
						textFieldAlfabeto.setVisible(true);
						txtpnAlfabetoFuturoDa.setText("Alfabeto futuro da transição (" + (i+1) + "," + (j+1) + ")");
						txtpnAlfabetoFuturoDa.setVisible(true);
						textFieldAlfabeto.setEditable(true);
						textFieldEstado.setEditable(false);
						textFieldAlfabeto.requestFocusInWindow();
					}
				}
			}
		});
		textFieldEstado.setBounds(270, 269, 96, 19);
		contentPane.add(textFieldEstado);
		textFieldEstado.setColumns(10);
		
		textFieldAlfabeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldAlfabeto.getText().equalsIgnoreCase("x")){
					atualizamat(mat,i,j,1);
					btnNewButton.doClick();
				}
				else {
					if (textFieldAlfabeto.getText().length() != 1) {
						txtpnErro.setText("Alfabeto não aceito - digite apenas uma letra");
						txtpnErro.setVisible(true);
					}
					else {
						textFieldDireção.setVisible(true);
						txtpnDireoDaTransio.setText("Direção da transição (" + (i+1) + "," + (j+1) + ")- D ou E");
						txtpnDireoDaTransio.setVisible(true);
						textFieldDireção.setEditable(true);
						textFieldAlfabeto.setEditable(false);
						textFieldDireção.requestFocusInWindow();	
					}
				}
			}
		});
		textFieldAlfabeto.setColumns(10);
		textFieldAlfabeto.setBounds(270, 298, 96, 19);
		contentPane.add(textFieldAlfabeto);
		
		textFieldDireção.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textFieldDireção.getText().equalsIgnoreCase("x")){
					atualizamat(mat,i,j,1);
					btnNewButton.doClick();
				}
				else if (textFieldDireção.getText().equalsIgnoreCase("d") || textFieldDireção.getText().equalsIgnoreCase("e")) {
					txtpnErro.setVisible(false);
					textFieldDireção.setEditable(false);
					atualizamat(mat,i,j,2);
					btnNewButton.doClick();
				}
				else {
					txtpnErro.setText("A direção deve ser D (Direita) ou E (Esquerda)");
					txtpnErro.setVisible(true);
				}
			}
		});
		textFieldDireção.setColumns(10);
		textFieldDireção.setBounds(270, 327, 96, 19);
		contentPane.add(textFieldDireção);
		
		txtpnEstadoFuturoDa.setOpaque(false);
		txtpnEstadoFuturoDa.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		txtpnEstadoFuturoDa.setBounds(376, 265, 226, 24);
		contentPane.add(txtpnEstadoFuturoDa);
		
		txtpnAlfabetoFuturoDa.setOpaque(false);
		txtpnAlfabetoFuturoDa.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		txtpnAlfabetoFuturoDa.setBounds(376, 295, 226, 24);
		contentPane.add(txtpnAlfabetoFuturoDa);
		
		txtpnDireoDaTransio.setOpaque(false);
		txtpnDireoDaTransio.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		txtpnDireoDaTransio.setBounds(376, 324, 286, 24);
		contentPane.add(txtpnDireoDaTransio);
		
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnNewButton.setBounds(566, 358, 96, 33);
		contentPane.add(btnNewButton);

		textArea.setEditable(false);
		textArea.setBounds(270, 53, 392, 182);
		contentPane.add(textArea);
		
		txtpnErro.setForeground(new Color(213, 0, 0));
		txtpnErro.setText("Estado não aceito");
		txtpnErro.setOpaque(false);
		txtpnErro.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		txtpnErro.setBounds(612, 295, 350, 24);
		contentPane.add(txtpnErro);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i == qtdestados-1 && j == tamanhodoalfabeto-1) {
					System.out.println("FOI, AI QUE DELICIA");
//					Main m = new Main();
//					m.imprime(mat, qtdestados, tamanhodoalfabeto, marcador, branco, alfabetogeral, finais);
					Palavra pl = new Palavra(tamanhodoalfabeto, qtdestados, alfabetogeral, mat, marcador, branco, finais, estadoinicial);
					pl.setVisible(true);
					dispose();
				}
				else {
					if (j <= tamanhodoalfabeto) {
						j++;
						if (j == tamanhodoalfabeto) {
							j = 0;
							i++;
						}
					}
					System.out.println("tam = " + tamanhodoalfabeto + " qtdestados = " + qtdestados);
					System.out.println("i = " + i + "j = " + j);
					txtpnEstadoFuturoDa.setText("Estado futuro da transição (" + (i+1) + "," + (j+1) + ")");
					textFieldEstado.setText("");
					textFieldEstado.setEditable(true);
					textFieldEstado.requestFocusInWindow();
					textFieldAlfabeto.setText("");
					textFieldDireção.setText("");
					textFieldAlfabeto.setVisible(false);
					txtpnAlfabetoFuturoDa.setVisible(false);
					textFieldDireção.setVisible(false);
					txtpnDireoDaTransio.setVisible(false);
				}
			}
		});
		
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
	}
	
	public void atualizarTextArea(final String texto) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textArea.append(texto);
            }
        });
    }
	
	public void atualizamat(Transicoes mat [][],int i, int j, int cod) {
		if (cod == 1) {
			mat[i][j] = new Transicoes ("Sx","x","x");
		}
		else if (cod == 2) {
			mat[i][j] = new Transicoes (textFieldEstado.getText(), textFieldAlfabeto.getText(), textFieldDireção.getText());
		}
	}

}
