package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionPage {

    public InteractionPage(WebDriver driver) {
    }
    @FindBy(xpath = "//*[@id=\"interaction_name\"]")
    WebElement interactionName;
    @FindBy(xpath = "//*[@id=\"interaction_description\"]")
    WebElement interactionDescription;
    @FindBy(xpath = "//*[@id=\"new_interaction\"]/input[3]")
    WebElement submitBtn;
    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]")
    WebElement message;

    public void fillAndSubmitInteraction(String name, String description){
        interactionName.sendKeys(name);
        interactionDescription.sendKeys(description);
        submitBtn.click();
    }

    public String getActualMessage() {
        return message.getText();
    }
}
