package notification.service;

import notification.model.Contrato;

public class ContratoService {

	public String gerarConteudoContrato(Contrato contrato) {
		
	String texto = "";
	
	texto = texto + " Senhor(a) " + contrato.getCadastro().getPessoa().getNome();
	texto = texto + " Informamaos que conforme contrato com protocolo de n�mero " + contrato.getNumeroProtocolo();
	return texto;
	
	
		
	}
}
