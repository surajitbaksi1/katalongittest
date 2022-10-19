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

WebUI.navigateToUrl('https://dev-inv-web.hissa.com/auth')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_Hissa - Investor Portfolio Management/a_Forgot your Password'))

WebUI.setText(findTestObject('Object Repository/Forgot Password/Page_Hissa - Investor Portfolio Management/input_Email_email'), 
    'surajitbaksi@qarea.biz')

WebUI.click(findTestObject('Object Repository/Forgot Password/Page_Hissa - Investor Portfolio Management/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot Password/Page_Hissa - Investor Portfolio Management/div_Password reset is sent. Please check yo_7b6fc3'), 
    'Password reset is sent. Please check your email')

WebUI.closeBrowser()

