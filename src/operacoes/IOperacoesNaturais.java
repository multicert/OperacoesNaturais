package operacoes;

import java.util.List;

public interface IOperacoesNaturais {

	//Permite adicionar uma nova operacao 
	public void adicionaOperacao(IOperacao operacao);
	//Permite lista as opercoes dispon�veis
	public List listaOperacoes();
	//permite executar uma opera��o de acordo com o nome e valore passados
	public int executaOperacao(String nome, int[] valores) throws IllegalArgumentException;
	
	
}
