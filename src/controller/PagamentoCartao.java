package controller;

import javax.swing.JOptionPane;

public class PagamentoCartao implements IPagamentoStrategy {

	@Override
	public void fazerPagamento() {
		String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do Cliente");
		String nome = JOptionPane.showInputDialog(null, "Digite o Nome do Cliente");
		String numCartao = JOptionPane.showInputDialog(null, "Digite o no. do Cartão");
		String cvvCartao = JOptionPane.showInputDialog(null, "Digite o CVV do Cartão");
		System.out.println("Pagamento processado para o cliente"+nome+" - CPF: "+cpf+" Cartão: "+numCartao+" CVV: "+cvvCartao);
	}

}
