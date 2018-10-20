import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
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

//click on SMTP settings
WebUI.click(findTestObject('Object Repository/Settings/ClickOnSMTPsettings'))

//click On Add SMTP settings
WebUI.click(findTestObject('Object Repository/Settings/AddSMTPsettings'))

//switch to the PopUp
WebUI.focus(findTestObject('Object Repository/Settings/AddSMTPPopup'))

WebUI.delay(3)

//enter the incomng server name
WebUI.setText(findTestObject('Object Repository/Settings/IncomingServerName'), '26')

//enter the outgoing server name
WebUI.setText(findTestObject('Object Repository/Settings/OutgoingServerName'), '26')

//enter the incomingincryption method
WebUI.setText(findTestObject('Object Repository/Settings/IncomingIncrytionMethod'), '26')

//enetr the outgoingincryption method
WebUI.setText(findTestObject('Object Repository/Settings/OutgoingIncryptionMethod'), '26')

//enter the username
WebUI.setText(findTestObject('Object Repository/Settings/UserName'), 'DummyName26')

//enter the Password
WebUI.setText(findTestObject('Object Repository/Settings/Password'), '123')

//click on Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

//Added 1 entry
//Second entry to add
WebUI.delay(5)

//Duplicate entry
//click On Add SMTP settings
WebUI.click(findTestObject('Object Repository/Settings/AddSMTPsettings'))

//switch to the PopUp
WebUI.focus(findTestObject('Object Repository/Settings/AddSMTPPopup'))

WebUI.delay(3)

//enter the incomng server name
WebUI.setText(findTestObject('Object Repository/Settings/IncomingServerName'), '26')

//enter the outgoing server name
WebUI.setText(findTestObject('Object Repository/Settings/OutgoingServerName'), '26')

//enter the incomingincryption method
WebUI.setText(findTestObject('Object Repository/Settings/IncomingIncrytionMethod'), '26')

//enetr the outgoingincryption method
WebUI.setText(findTestObject('Object Repository/Settings/OutgoingIncryptionMethod'), '26')

//enter the username
WebUI.setText(findTestObject('Object Repository/Settings/UserName'), 'DummyName26')

//enter the Password
WebUI.setText(findTestObject('Object Repository/Settings/Password'), '123')

//click on Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

WebUI.delay(2)

//focus On the error Message
WebUI.focus(findTestObject('Object Repository/Settings/DuplicateSMTPError'))

try {
    String ErrMsg = WebUI.getText(findTestObject('Object Repository/Settings/DuplicateSMTPError'))

    println(ErrMsg)

    println('Error Message has been displayed')
}
catch (Exception e) {
    Assert.fail()

    println('No ErrMessage is Displayed')
} 

