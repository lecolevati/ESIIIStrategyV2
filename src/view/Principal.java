package view;

import controller.IPagamentoStrategy;
import controller.PagamentoCartao;
import controller.PagamentoDinheiro;
import controller.PagamentoPix;

public class Principal {

	public static void main(String[] args) {
		IPagamentoStrategy pagto = new PagamentoPix();
		pagto.fazerPagamento();
		
		pagto = new PagamentoCartao();
		pagto.fazerPagamento();
		
		pagto = new PagamentoDinheiro();
		pagto.fazerPagamento();
	}
	
}
