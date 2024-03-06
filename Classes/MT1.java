/* MÁQUINA DE TURING
 * Interface qure possui:
 *  		- uma introdução de quem foi Alan Turing
 *  		- dados sobre o conteúdo
 *  		- testes de conhecimento com questões da prova 
 *  			+ fazer diversas questões, cada vez que o usuário entrar vai ser uma diferente, selecionada por random (talvez usar banco de dados)
 *  		- utilizar o código passado para receber uma máquina de turing e testar se uma palavra deveria ser aceita
 */
package Classes;

import java.awt.TextArea;
import java.util.Scanner;
import Interfaces.Descricao;
import Interfaces.RecebeTransicoes;

public class MT1 {
	char vet [] = new char [60];
	
	public String [] Executar(char vet[], Transicoes mat[][], char alfabetogeral[],String finais [], int estadoinicial) {
		Scanner s = new Scanner (System.in);
		int cont = 1;
	    int estadoAtual = estadoinicial;
	    int estadoAtualaux = estadoAtual;

	    while (estadoAtual != -1) {
	        char leitura = vet[cont]; //o que está sendo lido agora na fita
	        int indiceAlfabeto = -1;

	        for (int i = 0; i < alfabetogeral.length; i++) { // encontra o índice do símbolo de leitura no alfabeto geral
	            if (leitura == alfabetogeral[i]) {
	                indiceAlfabeto = i;
	                break;
	            }
	        }

	        if (indiceAlfabeto != -1) {
	            Transicoes transicao = mat[estadoAtual][indiceAlfabeto]; //pega as Transicoes baseado no estado atual e no símbolo que está sendo lido agora

	            if (transicao != null && !transicao.getVetaux()[0].equals("Sx")) { //se transição não está vazia e se não é x,x,x
	            	String aux = String.valueOf(transicao.getVetaux()[0].charAt(1)); //aux recebe o estado futuro, somente o número
	                estadoAtual = Integer.parseInt(aux);
	                estadoAtualaux = estadoAtual;
	                char novoSimbolo = transicao.getVetaux()[1].charAt(0); //novoSimbolo recebe o alfabeto futuro
	                char direcao = transicao.getVetaux()[2].charAt(0); //direcao recebe a direção

	                vet[cont] = novoSimbolo; // substitui na fita
	                
	                if (direcao == 'D') { //vai para a direita
	                    cont++; // o cabeçote da fita vai uma posição à direita
	                } 
	                else if (direcao == 'E') { //vai para a esquerda
	                    cont--; // o cabeçote da fita vai uma posição à esquerda
	                }
	                		
	            } 
	            else {
	                estadoAtual = -1; // transição inválida (nula ou igual a Sx), encerra a execução
	            }
	        } 
	        else {
	            estadoAtual = -1; // símbolo da fita lido não foi encontrado no alfabeto geral, encerra a execução
	        }

	        //VisualizarVetor(vet, " FITA FINAL ");// para visualizar todas as alterações na fita
	    }

	    VisualizarVetor(vet, " FITA FINAL ");// para visualizar somente a última fita
	    
	    boolean aceita = false;
	    for (String estadoFinal : finais) { // verifica se chegou a um estado final
	    	String aux = String.valueOf(estadoFinal.charAt(1));
	    	//System.out.println("aux = " + aux + "| estadoatual = " + estadoAtualaux);
	        if (Integer.parseInt(aux) == estadoAtualaux) {
	            aceita = true;
	            break;
	        }
	    }
	    
	    String vets = new String (vet);
	    
	    String [] retorno = new String [2];

	    if (aceita) {
	        System.out.println("A palavra foi aceita!");
	        retorno [0] = "true"; retorno[1] = vets;
	        return retorno;
	    } else {
	        System.out.println("A palavra não foi aceita!");
	        retorno [0] = "false"; retorno[1] = vets;
	        return retorno;
	    }
	    
	}
	
	public static void VisualizarVetor (char vet[], String texto) {
		Impressao ("*", texto);
		for (int i = 0; i < vet.length; i++) {
			if (i == vet.length-1) System.out.print (vet[i] + "\n");
			else System.out.print (vet[i] + " ");
		}
		Impressao ("*","*");
	}
	
