package testes;
import static org.junit.Assert.*;

import org.junit.Test;

import operacoes.Arranjos;
import operacoes.Fatorial;
import operacoes.IOperacao;

public class TestOperacoes {

	IOperacao operacao;
	/**
	 *  Testar 1! = 1, 3! = 6, 5! = 120
	 */
	@Test
	public final void testFatorial() {
		
		operacao = new Fatorial();
		int[] input1 = new int[] {1};
		int[] input2 = new int[] {3};
		int[] input3 = new int[] {5};
		operacao.setNomeDaOperacao("operacao");
		operacao.setInputs(input1);
		assertEquals(1, operacao.realizaOperacao());
		operacao.setInputs(input2);
		assertEquals(6, operacao.realizaOperacao());	
		operacao.setInputs(input3);
		assertEquals(120, operacao.realizaOperacao());	
	}
	
	@Test
	public final void testArranjos() {
		operacao = new Arranjos();
		int[] input1 = new int[] {1,1};
		int[] input2 = new int[] {3,1};
		int[] input3 = new int[] {5,2};
		operacao.setNomeDaOperacao("arranjos");
		operacao.setInputs(input1);
		assertEquals(1, operacao.realizaOperacao());
		operacao.setInputs(input2);
		assertEquals(6, operacao.realizaOperacao());	
		operacao.setInputs(input3);
		assertEquals(60, operacao.realizaOperacao());	
	}
	

}
