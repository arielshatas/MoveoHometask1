import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Moveo {
    WebDriver driver;

    //Ctor
    public Moveo() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ariel\\Downloads\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    //func
    //פןנקציה לפתיחת האתר
    public String openSite(String url) {
        this.driver.get(url);
        return this.driver.getCurrentUrl();

    }

    //פונקציה לפתיחת עמוד הקריירה
    public String OpenCareerPage(){
        //לחיצה על על שלוש הקווים למעלה מצד שמאל לכניסה חמסך האפשרויות
        WebElement OptionbuttonBtn = this.driver.findElement(By.cssSelector("body > div.menu-button.home > div > svg"));
        OptionbuttonBtn.click();
       //אלה שורות קוד שגורומות לפונקציה לחוכות כמה שניות לםני שהם ממשיכים לשלב הבאה בלי זה הםונקציה פועלת מהר מידי וזה לא עובד
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //לחיצה על קריירה כדי להכיכנס למסך קריירה
       WebElement CarweersBtn =this.driver.findElement(By.cssSelector("body > div.desktop-menu-div.home > div.menu-all-links > a:nth-child(5)"));
       CarweersBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //בחרתי בwe are moveo טקסט כדי להוכיח שאנחנו בעמוד הנכון
       WebElement BootyorcareerLabel= driver.findElement(By.cssSelector("body > div.section2.blog.wf-section > div > div:nth-child(5) > div.div-block-11 > p.subheader-about > strong"));
       return BootyorcareerLabel.getText();
    }

    public String ApllyToWork(){
        //סקריפט שבעזרנו נגלול למטה עד לחלק של aplly here
        JavascriptExecutor Js =(JavascriptExecutor)driver;
        Js.executeScript("window.scroll(0,1700)");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //לקיחה לאישור קבצי קוקי כי חשבתי שזה מה שמונע ממני להכניס ערך ב name
        WebElement CoockieBtn= this.driver.findElement
                (By.cssSelector("body > div.cc-window.cc-floating.cc-type-info.cc-theme-classic.cc-bottom.cc-left.cc-color-override--302268980 > div > a"));
        CoockieBtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement AddName= this.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/input"));
        AddName.sendKeys("a");

        return AddName.getText();
    }




}