	public static void Recebimento (char vet[],String qtdalfabetoS, String alfabetoS, String letra, String qtd, String inicial, String qtdfinal, String finaisS, String marci, String marcb) {
		Scanner s = new Scanner (System.in);
		
		//System.out.print("Digite a quantidade de letras do alfabeto: ");
		int qtdalfabeto = Integer.parseInt(qtdalfabetoS);
		
		String [] alfabetoaux = alfabetoS.split(",");
		
		char alfabeto[] = new char [alfabetoaux.length];
		
		for (int i = 0; i < alfabetoaux.length; i++) {
            // Certifique-se de que a parte atual não está vazia
            if (!alfabetoaux[i].isEmpty()) {
                // Pegue o primeiro caractere da parte atual e armazene no vetor de char
                alfabeto[i] = alfabetoaux[i].charAt(0);
            }
        }
		
		//System.out.print("Informe uma letra para representar os estados: ");
		char estado =letra.charAt(0);
		
		//System.out.print("Digite a quantidade total de estados: "); 
		int qtdestados = Integer.parseInt(qtd);
		String estados [] =  new String [qtdestados];
		
		//System.out.print("Digite o estado inicial - somente o nº -: "); 
		String numinicial = inicial; int estadoinicial = Integer.parseInt(numinicial);

		int x = Integer.parseInt(numinicial);
		for (int i = 0; i < qtdestados; i++) {
			String aux = Integer.toString(x);
			estados[i] = estado+aux;
			x++;
		}
		
		//System.out.print("Digite a quantidade de  estados finais: "); 
		int qtdfinais = Integer.parseInt(qtdfinal);
		String finais [] =  new String [qtdfinais];
		
		String finaisaux [] = finaisS.split(",");
		
		for (int i = 0; i < qtdfinais; i++) {
			//System.out.print("Digite o " + (i+1) +"º estado final - somente o nº -:  ");
			finais [i] = estado + finaisaux[i];
		}
		
		//System.out.print("Digite o marcador de início: ");
		char marcador = marci.charAt(0);
		
		//System.out.print("Digite o marcador de branco: ");
		char branco = marcb.charAt(0);
		
		
		Descricao d = new Descricao (qtdestados,qtdalfabeto,alfabeto,estados,marcador,branco,finais,estadoinicial);
		
		//Impressão da Descrição Formal
		d.atualizarTextArea("============================== Descrição Formal ==============================\n");
		d.atualizarTextArea("\u2211 = {");
		
		Impressao("*"," Descrição Formal ");
		System.out.print("∑ = {");
		for (int i = 0; i < alfabeto.length; i++) {
			if (i < alfabeto.length-1) {
				System.out.print(alfabeto[i] + ",");
				d.atualizarTextArea(alfabeto[i] + ",");
			}
			else {
				System.out.print(alfabeto[i]);
				d.atualizarTextArea(alfabeto[i] + "");
			}
		}
		System.out.print("} \n");
		d.atualizarTextArea("} \n");
		
		System.out.print("E = {");
		d.atualizarTextArea("E = {");
		for (int i = 0; i < qtdestados; i++) {
			if (i < qtdestados-1) {
				System.out.print(estados[i] + ",");
				d.atualizarTextArea(estados[i] + ",");
			}
			else {
				System.out.print(estados[i]);
				d.atualizarTextArea(estados[i]);
			}
		}
		System.out.print("} \n");
		d.atualizarTextArea("} \n");
		
		System.out.println("i =  " + estado + estadoinicial);
		d.atualizarTextArea("i =  " + estado + estadoinicial + "\n");
		
		System.out.print("F = {");
		d.atualizarTextArea("F = {");
		for (int i = 0; i < qtdfinais; i++) {
			if (i < qtdfinais-1) {
				System.out.print(finais[i] + ",");
				d.atualizarTextArea(finais[i] + ",");
			}
			else {
				System.out.print(finais[i]);
				d.atualizarTextArea(finais[i]);
			}
		}
		System.out.print("} \n");
		d.atualizarTextArea("} \n");
		
		System.out.println("γ =  {" + marcador + "," + branco + "}");
		d.atualizarTextArea("γ =  {" + marcador + "," + branco + "}\n");
		
		System.out.println("< =  " + marcador);
		d.atualizarTextArea("< =  " + marcador + "\n");
		
		System.out.println("β =  " + branco);
		d.atualizarTextArea("β =  " + branco + "\n");
		
		//
		
		Impressao ("*"," Tabela de Transição ");
		d.atualizarTextArea("============================== Tabela de Transição ==============================\n");
		
		for (int i = 0; i < (qtdestados+1); i++) {
			for (int j = 0; j < (qtdalfabeto + 3); j++) {
				if (i == 0) {
					if (j == 0) {
						System.out.print("δ     ");
						d.atualizarTextArea("δ       ");
					}
					else if (j < (qtdalfabeto + 1)){
						System.out.print(alfabeto[j-1] + "     ");
						d.atualizarTextArea(alfabeto[j-1] + "     ");
					}
					else if (j == qtdalfabeto + 1) {
						System.out.print(marcador + "     ");
						d.atualizarTextArea(marcador + "     ");
					}
					else {
						System.out.print(branco);
						d.atualizarTextArea(branco + "");
					}
				}
				else if (j == 0) {
					System.out.print(estados[i-1] + "   ");
					d.atualizarTextArea(estados[i-1] + "   ");
				}
				else {
					System.out.print(i + "," + j + "   ");
					d.atualizarTextArea(i + "," + j + "   ");
				}
			}
			System.out.println();
			d.atualizarTextArea("\n");
		}
		
		d.setVisible(true);
		
	}
	
