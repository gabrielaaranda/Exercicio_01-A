package nomes;

import java.util.Set;

public class FuncoesDoPrograma {

	// Adicionar nomes ao conjunto
    public static void add(Set<String> set, String nome) {
        if (set.contains(nome)) {
            System.out.println("Nome ja existe");
        } else {
            set.add(nome);
        }
    }

    // Remover nomes do conjunto
    public static void remove(Set<String> set, String nome) {
        if (set.contains(nome)) {
            set.remove(nome);
        } else {
            System.out.println("Nome não existe");
        }
    }

    // Verificar se um nome existe no conjunto
    public static boolean contains(Set<String> set, String nome) {
        return set.contains(nome);
    }
    
    //Exclui todos os itens
    public static void limpaConjunto(Set<String> set, int aux) {
        if(aux == 1)
    		set.clear();
    }
	
	
}
