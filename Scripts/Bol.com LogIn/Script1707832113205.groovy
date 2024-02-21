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

WebUI.click(findTestObject('Object Repository/Page_De winkel van ons allemaal  bol/span_Inloggen'))

WebUI.setText(findTestObject('Object Repository/Page_bol.com  Inloggen/input_Inloggen_j_username'), 'zelim@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_bol.com  Inloggen/input_E-mailadres_j_password'), 'jt9hHVg9rFWx0pdblpZwlg==')

WebUI.click(findTestObject('Object Repository/Page_bol.com  Inloggen/button_Inloggen'))

WebUI.setText(findTestObject('Object Repository/Page_bol.com  Account  Accountoverzicht/input_Zoeken_searchtext'), 'Omega Seamaster')

WebUI.click(findTestObject('Object Repository/Page_bol.com  Account  Accountoverzicht/a_omega seamaster'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Zoekresultaten voor omega seamaster/svg_Zoeken_svg-inline--bi bi-search-vi bi-lg'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Zoekresultaten voor omega seamaster/a_22mm Nato Strap Blauw met rode streep - V_316768'))

WebUI.click(findTestObject('Object Repository/Page_22mm Nato Strap Blauw met rode streep _4a5002/a_In winkelwagen'))

WebUI.click(findTestObject('Object Repository/Page_22mm Nato Strap Blauw met rode streep _4a5002/a_Bestellen'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Winkelwagentje/button_Verder naar bestellen'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Bestellen/button_Artikelen'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Bestellen/button_Andere betaalmethode'))

WebUI.click(findTestObject('Object Repository/Page_Betalen via/div_Veilig betalen via je eigen Belgische b_818ff1'))

WebUI.click(findTestObject('Object Repository/Page_Bancontact/div_Betalen met de Bancontact App of QR_lis_f67457'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Bestellen/button_Bestellen en betalen'))

WebUI.click(findTestObject('Object Repository/Page_/a_Annuleren'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Winkelwagentje/label_Welkom      Zelim'))

WebUI.click(findTestObject('Object Repository/Page_bol.com  Winkelwagentje/span_Uitloggen'))

