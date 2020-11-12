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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

CustomKeywords.'com.helper.login.loginhelper.logintoapp'()

WebUI.click(findTestObject('Page_tC Create/Organization unfoldingWord'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/span_unfoldingWord Translation Notes'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/div_Step 4 Select Your Language option am -_f1dc08'))

WebUI.setText(findTestObject('Page_tC Create/input_Step4Select Your Language_react-selec_aae5da'), 'en')

WebUI.click(findTestObject('Page_tC Create/div_en - English - English (Europe Gateway)'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/span_en_tn_57-TIT.tsv'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/div_Introduction to TitusPart 1'))

//WebUI.setText(findTestObject('Object Repository/Page_tC Create/div_Introduction to TitusPart 1'), 'this is a test edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_tC Create/div_Introduction to TitusPart 1'), "edit again ")

WebDriver driver = DriverFactory.getWebDriver()

	Actions action = new Actions(driver)

	action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform()



WebUI.sendKeys(findTestObject('Object Repository/Page_tC Create/div_Introduction to TitusPart 1'), Keys.chord(Keys.COMMAND, 'z'))
System.out.println("Text is cleared successfully by undo action")
WebUI.closeBrowser()