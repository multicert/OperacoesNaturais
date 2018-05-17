package operacoes;

public interface IOperacao {

	//Atribui os inputs da opera�ao a realizar
	public void setInputs(int[] inputs);
	//Atribui nome � opera��o
	public void setNomeDaOperacao(String nomeDaOperacao);
	//Implementa a operacao
	public int realizaOperacao();
	//Devolve o nome da operacao
	public String getNomeDaOperacao();
	//devolve o nome e os inputs da operacao
	public String getDescricaoOperacaoAtual();
	
}
