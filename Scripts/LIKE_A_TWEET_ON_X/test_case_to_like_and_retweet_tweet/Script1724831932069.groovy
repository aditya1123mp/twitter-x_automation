import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

'maximize windows'
WebUI.maximizeWindow()

'navigate to amazon website'
WebUI.navigateToUrl('https://twitter.com/')

WebUI.delay(3)

'Refresh the current web page'
WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN-X-TWITTER/sign_in_button'), 10)

WebUI.click(findTestObject('Object Repository/LOGIN-X-TWITTER/sign_in_button'))

WebUI.click(findTestObject('Object Repository/LOGIN-X-TWITTER/username_textbox'))

WebUI.setText(findTestObject('Object Repository/LOGIN-X-TWITTER/username_textbox'), GlobalVariable.UserName)

WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN-X-TWITTER/next_button'), 10)

WebUI.click(findTestObject('Object Repository/LOGIN-X-TWITTER/next_button'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN-X-TWITTER/bot_confirmation_password'), 10, FailureHandling.CONTINUE_ON_FAILURE)) {
    println("Bot confirmation password element found. Executing bot login test case.")
    WebUI.callTestCase(findTestCase('LOGIN-X-TWITTER/Test_Case_for_bot_login'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println("Bot confirmation password element not found. Executing second login test case.")
    WebUI.callTestCase(findTestCase('LOGIN-X-TWITTER/second_login_test_case'), [:], FailureHandling.STOP_ON_FAILURE)
}



