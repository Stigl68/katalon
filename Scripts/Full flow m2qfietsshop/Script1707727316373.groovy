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

WebUI.navigateToUrl('https://m2qfietsshop.be/')

WebUI.click(findTestObject('Object Repository/Page_M2Q Fietsshop  Uw kwaliteitsfiets/span_Mijn account'))

WebUI.setText(findTestObject('Object Repository/Page_Mijn account  M2Q Fietsshop/input__username'), 'zelim@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mijn account  M2Q Fietsshop/input__password'), '7VY4ktgehIOhgLd4RWPzeQ==')

WebUI.click(findTestObject('Object Repository/Page_Mijn account  M2Q Fietsshop/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Mijn account  M2Q Fietsshop/span_Winkel'))

WebUI.click(findTestObject('Object Repository/Page_Producten  M2Q Fietsshop/h2_Heren fiets  Giant'))

WebUI.click(findTestObject('Object Repository/Page_Heren fiets  Giant  M2Q Fietsshop/button_In winkelmand'))

WebUI.click(findTestObject('Object Repository/Page_Heren fiets  Giant  M2Q Fietsshop/a_Winkelmand bekijken'))

WebUI.click(findTestObject('Object Repository/Page_Winkelmand  M2Q Fietsshop/a_'))

WebUI.click(findTestObject('Object Repository/Page_Winkelmand  M2Q Fietsshop/span_Mijn account'))

WebUI.click(findTestObject('Object Repository/Page_Mijn account  M2Q Fietsshop/a_Uitloggen'))

