import automatizado.page.GooglePO;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes(){
        driver.get("https://www.google.com/");
        googlePage = new GooglePO(driver);

    }

    @Test
    public void TC001_devePesquisarNoGoogleOTextoBatataFrita(){


        //googlePage.inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);
        googlePage.pesquisar("Batata frita");

        String resultado = googlePage.obterResulatdoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));
    }

    @Test
    public void TC002_devePesquisarNoGoogleOTextoNutella(){

        googlePage.pesquisar("Nutella");

        String resultado = googlePage.obterResulatdoDaPesquisa();

        assertTrue(resultado, resultado.contains("resultados"));
    }
}
