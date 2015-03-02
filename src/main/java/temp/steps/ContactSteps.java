package temp.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import temp.pages.CreateContactPage;
import temp.pages.MainPage;

public class ContactSteps extends ScenarioSteps {

	MainPage mainPage;
	CreateContactPage createANewItemPage;

	@Step
	public void openMainPage() {
		mainPage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void clickCreateButton(){
		mainPage.clickCreateNewContactButton();
	}

	@Step
	public void clickDelete(String title){
		mainPage.clickDelete(title);
	}

	@Step
	public void clickEdit(String title){
		mainPage.clickEdit(title);
	}

	@Step
	public void fillInForm(String title, String email, String phone){
		createANewItemPage.fillForm(title, email, phone);
	}

	@Step
	public void submitForm(){
		createANewItemPage.submitForm();
	}
	@Step
	public boolean isContactPresent(String title){
		return mainPage.isContactWithTilePresent(title);
	}
}
