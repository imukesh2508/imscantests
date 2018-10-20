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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

//click on settings tab
WebUI.scrollToElement(findTestObject('Object Repository/Settings/ClickOnSettings'), 2)
WebUI.click(findTestObject('Object Repository/Settings/ClickOnSettings'))

//click on SMTP settings
WebUI.click(findTestObject('Object Repository/Settings/ClickOnSMTPsettings'))

//click On Add SMTP settings
WebUI.click(findTestObject('Object Repository/Settings/AddSMTPsettings'))

//switch to the PopUp
WebUI.focus(findTestObject('Object Repository/Settings/AddSMTPPopup'))

WebUI.delay(3)

//enter the incomng server name
WebUI.setText(findTestObject('Object Repository/Settings/IncomingServerName'), findTestData('ImScanDataSource').getValue(1, 11))

//enter the outgoing server name
WebUI.setText(findTestObject('Object Repository/Settings/OutgoingServerName'),findTestData('ImScanDataSource').getValue(2, 11))

//enter the incomingincryption method
WebUI.setText(findTestObject('Object Repository/Settings/IncomingIncrytionMethod'), findTestData('ImScanDataSource').getValue(3, 11))

//enetr the outgoingincryption method
WebUI.setText(findTestObject('Object Repository/Settings/OutgoingIncryptionMethod'), findTestData('ImScanDataSource').getValue(4, 11))

//enter the username
WebUI.setText(findTestObject('Object Repository/Settings/UserName'), findTestData('ImScanDataSource').getValue(5, 11))

//enter the Password
WebUI.setText(findTestObject('Object Repository/Settings/Password'), findTestData('ImScanDataSource').getValue(6, 11))

//click on Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

