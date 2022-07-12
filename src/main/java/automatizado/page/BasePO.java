package automatizado.page;

    /*
     * Classe base para criação das novas PagesObjects.
     * Todas as pages devem ser herdadas desta classe.
     * */

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 *  Classe base para criação das novas PageObjects.
 *  Toda as pages devem ser herdadas desta classe.
 */
public abstract class BasePO {

        /* Driver base que será usado pelas pages. */
        protected WebDriver driver;

        /**
         * Construtor base para criação da fábrica de elementos.
         * @param driver  - Driver da página atual.
         */
        public BasePO(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        /**
         Método que retorna o título da página atual.
         *@return
         */
        public String obterTituloPagina(){
        return driver.getTitle();
        }

        /** Método que sabe escrever em qualquer WebElement do tipo input e dá um TAB no final.
         * @param input Input a qual será excrito.
         * @param texto Texto que será inscrito no input.
         */
    public void escrever(WebElement input, String texto) {
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }
}
