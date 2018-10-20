import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.stringtemplate.v4.compiler.STParser.element_return

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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), 'Dixita')

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), 'Dixita456')

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

//verfiy Home Page is displayed or not
WebUI.verifyElementPresent(findTestObject('Object Repository/Create_a_New_Dept/VerfiyHomePageDisplayed'), 3)

WebUI.delay(3)
//click on Users
WebUI.click(findTestObject('Object Repository/Users/Users'))

//Focus on search field
WebUI.focus(findTestObject('Object Repository/Search/Search_Inspect'))

//Set the text
WebUI.setText(findTestObject('Object Repository/Search/Search_Inspect'), 'Hi')

//focus on the element
WebUI.focus(findTestObject('Object Repository/Users/ElementToBeEdited'))

//click on edit
WebUI.click(findTestObject('Object Repository/Users/EditIconofElement'))

//switch to the popup
WebUI.waitForAlert(5)
//focus on the PopUp
WebUI.focus(findTestObject('Object Repository/Users/UsersPopUp/Popup'))

WebUI.delay(5)
WebUI.waitForElementVisible(findTestObject('Object Repository/Users/Firstname'), 2)
//Enter the firstName
WebUI.focus(findTestObject('Object Repository/Users/Firstname'))
WebUI.setText(findTestObject('Object Repository/Users/Firstname'), 'Hey')

//scroll to save
WebUI.scrollToElement(findTestObject('Object Repository/Users/ClickonSaveOfPopup'), 3)

//click on save
WebUI.click(findTestObject('Object Repository/Users/ClickonSaveOfPopup'))




