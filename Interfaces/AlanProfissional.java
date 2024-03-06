package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class AlanProfissional extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlanProfissional frame = new AlanProfissional();
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
	public AlanProfissional() {
		setResizable(false);
		addWindowListener(new WindowAdapter() { // executa quando a janela é aberta
            @Override
            public void windowOpened(WindowEvent e) {
            	textArea.setCaretPosition(0); //posiciona o scroll no começo do texto
            }
        });
		
		setFont(new Font("Bahnschrift", Font.BOLD, 12));
    	setTitle("Vida Profissional de Alan Turing");
		setBackground(new Color(255, 255, 255));
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 986, 592);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(246, 246, 246));
        contentPane.setLayout(null);
        
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
        
        //JLabel background = new JLabel(new ImageIcon("C:\\Users\\jonhv\\Downloads\\alan-turing-2.jpg"));
        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/imagens/alan-turing-2.jpg")));
        background.setBounds(521, -11, 662, 675);
        
        contentPane.add(background);
        
        JTextPane txtpnAlan = new JTextPane();
        txtpnAlan.setForeground(new Color(51, 51, 51));
        txtpnAlan.setEditable(false);
        txtpnAlan.setFont(new Font("Stencil", Font.BOLD, 64));
        txtpnAlan.setText("Alan");
        txtpnAlan.setBounds(78, 36, 376, 71);
        txtpnAlan.setOpaque(false);
        contentPane.add(txtpnAlan);
        
        JTextPane txtpnProfissional = new JTextPane();
        txtpnProfissional.setText("Profissional");
        txtpnProfissional.setOpaque(false);
        txtpnProfissional.setForeground(new Color(51, 51, 51));
        txtpnProfissional.setFont(new Font("Callheart", Font.PLAIN, 52));
        txtpnProfissional.setEditable(false);
        txtpnProfissional.setBounds(266, 47, 261, 51);
        contentPane.add(txtpnProfissional);
        
        JTextPane txtpnTuring = new JTextPane();
        txtpnTuring.setForeground(new Color(51, 51, 51));
        txtpnTuring.setEditable(false);
        txtpnTuring.setText("Turing");
        txtpnTuring.setFont(new Font("Stencil", Font.BOLD, 64));
        txtpnTuring.setBounds(198, 84, 256, 71);
        txtpnTuring.setOpaque(false);
        contentPane.add(txtpnTuring);
        
        textArea.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        textArea.setEditable(false);
        textArea.setBounds(10, 155, 517, 390);
        textArea.setLineWrap(true); // Habilita a quebra automática de linha
        textArea.setWrapStyleWord(true); // Quebra apenas nas palavras completas
        contentPane.add(textArea);
        
        textArea.setCaretPosition(0);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 155, 517, 390);
        contentPane.add(scrollPane);
        
        
        
        textArea.append("     Alan, aos 24 anos (e já formado), construiu um modelo computacional teórico responsável pelos conceitos hoje usados na computação, como os algoritmos e o desenvolvimento de computadores no geral. A máquina conhecida como “Máquina de Turing” não saiu do papel com seu criador, mas interpretava símbolos limitados entre 0 e 1, o que, atualmente, resume a linguagem binária. O objetivo principal do dispositivo de Turing seria realizar todo tipo de cálculos por meio da lógica humana, sendo traduzidos para a máquina de forma simplificada em algoritmos.\n"
                + "      Durante a Segunda Guerra Mundial, por volta de 1939, Alan viria a realizar um de seus maiores feitos, auxiliaria no combate ao nazismo, traduzindo mensagens codificadas de soldados e entidades alemãs. O Governo Britânico, tentando prever as ações do exército de Hitler e seus aliados, contratou uma equipe de ‘gênios’, que, instalados na cidade de Bletchley, desvendavam partes de códigos gerados pela Enigma, uma máquina de criptografia que embaralhava os códigos militares transmitidos entre alemães, ela era considerada impenetrável. Mas, como nem tudo é o que parece, a equipe liderada por Turing, juntamente com outras equipes britânicas, desenvolveram a máquina ‘Bombe’, capaz de traduzir os códigos interceptados com uma rapidez e precisão muito superior que a dos humanos. A equipe de Mathison ficava responsável por traduzir as informações referentes aos ataques aéreos e outras informações relevantes, desta forma, a máquina e suas descobertas foram cruciais para a derrota do nazismo em 1945.\n"
                + "      Alan não parou depois que ajudou o mundo a parar uma guerra sangrenta em andamento, em 1950, por exemplo, o criador se questiona se uma máquina poderia, um dia, pensar, possuir inteligência. Assim nasceram os primeiros vestígios de uma pesquisa sobre inteligência artificial, tão presente nas vidas diárias de cada um deste planeta. O chamado Teste de Turing foi criado com o objetivo de mensurar, determinar, a capacidade cognitiva, ou de inteligência, de uma determinada máquina. O sistema era muito avançado, poderia ser capaz de calcular difíceis problemas, sendo também um dos mais rápidos da época. O processo era, de certa forma, simples. Uma pessoa deveria realizar perguntas, estas que seriam respondidas pelo computador e por outro humano; se ao final dos questionamentos o que fez as perguntas for confundido pelo computador, atribuindo as respostas ao humano, a inteligência do sistema é maior. Pode parecer um meio simples demais para entender o mundo da inteligência computacional, mas pôde ser usada de base para as tecnologias futuras neste campo.");
        
	}

}
