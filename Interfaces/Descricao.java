package Interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.MT1;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import java.awt.Font;

public class Descricao extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextArea textArea = new JTextArea();
	private int qtdestados, qtdalfabeto;
	private char [] alfabeto;
	private char marcador,branco;
	private String [] estados;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Descricao dialog = new Descricao(0, 0, null, null, '\0', '\0',null,1);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * 
	 * 
	 */
	
	public Descricao(int qtdestados, int qtdalfabeto, char [] alfabeto, String [] estados, char marcador, char branco, String[] finais, int estadoinicial) {
		setResizable(false);
		setBounds(100, 100, 986, 592);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			
			textArea.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
			textArea.setEditable(false);
			textArea.setBounds(10, 10, 962, 514);
			contentPanel.add(textArea);
			
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Continuar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MT1.Transicoes(qtdestados,qtdalfabeto,alfabeto,estados,marcador,branco,finais,estadoinicial);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	
	public void atualizarTextArea(final String texto) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textArea.append(texto);
            }
        });
    }

}
