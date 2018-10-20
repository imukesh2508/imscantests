import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.PopupMenu as PopupMenu
import java.sql.Connection as Connection
import org.junit.rules.TestWatchman as TestWatchman
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

//click On Database Connection
WebUI.click(findTestObject('Object Repository/Settings/ClickOnDatabaseConnections'))

WebUI.delay(2)

//click On Add Connections
WebUI.click(findTestObject('Object Repository/Settings/CreateDBconnections'))

//Focus on the Popup
WebUI.focus(findTestObject('Object Repository/Settings/DBconnectionPopUP'))
WebUI.delay(5)
//Set the server name
WebUI.setText(findTestObject('Object Repository/Settings/ServerName'), findTestData('ImScanDataSource').getValue(5, 8))

//Set the Database Connections
WebUI.setText(findTestObject('Object Repository/Settings/DatabaseName'), findTestData('ImScanDataSource').getValue(6, 8))

//Set the Connection Name
WebUI.setText(findTestObject('Object Repository/Settings/ConnectionName'),findTestData('ImScanDataSource').getValue(7, 8))

//set the username
WebUI.setText(findTestObject('Object Repository/Settings/UserName'), findTestData('ImScanDataSource').getValue(8, 8))

//set the Password
WebUI.setText(findTestObject('Object Repository/Settings/PasswordDB'), findTestData('ImScanDataSource').getValue(8, 8))

//click On Save
WebUI.click(findTestObject('Object Repository/Settings/SaveButton'))

