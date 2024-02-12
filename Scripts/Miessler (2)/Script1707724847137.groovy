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

WebUI.navigateToUrl('https://www.miessler-automotive.com/')

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG - Luf_d122f7/button_Alle akzeptieren'))

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG - Luf_d122f7/a_Mein Konto'))

WebUI.setText(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Luftf_8667d9/input_Anmelden fr registrierte Kunden_email'), 
    'zelim@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Luftf_8667d9/input_E-Mail-Adresse_passwort'), 
    'jt9hHVg9rFWx0pdblpZwlg==')

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Luftf_8667d9/button_Anmelden'))

WebUI.setText(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Luftf_8667d9/input_Oliver Miessler_qs'), 
    'shock absorber rear audi a6 c5 allroad')

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Luftf_8667d9/button_Oliver Miessler_btn  btn-secondary'))

WebUI.click(findTestObject('Object Repository/Page_shock absorber rear audi a6 c5 allroad_4218d1/a_Audi A6 C5 4B allroad Shock absorber air _78adf6'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 4B allroad Shock absorber a_b3990b/div_Left and right side'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 4B allroad Shock absorber a_b3990b/div_Left and right side'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 4B allroad Shock absorber a_b3990b/label_Left and right side'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 4B allroad Shock absorber a_b3990b/button_Add to basket'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 4B allroad Shock absorber a_5b4d0a/a_1                                        _2bfd7f'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 4B allroad Shock absorber a_5b4d0a/a_Go to basket'))

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Air S_0abc18/button_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Air S_0abc18/a_My account'))

WebUI.click(findTestObject('Object Repository/Page_Miessler Automotive GmbH  Co. KG Air S_0abc18/a_Log out'))

