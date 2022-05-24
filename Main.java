package nomes;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Questao 1. Considere um objeto Set:
    (a) Escreva um programa que le uma serie de nomes e elimina as duplicatas armazenando-os em um Set;
        i) O usuario deve poder remover um determinado nome, se o nome nao pertencer ao conjunto, uma mensagem de erro deve ser informada;
        ii) O  deve poder verificar se um determinado nome  foi armazenado;
        iii) Por fim, um usuario pode apagar todos os nomes armazenados;
*/

// Questao 1.a
public class Main {

    public static void main(String[] args) {
    	
    	Scanner ler = new Scanner(System.in);
    	
    	int aux = 0, i = 0;
    	String nomeAux;
    	
        Set<String> pessoas = new HashSet<>(); // Cria um conjunto de nomes
        String nomesPessoas [] = new String[4]; // Vetor para os nomes
        
        System.out.println("\t***LISTA PARA NOMES***");
        
        do {
        	if(i == nomesPessoas.length) {
        		System.out.println("\nNao e possivel adicionar mais nomes");
        		break;
        	}
        	
            System.out.println("\nDigite um nome: ");
            nomesPessoas [i] = ler.next();
            FuncoesDoPrograma.add(pessoas, nomesPessoas[i]);
            
            System.out.println("\nDeseja adicionar mais um nome?");
            System.out.println("1 - Sim \t0 - Nao");
            
            aux = ler.nextInt();
            i++;
        } while (aux != 0);
        
        System.out.println("\nVetor: " + pessoas); //Imprime conjunto
        
//        for (int i = 0; i < nomesPessoas.length; i++) {
//            FuncoesDoPrograma.add(pessoas, nomesPessoas[i]);
//        }
        
        // Remover nome do conjunto
        System.out.println("\nDeseja remover um nome?");
        System.out.println("1 - Sim \t0 - Nao");
        i = ler.nextInt();
        
        if(i == 1) {
            System.out.println("\nNome a ser removido: ");
            nomeAux = ler.next();
        	FuncoesDoPrograma.remove(pessoas, nomeAux);
        }
        
        System.out.println("\nVetor: " + pessoas);
        
        // Verificar se um nome existe no conjunto
        System.out.println("\nDeseja verificar um nome?");
        System.out.println("1 - Sim \t0 - Nao");
        i = ler.nextInt();

        if(i == 1) {
            System.out.println("\nNome a ser verificado: ");
            nomeAux = ler.next();
        	if(FuncoesDoPrograma.contains(pessoas, nomeAux) == false) {
        		System.out.println("O nome nao esta no conjunto");
        	} else {
        		System.out.println("O nome esta no conjunto");
        	}
        }
        
    }
    
//    ler.close();
}
