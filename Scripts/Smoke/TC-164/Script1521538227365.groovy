import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.PopupMenu
import java.sql.Savepoint
import java.text.Format

import javax.swing.text.html.HTMLEditorKit.HTMLFactory.BodyBlockView

import org.testng.reporters.EmailableReporter

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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'),  findTestData('ImScanDataSource').getValue(1, 1))

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'),  findTestData('ImScanDataSource').getValue(2, 1))

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

//delay
WebUI.delay(3)
//click on settings tab
WebUI.scrollToElement(findTestObject('Object Repository/Settings/ClickOnSettings'), 2)
WebUI.click(findTestObject('Object Repository/Settings/ClickOnSettings'))
//delay
WebUI.delay(3)
//click On Email Formats
WebUI.click(findTestObject('Object Repository/Settings/ClickOnEmailFormat'))

//click On Add Email Format
WebUI.click(findTestObject('Object Repository/Settings/AddEmailFormat'))

//focus on the Popup
WebUI.focus(findTestObject('Object Repository/Settings/EmailFormatPopup'))
//delay
WebUI.delay(3)
//add type of Email
WebUI.setText(findTestObject('Object Repository/Settings/TypeEmail'), findTestData('ImScanDataSource').getValue(7, 1))

//add Subject to the Email Format
WebUI.setText(findTestObject('Object Repository/Settings/Subject'), findTestData('ImScanDataSource').getValue(8, 1))

//switch to frame
WebUI.switchToFrame(findTestObject('Object Repository/Settings/FrameForbody'), 3)
//click on the body
WebUI.focus(findTestObject('Object Repository/Settings/Body'))
// add Body to the Email
WebUI.setText(findTestObject('Object Repository/Settings/Body'), 'hellooo23')
//focus on Parent frame
WebUI.switchToDefaultContent()
/*WebUI.focus(findTestObject('Object Repository/Settings/EmailFormatPopup'))*/
//click On Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))