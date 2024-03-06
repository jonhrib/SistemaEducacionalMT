package Interfaces;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaInicial frame = new TelaInicial();
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
    public TelaInicial() {
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 986, 592);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // plano de fundo
        //JLabel background = new JLabel(new ImageIcon("C:\\Users\\jonhv\\OneDrive\\Documentos\\Photoshop\\MaquinaDeTuringInicial.png"));
        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/imagens/MaquinaDeTuringInicial.png"))); 
        background.setBounds(-21, -55, 1012, 588);
        contentPane.add(background);
        
        JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Quais os tipos e do que é composta?");
        mntmNewMenuItem_1_1.setBackground(new Color(255, 231, 206));
        mntmNewMenuItem_1_1.setBounds(10, 41, 245, 24);
        contentPane.add(mntmNewMenuItem_1_1);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setFont(new Font("Bahnschrift", Font.BOLD, 12));
        menuBar.setBackground(new Color(217, 241, 242));
        setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("Conheça o conteúdo");
        mnNewMenu.setBackground(new Color(255, 231, 206));
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("O que é Máquina de Turing?");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MT m1 = new MT ("1");
        		m1.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem.setBackground(new Color(255, 231, 206));
        mnNewMenu.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("Quais os tipos e do que é composta?");
        mntmNewMenuItem_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MT m2 = new MT ("2");
        		m2.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_1_2.setBackground(new Color(255, 242, 230));
        mnNewMenu.add(mntmNewMenuItem_1_2);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Descrição Formal");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MT m3 = new MT ("3");
        		m3.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_1.setBackground(new Color(255, 231, 206));
        mnNewMenu.add(mntmNewMenuItem_1);
        
        JMenuItem mntmNewMenuItem_1_3 = new JMenuItem("Exemplos");
        mntmNewMenuItem_1_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MT m4 = new MT ("4");
        		m4.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_1_3.setBackground(new Color(255, 242, 230));
        mnNewMenu.add(mntmNewMenuItem_1_3);
        
        JMenuItem mntmNewMenuItem_1_4 = new JMenuItem("Variações");
        mntmNewMenuItem_1_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MT m5 = new MT ("5");
        		m5.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_1_4.setBackground(new Color(255, 231, 206));
        mnNewMenu.add(mntmNewMenuItem_1_4);
        
        JMenu mnNewMenu_1 = new JMenu("Quem foi Alan Turing?");
        menuBar.add(mnNewMenu_1);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Vida Pessoal");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AlanPessoal ap = new AlanPessoal ();
        		ap.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_2.setBackground(new Color(255, 231, 206));
        mnNewMenu_1.add(mntmNewMenuItem_2);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Vida Profissional");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AlanProfissional apr = new AlanProfissional ();
        		apr.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_3.setBackground(new Color(255, 242, 230));
        mnNewMenu_1.add(mntmNewMenuItem_3);
        
        JMenu mnNewMenu_2 = new JMenu("Teste seus conhecimentos");
        menuBar.add(mnNewMenu_2);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Múltipla Escolha");
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MarqueX rm = new MarqueX(1);
        		rm.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_5.setBackground(new Color(255, 231, 206));
        mnNewMenu_2.add(mntmNewMenuItem_5);
        
        JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("Somatória");
        mntmNewMenuItem_5_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Somatoria s = new Somatoria(1);
        		s.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_5_1.setBackground(new Color(255, 242, 230));
        mnNewMenu_2.add(mntmNewMenuItem_5_1);
        
        JMenu mnNewMenu_3 = new JMenu("Execute uma máquina de turing virtual");
        menuBar.add(mnNewMenu_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Testar");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ExecutarMT em = new ExecutarMT ();
        		em.setVisible(true);
        		dispose();
        	}
        });
        mntmNewMenuItem_4.setBackground(new Color(255, 231, 206));
        mnNewMenu_3.add(mntmNewMenuItem_4);
        
        
    }
}
