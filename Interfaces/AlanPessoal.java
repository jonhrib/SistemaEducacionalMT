package Interfaces;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.ScrollPane;

public class AlanPessoal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea = new JTextArea();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AlanPessoal frame = new AlanPessoal();
                    frame.scrollToTop();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    private void scrollToTop() {
        textArea.setCaretPosition(0);
    }

    public AlanPessoal() {
    	setResizable(false);
    	addWindowListener(new WindowAdapter() { // executa quando a janela é aberta
            @Override
            public void windowOpened(WindowEvent e) {
            	textArea.setCaretPosition(0); //posiciona o scroll no começo do texto
            }
        });
    	
    	setFont(new Font("Bahnschrift", Font.BOLD, 12));
    	setTitle("Vida Pessoal de Alan Turing");
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
        
        //JLabel background = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\AlanTuring.jpg"));
        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/imagens/AlanTuring.jpg")));
        background.setBounds(488, -49, 662, 675);
        
        contentPane.add(background);
        
        JTextPane txtpnAlan = new JTextPane();
        txtpnAlan.setForeground(new Color(51, 51, 51));
        txtpnAlan.setEditable(false);
        txtpnAlan.setFont(new Font("Stencil", Font.BOLD, 64));
        txtpnAlan.setText("Alan");
        txtpnAlan.setBounds(78, 36, 376, 71);
        txtpnAlan.setOpaque(false);
        contentPane.add(txtpnAlan);
        
        JTextPane txtpnTuring = new JTextPane();
        txtpnTuring.setForeground(new Color(51, 51, 51));
        txtpnTuring.setEditable(false);
        txtpnTuring.setText("Turing");
        txtpnTuring.setFont(new Font("Stencil", Font.BOLD, 64));
        txtpnTuring.setBounds(198, 84, 256, 71);
        txtpnTuring.setOpaque(false);
        contentPane.add(txtpnTuring);
        textArea.setForeground(new Color(0, 0, 0));
        
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
        
        JTextPane txtpnPessoal = new JTextPane();
        txtpnPessoal.setText("Pessoal");
        txtpnPessoal.setOpaque(false);
        txtpnPessoal.setForeground(new Color(51, 51, 51));
        txtpnPessoal.setFont(new Font("Callheart", Font.PLAIN, 52));
        txtpnPessoal.setEditable(false);
        txtpnPessoal.setBounds(44, 104, 206, 51);
        contentPane.add(txtpnPessoal);
        
        
        
        textArea.append("     Alan Mathison Turing, nascido em 1912, na Inglaterra, onde, já na infância, se descobriu interessado pelo mundo das exatas, apaixonando-se pelas ciências e, também, pela lógica. Aos 15 anos, Turing já mostrava sinais de sua genialidade, resolvendo problemas matemáticos complexos, que somente conhecedores de cálculo poderiam dominar, mas ele, sem ter estudado tal matéria, já questionava até mesmo a teoria da relatividade de Einstein.\n"
                + "     Mesmo tendo desenvolvido diversas descobertas e feitos importantes para a humanidade, Alan Turing nunca foi devidamente reconhecido por seus trabalhos, ao menos não até 2013.\n"
                + "     Turing, por volta de 1952, ingenuamente revelou ser gay e se relacionava com outro homem no momento, o que, para as autoridades, soou como uma prerrogativa criminosa, visto que, na época, a homossexualidade era considerada crime na Inglaterra. O homem de apenas 39 anos só teve uma oportunidade de “escolher como seria seu futuro” por ter auxiliado a inteligência britânica na guerra, mas, os cenários eram igualmente péssimos, por um lado, Alan seria preso, por outro, castrado quimicamente. Com medo do que aconteceria com sigo na prisão, ele optara pela segunda opção, sendo obrigado a tomar injeções de hormônios femininos. Além disso, foi destituído de seu cargo no Bletchley Park, ficando sem emprego, sem respeito e, agora adoecido, com sintomas da alteração brusca de hormônios. O britânico foi condenado por “indecência”, e nela faleceu dois anos depois, em 1954, envenenado por cianeto, após morder uma maçã infectada. Segundo especialistas que recentemente revisitaram o caso de Turing, possivelmente não se tratou de um suicídio, como se afirmou na época, mas sim de uma intoxicação por medicamentos que tomava com frequência por conta da castração química.\n"
                + "     Alan Mathison Turing foi alvo de uma homofobia, que na época, era legalizada, como ainda é em muitos países, e por causa de sua orientação sexual, sofreu, não teve seu trabalho reconhecido por muito tempo e faleceu precocemente quase que como um ‘ninguém’, como muitos afirmaram por anos. Mas, na verdade, Turing foi um alguém que pôde, em conjunto com outras pessoas, salvar vidas durante a guerra, revolucionar o mundo moderno e estipular uma conclusão lógica para os fatos de sua vida: A homofobia mata, até mesmo o melhor dos homens, seja por dentro ou por fora do corpo.\n"
                + "     Em homenagem e agradecimento à Turing e sua força, uma Lei foi reconhecida em 2017, concedendo ‘perdão’ e cancelando a condenação de todos os homens perseguidos antes do fim da legalização da criminalização dos homossexuais, cerca de 65 mil homens, no total (destes, por volta de 15 mil ainda eram vivos). Por fim, é importante citar que Alan só teve suas atividades reconhecidas e agradecidas pelo governo britânico em 2009 pelo Primeiro Ministro e, em 2013, pela Rainha Elizabeth II, quando foi perdoado oficialmente por tentar ser quem sempre foi.\n");
        
    }
}
