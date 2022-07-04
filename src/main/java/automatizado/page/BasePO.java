package automatizado.page;

    /*
     * Classe base para criação das novas PagesObjects.
     * Todas as pages devem ser herdadas desta classe.
     * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {
        /* Driver base que será usado pelas pages*/
        protected WebDriver driver;

        /**
         * Construtor base para criação da fábrica de elementos.
         * @param driver  - Driver da página atual.
         *  */

        protected BasePO(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    }