	public static void Transicoes (int qtdestados, int qtdalfabeto, char [] alfabeto, String [] estados, char marcador, char branco, String[] finais, int estadoinicial) {
		
		char alfabetogeral [] = new char [qtdalfabeto+2]; // junção do alfabeto e do alfabeto auxiliar
		for (int i = 0; i < alfabetogeral.length; i++) {
			if (i < qtdalfabeto) alfabetogeral[i] = alfabeto[i];
			else if (i == qtdalfabeto) alfabetogeral[i] = marcador;
			else alfabetogeral[i] = branco;
		}
		
		RecebeTransicoes rt = new RecebeTransicoes(alfabetogeral.length,qtdestados, alfabetogeral, marcador, branco, finais, estadoinicial);
		rt.setVisible(true);
		
		for (int i = 0; i < (qtdestados+1); i++) {
			for (int j = 0; j < (qtdalfabeto + 3); j++) {
				if (i == 0) {
					if (j == 0) {
						System.out.print("δ     ");
						rt.atualizarTextArea("δ       ");
					}
					else if (j < (qtdalfabeto + 1)){
						System.out.print(alfabeto[j-1] + "     ");
						rt.atualizarTextArea(alfabeto[j-1] + "     ");
					}
					else if (j == qtdalfabeto + 1) {
						System.out.print(marcador + "     ");
						rt.atualizarTextArea(marcador + "     ");
					}
					else {
						System.out.print(branco);
						rt.atualizarTextArea(branco + "");
					}
				}
				else if (j == 0) {
					System.out.print(estados[i-1] + "   ");
					rt.atualizarTextArea(estados[i-1] + "   ");
				}
				else {
					System.out.print(i + "," + j + "   ");
					rt.atualizarTextArea(i + "," + j + "   ");
				}
			}
			System.out.println();
			rt.atualizarTextArea("\n");
			
			Impressao ("*"," Tabela de Transição ");
		}
	}
	
	public String[] executapalavra (String teste, int tamanhodoalfabeto, int qtdestados, char [] alfabetogeral, Transicoes mat [][], char marcador, char branco, String[] finais, int estadoinicial) {
		//recebendo palavra a ser testada
		
		vet[0]= marcador;
		for (int i = 0; i < teste.length(); i++) {
			vet[i+1] = teste.charAt(i);
		}
		
		for (int i = teste.length()+1; i < vet.length; i++) {
			vet[i] = branco;
		}
		
		VisualizarVetor(vet, " FITA INICIAL ");
		
		char vetinicial [] = new char [60];
		vetinicial = vet;
		
		String[] valor = Executar(vet, mat, alfabetogeral, finais, estadoinicial);
		
		return valor;
	}
	
	public static void Impressao (String separador, String conteúdo) { // função que imprime títulos adequados ao tamanho padronizado da tela de impressão
		
		for (int i = 0; i < ((80-conteúdo.length())/2); i++) {
			System.out.print(separador); 
		}
		System.out.print(conteúdo);  //imprime o conteúdo recebido por parâmetro, entre cadeias de "="
		for (int i = 0; i < ((80-conteúdo.length())/2); i++) {
			System.out.print(separador);
		}
		 System.out.println();
	}
	
}


