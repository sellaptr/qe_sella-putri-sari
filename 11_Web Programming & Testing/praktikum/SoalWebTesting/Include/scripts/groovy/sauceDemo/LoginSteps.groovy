package sauceDemo
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



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user on login page")
	def onLoginPage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.saucedemo.com/')

		WebUI.maximizeWindow()

		WebUI.verifyElementClickable(findTestObject('SauceDemo/Login/ButtonLogin'))
	}

	@When("user input valid username (.*)")
	def inputUsername(String username) {
		WebUI.setText(findTestObject('SauceDemo/Login/Username'), 'standard_user')
	}

	@And("user input valid password (.*)")
	def inputPassword(String password) {
		WebUI.setText(findTestObject('SauceDemo/Login/Password'), 'secret_sauce')
	}

	@And("user click login button")
	def clickButtonLogin() {
		WebUI.click(findTestObject('SauceDemo/Login/ButtonLogin'))
	}

	@Then("user on products page (.*)")
	def onProductsPage(String status) {
		if (status == "success") {
			WebUI.verifyElementText(findTestObject('SauceDemo/Login/titleProduct'), 'Products')
		} else {
			WebUI.verifyElementClickable(findTestObject('SauceDemo/Login/ButtonLogin'))
		}
		WebUI.closeBrowser()
	}
}