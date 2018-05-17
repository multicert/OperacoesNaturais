package operacoes;

import java.util.List;

public interface IOperacoesNaturais {

	//Permite adicionar uma nova operacao 
	public void adicionaOperacao(IOperacao operacao);
	//Permite lista as opercoes disponíveis
	public List listaOperacoes();
	//permite executar uma operação de acordo com o nome e valore passados
	public int executaOperacao(String nome, int[] valores) throws IllegalArgumentException;
	
	
}
