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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN/input_UserName'), findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN/input_Password'), findTestData('ImScanDataSource').getValue(2, 1))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN/button_Login'))

WebUI.click(findTestObject('Object Repository/Create_New_Role/Page_IMSCAN - EDoc System/div_box'))
WebUI.scrollToElement(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/span_Create Role'), 2)

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/span_Create Role'))

WebUI.verifyElementPresent(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/h4_Add Role'), 5)

WebUI.focus(findTestObject('Object Repository/Create_New_Role/Page_IMSCAN - Edocs/div_Role Name'))

WebUI.focus(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/input_Name'))

WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/input_Name'), findTestData('ImScanDataSource').getValue(1, 15))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/li_Imscan User'))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/span_glyphicon glyphicon-chevr'))

WebUI.click(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/button_Save'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Create_New_Role/Page_IMSCAN - Edocs/input'),  findTestData('ImScanDataSource').getValue(1, 15))



