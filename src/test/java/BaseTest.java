import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "C:/Users/erla.santos/Documents/QA/Automatizando/sistema/login.html";
    private static final String CAMINHO_DRIVER = "C:\\Users\\erla.santos\\IdeaProjects\\Automatizado\\automatizado\\src\\resource\\chromedriver-v10305060.exe";

    // Encapsulamento
    @BeforeClass
    public static void iniciar() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}