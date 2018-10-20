import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.stringtemplate.v4.compiler.STParser.list_return
import org.stringtemplate.v4.compiler.STParser.option_return

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

WebUI.waitForElementPresent(findTestObject('Object Repository/Home/ClickOnHome'), 15)


//click on workflow reterival screen
WebUI.click(findTestObject('Object Repository/Workflow/ClickOnWorkflow'))

//Select a doc-type
WebUI.waitForElementVisible(findTestObject('Object Repository/Workflow/SelectDocType'), 15)
WebUI.click(findTestObject('Object Repository/Workflow/SelectDocType'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Workflow/SelectDocType'), '2')
Thread.sleep(1000)
//click on the 1st entry from the table
WebUI.click(findTestObject('Object Repository/Workflow/Selecting1stEntryfromSearch'))


//click on the 1st enabled action option_return
WebUI.click(findTestObject('Object Repository/Workflow/1stOptionfromListWhichIsNotDisabled'))




