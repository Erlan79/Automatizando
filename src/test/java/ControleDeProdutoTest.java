
import automatizado.page.ControleDeProdutoPO;
import automatizado.page.LoginPO;
import automatizado.page.builder.ProdutoBuilder;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Ordenar os testes
public class ControleDeProdutoTest extends BaseTest {

    private static LoginPO loginPage;
    private static ControleDeProdutoPO controleProdutoPage;

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("admin@admin.com","admin@123");

        controleProdutoPage = new ControleDeProdutoPO(driver);
        assertEquals(controleProdutoPage.obterTituloPagina(), "Controle de Produtos");
    }

    @Test
    public void TC001_deveAbrirCadastroAoClicarNoBotaoCriar(){
        controleProdutoPage.buttonAdicionar.click();
        //TODO: - Remover esse clique assim que o sistema for corrigido.
        controleProdutoPage.buttonAdicionar.click();

        String titulo = controleProdutoPage.tituloModal.getText();

        assertEquals("Produto", titulo);

        controleProdutoPage.buttonSair.click();
        controleProdutoPage.buttonSair.click();
    }

    /*
    @Test
    public void TC002_NaoDeveSerPossivelCadastrarUmProdutoSemPreencherTodosOsCampos(){

        controleProdutoPage.buttonAdicionar.click();
        controleProdutoPage.buttonAdicionar.click();

        controleProdutoPage.cadastrarProduto("00001", "Martelo", 10, 59.9, "");

        // Aqui vamos capturar a mensagem de erro.

        String mensagem = controleProdutoPage.spanMensagem.getText();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    }
    */
    @Test
    public void TC003_NaoDeveSerPossivelCadastrarUmProdutoSemPreencherTodosOsCampos(){

        controleProdutoPage.buttonAdicionar.click();
        controleProdutoPage.buttonAdicionar.click();

        ProdutoBuilder produtoBuilder = new ProdutoBuilder();

        controleProdutoPage.cadastrarProduto(produtoBuilder);

        // Aqui vamos capturar a mensagem de erro.

        String mensagem = controleProdutoPage.spanMensagem.getText();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    }

}

