package manage;

import models.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase {
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void initBoardCreationFromHeader() {
        click(By.cssSelector("[data-testid='header-create-menu-button']"));
        click(By.cssSelector("[data-testid='header-create-board-button']"));
        //click(By.cssSelector("[aria-label='BoardIcon']"));


    }

    public void fillInBoardCreationForm(String title) {
        type(By.cssSelector("[data-testid='create-board-title-input']"), title);
    }
    public void fillInBoardCreationForm(Board board) {
        type(By.cssSelector("[data-testid='create-board-title-input']"), board.getTitle());
    }

//    public void scrollDownTheForm() {
//        Actions action = new Actions(wd);
//        WebElement container = wd.findElement(By.cssSelector("[data-testid='header-create-menu-popover']"));
//        Rectangle rect = container.getRect();
//        int x = rect.getX() + 20;
//        int y = rect.getY() + rect.getHeight() / 2;
//        action.moveByOffset(x, y).click().perform();
//    }

    public void submitBoardCreation() {
        click(By.cssSelector("[data-testid='create-board-submit-button']"));
    }

    public boolean isCreate() {
        return wd.findElements(By.cssSelector(".list-name-input")).size() > 0;
    }
    public void returnHomePage() {
        click(By.cssSelector("[aria-label='Back to home']"));
    }
}


