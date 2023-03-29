package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {

    @BeforeMethod
    public void preCondition() {
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("jonathan5765@gmail.com", "Zeylik2504");
        app.getUser().submitLogin();
        app.getUser().pause(2000);
    }

    @Test
    public void boardCreation() {
        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillInBoardCreationForm("qa37");
        app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().isCreate();


    }

}
