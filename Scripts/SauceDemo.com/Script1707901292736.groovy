import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Bike Light'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Bolt T-ShirtGet your testing_096930'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Bolt T-Shirt'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Fleece Jacket'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_About'))

WebUI.click(findTestObject('Object Repository/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Try it free_MuiButtonBase-root MuiIc_d392d3'))

WebUI.click(findTestObject('Object Repository/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/img_Products_chevron'))

WebUI.click(findTestObject('Object Repository/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Back to Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Try it free'))

WebUI.click(findTestObject('Object Repository/Page_Sign Up for a Free Trial  Sauce Labs/a_Sign in'))

