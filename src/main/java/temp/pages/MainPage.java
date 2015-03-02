package temp.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * MainPage
 */
@DefaultUrl("http://slitvinov.ksn.dataart.net")
public class MainPage extends PageObject {

	@FindBy(xpath="//ul[contains(@class,'contact-list')]")
	private WebElementFacade contactList;

	@FindBy(xpath="//div[contains(@class,'navbar')]//a[contains(text(),'Create')]")
	private WebElementFacade createNewContactButton;

	@WhenPageOpens
	public void whenPageOpenes(){
		contactList.waitUntilVisible();
	}

	public void clickCreateNewContactButton(){
		createNewContactButton.click();
	}

	public boolean isContactWithTilePresent(String title){
		return findAll(String.format(TITLE,title)).size()>0;
	}

	public void clickDelete(String title){
		findBy(String.format(DELETE, title)).click();
	}

	public void clickEdit(String title){
		findBy(String.format(EDIT, title)).click();
	}

	private static final String TITLE = "//li/h2[text()='%s']";
	private static final String DELETE = "//li//h2[text()='%s']/../a[2]";
	private static final String EDIT = "//li/h2[text()='%s']/../a[contains(@class,'success')]";
}
