package temp.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * CreateContactPAge
 */
public class CreateContactPage extends PageObject{

	@FindBy(xpath="//input[1]")
	private WebElementFacade titleInput;

	@FindBy(xpath="//input[2]")
	private WebElementFacade emailInput;

	@FindBy(xpath="//input[3]")
	private WebElementFacade phoneInput;

	@FindBy(xpath="//input[@type='button']")
	private WebElementFacade submitButton;

	public void fillForm(String title, String email, String phone){
		titleInput.type(title);
		emailInput.type(email);
		phoneInput.type(phone);
	}

	public void submitForm(){
		submitButton.click();
	}
}
