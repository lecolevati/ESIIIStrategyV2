package controller;

import javax.swing.JOptionPane;

public class PagamentoCartao implements IPagamentoStrategy {

	@Override
	public void fazerPagamento() {
		String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do Cliente");
		String nome = JOptionPane.showInputDialog(null, "Digite o Nome do Cliente");
		String numCartao = JOptionPane.showInputDialog(null, "Digite o no. do Cart�o");
		String cvvCartao = JOptionPane.showInputDialog(null, "Digite o CVV do Cart�o");
		System.out.println("Pagamento processado para o cliente"+nome+" - CPF: "+cpf+" Cart�o: "+numCartao+" CVV: "+cvvCartao);
	}

}
