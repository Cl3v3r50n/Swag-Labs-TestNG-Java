package Steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pageObjects.PagamentoPage;
import utils.ContextoSetup;

public class PagamentoSteps {

    ContextoSetup contextoSetup;
    public PagamentoSteps (ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }
    @E("^eu efetuo o pagamento$")
    public void euEfetuoOPagamento() throws InterruptedException {
//        PagamentoPage pagamentoPage = new PagamentoPage(contextoSetup.driver);
        PagamentoPage pagamentoPage = contextoSetup.gerenciarPO.getPagamentoPage();
        pagamentoPage.acessarCarrinho();
        pagamentoPage.preencherDadosPagamento();
        pagamentoPage.confirmacaoCompra();

    }

    @Então("^eu irei visualizar a mensagem \"([^\"]*)\"$")
    public void eu_irei_visualizar_a_mensagem(String mensagemSucesso) throws InterruptedException {
        PagamentoPage pagamentoPage = contextoSetup.gerenciarPO.getPagamentoPage();
        pagamentoPage.validarMensagemPagamento(mensagemSucesso);
    }
}
