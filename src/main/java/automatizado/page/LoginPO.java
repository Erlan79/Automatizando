package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(name = "senha")
    public WebElement inputSenha;

    @FindBy(name = "senha")
    public WebElement buttonEntrar;

    @FindBy(css = "form.form-login>div.alert>span")
    public WebElement spanMensagem;

    /**
     * Construtor padrão para criação de uma nova instancia da página de login.
     *
     * @param driver - Driver da página de login.
     */
    public LoginPO(WebDriver driver) {
        super(driver);
    }
}
