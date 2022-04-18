package controller;

public class PagamentoPix implements IPagamentoStrategy {

	@Override
	public void fazerPagamento() {
		String chavePix = "9237459372854876512935618273652187635182736518";
		System.out.println("Pagamento por pix usando chave " + chavePix);
	}

}
