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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/requestloan.htm')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Error/input_Username_username'), 'zelim')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Error/input_Password_password'), 'jt9hHVg9rFWx0pdblpZwlg==')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Error/input_Password_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Open New Account'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Open Account/a_Transfer Funds'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Transfer Funds/input_Amount_input'), '200')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Transfer Funds/input_From account to account_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Transfer Funds/a_Update Contact Info'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Update Profile/a_Open New Account'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Open Account/a_Accounts Overview'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Transfer Funds'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Transfer Funds/a_Bill Pay'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Payee Name_payee.name'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Address_payee.address.street'), 'Tribeca Ave. 1466')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_City_payee.address.city'), 'Atlanta')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_State_payee.address.state'), 'Texas')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Zip Code_payee.address.zipCode'), '125968')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Phone_payee.phoneNumber'), '+158965874')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Account_payee.accountNumber'), '123')

WebUI.sendKeys(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Account_payee.accountNumber'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Account_payee.accountNumber'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Verify Account_verifyAccount'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Amount_amount'), '250')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_From account_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Bill Payment Complete/a_Accounts Overview'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Log Out'))

