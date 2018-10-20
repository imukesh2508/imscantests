import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

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
//Enter username and Password
WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN/input_UserName'), 'Dixita')

WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN/input_Password'), 'Dixita456')
//click on login
WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN/button_Login'))
//click on div box
WebUI.click(findTestObject('Object Repository/Create_New_Role/Page_IMSCAN - EDoc System/div_box'))
//click on role
WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/span_Create Role'))
//verify present or not
WebUI.verifyElementPresent(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/h4_Add Role'), 5)
//wait focus on Role
WebUI.focus(findTestObject('Object Repository/Create_New_Role/Page_IMSCAN - Edocs/div_Role Name'))

WebUI.focus(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/input_Name'))
//enter the Role Name
WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/input_Name'), 'Hii')
//click on Save
WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/button_Save'))

//focus on the error Msg
WebUI.focus(findTestObject('Object Repository/Create_New_Role/ErrorMsgForBlankPermission'))
try {
	String msg= WebUI.getText(findTestObject('Object Repository/Create_New_Role/ErrorMsgForBlankPermission'))
	println (msg)
	println ('Error Message is Dispalyed')
} catch (Exception e) {
	println ('Error Message is NOT Displayed')
	Assert.fail()
}

