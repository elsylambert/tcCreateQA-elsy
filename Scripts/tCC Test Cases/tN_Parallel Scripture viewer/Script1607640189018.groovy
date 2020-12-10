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

CustomKeywords.'com.helper.login.loginhelper.logintoapp'()

WebUI.click(findTestObject('Page_tC Create/Organization unfoldingWord'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/span_unfoldingWord Translation Notes'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/div_Step 4 Select Your Language option am -_f1dc08'))

WebUI.setText(findTestObject('Page_tC Create/input_Step4Select Your Language_react-selec_aae5da'), 'en')

WebUI.click(findTestObject('Page_tC Create/div_en - English - English (Europe Gateway)'))

WebUI.click(findTestObject('Object Repository/Page_tC Create/span_en_tn_57-TIT.tsv'))

//Scrolls to top for the hamburger to be visible
//check whether the toggle is "on"
CustomKeywords.'com.tccreate.keywords.ExpandAllScriptureToggle.toggleAllScripture'('"test"')

//turn the toggle On if it is not
CustomKeywords.'com.tccreate.keywords.ExpandAllScriptureToggle.toggleAllScripture'('"on"')

//Checks ULT in the scripture pane
if (WebUI.verifyElementPresent(findTestObject('Page_tC Create/span_unfoldingWord Literal Text v14'), 5)) {
    System.out.println('ULT is visible 1')
} else {
    System.out.println('Cannot find ULT in PSV')
}

//Checks UST in the scripture pane
if (WebUI.verifyElementPresent(findTestObject('Page_tC Create/span_unfoldingWord Simplified Text v14'), 5)) {
    System.out.println('UST is visible')
} else {
    System.out.println('Cannot find UST in PSV')
}

System.out.println('ParallelScripture is present')

//turn toggle Off
CustomKeywords.'com.tccreate.keywords.ExpandAllScriptureToggle.toggleAllScripture'('"off"')

System.out.println('button is toggled')

if (WebUI.verifyElementNotPresent(findTestObject('Page_tC Create/span_unfoldingWord Literal Text v14'), 3)) {
    System.out.println('ULT is not visible as expected')
} else {
    System.out.println('PSV is visible when it should not be')
}

WebUI.closeBrowser()
