package operacoes;

public class Fatorial implements IOperacao {

	private int[] input;
	private String operacao;
	
	
	@Override
	public void setInputs(int[] inputs) {
		
		input = new int[] {0};
		input[0]  = inputs[0];

	}

	@Override
	public void setNomeDaOperacao(String nomeDaOperacao) {
		operacao = nomeDaOperacao;
	}

	@Override
	public int realizaOperacao() {
		int valor = 1;
		for(int i = 1; i <= input[0]; i++)
		{
			valor = valor*i;
		}
		return valor;
	}

	@Override
	public String getNomeDaOperacao() {
		// TODO Auto-generated method stub
		return operacao;
	}

	@Override
	public String getDescricaoOperacaoAtual() {
		// TODO Auto-generated method stub
		return operacao + " - valor: " + input[0] ;
	}

}
