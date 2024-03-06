package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Variacoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextPane txtpnTitulo = new JTextPane();
	JButton btnNewButton = new JButton("Voltar para o menu");
	JButton btnContinuarNoContedo = new JButton("Continuar no conteúdo");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variacoes frame = new Variacoes(1);
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
	public Variacoes(int cod) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane Titulo = new JTextPane();
		JTextPane texto = new JTextPane();
		
		switch (cod) {
			case 1: //ilimitada
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 20));
				txtpnTitulo.setBounds(10, 10, 213, 25);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        Titulo.setText("MT Ilimitada");
		        Titulo.setOpaque(false);
		        Titulo.setForeground(new Color(0, 0, 160));
		        Titulo.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		        Titulo.setEditable(false);
		        Titulo.setBounds(357, 68, 266, 55);
		        contentPane.add(Titulo);
		        
		        texto.setText("- não possui o símbolo de início de fita;\r\n- ilimitada para \"esquerda e \"direita\".");
		        texto.setOpaque(false);
		        texto.setForeground(new Color(0, 0, 0));
		        texto.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		        texto.setEditable(false);
		        texto.setBounds(27, 162, 342, 55);
		        contentPane.add(texto);
		        
		        //JLabel ilimitada = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteIlimitada.png"));
		        JLabel ilimitada = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteIlimitada.png")));
		        ilimitada.setBounds(27, 142, 919, 329);
		        contentPane.add(ilimitada);
		        
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
		        		Variacoes v2 = new Variacoes(2);
		        		v2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case 2: //cabeçote imóvel
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 20));
				txtpnTitulo.setBounds(10, 10, 213, 25);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        Titulo.setText("MT com cabeçote imóvel");
		        Titulo.setOpaque(false);
		        Titulo.setForeground(new Color(0, 0, 160));
		        Titulo.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		        Titulo.setEditable(false);
		        Titulo.setBounds(246, 65, 497, 55);
		        contentPane.add(Titulo);
		        
		        texto.setText("- ao realizar uma transição, além de ir para a direita ou esquerda, o cabeçote da fita pode ficar imóvel.");
		        texto.setOpaque(false);
		        texto.setForeground(new Color(0, 0, 0));
		        texto.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		        texto.setEditable(false);
		        texto.setBounds(27, 162, 342, 55);
		        contentPane.add(texto);
		        
		        //JLabel imovel = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteCab.png"));
		        JLabel imovel = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteCab.png")));
		        imovel.setBounds(27, 142, 919, 329);
		        contentPane.add(imovel);
		        
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
		        		Variacoes v2 = new Variacoes(3);
		        		v2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case 3: //não determinista
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 20));
				txtpnTitulo.setBounds(10, 10, 213, 25);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        Titulo.setText("MT não determinista");
		        Titulo.setOpaque(false);
		        Titulo.setForeground(new Color(0, 0, 160));
		        Titulo.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		        Titulo.setEditable(false);
		        Titulo.setBounds(278, 66, 497, 55);
		        contentPane.add(Titulo);
		        
		        texto.setText("- pode ter mais de um estado ativo ao mesmo tempo.");
		        texto.setOpaque(false);
		        texto.setForeground(new Color(0, 0, 0));
		        texto.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		        texto.setEditable(false);
		        texto.setBounds(27, 162, 342, 55);
		        contentPane.add(texto);
		        
		        JLabel ndeterminista = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteNd.png")));
		        ndeterminista.setBounds(0, 34, 919, 511);
		        contentPane.add(ndeterminista);
		        
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
		        		Variacoes v2 = new Variacoes(4);
		        		v2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case 4: //múltiplas fitas
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 20));
				txtpnTitulo.setBounds(10, 10, 213, 25);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        Titulo.setText("MT de múltiplas fitas");
		        Titulo.setOpaque(false);
		        Titulo.setForeground(new Color(0, 0, 160));
		        Titulo.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		        Titulo.setEditable(false);
		        Titulo.setBounds(269, 65, 497, 55);
		        contentPane.add(Titulo);
		        
		        texto.setText("- duas ou mais fitas com cabeçotes independentes.");
		        texto.setOpaque(false);
		        texto.setForeground(new Color(0, 0, 0));
		        texto.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		        texto.setEditable(false);
		        texto.setBounds(27, 162, 342, 55);
		        contentPane.add(texto);
		        
		       // JLabel multf = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteMf.png"));
		        JLabel multf = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteMf.png")));
		        multf.setBounds(37, 10, 919, 535);
		        contentPane.add(multf);
		        
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
		        		Variacoes v2 = new Variacoes(5);
		        		v2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				
				break;
			case 5: //múltiplas trilhas
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 20));
				txtpnTitulo.setBounds(10, 10, 213, 25);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        Titulo.setText("MT de múltiplas trilhas");
		        Titulo.setOpaque(false);
		        Titulo.setForeground(new Color(0, 0, 160));
		        Titulo.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		        Titulo.setEditable(false);
		        Titulo.setBounds(269, 65, 497, 55);
		        contentPane.add(Titulo);
		        
		        texto.setText("- duas ou mais trilhas no mesmo cabeçote.");
		        texto.setOpaque(false);
		        texto.setForeground(new Color(0, 0, 0));
		        texto.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		        texto.setEditable(false);
		        texto.setBounds(27, 162, 342, 55);
		        contentPane.add(texto);
		        
		        //JLabel multt = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteMt.png"));
		        JLabel multt = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteMt.png")));
		        multt.setBounds(37, 10, 919, 535);
		        contentPane.add(multt);
		        
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
		        		Variacoes v2 = new Variacoes(6);
		        		v2.setVisible(true);
		        		dispose();
		        	}
		        });
		        btnContinuarNoContedo.setFont(new Font("Bauhaus", Font.BOLD, 10));
		        btnContinuarNoContedo.setBackground(UIManager.getColor("Button.background"));
		        btnContinuarNoContedo.setBounds(806, 522, 156, 21);
		        contentPane.add(btnContinuarNoContedo);
				break;
			case 6: //multiplas fitas e trilhas
				txtpnTitulo.setForeground(new Color(51, 51, 51));
				txtpnTitulo.setEditable(false);
				txtpnTitulo.setText("Variações de MT");
				txtpnTitulo.setFont(new Font("Stencil", Font.BOLD, 20));
				txtpnTitulo.setBounds(10, 10, 213, 25);
				txtpnTitulo.setOpaque(false);
		        contentPane.add(txtpnTitulo);
		        
		        Titulo.setText("MT de múltiplas fitas e múltiplas trilhas");
		        Titulo.setOpaque(false);
		        Titulo.setForeground(new Color(0, 0, 160));
		        Titulo.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		        Titulo.setEditable(false);
		        Titulo.setBounds(104, 65, 788, 55);
		        contentPane.add(Titulo);
		        
		        texto.setText("- combinação das variações de múltiplas fitas e múltiplas trilhas.");
		        texto.setOpaque(false);
		        texto.setForeground(new Color(0, 0, 0));
		        texto.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		        texto.setEditable(false);
		        texto.setBounds(27, 162, 342, 55);
		        contentPane.add(texto);
		        
		        //JLabel multft = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\TesteMft.png"));
		        JLabel multft = new JLabel(new ImageIcon(getClass().getResource("/imagens/TesteMft.png")));
		        multft.setBounds(-11, 81, 1002, 504);
		        contentPane.add(multft);
		        
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
		}
	}

}
