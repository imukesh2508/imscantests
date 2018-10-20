import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.format.DateTimeFormatterBuilder.SettingsParser

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

//click on Settings
WebUI.scrollToElement(findTestObject('Object Repository/Settings/ClickOnSettings'), 5)
WebUI.click(findTestObject('Object Repository/Settings/ClickOnSettings'))

//Click on Email setting
WebUI.click(findTestObject('Object Repository/Settings/ClickOnEmailSettings'))

//CLick on Add Email settings
WebUI.click(findTestObject('Object Repository/Settings/AddEmailSettings'))

//Focus on Email settings popup
WebUI.focus(findTestObject('Object Repository/Settings/EmailSettingsPopUp'))

//Focus on Email settings tab
WebUI.focus(findTestObject('Object Repository/Settings/Email'))
WebUI.click(findTestObject('Object Repository/Settings/Email'))
//Enter the Email address
WebUI.sendKeys(findTestObject('Object Repository/Settings/Email'), findTestData('ImScanDataSource').getValue(4,8))

//Click Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

//Identify the validation message for mandatory password

WebUI.getText(findTestObject('Object Repository/Settings/MandatoryPassword'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/MandatoryPassword'),2)
