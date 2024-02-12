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

WebUI.navigateToUrl('https://www.mail.com/consentpage')

WebUI.click(findTestObject('Object Repository/Page_Consent mail.com/button_Agree and continue'))

WebUI.click(findTestObject('Object Repository/Page_Free email accounts with mail.com  Log_9cadc2/span_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Free email accounts with mail.com  Log_9cadc2/input_Email address_username'), 
    'zelim@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Free email accounts with mail.com  Log_9cadc2/input_Password_password'), 
    'jt9hHVg9rFWx0pdblpZwlg==')

WebUI.click(findTestObject('Object Repository/Page_Free email accounts with mail.com  Log_9cadc2/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Free Email Addresses Web based and sec_26c7c5/a_E-mail'))

WebUI.click(findTestObject('Object Repository/Page_Free Email Addresses Web based and sec_26c7c5/span_Log out'))

WebUI.closeBrowser()

