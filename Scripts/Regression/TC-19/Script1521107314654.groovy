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

WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN/input_UserName'), 'Dixita')

WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN/input_Password'), 'Dixita456')

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN/button_Login'))

WebUI.click(findTestObject('Object Repository/Create_New_Role/Page_IMSCAN - EDoc System/div_box'))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/span_Create Role'))

WebUI.verifyElementPresent(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/h4_Add Role'), 5)

WebUI.focus(findTestObject('Object Repository/Create_New_Role/Page_IMSCAN - Edocs/div_Role Name'))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/li_Imscan User'))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/span_glyphicon glyphicon-chevr'))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/button_Save'))
//verify Error message is displayed or not
try {
	WebUI.focus(findTestObject('Object Repository/Create_New_Role/ErrorMsgForUserRole'))
	String errMsg=WebUI.getText(findTestObject('Object Repository/Create_New_Role/ErrorMsgForUserRole'))
	println (errMsg)
	println ('Error Message Is displayed')
    } 
catch (Exception e) {
	println ('Error Message is NOT displayed')
                    }

