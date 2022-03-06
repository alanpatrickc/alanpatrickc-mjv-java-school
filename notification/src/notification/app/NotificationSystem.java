package notification.app;

import java.util.Date;

import notification.model.Cadastro;
import notification.model.Contrato;
import notification.model.Endereco;
import notification.model.NotificacaoTipo;
import notification.model.Pessoa;
import notification.service.ContratoService;
import notification.service.TransmissorMensagemSms;
import notification.service.TransmissorMensagemWhats;
import notification.service.TransmissorMensagem;

public class NotificationSystem {

	public static void main(String[] args) {
	
	   Contrato contrato = new Contrato();
	   contrato.setNumeroProtocolo(123);
		
	   Cadastro cadastro = new Cadastro();
	   cadastro.setAtivo(true);
	   cadastro.setNumero(27);
	    
	   Pessoa pessoa = new Pessoa();
	   pessoa.setCpf("123456789");
	   pessoa.setNome("Alan Rodrigues");
	   pessoa.setRg("1321321321");
	   pessoa.setTelefone("795246546");
	   
	   Endereco endereco = new Endereco();
	   endereco.setBairro("Palmeira");
	   endereco.setCep("65300000");
	   endereco.setCidade("Santa Inês");
	   endereco.setEstado("MA");
	   endereco.setLogradouro("Rua do Bambu");
	   endereco.setNumero("530");
	  
	   cadastro.setPessoa(pessoa);
	   cadastro.setNotificacaoTipo(NotificacaoTipo.WHATS);
	   contrato.setCadastro(cadastro);
	   contrato.setDataHora(new Date());
	   
	   ContratoService contratoService = new ContratoService();
	   String mensagem = contratoService.gerarConteudoContrato(contrato);
	   	
	   TransmissorMensagem transmissor = null;
	   
	   if(cadastro.getNotificacaoTipo() == NotificacaoTipo.SMS)
	   transmissor = new TransmissorMensagemSms();
	   else
	   transmissor = new TransmissorMensagemWhats(); 
	   
	   transmissor.transmitir(contrato.getCadastro().getPessoa().getTelefone(), mensagem);
	   
	   
	   
	  
	   
	   
	 
	}
}
