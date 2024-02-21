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

WebUI.navigateToUrl('https://www.ebay.be/')

WebUI.click(findTestObject('Object Repository/Page_ebay.be - eBay Belgi, eBay Belgique/a_Nederlands'))

WebUI.click(findTestObject('Object Repository/Page_Elektronica, autos, kleding, verzamelo_9a2164/button_Alles accepteren'))

WebUI.setText(findTestObject('Object Repository/Page_Elektronica, autos, kleding, verzamelo_9a2164/input_Voer uw trefwoord in__nkw'), 
    'Audi A6 C5 Allroad shock absorbers rear')

WebUI.click(findTestObject('Object Repository/Page_Elektronica, autos, kleding, verzamelo_9a2164/input_magical murphy_gh-btn'))

WebUI.click(findTestObject('Object Repository/Page_Audi A6 C5 Allroad shock absorbers rear  eBay/div_X2 PCS REAR SHOCK ABSORBERS PAIR SHOCKE_52d480'))

WebUI.switchToWindowTitle('X2 PCS REAR SHOCK ABSORBERS PAIR SHOCKER SK-2805 ARNOTT EUROPE I | eBay')

WebUI.click(findTestObject('Object Repository/Page_X2 PCS REAR SHOCK ABSORBERS PAIR SHOCK_94d243/span_Toevoegen aan winkelwagentje'))

WebUI.click(findTestObject('Object Repository/Page_eBay-winkelwagentje/button_Ga naar Betalen'))

WebUI.click(findTestObject('Object Repository/Page_eBay-winkelwagentje/button_Doorgaan als bezoeker'))

