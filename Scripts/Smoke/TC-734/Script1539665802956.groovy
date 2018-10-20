import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1,38))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 38))

WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Home/VerifyHomePage'))


//Click on Reterival screen
WebUI.click(findTestObject('Object Repository/Retreival/ClickOnRetrieval'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Retreival/TitleofReterivalScreen'),15)

//select a doc type
WebUI.click(findTestObject('Object Repository/Retreival/SelectDocType'))
WebUI.selectOptionByIndex(findTestObject('Object Repository/Retreival/SelectDocType'), 3)


//Click on searchAll button
WebUI.click(findTestObject('Object Repository/Retreival/SearchAllButton'))
Thread.sleep(30000)

//select 1 entry from the list
WebUI.click(findTestObject('Object Repository/Retreival/Selecting1stEntryfromSearchfield'))

//Click on the email button from the viewer
WebUI.click(findTestObject('Object Repository/Retreival/EmailCurrentDoc'))

//Focus on the email popup
WebUI.focus(findTestObject('Object Repository/Retreival/EmailPopup'))

//Enter Email Address
WebUI.setText(findTestObject('Object Repository/Retreival/EmailAddressfield'),findTestData('ImScanDataSource').getValue(4,23))

//Click on Send
WebUI.click(findTestObject('Object Repository/Retreival/SendEmail'))

//wait till the sucessmsg is displayed
WebUI.waitForElementVisible(findTestObject('Object Repository/Retreival/SucessMsgForEmail'), 20)


