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

WebUI.navigateToUrl('https://www.bol.com/nl/nl/')

WebUI.click(findTestObject('Object Repository/Page_De winkel van ons allemaal  bol/button_Alles accepteren'))

WebUI.click(findTestObject('Object Repository/Page_De winkel van ons allemaal  bol/span_Belgi'))

WebUI.click(findTestObject('Object Repository/Page_De winkel van ons allemaal  bol/button_Doorgaan'))

WebUI.setText(findTestObject('Object Repository/Page_De winkel van ons allemaal  bol/input_Zoeken_searchtext'), 'omega seamaster strap')

WebUI.click(findTestObject('Object Repository/Page_De winkel van ons allemaal  bol/button_Zoeken_wsp-search__btn'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Zoekresultaten voor omega sea_daff48/a_20mm Nato Strap BLAUW - Vintage James Bon_531d03'))

WebUI.click(findTestObject('Object Repository/Page_20mm Nato Strap BLAUW - Vintage James _f09279/a_In winkelwagen'))

WebUI.click(findTestObject('Object Repository/Page_20mm Nato Strap BLAUW - Vintage James _f09279/a_Bestellen'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Winkelwagentje/button_Aantal_c-cTzGPd c-PJLV c-PJLV-eOgkdH_be5215'))

