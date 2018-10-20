import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.format.DateTimeFormatterBuilder.SettingsParser as SettingsParser
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

//click on Email Settings
WebUI.click(findTestObject('Object Repository/Settings/ClickOnEmailSettings'))

//wait for 2 sec
WebUI.delay(2)

//click on Email Settings
WebUI.click(findTestObject('Object Repository/Settings/ClickOnEmailSettings'))

//click on Add Email Settings
WebUI.click(findTestObject('Object Repository/Settings/AddEmailSettings'))
WebUI.delay(3)
//Focus on the PopUp
WebUI.focus(findTestObject('Object Repository/Settings/EmailSettingsPopUp'))

//delay
WebUI.delay(3)

//Enter the Email
WebUI.setText(findTestObject('Object Repository/Settings/Email'), findTestData('ImScanDataSource').getValue(4, 8))

//Enter the Password
WebUI.setText(findTestObject('Object Repository/Settings/Password'), '123456')

//Click on Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

