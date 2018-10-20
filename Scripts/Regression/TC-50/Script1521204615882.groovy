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

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_UserName'), 'Dixita')

WebUI.setText(findTestObject('Login/Page_IMSCAN/input_Password'), 'Dixita456')

//click on Login
WebUI.click(findTestObject('Login/Page_IMSCAN/button_Login'))

//click on settings tab
WebUI.click(findTestObject('Object Repository/Settings/ClickOnSettings'))

//wait for 2 sec
WebUI.delay(2)

//click on Email Settings
WebUI.click(findTestObject('Object Repository/Settings/ClickOnEmailSettings'))

//focus on the 2nd element to edited
WebUI.focus(findTestObject('Object Repository/Settings/ElementToBeEdited(2)'))

//click On Edit 
WebUI.click(findTestObject('Object Repository/Settings/ClickOnEdit(2)'))

//focus on EditPopUp
WebUI.focus(findTestObject('Object Repository/Settings/EditEmailPopUp'))

//delay
WebUI.delay(5)

//Clear the text
WebUI.clearText(findTestObject('Object Repository/Settings/Email'))

//wait 5 sec
WebUI.delay(5)

//set the Email 
WebUI.setText(findTestObject('Object Repository/Settings/Email'), 'xyzs12@gmail.com')

//click On save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

