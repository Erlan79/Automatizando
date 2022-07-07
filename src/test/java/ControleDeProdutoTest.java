
import automatizado.page.ControleDeProdutoPO;
import automatizado.page.LoginPO;
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
    }
}

