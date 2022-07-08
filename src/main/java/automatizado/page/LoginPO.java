package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {

    // pageFactory
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    /**
     * Construtor padrão para criação de uma nova instancia da página de login.
     *
     * @param driver - Driver da página de login.
     */
    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public String obterMensagem() {
        return spanMensagem.getText();
    }

    /**
     * Método que tenta executar a ação de logar no sistema.
     * @param email E-mail para tentativa de login.
     * @param senha Senha para tentativa de login.
     * */
    public void executarAcaoDeLogar(String email, String senha) {
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
        buttonEntrar.click();
    }
}
