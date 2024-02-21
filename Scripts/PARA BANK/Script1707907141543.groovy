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

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Error/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_First Name_customer.firstName'), 
    'zelim')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Last Name_customer.lastName'), 
    'soul')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Address_customer.address.street'), 
    'Veldstraat 25')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_City_customer.address.city'), 
    'Antwerp')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_State_customer.address.state'), 
    'Minnesota')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Zip Code_customer.address.zipCode'), 
    '2640')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Phone_customer.phoneNumber'), 
    '04856245872')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_SSN_customer.ssn'), 
    '12354698')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Username_customer.username'), 
    'zelim')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Password_customer.password'), 
    'jt9hHVg9rFWx0pdblpZwlg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_repeatedPassword'), 
    'jt9hHVg9rFWx0pdblpZwlg==')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Customer Created/a_Request Loan'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Loan Request/input_Loan Amount_amount'), '500')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Loan Request/input_Down Payment_downPayment'), '50')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Loan Request/input_From account_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Loan Request/a_Log Out'))

