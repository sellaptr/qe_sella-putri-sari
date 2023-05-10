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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open register form")
	def openThisURL(){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}

	@When("I fill the fullname field (.*)")
	def fillFullName(String fullname){
		WebUI.setText(findTestObject('Object Repository/AltaShop/Register/registerPage/input_Nama Lengkap_input-18'), fullname)
	}

	@When("I fill with valid email (.*)")
	def fillEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/AltaShop/Register/registerPage/input_Email_input-21'), email)
	}

	@And("I fill the password (.*)")
	def fillPassword(String password) {
		WebUI.setText(findTestObject('Object Repository/AltaShop/Register/registerPage/input_Password_input-24'), password)

		WebUI.takeScreenshot()
	}

	@And("I click register button")
	def clickButtonRegister() {
		WebUI.click(findTestObject('Object Repository/AltaShop/Register/registerPage/button_Register'))
	}

	@Then("AltaShop LoginPage appears (.*)")
	def loginPage(String status) {
		if (status == "success") {
			WebUI.navigateToUrl(' https://alta-shop.vercel.app/auth/login')
		}
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}


	//	@Given("As a user iam open the register form")
	//	def openRegisterForm() {
	//		WebUI.openBrowser('')
	//		WebUI.maximizeWindow()
	//
	//		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	//	}
	//
	//	@When("I fill fullname")
	//	def fillFullnameField() {
	//		WebUI.setText(findTestObject('Object Repository/AltaShop/Register/registerPage/input_Nama Lengkap_input-18'), 'angel')
	//	}
	//
	//	@And("I fill with registered (.*)")
	//	def registeredEmail(String email) {
	//		WebUI.setText(findTestObject('Object Repository/AltaShop/Register/registerPage/input_Email_input-21'), email)
	//	}
	//
	//	@And("I fill the (.*) field")
	//	def fillPasswordField(String password) {
	//		WebUI.setText(findTestObject('Object Repository/AltaShop/Register/registerPage/input_Password_input-24'), password)
	//
	//		WebUI.takeScreenshot()
	//	}
	//
	//	@And("I click the register button")
	//	def clickButton() {
	//		WebUI.click(findTestObject('Object Repository/AltaShop/Register/registerPage/button_Register'))
	//	}
	//
	//	@Then("Show the error message and fail to register (.*)")
	//	def failToRegister(String status) {
	//		if (status == "fail") {
	//			WebUI.getText(findTestObject('Object Repository/AltaShop/Register/registerPage/div_Sudah memiliki akun Login'))
	//		}
	//		WebUI.takeScreenshot()
	//		WebUI.closeBrowser()
	//	}
}