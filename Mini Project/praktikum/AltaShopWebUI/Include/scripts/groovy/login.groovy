import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I open the web")
	def openTheWeb() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("I fill the field with valid (.*)")
	def fillValidEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/AltaShop/Login/loginPage/input_Email_input-18'), email)
	}

	@When("I fill correct (.*)")
	def fillCorrectPassword(String password) {
		WebUI.setText(findTestObject('Object Repository/AltaShop/Login/loginPage/input_Password_input-21'), password)

		WebUI.takeScreenshot()
	}

	@And("I click the login button")
	def clickLoginButton() {
		WebUI.click(findTestObject('Object Repository/AltaShop/Login/loginPage/button_Login'))
	}


	@Then("I direct to homepage (.*)")
	def directToHomepage(String status) {
		if (status == "success") {
			WebUI.getText(findTestObject('Object Repository/AltaShop/Login/loginPage/h3_AltaShop'))
		} else {
			WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		}
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Given("I open the url")
	def openURL() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("I fill the field with unregistered email (.*)")
	def fillUnregisteredEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/AltaShop/Login/loginPage/input_Email_input-18'), email)
	}

	@And("I fill password (.*)")
	def fillPassword(String password) {
		WebUI.setText(findTestObject('Object Repository/AltaShop/Login/loginPage/input_Password_input-21'), password)

		WebUI.takeScreenshot()
	}

	@And("I click login button")
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/AltaShop/Login/loginPage/button_Login'))
	}

	@Then("Failed to login (.*)")
	def FailLogin(String status) {
		if (status == "fail") {
			WebUI.getText(findTestObject('Object Repository/AltaShop/Login/loginPage/div_record not found'))
		}
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}