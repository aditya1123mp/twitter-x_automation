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

WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN-X-TWITTER/password_text_box'), 10)

WebUI.click(findTestObject('Object Repository/LOGIN-X-TWITTER/password_text_box'))

WebUI.setText(findTestObject('Object Repository/LOGIN-X-TWITTER/password_text_box'), GlobalVariable.PassWord)

WebUI.verifyElementPresent(findTestObject('Object Repository/LOGIN-X-TWITTER/login_button'),10)

WebUI.click(findTestObject('Object Repository/LOGIN-X-TWITTER/login_button'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/for_search_b0x'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/for_search_b0x'), 10)

WebUI.click(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/for_search_b0x'))

WebUI.setText(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/for_search_b0x'), GlobalVariable.rolando)

WebUI.waitForElementPresent(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/click_on_search_option'), 30)

WebUI.click(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/click_on_search_option'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/click_on_search_option'), 10)
//WebUI.click(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/selecting_first_option'))

//WebUI.scrollToElement(findTestObject('LIKE_A_TWEET_ON_X/scroll_to_first_tweet'), 2)

WebUI.click(findTestObject('Object Repository/LIKE_A_TWEET_ON_X/liking_first_x_post'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/RETWEET/retweet_selection'))

WebUI.click(findTestObject('Object Repository/RETWEET/retweet_confirmation'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('LOGOUT-X-TWITTER/test_case_to_logout'), [:], FailureHandling.STOP_ON_FAILURE)
