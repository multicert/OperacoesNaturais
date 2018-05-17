package operacoes;

public class Arranjos implements IOperacao {

	
	private int[] input;
	private String operacao;
	
	@Override
	public void setInputs(int[] inputs) {
		input = new int[] {0,0};
		input[0]  = inputs[0];
		input[1]  = inputs[1];
		

	}
	@Override
	public void setNomeDaOperacao(String nomeDaOperacao) {
		operacao = nomeDaOperacao;
	}


	private int fat(int v)
	{
		int valor = 1;
		for(int i = 1; i <= v; i++)
		{
			valor = valor*i;
		}
		return valor;
	}
	
	@Override
	public int realizaOperacao() {
		
		return fat(input[0])/fat(input[1]);
	}

	@Override
	public String getNomeDaOperacao() {
		
		return operacao;
	}

	@Override
	public String getDescricaoOperacaoAtual() {
		// TODO Auto-generated method stub
		return operacao + " - valor: " + input[0] + ", " + input[1] ;
	}
}
