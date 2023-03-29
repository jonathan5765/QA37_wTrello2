package tests;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase{
    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }

    @Test
    public void login() {
        User user = new User().setEmail("jonathan5765@gmail.com").setPassword("Zeylik2504");

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());

    }
    @Test
    public void login2() {

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("jonathan5765@gmail.com","Zeylik2504");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());

    }


}
