package temp.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import temp.steps.ContactSteps;

import static junit.framework.TestCase.assertFalse;

public class DefinitionSteps {

	@Steps
	ContactSteps contactSteps;

	@Given("Main page is opened")
	public void givenMainPageIsOpened() {
		contactSteps.openMainPage();
	}

	@When("User clicks create new contact button")
	public void whenUserClicksCreateButton() {
		contactSteps.clickCreateButton();
	}

	@When("User click delete button for contact $contact")
	public void whenUserClicksDelete(String contact) {
		contactSteps.clickCreateButton();
	}

	@When("User fill fields with title $title email $email and phone number $phone")
	public void whenUserFillsForm(String title, String email, String phone) {
		contactSteps.fillInForm(title, email, phone);
	}

	@When("Submit create form")
	public void whenUserSubmit() {
		contactSteps.submitForm();
	}

	@When("Click delete buttn for contact $contact")
	public void whenClickDelete(String contact) {
		contactSteps.clickDelete(contact);
	}

	@When("Click edit button for contact $contact")
	public void whenEdit(String contact) {
		contactSteps.clickEdit(contact);
	}

	@Then("New contact $title deleted and not displayed on main page")
	public void thenDeleted(String title) {
		assertFalse(contactSteps.isContactPresent(title));
	}

	@Then("New contact $title created and displayed on main page")
	public void thenTheyShouldSeeADefinitionContainingTheWords(String title) {
		contactSteps.isContactPresent(title);
	}
}
